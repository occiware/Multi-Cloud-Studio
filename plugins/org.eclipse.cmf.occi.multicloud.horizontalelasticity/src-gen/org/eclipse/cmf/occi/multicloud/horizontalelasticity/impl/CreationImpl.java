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

import java.lang.reflect.InvocationTargetException;

import java.sql.Time;

import java.util.Map;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Creation;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.util.HorizontalelasticityValidator;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Creation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.CreationImpl#getOcciComputeCreationDate <em>Occi Compute Creation Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CreationImpl extends MixinBaseImpl implements Creation {
	/**
	 * The default value of the '{@link #getOcciComputeCreationDate() <em>Occi Compute Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeCreationDate()
	 * @generated
	 * @ordered
	 */
	protected static final Time OCCI_COMPUTE_CREATION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOcciComputeCreationDate() <em>Occi Compute Creation Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOcciComputeCreationDate()
	 * @generated
	 * @ordered
	 */
	protected Time occiComputeCreationDate = OCCI_COMPUTE_CREATION_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return HorizontalelasticityPackage.Literals.CREATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Time getOcciComputeCreationDate() {
		return occiComputeCreationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOcciComputeCreationDate(Time newOcciComputeCreationDate) {
		Time oldOcciComputeCreationDate = occiComputeCreationDate;
		occiComputeCreationDate = newOcciComputeCreationDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, HorizontalelasticityPackage.CREATION__OCCI_COMPUTE_CREATION_DATE, oldOcciComputeCreationDate, occiComputeCreationDate));
	}

	/**
	 * The cached validation expression for the '{@link #appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String APPLIES_CONSTRAINT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION = "self.entity.oclIsKindOf(infrastructure::Compute)";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			HorizontalelasticityValidator.validate
				(HorizontalelasticityPackage.Literals.CREATION,
				 this,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 HorizontalelasticityPackage.Literals.CREATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP,
				 APPLIES_CONSTRAINT_DIAGNOSTIC_CHAIN_MAP__EEXPRESSION,
				 Diagnostic.ERROR,
				 HorizontalelasticityValidator.DIAGNOSTIC_SOURCE,
				 HorizontalelasticityValidator.CREATION__APPLIES_CONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case HorizontalelasticityPackage.CREATION__OCCI_COMPUTE_CREATION_DATE:
				return getOcciComputeCreationDate();
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
			case HorizontalelasticityPackage.CREATION__OCCI_COMPUTE_CREATION_DATE:
				setOcciComputeCreationDate((Time)newValue);
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
			case HorizontalelasticityPackage.CREATION__OCCI_COMPUTE_CREATION_DATE:
				setOcciComputeCreationDate(OCCI_COMPUTE_CREATION_DATE_EDEFAULT);
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
			case HorizontalelasticityPackage.CREATION__OCCI_COMPUTE_CREATION_DATE:
				return OCCI_COMPUTE_CREATION_DATE_EDEFAULT == null ? occiComputeCreationDate != null : !OCCI_COMPUTE_CREATION_DATE_EDEFAULT.equals(occiComputeCreationDate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case HorizontalelasticityPackage.CREATION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (occiComputeCreationDate: ");
		result.append(occiComputeCreationDate);
		result.append(')');
		return result.toString();
	}

} //CreationImpl
