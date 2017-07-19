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

import org.eclipse.cmf.occi.infrastructure.Os_tpl;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Macosx</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Macosx#getGuestid <em>Guestid</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Macosx#getDatastoreisopath <em>Datastoreisopath</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getMacosx()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Macosx extends MixinBase, Os_tpl {
	/**
	 * Returns the value of the '<em><b>Guestid</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guestid</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers
	 * @see #setGuestid(GuestOsIdentifiers)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getMacosx_Guestid()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Macosx!guestid'"
	 * @generated
	 */
	GuestOsIdentifiers getGuestid();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Macosx#getGuestid <em>Guestid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guestid</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.vmware.GuestOsIdentifiers
	 * @see #getGuestid()
	 * @generated
	 */
	void setGuestid(GuestOsIdentifiers value);

	/**
	 * Returns the value of the '<em><b>Datastoreisopath</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datastoreisopath</em>' attribute.
	 * @see #setDatastoreisopath(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getMacosx_Datastoreisopath()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Macosx!datastoreisopath'"
	 * @generated
	 */
	String getDatastoreisopath();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Macosx#getDatastoreisopath <em>Datastoreisopath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datastoreisopath</em>' attribute.
	 * @see #getDatastoreisopath()
	 * @generated
	 */
	void setDatastoreisopath(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Macosx::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(infrastructure::Compute)\n *       in\n *         \'Macosx::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.STR_Macosx_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Compute_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.CLSSid_Compute, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Compute_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.STR_Macosx_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Macosx
