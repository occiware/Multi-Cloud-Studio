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
package org.eclipse.cmf.occi.multicloud.elasticzabbix.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables;
import org.eclipse.cmf.occi.multicloud.elasticzabbix.Supervisorapiconnect;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supervisorapiconnect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.SupervisorapiconnectImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.SupervisorapiconnectImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.impl.SupervisorapiconnectImpl#getHttpApiAddress <em>Http Api Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupervisorapiconnectImpl extends MixinBaseImpl implements Supervisorapiconnect {
	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getHttpApiAddress() <em>Http Api Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpApiAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String HTTP_API_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHttpApiAddress() <em>Http Api Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpApiAddress()
	 * @generated
	 * @ordered
	 */
	protected String httpApiAddress = HTTP_API_ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupervisorapiconnectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ElasticzabbixPackage.Literals.SUPERVISORAPICONNECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticzabbixPackage.SUPERVISORAPICONNECT__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticzabbixPackage.SUPERVISORAPICONNECT__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHttpApiAddress() {
		return httpApiAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHttpApiAddress(String newHttpApiAddress) {
		String oldHttpApiAddress = httpApiAddress;
		httpApiAddress = newHttpApiAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ElasticzabbixPackage.SUPERVISORAPICONNECT__HTTP_API_ADDRESS, oldHttpApiAddress, httpApiAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let
		 *     severity : Integer[1] = 'Supervisorapiconnect::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(monitoring::Collector)
		 *       in
		 *         'Supervisorapiconnect::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ElasticzabbixTables.STR_Supervisorapiconnect_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ElasticzabbixTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_monitoring_c_c_Collector_0 = idResolver.getClass(ElasticzabbixTables.CLSSid_Collector, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_monitoring_c_c_Collector_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ElasticzabbixTables.STR_Supervisorapiconnect_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ElasticzabbixTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ElasticzabbixPackage.SUPERVISORAPICONNECT__USERNAME:
				return getUsername();
			case ElasticzabbixPackage.SUPERVISORAPICONNECT__PASSWORD:
				return getPassword();
			case ElasticzabbixPackage.SUPERVISORAPICONNECT__HTTP_API_ADDRESS:
				return getHttpApiAddress();
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
			case ElasticzabbixPackage.SUPERVISORAPICONNECT__USERNAME:
				setUsername((String)newValue);
				return;
			case ElasticzabbixPackage.SUPERVISORAPICONNECT__PASSWORD:
				setPassword((String)newValue);
				return;
			case ElasticzabbixPackage.SUPERVISORAPICONNECT__HTTP_API_ADDRESS:
				setHttpApiAddress((String)newValue);
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
			case ElasticzabbixPackage.SUPERVISORAPICONNECT__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case ElasticzabbixPackage.SUPERVISORAPICONNECT__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case ElasticzabbixPackage.SUPERVISORAPICONNECT__HTTP_API_ADDRESS:
				setHttpApiAddress(HTTP_API_ADDRESS_EDEFAULT);
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
			case ElasticzabbixPackage.SUPERVISORAPICONNECT__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case ElasticzabbixPackage.SUPERVISORAPICONNECT__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case ElasticzabbixPackage.SUPERVISORAPICONNECT__HTTP_API_ADDRESS:
				return HTTP_API_ADDRESS_EDEFAULT == null ? httpApiAddress != null : !HTTP_API_ADDRESS_EDEFAULT.equals(httpApiAddress);
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
			case ElasticzabbixPackage.SUPERVISORAPICONNECT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(", httpApiAddress: ");
		result.append(httpApiAddress);
		result.append(')');
		return result.toString();
	}

} //SupervisorapiconnectImpl
