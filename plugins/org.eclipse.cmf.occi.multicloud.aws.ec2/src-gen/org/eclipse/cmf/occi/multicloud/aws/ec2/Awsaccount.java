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

import org.eclipse.cmf.occi.multicloud.accounts.Cloudaccount;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Awsaccount</b></em>'.
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
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Awsaccount#getRegionId <em>Region Id</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getAwsaccount()
 * @model
 * @generated
 */
public interface Awsaccount extends Cloudaccount {

	/**
	 * Returns the value of the '<em><b>Region Id</b></em>' attribute.
	 * The default value is <code>"eu-west-3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * regionId is the id of this region given by the provider 
	 * Default is eu-west-3 (France - Paris)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region Id</em>' attribute.
	 * @see #setRegionId(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getAwsaccount_RegionId()
	 * @model default="eu-west-3" dataType="org.eclipse.cmf.occi.core.String" required="true"
	 * @generated
	 */
	String getRegionId();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.Awsaccount#getRegionId <em>Region Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Id</em>' attribute.
	 * @see #getRegionId()
	 * @generated
	 */
	void setRegionId(String value);
} // Awsaccount
