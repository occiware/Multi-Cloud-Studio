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

import org.eclipse.cmf.occi.infrastructure.Networkinterface;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Networkadapter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Network adapter interface
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getNetworkadapter()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='sourceConstraint targetConstraint'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot sourceConstraint='self.source.oclIsKindOf(vmware::Instancevmware)' targetConstraint='self.target.oclIsKindOf(vmware::Vswitch)'"
 * @generated
 */
public interface Networkadapter extends Networkinterface {

} // Networkadapter
