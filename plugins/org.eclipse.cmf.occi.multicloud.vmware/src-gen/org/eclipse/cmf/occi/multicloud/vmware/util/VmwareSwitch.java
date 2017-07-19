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

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.Network;
import org.eclipse.cmf.occi.infrastructure.Networkinterface;
import org.eclipse.cmf.occi.infrastructure.Os_tpl;
import org.eclipse.cmf.occi.infrastructure.Storage;
import org.eclipse.cmf.occi.infrastructure.Storagelink;
import org.eclipse.cmf.occi.infrastructure.User_data;

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
			case VmwarePackage.INSTANCEVMWARE: {
				Instancevmware instancevmware = (Instancevmware)theEObject;
				T result = caseInstancevmware(instancevmware);
				if (result == null) result = caseCompute(instancevmware);
				if (result == null) result = caseResource(instancevmware);
				if (result == null) result = caseEntity(instancevmware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.STORAGEVMWARE: {
				Storagevmware storagevmware = (Storagevmware)theEObject;
				T result = caseStoragevmware(storagevmware);
				if (result == null) result = caseStorage(storagevmware);
				if (result == null) result = caseResource(storagevmware);
				if (result == null) result = caseEntity(storagevmware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.STORAGELINKVMWARE: {
				Storagelinkvmware storagelinkvmware = (Storagelinkvmware)theEObject;
				T result = caseStoragelinkvmware(storagelinkvmware);
				if (result == null) result = caseStoragelink(storagelinkvmware);
				if (result == null) result = caseLink(storagelinkvmware);
				if (result == null) result = caseEntity(storagelinkvmware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.VSWITCH: {
				Vswitch vswitch = (Vswitch)theEObject;
				T result = caseVswitch(vswitch);
				if (result == null) result = caseNetwork(vswitch);
				if (result == null) result = caseResource(vswitch);
				if (result == null) result = caseEntity(vswitch);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.NETWORKADAPTER: {
				Networkadapter networkadapter = (Networkadapter)theEObject;
				T result = caseNetworkadapter(networkadapter);
				if (result == null) result = caseNetworkinterface(networkadapter);
				if (result == null) result = caseLink(networkadapter);
				if (result == null) result = caseEntity(networkadapter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.WINDOWS: {
				Windows windows = (Windows)theEObject;
				T result = caseWindows(windows);
				if (result == null) result = caseOs_tpl_vmware(windows);
				if (result == null) result = caseOs_tpl(windows);
				if (result == null) result = caseMixinBase(windows);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.LINUX: {
				Linux linux = (Linux)theEObject;
				T result = caseLinux(linux);
				if (result == null) result = caseOs_tpl_vmware(linux);
				if (result == null) result = caseOs_tpl(linux);
				if (result == null) result = caseMixinBase(linux);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.MACOSX: {
				Macosx macosx = (Macosx)theEObject;
				T result = caseMacosx(macosx);
				if (result == null) result = caseOs_tpl_vmware(macosx);
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
			case VmwarePackage.OS_TPL_VMWARE: {
				Os_tpl_vmware os_tpl_vmware = (Os_tpl_vmware)theEObject;
				T result = caseOs_tpl_vmware(os_tpl_vmware);
				if (result == null) result = caseOs_tpl(os_tpl_vmware);
				if (result == null) result = caseMixinBase(os_tpl_vmware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case VmwarePackage.SSH_USER_DATA: {
				Ssh_user_data ssh_user_data = (Ssh_user_data)theEObject;
				T result = caseSsh_user_data(ssh_user_data);
				if (result == null) result = caseUser_data(ssh_user_data);
				if (result == null) result = caseMixinBase(ssh_user_data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instancevmware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instancevmware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstancevmware(Instancevmware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storagevmware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storagevmware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoragevmware(Storagevmware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storagelinkvmware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storagelinkvmware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoragelinkvmware(Storagelinkvmware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vswitch</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vswitch</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVswitch(Vswitch object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Networkadapter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Networkadapter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkadapter(Networkadapter object) {
		return null;
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
	 * Returns the result of interpreting the object as an instance of '<em>Os tpl vmware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Os tpl vmware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOs_tpl_vmware(Os_tpl_vmware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ssh user data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ssh user data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSsh_user_data(Ssh_user_data object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompute(Compute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storage</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorage(Storage object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Storagelink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storagelink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStoragelink(Storagelink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Network</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Network</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetwork(Network object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Networkinterface</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Networkinterface</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkinterface(Networkinterface object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>User data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser_data(User_data object) {
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
