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

import org.eclipse.cmf.occi.multicloud.regions.Europe;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eu west 3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link awsregions.Eu_west_3#getRegionName <em>Region Name</em>}</li>
 *   <li>{@link awsregions.Eu_west_3#getCountry <em>Country</em>}</li>
 *   <li>{@link awsregions.Eu_west_3#getRegionId <em>Region Id</em>}</li>
 *   <li>{@link awsregions.Eu_west_3#getCity <em>City</em>}</li>
 * </ul>
 *
 * @see awsregions.AwsregionsPackage#getEu_west_3()
 * @model
 * @generated
 */
public interface Eu_west_3 extends Europe, MixinBase {
	/**
	 * Returns the value of the '<em><b>Region Name</b></em>' attribute.
	 * The default value is <code>"EU (Paris)"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Region name give an intelligible name on this region
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region Name</em>' attribute.
	 * @see #setRegionName(String)
	 * @see awsregions.AwsregionsPackage#getEu_west_3_RegionName()
	 * @model default="EU (Paris)" dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getRegionName();

	/**
	 * Sets the value of the '{@link awsregions.Eu_west_3#getRegionName <em>Region Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Name</em>' attribute.
	 * @see #getRegionName()
	 * @generated
	 */
	void setRegionName(String value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * The default value is <code>"France"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * the country where this resource or link is available
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see awsregions.AwsregionsPackage#getEu_west_3_Country()
	 * @model default="France" dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link awsregions.Eu_west_3#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Region Id</b></em>' attribute.
	 * The default value is <code>"eu-west-3"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * regionId is the id of this region given by the provider 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Region Id</em>' attribute.
	 * @see #setRegionId(String)
	 * @see awsregions.AwsregionsPackage#getEu_west_3_RegionId()
	 * @model default="eu-west-3" dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getRegionId();

	/**
	 * Sets the value of the '{@link awsregions.Eu_west_3#getRegionId <em>Region Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Region Id</em>' attribute.
	 * @see #getRegionId()
	 * @generated
	 */
	void setRegionId(String value);

	/**
	 * Returns the value of the '<em><b>City</b></em>' attribute.
	 * The default value is <code>"Paris"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The city where this resource or link is available
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>City</em>' attribute.
	 * @see #setCity(String)
	 * @see awsregions.AwsregionsPackage#getEu_west_3_City()
	 * @model default="Paris" dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getCity();

	/**
	 * Sets the value of the '{@link awsregions.Eu_west_3#getCity <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>City</em>' attribute.
	 * @see #getCity()
	 * @generated
	 */
	void setCity(String value);

} // Eu_west_3
