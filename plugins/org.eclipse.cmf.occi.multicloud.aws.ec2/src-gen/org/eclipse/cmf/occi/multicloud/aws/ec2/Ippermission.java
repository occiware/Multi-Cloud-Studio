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
 * A representation of the model object '<em><b>Ippermission</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission#getToPort <em>To Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission#getFromPort <em>From Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission#getIpProtocol <em>Ip Protocol</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission#getIpv4Ranges <em>Ipv4 Ranges</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission#getIpv6Ranges <em>Ipv6 Ranges</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission#getTraffic <em>Traffic</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission#isAuthorized <em>Authorized</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getIppermission()
 * @model
 * @generated
 */
public interface Ippermission extends Resource {
	/**
	 * Returns the value of the '<em><b>To Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Port</em>' attribute.
	 * @see #setToPort(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getIppermission_ToPort()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getToPort();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission#getToPort <em>To Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Port</em>' attribute.
	 * @see #getToPort()
	 * @generated
	 */
	void setToPort(Integer value);

	/**
	 * Returns the value of the '<em><b>From Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Port</em>' attribute.
	 * @see #setFromPort(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getIppermission_FromPort()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getFromPort();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission#getFromPort <em>From Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Port</em>' attribute.
	 * @see #getFromPort()
	 * @generated
	 */
	void setFromPort(Integer value);

	/**
	 * Returns the value of the '<em><b>Ip Protocol</b></em>' attribute.
	 * The default value is <code>"tcp"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.aws.ec2.IpProtocol}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip Protocol</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.IpProtocol
	 * @see #setIpProtocol(IpProtocol)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getIppermission_IpProtocol()
	 * @model default="tcp"
	 * @generated
	 */
	IpProtocol getIpProtocol();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission#getIpProtocol <em>Ip Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Protocol</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.IpProtocol
	 * @see #getIpProtocol()
	 * @generated
	 */
	void setIpProtocol(IpProtocol value);

	/**
	 * Returns the value of the '<em><b>Ipv4 Ranges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CidrIp range, like  "111.111.111.111/32;150.150.150.150/32" , to build a list use ; as separator
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ipv4 Ranges</em>' attribute.
	 * @see #setIpv4Ranges(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getIppermission_Ipv4Ranges()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getIpv4Ranges();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission#getIpv4Ranges <em>Ipv4 Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipv4 Ranges</em>' attribute.
	 * @see #getIpv4Ranges()
	 * @generated
	 */
	void setIpv4Ranges(String value);

	/**
	 * Returns the value of the '<em><b>Ipv6 Ranges</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ipv6 Ranges</em>' attribute.
	 * @see #setIpv6Ranges(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getIppermission_Ipv6Ranges()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getIpv6Ranges();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission#getIpv6Ranges <em>Ipv6 Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ipv6 Ranges</em>' attribute.
	 * @see #getIpv6Ranges()
	 * @generated
	 */
	void setIpv6Ranges(String value);

	/**
	 * Returns the value of the '<em><b>Traffic</b></em>' attribute.
	 * The default value is <code>"inbound"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.aws.ec2.IpPermissionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Traffic</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.IpPermissionType
	 * @see #setTraffic(IpPermissionType)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getIppermission_Traffic()
	 * @model default="inbound" required="true"
	 * @generated
	 */
	IpPermissionType getTraffic();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission#getTraffic <em>Traffic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traffic</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.IpPermissionType
	 * @see #getTraffic()
	 * @generated
	 */
	void setTraffic(IpPermissionType value);

	/**
	 * Returns the value of the '<em><b>Authorized</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Authorized</em>' attribute.
	 * @see #setAuthorized(boolean)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getIppermission_Authorized()
	 * @model default="true" dataType="org.eclipse.cmf.occi.core.Boolean"
	 * @generated
	 */
	boolean isAuthorized();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission#isAuthorized <em>Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorized</em>' attribute.
	 * @see #isAuthorized()
	 * @generated
	 */
	void setAuthorized(boolean value);

} // Ippermission
