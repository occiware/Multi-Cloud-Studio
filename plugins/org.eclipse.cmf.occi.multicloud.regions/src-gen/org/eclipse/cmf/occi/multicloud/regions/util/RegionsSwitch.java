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
package org.eclipse.cmf.occi.multicloud.regions.util;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.multicloud.regions.*;

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
 * @see org.eclipse.cmf.occi.multicloud.regions.RegionsPackage
 * @generated
 */
public class RegionsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RegionsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegionsSwitch() {
		if (modelPackage == null) {
			modelPackage = RegionsPackage.eINSTANCE;
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
			case RegionsPackage.REGION: {
				Region region = (Region)theEObject;
				T result = caseRegion(region);
				if (result == null) result = caseMixinBase(region);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegionsPackage.AVAILABILITYZONE: {
				Availabilityzone availabilityzone = (Availabilityzone)theEObject;
				T result = caseAvailabilityzone(availabilityzone);
				if (result == null) result = caseMixinBase(availabilityzone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegionsPackage.NORTHAMERICA: {
				Northamerica northamerica = (Northamerica)theEObject;
				T result = caseNorthamerica(northamerica);
				if (result == null) result = caseRegion(northamerica);
				if (result == null) result = caseMixinBase(northamerica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegionsPackage.SOUTHAMERICA: {
				Southamerica southamerica = (Southamerica)theEObject;
				T result = caseSouthamerica(southamerica);
				if (result == null) result = caseRegion(southamerica);
				if (result == null) result = caseMixinBase(southamerica);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegionsPackage.ASIAPACIFIC: {
				Asiapacific asiapacific = (Asiapacific)theEObject;
				T result = caseAsiapacific(asiapacific);
				if (result == null) result = caseRegion(asiapacific);
				if (result == null) result = caseMixinBase(asiapacific);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegionsPackage.EUROPE: {
				Europe europe = (Europe)theEObject;
				T result = caseEurope(europe);
				if (result == null) result = caseRegion(europe);
				if (result == null) result = caseMixinBase(europe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case RegionsPackage.AFRICA: {
				Africa africa = (Africa)theEObject;
				T result = caseAfrica(africa);
				if (result == null) result = caseRegion(africa);
				if (result == null) result = caseMixinBase(africa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>Availabilityzone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Availabilityzone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAvailabilityzone(Availabilityzone object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Southamerica</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Southamerica</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSouthamerica(Southamerica object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Africa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Africa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAfrica(Africa object) {
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

} //RegionsSwitch