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
package awsregions;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.multicloud.regions.Asiapacific;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ap south 1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link awsregions.Ap_south_1#getCountry <em>Country</em>}</li>
 *   <li>{@link awsregions.Ap_south_1#getRegionName <em>Region Name</em>}</li>
 *   <li>{@link awsregions.Ap_south_1#getRegionId <em>Region Id</em>}</li>
 *   <li>{@link awsregions.Ap_south_1#getCity <em>City</em>}</li>
 * </ul>
 *
 * @see awsregions.AwsregionsPackage#getAp_south_1()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(awsregions::Awsregion)'"
 * @generated
 */
public interface Ap_south_1 extends Asiapacific, MixinBase {
	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * The default value is <code>"India"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the country where this resource or link is available
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see awsregions.AwsregionsPackage#getAp_south_1_Country()
	 * @model default="India" dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link awsregions.Ap_south_1#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Region Name</b></em>' attribute.
	 * The default value is <code>"Asia Pacific (Mumbai)"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Region name give an intelligible name on this region
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region Name</em>' attribute.
	 * @see #setRegionName(String)
	 * @see awsregions.AwsregionsPackage#getAp_south_1_RegionName()
	 * @model default="Asia Pacific (Mumbai)" dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getRegionName();

	/**
	 * Sets the value of the '{@link awsregions.Ap_south_1#getRegionName <em>Region Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Name</em>' attribute.
	 * @see #getRegionName()
	 * @generated
	 */
	void setRegionName(String value);

	/**
	 * Returns the value of the '<em><b>Region Id</b></em>' attribute.
	 * The default value is <code>"ap-south-1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * regionId is the id of this region given by the provider 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region Id</em>' attribute.
	 * @see #setRegionId(String)
	 * @see awsregions.AwsregionsPackage#getAp_south_1_RegionId()
	 * @model default="ap-south-1" dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getRegionId();

	/**
	 * Sets the value of the '{@link awsregions.Ap_south_1#getRegionId <em>Region Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Id</em>' attribute.
	 * @see #getRegionId()
	 * @generated
	 */
	void setRegionId(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * The default value is <code>"Bombay"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The city where this resource or link is available
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see awsregions.AwsregionsPackage#getAp_south_1_City()
	 * @model default="Bombay" dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link awsregions.Ap_south_1#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

} // Ap_south_1
