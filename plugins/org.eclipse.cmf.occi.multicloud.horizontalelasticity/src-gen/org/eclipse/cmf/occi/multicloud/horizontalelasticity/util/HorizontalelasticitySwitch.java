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
			case HorizontalelasticityPackage.ELASTICITYCONTROLLER: {
				Elasticitycontroller elasticitycontroller = (Elasticitycontroller)theEObject;
				T result = caseElasticitycontroller(elasticitycontroller);
				if (result == null) result = caseResource(elasticitycontroller);
				if (result == null) result = caseEntity(elasticitycontroller);
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
			case HorizontalelasticityPackage.LOADBALANCERLINK: {
				Loadbalancerlink loadbalancerlink = (Loadbalancerlink)theEObject;
				T result = caseLoadbalancerlink(loadbalancerlink);
				if (result == null) result = caseLink(loadbalancerlink);
				if (result == null) result = caseEntity(loadbalancerlink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.ELASTICLINK: {
				Elasticlink elasticlink = (Elasticlink)theEObject;
				T result = caseElasticlink(elasticlink);
				if (result == null) result = caseLink(elasticlink);
				if (result == null) result = caseEntity(elasticlink);
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
			case HorizontalelasticityPackage.SCHEDULINGPOLICY: {
				Schedulingpolicy schedulingpolicy = (Schedulingpolicy)theEObject;
				T result = caseSchedulingpolicy(schedulingpolicy);
				if (result == null) result = caseMixinBase(schedulingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.UNIQUESCHEDULINGPOLICY: {
				Uniqueschedulingpolicy uniqueschedulingpolicy = (Uniqueschedulingpolicy)theEObject;
				T result = caseUniqueschedulingpolicy(uniqueschedulingpolicy);
				if (result == null) result = caseSchedulingpolicy(uniqueschedulingpolicy);
				if (result == null) result = caseMixinBase(uniqueschedulingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.RECURRINGSCHEDULINGPOLICY: {
				Recurringschedulingpolicy recurringschedulingpolicy = (Recurringschedulingpolicy)theEObject;
				T result = caseRecurringschedulingpolicy(recurringschedulingpolicy);
				if (result == null) result = caseSchedulingpolicy(recurringschedulingpolicy);
				if (result == null) result = caseMixinBase(recurringschedulingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.SCALINGPOLICY: {
				Scalingpolicy scalingpolicy = (Scalingpolicy)theEObject;
				T result = caseScalingpolicy(scalingpolicy);
				if (result == null) result = caseMixinBase(scalingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.DYNAMICSCALINGPOLICY: {
				Dynamicscalingpolicy dynamicscalingpolicy = (Dynamicscalingpolicy)theEObject;
				T result = caseDynamicscalingpolicy(dynamicscalingpolicy);
				if (result == null) result = caseScalingpolicy(dynamicscalingpolicy);
				if (result == null) result = caseMixinBase(dynamicscalingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.DYNAMICADJUSTMENTSCALINGPOLICY: {
				Dynamicadjustmentscalingpolicy dynamicadjustmentscalingpolicy = (Dynamicadjustmentscalingpolicy)theEObject;
				T result = caseDynamicadjustmentscalingpolicy(dynamicadjustmentscalingpolicy);
				if (result == null) result = caseDynamicscalingpolicy(dynamicadjustmentscalingpolicy);
				if (result == null) result = caseScalingpolicy(dynamicadjustmentscalingpolicy);
				if (result == null) result = caseMixinBase(dynamicadjustmentscalingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.SIMPLEDYNAMICSCALINGPOLICY: {
				Simpledynamicscalingpolicy simpledynamicscalingpolicy = (Simpledynamicscalingpolicy)theEObject;
				T result = caseSimpledynamicscalingpolicy(simpledynamicscalingpolicy);
				if (result == null) result = caseDynamicscalingpolicy(simpledynamicscalingpolicy);
				if (result == null) result = caseScalingpolicy(simpledynamicscalingpolicy);
				if (result == null) result = caseMixinBase(simpledynamicscalingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.STEPDYNAMICSCALINGPOLICY: {
				Stepdynamicscalingpolicy stepdynamicscalingpolicy = (Stepdynamicscalingpolicy)theEObject;
				T result = caseStepdynamicscalingpolicy(stepdynamicscalingpolicy);
				if (result == null) result = caseDynamicscalingpolicy(stepdynamicscalingpolicy);
				if (result == null) result = caseScalingpolicy(stepdynamicscalingpolicy);
				if (result == null) result = caseMixinBase(stepdynamicscalingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.MANUALSCALINGPOLICY: {
				Manualscalingpolicy manualscalingpolicy = (Manualscalingpolicy)theEObject;
				T result = caseManualscalingpolicy(manualscalingpolicy);
				if (result == null) result = caseScalingpolicy(manualscalingpolicy);
				if (result == null) result = caseMixinBase(manualscalingpolicy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.METRIC: {
				Metric metric = (Metric)theEObject;
				T result = caseMetric(metric);
				if (result == null) result = caseMixinBase(metric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.CPUUTILISATION: {
				Cpuutilisation cpuutilisation = (Cpuutilisation)theEObject;
				T result = caseCpuutilisation(cpuutilisation);
				if (result == null) result = caseMetric(cpuutilisation);
				if (result == null) result = caseMixinBase(cpuutilisation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case HorizontalelasticityPackage.MEMORYUTILISATION: {
				Memoryutilisation memoryutilisation = (Memoryutilisation)theEObject;
				T result = caseMemoryutilisation(memoryutilisation);
				if (result == null) result = caseMetric(memoryutilisation);
				if (result == null) result = caseMixinBase(memoryutilisation);
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
	 * Returns the result of interpreting the object as an instance of '<em>Elasticitycontroller</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elasticitycontroller</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElasticitycontroller(Elasticitycontroller object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Loadbalancerlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loadbalancerlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoadbalancerlink(Loadbalancerlink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Elasticlink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Elasticlink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElasticlink(Elasticlink object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Schedulingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schedulingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchedulingpolicy(Schedulingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Uniqueschedulingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Uniqueschedulingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUniqueschedulingpolicy(Uniqueschedulingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recurringschedulingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recurringschedulingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecurringschedulingpolicy(Recurringschedulingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scalingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScalingpolicy(Scalingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamicscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamicscalingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicscalingpolicy(Dynamicscalingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamicadjustmentscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamicadjustmentscalingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicadjustmentscalingpolicy(Dynamicadjustmentscalingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simpledynamicscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simpledynamicscalingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpledynamicscalingpolicy(Simpledynamicscalingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stepdynamicscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stepdynamicscalingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStepdynamicscalingpolicy(Stepdynamicscalingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manualscalingpolicy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manualscalingpolicy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManualscalingpolicy(Manualscalingpolicy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpuutilisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpuutilisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpuutilisation(Cpuutilisation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memoryutilisation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memoryutilisation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryutilisation(Memoryutilisation object) {
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
