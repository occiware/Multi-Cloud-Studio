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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Vmwarefolders!datacentername'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Vmwarefolders!datastorename'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Vmwarefolders!clustername'"
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
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Vmwarefolders!hostsystemname'"
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
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/vmware/ecore!Vmwarefolders!inventorypath'"
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Vmwarefolders::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[?] = self.entity.oclIsKindOf(Instancevmware) or\n *         self.entity.oclIsKindOf(Networkadapter) or\n *         self.entity.oclIsKindOf(Storagelinkvmware) or\n *         self.entity.oclIsKindOf(Storagevmware) or\n *         self.entity.oclIsKindOf(Vswitch)\n *       in\n *         \'Vmwarefolders::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.STR_Vmwarefolders_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_vmware_c_c_Instancevmware_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.CLSSid_Instancevmware, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity_3 = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean oclIsKindOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_3, TYP_vmware_c_c_Instancevmware_0).booleanValue();\n\t/*@NonInvalid\052/ boolean or;\n\tif (oclIsKindOf) {\n\t\tor = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_vmware_c_c_Networkadapter = idResolver.getClass(&lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.CLSSid_Networkadapter, null);\n\t\tfinal /*@NonInvalid\052/ boolean oclIsKindOf_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_3, TYP_vmware_c_c_Networkadapter).booleanValue();\n\t\tor = oclIsKindOf_0;\n\t}\n\t/*@NonInvalid\052/ boolean or_0;\n\tif (or) {\n\t\tor_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_vmware_c_c_Storagelinkvmware = idResolver.getClass(&lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.CLSSid_Storagelinkvmware, null);\n\t\tfinal /*@NonInvalid\052/ boolean oclIsKindOf_1 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_3, TYP_vmware_c_c_Storagelinkvmware).booleanValue();\n\t\tor_0 = oclIsKindOf_1;\n\t}\n\t/*@NonInvalid\052/ boolean or_1;\n\tif (or_0) {\n\t\tor_1 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_vmware_c_c_Storagevmware_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.CLSSid_Storagevmware, null);\n\t\tfinal /*@NonInvalid\052/ boolean oclIsKindOf_2 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_3, TYP_vmware_c_c_Storagevmware_0).booleanValue();\n\t\tor_1 = oclIsKindOf_2;\n\t}\n\t/*@NonInvalid\052/ boolean result;\n\tif (or_1) {\n\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_vmware_c_c_Vswitch_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.CLSSid_Vswitch, null);\n\t\tfinal /*@NonInvalid\052/ boolean oclIsKindOf_3 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_3, TYP_vmware_c_c_Vswitch_0).booleanValue();\n\t\tresult = oclIsKindOf_3;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.STR_Vmwarefolders_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.multicloud.vmware.VmwareTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Vmwarefolders
