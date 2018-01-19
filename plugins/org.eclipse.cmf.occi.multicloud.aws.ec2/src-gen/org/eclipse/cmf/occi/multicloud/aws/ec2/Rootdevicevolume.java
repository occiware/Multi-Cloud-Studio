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
 * A representation of the model object '<em><b>Rootdevicevolume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume#getRootDeviceName <em>Root Device Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume#getRootDeviceType <em>Root Device Type</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getRootdevicevolume()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(ec2::Instanceec2)'"
 * @generated
 */
public interface Rootdevicevolume extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Root Device Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The device name of the root device volume (for example, /dev/sda1).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Device Name</em>' attribute.
	 * @see #setRootDeviceName(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getRootdevicevolume_RootDeviceName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getRootDeviceName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume#getRootDeviceName <em>Root Device Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Device Name</em>' attribute.
	 * @see #getRootDeviceName()
	 * @generated
	 */
	void setRootDeviceName(String value);

	/**
	 * Returns the value of the '<em><b>Root Device Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The root device type used by the AMI. 
	 * The AMI can use an EBS volume or an instance store volume.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Root Device Type</em>' attribute.
	 * @see #setRootDeviceType(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getRootdevicevolume_RootDeviceType()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getRootDeviceType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume#getRootDeviceType <em>Root Device Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root Device Type</em>' attribute.
	 * @see #getRootDeviceType()
	 * @generated
	 */
	void setRootDeviceType(String value);

} // Rootdevicevolume
