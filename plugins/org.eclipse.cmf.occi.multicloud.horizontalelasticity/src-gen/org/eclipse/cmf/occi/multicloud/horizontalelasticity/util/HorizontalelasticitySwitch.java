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
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;

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
			case HorizontalelasticityPackage.RECURRENCE_STEP: {
				RecurrenceStep recurrenceStep = (RecurrenceStep)theEObject;
				T result = caseRecurrenceStep(recurrenceStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.ARRAY: {
				Array array = (Array)theEObject;
				T result = caseArray(array);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.ARROF_REC_STEP: {
				ArrofRecStep arrofRecStep = (ArrofRecStep)theEObject;
				T result = caseArrofRecStep(arrofRecStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
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
			case HorizontalelasticityPackage.HORIZONTALELASTICCONTROLLER: {
				Horizontalelasticcontroller horizontalelasticcontroller = (Horizontalelasticcontroller)theEObject;
				T result = caseHorizontalelasticcontroller(horizontalelasticcontroller);
				if (result == null) result = caseResource(horizontalelasticcontroller);
				if (result == null) result = caseEntity(horizontalelasticcontroller);
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
			case HorizontalelasticityPackage.GROUPLINK: {
				Grouplink grouplink = (Grouplink)theEObject;
				T result = caseGrouplink(grouplink);
				if (result == null) result = caseLink(grouplink);
				if (result == null) result = caseEntity(grouplink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.MANUAL: {
				Manual manual = (Manual)theEObject;
				T result = caseManual(manual);
				if (result == null) result = caseHorizontalelasticcontroller(manual);
				if (result == null) result = caseResource(manual);
				if (result == null) result = caseEntity(manual);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.DYNAMIC: {
				Dynamic dynamic = (Dynamic)theEObject;
				T result = caseDynamic(dynamic);
				if (result == null) result = caseHorizontalelasticcontroller(dynamic);
				if (result == null) result = caseResource(dynamic);
				if (result == null) result = caseEntity(dynamic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.SIMPLEDYNAMIC: {
				Simpledynamic simpledynamic = (Simpledynamic)theEObject;
				T result = caseSimpledynamic(simpledynamic);
				if (result == null) result = caseDynamicpolicy(simpledynamic);
				if (result == null) result = caseDynamic(simpledynamic);
				if (result == null) result = caseHorizontalelasticcontroller(simpledynamic);
				if (result == null) result = caseResource(simpledynamic);
				if (result == null) result = caseEntity(simpledynamic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.STEPDYNAMIC: {
				Stepdynamic stepdynamic = (Stepdynamic)theEObject;
				T result = caseStepdynamic(stepdynamic);
				if (result == null) result = caseDynamicpolicy(stepdynamic);
				if (result == null) result = caseDynamic(stepdynamic);
				if (result == null) result = caseHorizontalelasticcontroller(stepdynamic);
				if (result == null) result = caseResource(stepdynamic);
				if (result == null) result = caseEntity(stepdynamic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.DYNAMICADJUSTMENT: {
				Dynamicadjustment dynamicadjustment = (Dynamicadjustment)theEObject;
				T result = caseDynamicadjustment(dynamicadjustment);
				if (result == null) result = caseDynamic(dynamicadjustment);
				if (result == null) result = caseHorizontalelasticcontroller(dynamicadjustment);
				if (result == null) result = caseResource(dynamicadjustment);
				if (result == null) result = caseEntity(dynamicadjustment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.RULE: {
				Rule rule = (Rule)theEObject;
				T result = caseRule(rule);
				if (result == null) result = caseLink(rule);
				if (result == null) result = caseEntity(rule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.ACTIONTRIGGER: {
				Actiontrigger actiontrigger = (Actiontrigger)theEObject;
				T result = caseActiontrigger(actiontrigger);
				if (result == null) result = caseResource(actiontrigger);
				if (result == null) result = caseEntity(actiontrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.DYNAMICPOLICY: {
				Dynamicpolicy dynamicpolicy = (Dynamicpolicy)theEObject;
				T result = caseDynamicpolicy(dynamicpolicy);
				if (result == null) result = caseDynamic(dynamicpolicy);
				if (result == null) result = caseHorizontalelasticcontroller(dynamicpolicy);
				if (result == null) result = caseResource(dynamicpolicy);
				if (result == null) result = caseEntity(dynamicpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.STEP: {
				Step step = (Step)theEObject;
				T result = caseStep(step);
				if (result == null) result = caseResource(step);
				if (result == null) result = caseEntity(step);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.STEPLINK: {
				Steplink steplink = (Steplink)theEObject;
				T result = caseSteplink(steplink);
				if (result == null) result = caseLink(steplink);
				if (result == null) result = caseEntity(steplink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.CREATION: {
				Creation creation = (Creation)theEObject;
				T result = caseCreation(creation);
				if (result == null) result = caseMixinBase(creation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.SCHEDULER: {
				Scheduler scheduler = (Scheduler)theEObject;
				T result = caseScheduler(scheduler);
				if (result == null) result = caseMixinBase(scheduler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.UNIQUESCHEDULE: {
				Uniqueschedule uniqueschedule = (Uniqueschedule)theEObject;
				T result = caseUniqueschedule(uniqueschedule);
				if (result == null) result = caseScheduler(uniqueschedule);
				if (result == null) result = caseMixinBase(uniqueschedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.RECURRINGSCHEDULE: {
				Recurringschedule recurringschedule = (Recurringschedule)theEObject;
				T result = caseRecurringschedule(recurringschedule);
				if (result == null) result = caseScheduler(recurringschedule);
				if (result == null) result = caseMixinBase(recurringschedule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recurrence Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recurrence Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecurrenceStep(RecurrenceStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArray(Array object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arrof Rec Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arrof Rec Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrofRecStep(ArrofRecStep object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Horizontalelasticcontroller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Horizontalelasticcontroller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHorizontalelasticcontroller(Horizontalelasticcontroller object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Grouplink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grouplink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGrouplink(Grouplink object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Simpledynamic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simpledynamic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpledynamic(Simpledynamic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stepdynamic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stepdynamic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepdynamic(Stepdynamic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamicadjustment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamicadjustment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicadjustment(Dynamicadjustment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRule(Rule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Actiontrigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Actiontrigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActiontrigger(Actiontrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamicpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamicpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicpolicy(Dynamicpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStep(Step object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Steplink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Steplink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSteplink(Steplink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Creation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Creation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCreation(Creation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scheduler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScheduler(Scheduler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniqueschedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniqueschedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniqueschedule(Uniqueschedule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recurringschedule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recurringschedule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecurringschedule(Recurringschedule object) {
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

} //HorizontalelasticitySwitch
