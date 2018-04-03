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

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vmwarefolders</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getDatacentername <em>Datacentername</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getDatastorename <em>Datastorename</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getClustername <em>Clustername</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getHostsystemname <em>Hostsystemname</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getInventorypath <em>Inventorypath</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getVmwarefolders()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot appliesConstraint='self.entity.oclIsKindOf(vmware::Instancevmware) or self.entity.oclIsKindOf(vmware::Networkadapter) or self.entity.oclIsKindOf(vmware::Storagelinkvmware) or self.entity.oclIsKindOf(vmware::Storagevmware) or self.entity.oclIsKindOf(vmware::Vswitch)'"
 * @generated
 */
public interface Vmwarefolders extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Datacentername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datacenter name identifier of the entity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datacentername</em>' attribute.
	 * @see #setDatacentername(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getVmwarefolders_Datacentername()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getDatacentername();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getDatacentername <em>Datacentername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datacentername</em>' attribute.
	 * @see #getDatacentername()
	 * @generated
	 */
	void setDatacentername(String value);

	/**
	 * Returns the value of the '<em><b>Datastorename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datastore name
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datastorename</em>' attribute.
	 * @see #setDatastorename(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getVmwarefolders_Datastorename()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getDatastorename();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getDatastorename <em>Datastorename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datastorename</em>' attribute.
	 * @see #getDatastorename()
	 * @generated
	 */
	void setDatastorename(String value);

	/**
	 * Returns the value of the '<em><b>Clustername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Clustername</em>' attribute.
	 * @see #setClustername(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getVmwarefolders_Clustername()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getClustername();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getClustername <em>Clustername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clustername</em>' attribute.
	 * @see #getClustername()
	 * @generated
	 */
	void setClustername(String value);

	/**
	 * Returns the value of the '<em><b>Hostsystemname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hostsystemname</em>' attribute.
	 * @see #setHostsystemname(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getVmwarefolders_Hostsystemname()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getHostsystemname();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getHostsystemname <em>Hostsystemname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hostsystemname</em>' attribute.
	 * @see #getHostsystemname()
	 * @generated
	 */
	void setHostsystemname(String value);

	/**
	 * Returns the value of the '<em><b>Inventorypath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inventorypath</em>' attribute.
	 * @see #setInventorypath(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getVmwarefolders_Inventorypath()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 * @generated
	 */
	String getInventorypath();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmwarefolders#getInventorypath <em>Inventorypath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inventorypath</em>' attribute.
	 * @see #getInventorypath()
	 * @generated
	 */
	void setInventorypath(String value);

} // Vmwarefolders
