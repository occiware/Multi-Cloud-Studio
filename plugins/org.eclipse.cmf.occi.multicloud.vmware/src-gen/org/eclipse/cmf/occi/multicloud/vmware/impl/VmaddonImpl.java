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

import org.eclipse.cmf.occi.multicloud.vmware.Vmaddon;
import org.eclipse.cmf.occi.multicloud.vmware.Vmimage;
import org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage;
import org.eclipse.cmf.occi.multicloud.vmware.VmwareTables;

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
 * An implementation of the model object '<em><b>Vmaddon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmaddonImpl#getImagename <em>Imagename</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmaddonImpl#getVcpu <em>Vcpu</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmaddonImpl#getGueststate <em>Gueststate</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmaddonImpl#getGuestosid <em>Guestosid</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.impl.VmaddonImpl#getMarkedastemplate <em>Markedastemplate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VmaddonImpl extends MixinBaseImpl implements Vmaddon {
	/**
	 * The default value of the '{@link #getImagename() <em>Imagename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagename()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImagename() <em>Imagename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImagename()
	 * @generated
	 * @ordered
	 */
	protected String imagename = IMAGENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVcpu() <em>Vcpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpu()
	 * @generated
	 * @ordered
	 */
	protected static final String VCPU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVcpu() <em>Vcpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVcpu()
	 * @generated
	 * @ordered
	 */
	protected String vcpu = VCPU_EDEFAULT;

	/**
	 * The default value of the '{@link #getGueststate() <em>Gueststate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGueststate()
	 * @generated
	 * @ordered
	 */
	protected static final String GUESTSTATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGueststate() <em>Gueststate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGueststate()
	 * @generated
	 * @ordered
	 */
	protected String gueststate = GUESTSTATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuestosid() <em>Guestosid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestosid()
	 * @generated
	 * @ordered
	 */
	protected static final String GUESTOSID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuestosid() <em>Guestosid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestosid()
	 * @generated
	 * @ordered
	 */
	protected String guestosid = GUESTOSID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarkedastemplate() <em>Markedastemplate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkedastemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String MARKEDASTEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarkedastemplate() <em>Markedastemplate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarkedastemplate()
	 * @generated
	 * @ordered
	 */
	protected String markedastemplate = MARKEDASTEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VmaddonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmwarePackage.Literals.VMADDON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImagename() {
		return imagename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImagename(String newImagename) {
		String oldImagename = imagename;
		imagename = newImagename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VMADDON__IMAGENAME, oldImagename, imagename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVcpu() {
		return vcpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVcpu(String newVcpu) {
		String oldVcpu = vcpu;
		vcpu = newVcpu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VMADDON__VCPU, oldVcpu, vcpu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGueststate() {
		return gueststate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGueststate(String newGueststate) {
		String oldGueststate = gueststate;
		gueststate = newGueststate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VMADDON__GUESTSTATE, oldGueststate, gueststate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuestosid() {
		return guestosid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestosid(String newGuestosid) {
		String oldGuestosid = guestosid;
		guestosid = newGuestosid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VMADDON__GUESTOSID, oldGuestosid, guestosid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMarkedastemplate() {
		return markedastemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarkedastemplate(String newMarkedastemplate) {
		String oldMarkedastemplate = markedastemplate;
		markedastemplate = newMarkedastemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmwarePackage.VMADDON__MARKEDASTEMPLATE, oldMarkedastemplate, markedastemplate));
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
		 *   let severity : Integer[1] = 'Vmaddon::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(infrastructure::Compute)
		 *       in
		 *         'Vmaddon::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, VmwareTables.STR_Vmaddon_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, VmwareTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_infrastructure_c_c_Compute_0 = idResolver.getClass(VmwareTables.CLSSid_Compute, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Compute_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, VmwareTables.STR_Vmaddon_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, VmwareTables.INT_0).booleanValue();
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
			case VmwarePackage.VMADDON__IMAGENAME:
				return getImagename();
			case VmwarePackage.VMADDON__VCPU:
				return getVcpu();
			case VmwarePackage.VMADDON__GUESTSTATE:
				return getGueststate();
			case VmwarePackage.VMADDON__GUESTOSID:
				return getGuestosid();
			case VmwarePackage.VMADDON__MARKEDASTEMPLATE:
				return getMarkedastemplate();
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
			case VmwarePackage.VMADDON__IMAGENAME:
				setImagename((String)newValue);
				return;
			case VmwarePackage.VMADDON__VCPU:
				setVcpu((String)newValue);
				return;
			case VmwarePackage.VMADDON__GUESTSTATE:
				setGueststate((String)newValue);
				return;
			case VmwarePackage.VMADDON__GUESTOSID:
				setGuestosid((String)newValue);
				return;
			case VmwarePackage.VMADDON__MARKEDASTEMPLATE:
				setMarkedastemplate((String)newValue);
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
			case VmwarePackage.VMADDON__IMAGENAME:
				setImagename(IMAGENAME_EDEFAULT);
				return;
			case VmwarePackage.VMADDON__VCPU:
				setVcpu(VCPU_EDEFAULT);
				return;
			case VmwarePackage.VMADDON__GUESTSTATE:
				setGueststate(GUESTSTATE_EDEFAULT);
				return;
			case VmwarePackage.VMADDON__GUESTOSID:
				setGuestosid(GUESTOSID_EDEFAULT);
				return;
			case VmwarePackage.VMADDON__MARKEDASTEMPLATE:
				setMarkedastemplate(MARKEDASTEMPLATE_EDEFAULT);
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
			case VmwarePackage.VMADDON__IMAGENAME:
				return IMAGENAME_EDEFAULT == null ? imagename != null : !IMAGENAME_EDEFAULT.equals(imagename);
			case VmwarePackage.VMADDON__VCPU:
				return VCPU_EDEFAULT == null ? vcpu != null : !VCPU_EDEFAULT.equals(vcpu);
			case VmwarePackage.VMADDON__GUESTSTATE:
				return GUESTSTATE_EDEFAULT == null ? gueststate != null : !GUESTSTATE_EDEFAULT.equals(gueststate);
			case VmwarePackage.VMADDON__GUESTOSID:
				return GUESTOSID_EDEFAULT == null ? guestosid != null : !GUESTOSID_EDEFAULT.equals(guestosid);
			case VmwarePackage.VMADDON__MARKEDASTEMPLATE:
				return MARKEDASTEMPLATE_EDEFAULT == null ? markedastemplate != null : !MARKEDASTEMPLATE_EDEFAULT.equals(markedastemplate);
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
		if (baseClass == Vmimage.class) {
			switch (derivedFeatureID) {
				case VmwarePackage.VMADDON__IMAGENAME: return VmwarePackage.VMIMAGE__IMAGENAME;
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
		if (baseClass == Vmimage.class) {
			switch (baseFeatureID) {
				case VmwarePackage.VMIMAGE__IMAGENAME: return VmwarePackage.VMADDON__IMAGENAME;
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
		if (baseClass == Vmimage.class) {
			switch (baseOperationID) {
				case VmwarePackage.VMIMAGE___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return VmwarePackage.VMADDON___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
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
			case VmwarePackage.VMADDON___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
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
		result.append(" (imagename: ");
		result.append(imagename);
		result.append(", vcpu: ");
		result.append(vcpu);
		result.append(", gueststate: ");
		result.append(gueststate);
		result.append(", guestosid: ");
		result.append(guestosid);
		result.append(", markedastemplate: ");
		result.append(markedastemplate);
		result.append(')');
		return result.toString();
	}

} //VmaddonImpl
