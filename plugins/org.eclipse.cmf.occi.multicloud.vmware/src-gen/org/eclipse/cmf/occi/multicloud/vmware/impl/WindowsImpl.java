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
package org.eclipse.cmf.occi.multicloud.vmware.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.infrastructure.Os_tpl;

import org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers;
import org.eclipse.cmf.occi.multicloud.vmware.Os_tpl_vmware;
import org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage;
import org.eclipse.cmf.occi.multicloud.vmware.VmwareTables;
import org.eclipse.cmf.occi.multicloud.vmware.Windows;

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
 * An implementation of the model object '<em><b>Windows</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.WindowsImpl#getDatastoreisopath <em>Datastoreisopath</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.WindowsImpl#getGuestid <em>Guestid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindowsImpl extends MixinBaseImpl implements Windows {
	/**
	 * The default value of the '{@link #getDatastoreisopath() <em>Datastoreisopath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatastoreisopath()
	 * @generated
	 * @ordered
	 */
	protected static final String DATASTOREISOPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDatastoreisopath() <em>Datastoreisopath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatastoreisopath()
	 * @generated
	 * @ordered
	 */
	protected String datastoreisopath = DATASTOREISOPATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuestid() <em>Guestid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestid()
	 * @generated
	 * @ordered
	 */
	protected static final GuestOsIdentifiers GUESTID_EDEFAULT = GuestOsIdentifiers.DOS_GUEST;

	/**
	 * The cached value of the '{@link #getGuestid() <em>Guestid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestid()
	 * @generated
	 * @ordered
	 */
	protected GuestOsIdentifiers guestid = GUESTID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WindowsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.Literals.WINDOWS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDatastoreisopath() {
		return datastoreisopath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDatastoreisopath(String newDatastoreisopath) {
		String oldDatastoreisopath = datastoreisopath;
		datastoreisopath = newDatastoreisopath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.WINDOWS__DATASTOREISOPATH, oldDatastoreisopath, datastoreisopath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestOsIdentifiers getGuestid() {
		return guestid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestid(GuestOsIdentifiers newGuestid) {
		GuestOsIdentifiers oldGuestid = guestid;
		guestid = newGuestid == null ? GUESTID_EDEFAULT : newGuestid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.WINDOWS__GUESTID, oldGuestid, guestid));
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
		 *   let severity : Integer[1] = 'Windows::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Instancevmware)
		 *       in
		 *         'Windows::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, VmwareTables.STR_Windows_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, VmwareTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_vmware_c_c_Instancevmware = idResolver.getClass(VmwareTables.CLSSid_Instancevmware, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_vmware_c_c_Instancevmware).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, VmwareTables.STR_Windows_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, VmwareTables.INT_0).booleanValue();
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
			case VmwarePackage.WINDOWS__DATASTOREISOPATH:
				return getDatastoreisopath();
			case VmwarePackage.WINDOWS__GUESTID:
				return getGuestid();
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
			case VmwarePackage.WINDOWS__DATASTOREISOPATH:
				setDatastoreisopath((String)newValue);
				return;
			case VmwarePackage.WINDOWS__GUESTID:
				setGuestid((GuestOsIdentifiers)newValue);
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
			case VmwarePackage.WINDOWS__DATASTOREISOPATH:
				setDatastoreisopath(DATASTOREISOPATH_EDEFAULT);
				return;
			case VmwarePackage.WINDOWS__GUESTID:
				setGuestid(GUESTID_EDEFAULT);
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
			case VmwarePackage.WINDOWS__DATASTOREISOPATH:
				return DATASTOREISOPATH_EDEFAULT == null ? datastoreisopath != null : !DATASTOREISOPATH_EDEFAULT.equals(datastoreisopath);
			case VmwarePackage.WINDOWS__GUESTID:
				return guestid != GUESTID_EDEFAULT;
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
		if (baseClass == Os_tpl.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Os_tpl_vmware.class) {
			switch (derivedFeatureID) {
				case VmwarePackage.WINDOWS__DATASTOREISOPATH: return VmwarePackage.OS_TPL_VMWARE__DATASTOREISOPATH;
				case VmwarePackage.WINDOWS__GUESTID: return VmwarePackage.OS_TPL_VMWARE__GUESTID;
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
		if (baseClass == Os_tpl.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Os_tpl_vmware.class) {
			switch (baseFeatureID) {
				case VmwarePackage.OS_TPL_VMWARE__DATASTOREISOPATH: return VmwarePackage.WINDOWS__DATASTOREISOPATH;
				case VmwarePackage.OS_TPL_VMWARE__GUESTID: return VmwarePackage.WINDOWS__GUESTID;
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Os_tpl.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Os_tpl_vmware.class) {
			switch (baseOperationID) {
				case VmwarePackage.OS_TPL_VMWARE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return VmwarePackage.WINDOWS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case VmwarePackage.WINDOWS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (datastoreisopath: ");
		result.append(datastoreisopath);
		result.append(", guestid: ");
		result.append(guestid);
		result.append(')');
		return result.toString();
	}

} //WindowsImpl
