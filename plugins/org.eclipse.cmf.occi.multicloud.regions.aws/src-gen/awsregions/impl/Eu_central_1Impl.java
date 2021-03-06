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
package awsregions.impl;

import awsregions.AwsregionsPackage;
import awsregions.Eu_central_1;

import org.eclipse.cmf.occi.multicloud.regions.impl.EuropeImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Eu central 1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link awsregions.impl.Eu_central_1Impl#getCountry <em>Country</em>}</li>
 *   <li>{@link awsregions.impl.Eu_central_1Impl#getRegionId <em>Region Id</em>}</li>
 *   <li>{@link awsregions.impl.Eu_central_1Impl#getCity <em>City</em>}</li>
 *   <li>{@link awsregions.impl.Eu_central_1Impl#getRegionName <em>Region Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Eu_central_1Impl extends EuropeImpl implements Eu_central_1 {
	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = "Germany";

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegionId() <em>Region Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionId()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_ID_EDEFAULT = "eu-central-1";

	/**
	 * The cached value of the '{@link #getRegionId() <em>Region Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionId()
	 * @generated
	 * @ordered
	 */
	protected String regionId = REGION_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = "Frankfurt";

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegionName() <em>Region Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionName()
	 * @generated
	 * @ordered
	 */
	protected static final String REGION_NAME_EDEFAULT = "EU (Frankfurt)";

	/**
	 * The cached value of the '{@link #getRegionName() <em>Region Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegionName()
	 * @generated
	 * @ordered
	 */
	protected String regionName = REGION_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Eu_central_1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AwsregionsPackage.Literals.EU_CENTRAL_1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsregionsPackage.EU_CENTRAL_1__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegionId() {
		return regionId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionId(String newRegionId) {
		String oldRegionId = regionId;
		regionId = newRegionId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsregionsPackage.EU_CENTRAL_1__REGION_ID, oldRegionId, regionId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsregionsPackage.EU_CENTRAL_1__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegionName() {
		return regionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegionName(String newRegionName) {
		String oldRegionName = regionName;
		regionName = newRegionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AwsregionsPackage.EU_CENTRAL_1__REGION_NAME, oldRegionName, regionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AwsregionsPackage.EU_CENTRAL_1__COUNTRY:
				return getCountry();
			case AwsregionsPackage.EU_CENTRAL_1__REGION_ID:
				return getRegionId();
			case AwsregionsPackage.EU_CENTRAL_1__CITY:
				return getCity();
			case AwsregionsPackage.EU_CENTRAL_1__REGION_NAME:
				return getRegionName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AwsregionsPackage.EU_CENTRAL_1__COUNTRY:
				setCountry((String)newValue);
				return;
			case AwsregionsPackage.EU_CENTRAL_1__REGION_ID:
				setRegionId((String)newValue);
				return;
			case AwsregionsPackage.EU_CENTRAL_1__CITY:
				setCity((String)newValue);
				return;
			case AwsregionsPackage.EU_CENTRAL_1__REGION_NAME:
				setRegionName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AwsregionsPackage.EU_CENTRAL_1__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case AwsregionsPackage.EU_CENTRAL_1__REGION_ID:
				setRegionId(REGION_ID_EDEFAULT);
				return;
			case AwsregionsPackage.EU_CENTRAL_1__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case AwsregionsPackage.EU_CENTRAL_1__REGION_NAME:
				setRegionName(REGION_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AwsregionsPackage.EU_CENTRAL_1__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case AwsregionsPackage.EU_CENTRAL_1__REGION_ID:
				return REGION_ID_EDEFAULT == null ? regionId != null : !REGION_ID_EDEFAULT.equals(regionId);
			case AwsregionsPackage.EU_CENTRAL_1__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case AwsregionsPackage.EU_CENTRAL_1__REGION_NAME:
				return REGION_NAME_EDEFAULT == null ? regionName != null : !REGION_NAME_EDEFAULT.equals(regionName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (country: ");
		result.append(country);
		result.append(", regionId: ");
		result.append(regionId);
		result.append(", city: ");
		result.append(city);
		result.append(", regionName: ");
		result.append(regionName);
		result.append(')');
		return result.toString();
	}

} //Eu_central_1Impl
