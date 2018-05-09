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
package org.eclipse.cmf.occi.multicloud.interoperability.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.cmf.occi.core.impl.LinkImpl;

import org.eclipse.cmf.occi.multicloud.interoperability.Filetransferoperations;
import org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage;
import org.eclipse.cmf.occi.multicloud.interoperability.TransferType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filetransferoperations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.FiletransferoperationsImpl#getPathLocationSource <em>Path Location Source</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.FiletransferoperationsImpl#getPathLocationTarget <em>Path Location Target</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.FiletransferoperationsImpl#getProgressPercent <em>Progress Percent</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.FiletransferoperationsImpl#getTransferMode <em>Transfer Mode</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FiletransferoperationsImpl extends LinkImpl implements Filetransferoperations {
	/**
	 * The default value of the '{@link #getPathLocationSource() <em>Path Location Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathLocationSource()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_LOCATION_SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathLocationSource() <em>Path Location Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathLocationSource()
	 * @generated
	 * @ordered
	 */
	protected String pathLocationSource = PATH_LOCATION_SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathLocationTarget() <em>Path Location Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathLocationTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_LOCATION_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPathLocationTarget() <em>Path Location Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathLocationTarget()
	 * @generated
	 * @ordered
	 */
	protected String pathLocationTarget = PATH_LOCATION_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getProgressPercent() <em>Progress Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressPercent()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PROGRESS_PERCENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProgressPercent() <em>Progress Percent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgressPercent()
	 * @generated
	 * @ordered
	 */
	protected Integer progressPercent = PROGRESS_PERCENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransferMode() <em>Transfer Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferMode()
	 * @generated
	 * @ordered
	 */
	protected static final TransferType TRANSFER_MODE_EDEFAULT = TransferType.SCP;

	/**
	 * The cached value of the '{@link #getTransferMode() <em>Transfer Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransferMode()
	 * @generated
	 * @ordered
	 */
	protected TransferType transferMode = TRANSFER_MODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FiletransferoperationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteroperabilityPackage.Literals.FILETRANSFEROPERATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathLocationSource() {
		return pathLocationSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathLocationSource(String newPathLocationSource) {
		String oldPathLocationSource = pathLocationSource;
		pathLocationSource = newPathLocationSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.FILETRANSFEROPERATIONS__PATH_LOCATION_SOURCE, oldPathLocationSource, pathLocationSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPathLocationTarget() {
		return pathLocationTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathLocationTarget(String newPathLocationTarget) {
		String oldPathLocationTarget = pathLocationTarget;
		pathLocationTarget = newPathLocationTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.FILETRANSFEROPERATIONS__PATH_LOCATION_TARGET, oldPathLocationTarget, pathLocationTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getProgressPercent() {
		return progressPercent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgressPercent(Integer newProgressPercent) {
		Integer oldProgressPercent = progressPercent;
		progressPercent = newProgressPercent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.FILETRANSFEROPERATIONS__PROGRESS_PERCENT, oldProgressPercent, progressPercent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferType getTransferMode() {
		return transferMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransferMode(TransferType newTransferMode) {
		TransferType oldTransferMode = transferMode;
		transferMode = newTransferMode == null ? TRANSFER_MODE_EDEFAULT : newTransferMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.FILETRANSFEROPERATIONS__TRANSFER_MODE, oldTransferMode, transferMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void copy() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancel() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void encryptandcopy() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__PATH_LOCATION_SOURCE:
				return getPathLocationSource();
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__PATH_LOCATION_TARGET:
				return getPathLocationTarget();
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__PROGRESS_PERCENT:
				return getProgressPercent();
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__TRANSFER_MODE:
				return getTransferMode();
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
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__PATH_LOCATION_SOURCE:
				setPathLocationSource((String)newValue);
				return;
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__PATH_LOCATION_TARGET:
				setPathLocationTarget((String)newValue);
				return;
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__PROGRESS_PERCENT:
				setProgressPercent((Integer)newValue);
				return;
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__TRANSFER_MODE:
				setTransferMode((TransferType)newValue);
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
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__PATH_LOCATION_SOURCE:
				setPathLocationSource(PATH_LOCATION_SOURCE_EDEFAULT);
				return;
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__PATH_LOCATION_TARGET:
				setPathLocationTarget(PATH_LOCATION_TARGET_EDEFAULT);
				return;
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__PROGRESS_PERCENT:
				setProgressPercent(PROGRESS_PERCENT_EDEFAULT);
				return;
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__TRANSFER_MODE:
				setTransferMode(TRANSFER_MODE_EDEFAULT);
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
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__PATH_LOCATION_SOURCE:
				return PATH_LOCATION_SOURCE_EDEFAULT == null ? pathLocationSource != null : !PATH_LOCATION_SOURCE_EDEFAULT.equals(pathLocationSource);
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__PATH_LOCATION_TARGET:
				return PATH_LOCATION_TARGET_EDEFAULT == null ? pathLocationTarget != null : !PATH_LOCATION_TARGET_EDEFAULT.equals(pathLocationTarget);
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__PROGRESS_PERCENT:
				return PROGRESS_PERCENT_EDEFAULT == null ? progressPercent != null : !PROGRESS_PERCENT_EDEFAULT.equals(progressPercent);
			case InteroperabilityPackage.FILETRANSFEROPERATIONS__TRANSFER_MODE:
				return transferMode != TRANSFER_MODE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InteroperabilityPackage.FILETRANSFEROPERATIONS___COPY:
				copy();
				return null;
			case InteroperabilityPackage.FILETRANSFEROPERATIONS___CANCEL:
				cancel();
				return null;
			case InteroperabilityPackage.FILETRANSFEROPERATIONS___ENCRYPTANDCOPY:
				encryptandcopy();
				return null;
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
		result.append(" (pathLocationSource: ");
		result.append(pathLocationSource);
		result.append(", pathLocationTarget: ");
		result.append(pathLocationTarget);
		result.append(", progressPercent: ");
		result.append(progressPercent);
		result.append(", transferMode: ");
		result.append(transferMode);
		result.append(')');
		return result.toString();
	}

} //FiletransferoperationsImpl
