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
package cloudmonitoring;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Disk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudmonitoring.Disk#getSwap <em>Swap</em>}</li>
 *   <li>{@link cloudmonitoring.Disk#getFree <em>Free</em>}</li>
 *   <li>{@link cloudmonitoring.Disk#getVolumeName <em>Volume Name</em>}</li>
 *   <li>{@link cloudmonitoring.Disk#getDiskUsed <em>Disk Used</em>}</li>
 * </ul>
 *
 * @see cloudmonitoring.CloudmonitoringPackage#getDisk()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Disk extends MixinBase, Mainmetric {
	/**
	 * Returns the value of the '<em><b>Swap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Swap</em>' attribute.
	 * @see #setSwap(Double)
	 * @see cloudmonitoring.CloudmonitoringPackage#getDisk_Swap()
	 * @model dataType="cloudmonitoring.Percent"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/monitoring/ecore!Disk!swap'"
	 * @generated
	 */
	Double getSwap();

	/**
	 * Sets the value of the '{@link cloudmonitoring.Disk#getSwap <em>Swap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swap</em>' attribute.
	 * @see #getSwap()
	 * @generated
	 */
	void setSwap(Double value);

	/**
	 * Returns the value of the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Free</em>' attribute.
	 * @see #setFree(Double)
	 * @see cloudmonitoring.CloudmonitoringPackage#getDisk_Free()
	 * @model dataType="cloudmonitoring.Percent"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/monitoring/ecore!Disk!free'"
	 * @generated
	 */
	Double getFree();

	/**
	 * Sets the value of the '{@link cloudmonitoring.Disk#getFree <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free</em>' attribute.
	 * @see #getFree()
	 * @generated
	 */
	void setFree(Double value);

	/**
	 * Returns the value of the '<em><b>Volume Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Volume Name</em>' attribute.
	 * @see #setVolumeName(String)
	 * @see cloudmonitoring.CloudmonitoringPackage#getDisk_VolumeName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/monitoring/ecore!Disk!volumeName'"
	 * @generated
	 */
	String getVolumeName();

	/**
	 * Sets the value of the '{@link cloudmonitoring.Disk#getVolumeName <em>Volume Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume Name</em>' attribute.
	 * @see #getVolumeName()
	 * @generated
	 */
	void setVolumeName(String value);

	/**
	 * Returns the value of the '<em><b>Disk Used</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disk Used</em>' attribute.
	 * @see #setDiskUsed(Double)
	 * @see cloudmonitoring.CloudmonitoringPackage#getDisk_DiskUsed()
	 * @model dataType="cloudmonitoring.Percent"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/monitoring/ecore!Disk!diskUsed'"
	 * @generated
	 */
	Double getDiskUsed();

	/**
	 * Sets the value of the '{@link cloudmonitoring.Disk#getDiskUsed <em>Disk Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disk Used</em>' attribute.
	 * @see #getDiskUsed()
	 * @generated
	 */
	void setDiskUsed(Double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Disk::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(monitoring::Collector)\n *       in\n *         \'Disk::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%cloudmonitoring.CloudmonitoringTables%&gt;.STR_Disk_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%cloudmonitoring.CloudmonitoringTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_monitoring_c_c_Collector_0 = idResolver.getClass(&lt;%cloudmonitoring.CloudmonitoringTables%&gt;.CLSSid_Collector, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_monitoring_c_c_Collector_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%cloudmonitoring.CloudmonitoringTables%&gt;.STR_Disk_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%cloudmonitoring.CloudmonitoringTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Disk
