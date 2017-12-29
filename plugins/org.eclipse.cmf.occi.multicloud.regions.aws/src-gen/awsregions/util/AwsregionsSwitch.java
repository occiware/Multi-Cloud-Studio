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
package awsregions.util;

import awsregions.*;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.multicloud.regions.Asiapacific;
import org.eclipse.cmf.occi.multicloud.regions.Europe;
import org.eclipse.cmf.occi.multicloud.regions.Northamerica;
import org.eclipse.cmf.occi.multicloud.regions.Region;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see awsregions.AwsregionsPackage
 * @generated
 */
public class AwsregionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AwsregionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsregionsSwitch() {
		if (modelPackage == null) {
			modelPackage = AwsregionsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case AwsregionsPackage.US_EAST_2: {
				Us_east_2 us_east_2 = (Us_east_2)theEObject;
				T result = caseUs_east_2(us_east_2);
				if (result == null) result = caseNorthamerica(us_east_2);
				if (result == null) result = caseRegion(us_east_2);
				if (result == null) result = caseMixinBase(us_east_2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AwsregionsPackage.US_EAST_1: {
				Us_east_1 us_east_1 = (Us_east_1)theEObject;
				T result = caseUs_east_1(us_east_1);
				if (result == null) result = caseNorthamerica(us_east_1);
				if (result == null) result = caseRegion(us_east_1);
				if (result == null) result = caseMixinBase(us_east_1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AwsregionsPackage.EU_WEST_3: {
				Eu_west_3 eu_west_3 = (Eu_west_3)theEObject;
				T result = caseEu_west_3(eu_west_3);
				if (result == null) result = caseEurope(eu_west_3);
				if (result == null) result = caseRegion(eu_west_3);
				if (result == null) result = caseMixinBase(eu_west_3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AwsregionsPackage.US_WEST_1: {
				Us_west_1 us_west_1 = (Us_west_1)theEObject;
				T result = caseUs_west_1(us_west_1);
				if (result == null) result = caseNorthamerica(us_west_1);
				if (result == null) result = caseRegion(us_west_1);
				if (result == null) result = caseMixinBase(us_west_1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AwsregionsPackage.EU_WEST_1: {
				Eu_west_1 eu_west_1 = (Eu_west_1)theEObject;
				T result = caseEu_west_1(eu_west_1);
				if (result == null) result = caseEurope(eu_west_1);
				if (result == null) result = caseRegion(eu_west_1);
				if (result == null) result = caseMixinBase(eu_west_1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AwsregionsPackage.AP_SOUTH_1: {
				Ap_south_1 ap_south_1 = (Ap_south_1)theEObject;
				T result = caseAp_south_1(ap_south_1);
				if (result == null) result = caseAsiapacific(ap_south_1);
				if (result == null) result = caseRegion(ap_south_1);
				if (result == null) result = caseMixinBase(ap_south_1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AwsregionsPackage.SA_EAST_1: {
				Sa_east_1 sa_east_1 = (Sa_east_1)theEObject;
				T result = caseSa_east_1(sa_east_1);
				if (result == null) result = caseEurope(sa_east_1);
				if (result == null) result = caseRegion(sa_east_1);
				if (result == null) result = caseMixinBase(sa_east_1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AwsregionsPackage.US_WEST_2: {
				Us_west_2 us_west_2 = (Us_west_2)theEObject;
				T result = caseUs_west_2(us_west_2);
				if (result == null) result = caseNorthamerica(us_west_2);
				if (result == null) result = caseRegion(us_west_2);
				if (result == null) result = caseMixinBase(us_west_2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AwsregionsPackage.EU_WEST_2: {
				Eu_west_2 eu_west_2 = (Eu_west_2)theEObject;
				T result = caseEu_west_2(eu_west_2);
				if (result == null) result = caseEurope(eu_west_2);
				if (result == null) result = caseRegion(eu_west_2);
				if (result == null) result = caseMixinBase(eu_west_2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AwsregionsPackage.AP_SOUTHEAST_1: {
				Ap_southeast_1 ap_southeast_1 = (Ap_southeast_1)theEObject;
				T result = caseAp_southeast_1(ap_southeast_1);
				if (result == null) result = caseAsiapacific(ap_southeast_1);
				if (result == null) result = caseRegion(ap_southeast_1);
				if (result == null) result = caseMixinBase(ap_southeast_1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AwsregionsPackage.CA_CENTRAL_1: {
				Ca_central_1 ca_central_1 = (Ca_central_1)theEObject;
				T result = caseCa_central_1(ca_central_1);
				if (result == null) result = caseNorthamerica(ca_central_1);
				if (result == null) result = caseRegion(ca_central_1);
				if (result == null) result = caseMixinBase(ca_central_1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AwsregionsPackage.AP_NORTHEAST_2: {
				Ap_northeast_2 ap_northeast_2 = (Ap_northeast_2)theEObject;
				T result = caseAp_northeast_2(ap_northeast_2);
				if (result == null) result = caseAsiapacific(ap_northeast_2);
				if (result == null) result = caseRegion(ap_northeast_2);
				if (result == null) result = caseMixinBase(ap_northeast_2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AwsregionsPackage.AP_SOUTH_EAST2: {
				Ap_south_east2 ap_south_east2 = (Ap_south_east2)theEObject;
				T result = caseAp_south_east2(ap_south_east2);
				if (result == null) result = caseAsiapacific(ap_south_east2);
				if (result == null) result = caseRegion(ap_south_east2);
				if (result == null) result = caseMixinBase(ap_south_east2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AwsregionsPackage.EU_CENTRAL_1: {
				Eu_central_1 eu_central_1 = (Eu_central_1)theEObject;
				T result = caseEu_central_1(eu_central_1);
				if (result == null) result = caseEurope(eu_central_1);
				if (result == null) result = caseRegion(eu_central_1);
				if (result == null) result = caseMixinBase(eu_central_1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case AwsregionsPackage.AP_NORTHEAST_1: {
				Ap_northeast_1 ap_northeast_1 = (Ap_northeast_1)theEObject;
				T result = caseAp_northeast_1(ap_northeast_1);
				if (result == null) result = caseAsiapacific(ap_northeast_1);
				if (result == null) result = caseRegion(ap_northeast_1);
				if (result == null) result = caseMixinBase(ap_northeast_1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Us east 2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Us east 2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUs_east_2(Us_east_2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Us east 1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Us east 1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUs_east_1(Us_east_1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eu west 3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eu west 3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEu_west_3(Eu_west_3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Us west 1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Us west 1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUs_west_1(Us_west_1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eu west 1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eu west 1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEu_west_1(Eu_west_1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ap south 1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ap south 1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAp_south_1(Ap_south_1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sa east 1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sa east 1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSa_east_1(Sa_east_1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Us west 2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Us west 2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUs_west_2(Us_west_2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eu west 2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eu west 2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEu_west_2(Eu_west_2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ap southeast 1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ap southeast 1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAp_southeast_1(Ap_southeast_1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ca central 1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ca central 1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCa_central_1(Ca_central_1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ap northeast 2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ap northeast 2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAp_northeast_2(Ap_northeast_2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ap south east2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ap south east2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAp_south_east2(Ap_south_east2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Eu central 1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Eu central 1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEu_central_1(Eu_central_1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ap northeast 1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ap northeast 1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAp_northeast_1(Ap_northeast_1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixinBase(MixinBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Region</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Region</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegion(Region object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Northamerica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Northamerica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNorthamerica(Northamerica object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Europe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Europe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEurope(Europe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Asiapacific</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Asiapacific</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsiapacific(Asiapacific object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AwsregionsSwitch
