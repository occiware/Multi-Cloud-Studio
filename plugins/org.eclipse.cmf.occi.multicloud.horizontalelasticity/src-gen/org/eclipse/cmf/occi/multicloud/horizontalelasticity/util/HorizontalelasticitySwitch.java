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
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.util;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.cmf.occi.infrastructure.Compute;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.*;

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
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage
 * @generated
 */
public class HorizontalelasticitySwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static HorizontalelasticityPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalelasticitySwitch() {
		if (modelPackage == null) {
			modelPackage = HorizontalelasticityPackage.eINSTANCE;
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
			case HorizontalelasticityPackage.HORIZONTALGROUP: {
				Horizontalgroup horizontalgroup = (Horizontalgroup)theEObject;
				T result = caseHorizontalgroup(horizontalgroup);
				if (result == null) result = caseResource(horizontalgroup);
				if (result == null) result = caseEntity(horizontalgroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.LOADBALANCER: {
				Loadbalancer loadbalancer = (Loadbalancer)theEObject;
				T result = caseLoadbalancer(loadbalancer);
				if (result == null) result = caseResource(loadbalancer);
				if (result == null) result = caseEntity(loadbalancer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.INSTANCE: {
				Instance instance = (Instance)theEObject;
				T result = caseInstance(instance);
				if (result == null) result = caseCompute(instance);
				if (result == null) result = caseResource(instance);
				if (result == null) result = caseEntity(instance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.HORIZONTALELASTICCONTOLLER: {
				Horizontalelasticcontoller horizontalelasticcontoller = (Horizontalelasticcontoller)theEObject;
				T result = caseHorizontalelasticcontoller(horizontalelasticcontoller);
				if (result == null) result = caseResource(horizontalelasticcontoller);
				if (result == null) result = caseEntity(horizontalelasticcontoller);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.SCALINGSTRATEGY: {
				Scalingstrategy scalingstrategy = (Scalingstrategy)theEObject;
				T result = caseScalingstrategy(scalingstrategy);
				if (result == null) result = caseHorizontalelasticcontoller(scalingstrategy);
				if (result == null) result = caseResource(scalingstrategy);
				if (result == null) result = caseEntity(scalingstrategy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.MANUAL: {
				Manual manual = (Manual)theEObject;
				T result = caseManual(manual);
				if (result == null) result = caseScalingstrategy(manual);
				if (result == null) result = caseHorizontalelasticcontoller(manual);
				if (result == null) result = caseResource(manual);
				if (result == null) result = caseEntity(manual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.DYNAMIC: {
				Dynamic dynamic = (Dynamic)theEObject;
				T result = caseDynamic(dynamic);
				if (result == null) result = caseScalingstrategy(dynamic);
				if (result == null) result = caseHorizontalelasticcontoller(dynamic);
				if (result == null) result = caseResource(dynamic);
				if (result == null) result = caseEntity(dynamic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.INSTANCEGROUPLINK: {
				Instancegrouplink instancegrouplink = (Instancegrouplink)theEObject;
				T result = caseInstancegrouplink(instancegrouplink);
				if (result == null) result = caseLink(instancegrouplink);
				if (result == null) result = caseEntity(instancegrouplink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.LINKBALANCER: {
				Linkbalancer linkbalancer = (Linkbalancer)theEObject;
				T result = caseLinkbalancer(linkbalancer);
				if (result == null) result = caseLink(linkbalancer);
				if (result == null) result = caseEntity(linkbalancer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontalgroup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontalgroup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalgroup(Horizontalgroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loadbalancer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loadbalancer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadbalancer(Loadbalancer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstance(Instance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Horizontalelasticcontoller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontalelasticcontoller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalelasticcontoller(Horizontalelasticcontoller object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalingstrategy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalingstrategy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalingstrategy(Scalingstrategy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manual</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manual</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManual(Manual object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamic(Dynamic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instancegrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instancegrouplink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstancegrouplink(Instancegrouplink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linkbalancer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linkbalancer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkbalancer(Linkbalancer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompute(Compute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLink(Link object) {
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

} //HorizontalelasticitySwitch
