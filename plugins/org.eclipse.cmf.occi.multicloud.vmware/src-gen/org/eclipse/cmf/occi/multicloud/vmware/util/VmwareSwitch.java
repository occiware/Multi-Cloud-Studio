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
package org.eclipse.cmf.occi.multicloud.vmware.util;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.infrastructure.Os_tpl;

import org.eclipse.cmf.occi.multicloud.vmware.*;

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
 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage
 * @generated
 */
public class VmwareSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static VmwarePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmwareSwitch() {
		if (modelPackage == null) {
			modelPackage = VmwarePackage.eINSTANCE;
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
			case VmwarePackage.WINDOWS: {
				Windows windows = (Windows)theEObject;
				T result = caseWindows(windows);
				if (result == null) result = caseOs_tpl(windows);
				if (result == null) result = caseMixinBase(windows);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VMADDON: {
				Vmaddon vmaddon = (Vmaddon)theEObject;
				T result = caseVmaddon(vmaddon);
				if (result == null) result = caseVmimage(vmaddon);
				if (result == null) result = caseMixinBase(vmaddon);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VMIMAGE: {
				Vmimage vmimage = (Vmimage)theEObject;
				T result = caseVmimage(vmimage);
				if (result == null) result = caseMixinBase(vmimage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.LINUX: {
				Linux linux = (Linux)theEObject;
				T result = caseLinux(linux);
				if (result == null) result = caseOs_tpl(linux);
				if (result == null) result = caseMixinBase(linux);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.MACOSX: {
				Macosx macosx = (Macosx)theEObject;
				T result = caseMacosx(macosx);
				if (result == null) result = caseOs_tpl(macosx);
				if (result == null) result = caseMixinBase(macosx);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VMWAREFOLDERS: {
				Vmwarefolders vmwarefolders = (Vmwarefolders)theEObject;
				T result = caseVmwarefolders(vmwarefolders);
				if (result == null) result = caseMixinBase(vmwarefolders);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VSWITCHINFOS: {
				Vswitchinfos vswitchinfos = (Vswitchinfos)theEObject;
				T result = caseVswitchinfos(vswitchinfos);
				if (result == null) result = caseMixinBase(vswitchinfos);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.CREDENTIAL: {
				Credential credential = (Credential)theEObject;
				T result = caseCredential(credential);
				if (result == null) result = caseMixinBase(credential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Windows</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Windows</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWindows(Windows object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vmaddon</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vmaddon</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVmaddon(Vmaddon object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vmimage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vmimage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVmimage(Vmimage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linux</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linux</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinux(Linux object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Macosx</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Macosx</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMacosx(Macosx object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vmwarefolders</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vmwarefolders</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVmwarefolders(Vmwarefolders object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vswitchinfos</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vswitchinfos</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVswitchinfos(Vswitchinfos object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Credential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Credential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCredential(Credential object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Os tpl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os tpl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOs_tpl(Os_tpl object) {
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

} //VmwareSwitch
