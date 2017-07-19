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
package org.eclipse.cmf.occi.multicloud.vmware;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage
 * @generated
 */
public interface VmwareFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmwareFactory eINSTANCE = org.eclipse.cmf.occi.multicloud.vmware.impl.VmwareFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Instancevmware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Instancevmware</em>'.
	 * @generated
	 */
	Instancevmware createInstancevmware();

	/**
	 * Returns a new object of class '<em>Storagevmware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storagevmware</em>'.
	 * @generated
	 */
	Storagevmware createStoragevmware();

	/**
	 * Returns a new object of class '<em>Storagelinkvmware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Storagelinkvmware</em>'.
	 * @generated
	 */
	Storagelinkvmware createStoragelinkvmware();

	/**
	 * Returns a new object of class '<em>Vswitch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vswitch</em>'.
	 * @generated
	 */
	Vswitch createVswitch();

	/**
	 * Returns a new object of class '<em>Networkadapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Networkadapter</em>'.
	 * @generated
	 */
	Networkadapter createNetworkadapter();

	/**
	 * Returns a new object of class '<em>Windows</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Windows</em>'.
	 * @generated
	 */
	Windows createWindows();

	/**
	 * Returns a new object of class '<em>Linux</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Linux</em>'.
	 * @generated
	 */
	Linux createLinux();

	/**
	 * Returns a new object of class '<em>Macosx</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Macosx</em>'.
	 * @generated
	 */
	Macosx createMacosx();

	/**
	 * Returns a new object of class '<em>Vmwarefolders</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Vmwarefolders</em>'.
	 * @generated
	 */
	Vmwarefolders createVmwarefolders();

	/**
	 * Returns a new object of class '<em>Os tpl vmware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Os tpl vmware</em>'.
	 * @generated
	 */
	Os_tpl_vmware createOs_tpl_vmware();

	/**
	 * Returns a new object of class '<em>Ssh user data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ssh user data</em>'.
	 * @generated
	 */
	Ssh_user_data createSsh_user_data();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VmwarePackage getVmwarePackage();

} //VmwareFactory
