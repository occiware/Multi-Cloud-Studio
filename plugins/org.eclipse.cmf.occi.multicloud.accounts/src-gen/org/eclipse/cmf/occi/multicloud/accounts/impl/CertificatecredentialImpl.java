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
package org.eclipse.cmf.occi.multicloud.accounts.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.accounts.AccountsPackage;
import org.eclipse.cmf.occi.multicloud.accounts.AccountsTables;
import org.eclipse.cmf.occi.multicloud.accounts.Certificatecredential;

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
 * An implementation of the model object '<em><b>Certificatecredential</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.accounts.impl.CertificatecredentialImpl#getPublicCertificateContent <em>Public Certificate Content</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.accounts.impl.CertificatecredentialImpl#getPrivateCertifcateName <em>Private Certifcate Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CertificatecredentialImpl extends MixinBaseImpl implements Certificatecredential {
	/**
	 * The default value of the '{@link #getPublicCertificateContent() <em>Public Certificate Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicCertificateContent()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_CERTIFICATE_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicCertificateContent() <em>Public Certificate Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicCertificateContent()
	 * @generated
	 * @ordered
	 */
	protected String publicCertificateContent = PUBLIC_CERTIFICATE_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrivateCertifcateName() <em>Private Certifcate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateCertifcateName()
	 * @generated
	 * @ordered
	 */
	protected static final String PRIVATE_CERTIFCATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrivateCertifcateName() <em>Private Certifcate Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivateCertifcateName()
	 * @generated
	 * @ordered
	 */
	protected String privateCertifcateName = PRIVATE_CERTIFCATE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertificatecredentialImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AccountsPackage.Literals.CERTIFICATECREDENTIAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicCertificateContent() {
		return publicCertificateContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicCertificateContent(String newPublicCertificateContent) {
		String oldPublicCertificateContent = publicCertificateContent;
		publicCertificateContent = newPublicCertificateContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountsPackage.CERTIFICATECREDENTIAL__PUBLIC_CERTIFICATE_CONTENT, oldPublicCertificateContent, publicCertificateContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrivateCertifcateName() {
		return privateCertifcateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivateCertifcateName(String newPrivateCertifcateName) {
		String oldPrivateCertifcateName = privateCertifcateName;
		privateCertifcateName = newPrivateCertifcateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AccountsPackage.CERTIFICATECREDENTIAL__PRIVATE_CERTIFCATE_NAME, oldPrivateCertifcateName, privateCertifcateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generate() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/security/ecore!Certificatecredential!generate()
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
		 *     severity : Integer[1] = 'Certificatecredential::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Cloudaccount)
		 *       in
		 *         'Certificatecredential::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, AccountsTables.STR_Certificatecredential_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, AccountsTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_accounts_c_c_Cloudaccount_0 = idResolver.getClass(AccountsTables.CLSSid_Cloudaccount, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_accounts_c_c_Cloudaccount_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, AccountsTables.STR_Certificatecredential_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, AccountsTables.INT_0).booleanValue();
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
			case AccountsPackage.CERTIFICATECREDENTIAL__PUBLIC_CERTIFICATE_CONTENT:
				return getPublicCertificateContent();
			case AccountsPackage.CERTIFICATECREDENTIAL__PRIVATE_CERTIFCATE_NAME:
				return getPrivateCertifcateName();
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
			case AccountsPackage.CERTIFICATECREDENTIAL__PUBLIC_CERTIFICATE_CONTENT:
				setPublicCertificateContent((String)newValue);
				return;
			case AccountsPackage.CERTIFICATECREDENTIAL__PRIVATE_CERTIFCATE_NAME:
				setPrivateCertifcateName((String)newValue);
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
			case AccountsPackage.CERTIFICATECREDENTIAL__PUBLIC_CERTIFICATE_CONTENT:
				setPublicCertificateContent(PUBLIC_CERTIFICATE_CONTENT_EDEFAULT);
				return;
			case AccountsPackage.CERTIFICATECREDENTIAL__PRIVATE_CERTIFCATE_NAME:
				setPrivateCertifcateName(PRIVATE_CERTIFCATE_NAME_EDEFAULT);
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
			case AccountsPackage.CERTIFICATECREDENTIAL__PUBLIC_CERTIFICATE_CONTENT:
				return PUBLIC_CERTIFICATE_CONTENT_EDEFAULT == null ? publicCertificateContent != null : !PUBLIC_CERTIFICATE_CONTENT_EDEFAULT.equals(publicCertificateContent);
			case AccountsPackage.CERTIFICATECREDENTIAL__PRIVATE_CERTIFCATE_NAME:
				return PRIVATE_CERTIFCATE_NAME_EDEFAULT == null ? privateCertifcateName != null : !PRIVATE_CERTIFCATE_NAME_EDEFAULT.equals(privateCertifcateName);
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
			case AccountsPackage.CERTIFICATECREDENTIAL___GENERATE:
				generate();
				return null;
			case AccountsPackage.CERTIFICATECREDENTIAL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (publicCertificateContent: ");
		result.append(publicCertificateContent);
		result.append(", privateCertifcateName: ");
		result.append(privateCertifcateName);
		result.append(')');
		return result.toString();
	}

} //CertificatecredentialImpl
