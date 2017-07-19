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
 * A representation of the model object '<em><b>Vmaddon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getVcpu <em>Vcpu</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getGueststate <em>Gueststate</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getGuestosid <em>Guestosid</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getMarkedastemplate <em>Markedastemplate</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getVmaddon()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Vmaddon extends MixinBase, Vmimage {
	/**
	 * Returns the value of the '<em><b>Vcpu</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vcpu</em>' attribute.
	 * @see #setVcpu(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getVmaddon_Vcpu()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Vmaddon!vcpu'"
	 * @generated
	 */
	String getVcpu();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getVcpu <em>Vcpu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vcpu</em>' attribute.
	 * @see #getVcpu()
	 * @generated
	 */
	void setVcpu(String value);

	/**
	 * Returns the value of the '<em><b>Gueststate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gueststate</em>' attribute.
	 * @see #setGueststate(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getVmaddon_Gueststate()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Vmaddon!gueststate'"
	 * @generated
	 */
	String getGueststate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getGueststate <em>Gueststate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gueststate</em>' attribute.
	 * @see #getGueststate()
	 * @generated
	 */
	void setGueststate(String value);

	/**
	 * Returns the value of the '<em><b>Guestosid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Guestosid</em>' attribute.
	 * @see #setGuestosid(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getVmaddon_Guestosid()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Vmaddon!guestosid'"
	 * @generated
	 */
	String getGuestosid();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getGuestosid <em>Guestosid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guestosid</em>' attribute.
	 * @see #getGuestosid()
	 * @generated
	 */
	void setGuestosid(String value);

	/**
	 * Returns the value of the '<em><b>Markedastemplate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Markedastemplate</em>' attribute.
	 * @see #setMarkedastemplate(String)
	 * @see org.eclipse.cmf.occi.multicloud.vmware.VmwarePackage#getVmaddon_Markedastemplate()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Vmaddon!markedastemplate'"
	 * @generated
	 */
	String getMarkedastemplate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.vmware.Vmaddon#getMarkedastemplate <em>Markedastemplate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Markedastemplate</em>' attribute.
	 * @see #getMarkedastemplate()
	 * @generated
	 */
	void setMarkedastemplate(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Vmaddon::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(infrastructure::Compute)\n *       in\n *         \'Vmaddon::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.STR_Vmaddon_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_infrastructure_c_c_Compute_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.CLSSid_Compute, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_infrastructure_c_c_Compute_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.STR_Vmaddon_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Vmaddon
