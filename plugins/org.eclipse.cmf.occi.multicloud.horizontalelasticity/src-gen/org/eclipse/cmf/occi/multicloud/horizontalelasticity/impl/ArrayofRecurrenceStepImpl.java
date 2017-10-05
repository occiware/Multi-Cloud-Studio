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
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl;

import java.util.Collection;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.ArrayofRecurrenceStep;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.RecurrenceStep;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arrayof Recurrence Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ArrayofRecurrenceStepImpl#getArrayofrecurrencestepValues <em>Arrayofrecurrencestep Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArrayofRecurrenceStepImpl extends EObjectImpl implements ArrayofRecurrenceStep {
	/**
	 * The cached value of the '{@link #getArrayofrecurrencestepValues() <em>Arrayofrecurrencestep Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayofrecurrencestepValues()
	 * @generated
	 * @ordered
	 */
	protected EList<RecurrenceStep> arrayofrecurrencestepValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArrayofRecurrenceStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.ARRAYOF_RECURRENCE_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RecurrenceStep> getArrayofrecurrencestepValues() {
		if (arrayofrecurrencestepValues == null) {
			arrayofrecurrencestepValues = new EObjectContainmentEList<RecurrenceStep>(RecurrenceStep.class, this, HorizontalelasticityPackage.ARRAYOF_RECURRENCE_STEP__ARRAYOFRECURRENCESTEP_VALUES);
		}
		return arrayofrecurrencestepValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case HorizontalelasticityPackage.ARRAYOF_RECURRENCE_STEP__ARRAYOFRECURRENCESTEP_VALUES:
				return ((InternalEList<?>)getArrayofrecurrencestepValues()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.ARRAYOF_RECURRENCE_STEP__ARRAYOFRECURRENCESTEP_VALUES:
				return getArrayofrecurrencestepValues();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case HorizontalelasticityPackage.ARRAYOF_RECURRENCE_STEP__ARRAYOFRECURRENCESTEP_VALUES:
				getArrayofrecurrencestepValues().clear();
				getArrayofrecurrencestepValues().addAll((Collection<? extends RecurrenceStep>)newValue);
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
			case HorizontalelasticityPackage.ARRAYOF_RECURRENCE_STEP__ARRAYOFRECURRENCESTEP_VALUES:
				getArrayofrecurrencestepValues().clear();
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
			case HorizontalelasticityPackage.ARRAYOF_RECURRENCE_STEP__ARRAYOFRECURRENCESTEP_VALUES:
				return arrayofrecurrencestepValues != null && !arrayofrecurrencestepValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ArrayofRecurrenceStepImpl
