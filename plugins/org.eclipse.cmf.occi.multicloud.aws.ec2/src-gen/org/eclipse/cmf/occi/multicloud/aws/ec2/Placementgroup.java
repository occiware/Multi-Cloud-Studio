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
 * A representation of the model object '<em><b>Placementgroup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getGroupName <em>Group Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getAffinity <em>Affinity</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getHostId <em>Host Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getSpreadDomain <em>Spread Domain</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getTenancy <em>Tenancy</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getZoneName <em>Zone Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getPlacementgroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(ec2::Instanceec2)'"
 * @generated
 */
public interface Placementgroup extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the placement group the instance is in (for cluster compute instances).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Group Name</em>' attribute.
	 * @see #setGroupName(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getPlacementgroup_GroupName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getGroupName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getGroupName <em>Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Group Name</em>' attribute.
	 * @see #getGroupName()
	 * @generated
	 */
	void setGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Affinity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The affinity setting for the instance on the Dedicated Host.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Affinity</em>' attribute.
	 * @see #setAffinity(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getPlacementgroup_Affinity()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getAffinity();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getAffinity <em>Affinity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Affinity</em>' attribute.
	 * @see #getAffinity()
	 * @generated
	 */
	void setAffinity(String value);

	/**
	 * Returns the value of the '<em><b>Host Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ID of the Dedicated Host on which the instance resides.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Id</em>' attribute.
	 * @see #setHostId(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getPlacementgroup_HostId()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getHostId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getHostId <em>Host Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Id</em>' attribute.
	 * @see #getHostId()
	 * @generated
	 */
	void setHostId(String value);

	/**
	 * Returns the value of the '<em><b>Spread Domain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spread Domain</em>' attribute.
	 * @see #setSpreadDomain(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getPlacementgroup_SpreadDomain()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getSpreadDomain();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getSpreadDomain <em>Spread Domain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spread Domain</em>' attribute.
	 * @see #getSpreadDomain()
	 * @generated
	 */
	void setSpreadDomain(String value);

	/**
	 * Returns the value of the '<em><b>Tenancy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The tenancy of the instance (if the instance is running in a VPC).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tenancy</em>' attribute.
	 * @see #setTenancy(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getPlacementgroup_Tenancy()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getTenancy();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getTenancy <em>Tenancy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tenancy</em>' attribute.
	 * @see #getTenancy()
	 * @generated
	 */
	void setTenancy(String value);

	/**
	 * Returns the value of the '<em><b>Zone Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The datacenter part. The number and mapping of Availability Zones per region may vary between AWS accounts
	 * If null, the provider will choose the best to fit with this instance.
	 * Zone : a, b, c, d, e
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zone Name</em>' attribute.
	 * @see #setZoneName(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getPlacementgroup_ZoneName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getZoneName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup#getZoneName <em>Zone Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone Name</em>' attribute.
	 * @see #getZoneName()
	 * @generated
	 */
	void setZoneName(String value);

} // Placementgroup
