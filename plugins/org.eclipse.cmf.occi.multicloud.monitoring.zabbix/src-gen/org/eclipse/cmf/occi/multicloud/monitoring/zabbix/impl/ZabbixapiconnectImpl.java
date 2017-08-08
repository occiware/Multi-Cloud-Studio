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
package org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl;

import cloudmonitoring.CloudmonitoringPackage;
import cloudmonitoring.Supervisorapiconnect;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.ZabbixPackage;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.ZabbixTables;
import org.eclipse.cmf.occi.multicloud.monitoring.zabbix.Zabbixapiconnect;

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
 * An implementation of the model object '<em><b>Zabbixapiconnect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixapiconnectImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixapiconnectImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixapiconnectImpl#getHttpApiAddress <em>Http Api Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ZabbixapiconnectImpl extends MixinBaseImpl implements Zabbixapiconnect {
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
	protected ZabbixapiconnectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ZabbixPackage.Literals.ZABBIXAPICONNECT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZabbixPackage.ZABBIXAPICONNECT__USERNAME, oldUsername, username));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZabbixPackage.ZABBIXAPICONNECT__PASSWORD, oldPassword, password));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ZabbixPackage.ZABBIXAPICONNECT__HTTP_API_ADDRESS, oldHttpApiAddress, httpApiAddress));
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
		 *     severity : Integer[1] = 'Zabbixapiconnect::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Zabbixcollector)
		 *       in
		 *         'Zabbixapiconnect::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, ZabbixTables.STR_Zabbixapiconnect_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, ZabbixTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_zabbix_c_c_Zabbixcollector = idResolver.getClass(ZabbixTables.CLSSid_Zabbixcollector, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_zabbix_c_c_Zabbixcollector).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, ZabbixTables.STR_Zabbixapiconnect_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, ZabbixTables.INT_0).booleanValue();
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
			case ZabbixPackage.ZABBIXAPICONNECT__USERNAME:
				return getUsername();
			case ZabbixPackage.ZABBIXAPICONNECT__PASSWORD:
				return getPassword();
			case ZabbixPackage.ZABBIXAPICONNECT__HTTP_API_ADDRESS:
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
			case ZabbixPackage.ZABBIXAPICONNECT__USERNAME:
				setUsername((String)newValue);
				return;
			case ZabbixPackage.ZABBIXAPICONNECT__PASSWORD:
				setPassword((String)newValue);
				return;
			case ZabbixPackage.ZABBIXAPICONNECT__HTTP_API_ADDRESS:
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
			case ZabbixPackage.ZABBIXAPICONNECT__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case ZabbixPackage.ZABBIXAPICONNECT__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case ZabbixPackage.ZABBIXAPICONNECT__HTTP_API_ADDRESS:
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
			case ZabbixPackage.ZABBIXAPICONNECT__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case ZabbixPackage.ZABBIXAPICONNECT__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case ZabbixPackage.ZABBIXAPICONNECT__HTTP_API_ADDRESS:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Supervisorapiconnect.class) {
			switch (derivedFeatureID) {
				case ZabbixPackage.ZABBIXAPICONNECT__USERNAME: return CloudmonitoringPackage.SUPERVISORAPICONNECT__USERNAME;
				case ZabbixPackage.ZABBIXAPICONNECT__PASSWORD: return CloudmonitoringPackage.SUPERVISORAPICONNECT__PASSWORD;
				case ZabbixPackage.ZABBIXAPICONNECT__HTTP_API_ADDRESS: return CloudmonitoringPackage.SUPERVISORAPICONNECT__HTTP_API_ADDRESS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Supervisorapiconnect.class) {
			switch (baseFeatureID) {
				case CloudmonitoringPackage.SUPERVISORAPICONNECT__USERNAME: return ZabbixPackage.ZABBIXAPICONNECT__USERNAME;
				case CloudmonitoringPackage.SUPERVISORAPICONNECT__PASSWORD: return ZabbixPackage.ZABBIXAPICONNECT__PASSWORD;
				case CloudmonitoringPackage.SUPERVISORAPICONNECT__HTTP_API_ADDRESS: return ZabbixPackage.ZABBIXAPICONNECT__HTTP_API_ADDRESS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
			case ZabbixPackage.ZABBIXAPICONNECT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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

} //ZabbixapiconnectImpl
