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
 * A representation of the model object '<em><b>Mailpublisher</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link cloudmonitoring.Mailpublisher#getMailAddress <em>Mail Address</em>}</li>
 *   <li>{@link cloudmonitoring.Mailpublisher#isPostOnCpuAlert <em>Post On Cpu Alert</em>}</li>
 *   <li>{@link cloudmonitoring.Mailpublisher#isPostOnRamAlert <em>Post On Ram Alert</em>}</li>
 *   <li>{@link cloudmonitoring.Mailpublisher#isPostOnNetworkIOAlert <em>Post On Network IO Alert</em>}</li>
 *   <li>{@link cloudmonitoring.Mailpublisher#isPostOnDiskIOAlert <em>Post On Disk IO Alert</em>}</li>
 *   <li>{@link cloudmonitoring.Mailpublisher#getNbEmail <em>Nb Email</em>}</li>
 * </ul>
 *
 * @see cloudmonitoring.CloudmonitoringPackage#getMailpublisher()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Mailpublisher extends Publishercontrol, MixinBase {
	/**
	 * Returns the value of the '<em><b>Mail Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mail Address</em>' attribute.
	 * @see #setMailAddress(String)
	 * @see cloudmonitoring.CloudmonitoringPackage#getMailpublisher_MailAddress()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/monitoring/ecore!Mailpublisher!mailAddress'"
	 * @generated
	 */
	String getMailAddress();

	/**
	 * Sets the value of the '{@link cloudmonitoring.Mailpublisher#getMailAddress <em>Mail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mail Address</em>' attribute.
	 * @see #getMailAddress()
	 * @generated
	 */
	void setMailAddress(String value);

	/**
	 * Returns the value of the '<em><b>Post On Cpu Alert</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post On Cpu Alert</em>' attribute.
	 * @see #setPostOnCpuAlert(boolean)
	 * @see cloudmonitoring.CloudmonitoringPackage#getMailpublisher_PostOnCpuAlert()
	 * @model default="false" dataType="org.eclipse.cmf.occi.core.Boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/monitoring/ecore!Mailpublisher!postOnCpuAlert'"
	 * @generated
	 */
	boolean isPostOnCpuAlert();

	/**
	 * Sets the value of the '{@link cloudmonitoring.Mailpublisher#isPostOnCpuAlert <em>Post On Cpu Alert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post On Cpu Alert</em>' attribute.
	 * @see #isPostOnCpuAlert()
	 * @generated
	 */
	void setPostOnCpuAlert(boolean value);

	/**
	 * Returns the value of the '<em><b>Post On Ram Alert</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post On Ram Alert</em>' attribute.
	 * @see #setPostOnRamAlert(boolean)
	 * @see cloudmonitoring.CloudmonitoringPackage#getMailpublisher_PostOnRamAlert()
	 * @model default="false" dataType="org.eclipse.cmf.occi.core.Boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/monitoring/ecore!Mailpublisher!postOnRamAlert'"
	 * @generated
	 */
	boolean isPostOnRamAlert();

	/**
	 * Sets the value of the '{@link cloudmonitoring.Mailpublisher#isPostOnRamAlert <em>Post On Ram Alert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post On Ram Alert</em>' attribute.
	 * @see #isPostOnRamAlert()
	 * @generated
	 */
	void setPostOnRamAlert(boolean value);

	/**
	 * Returns the value of the '<em><b>Post On Network IO Alert</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post On Network IO Alert</em>' attribute.
	 * @see #setPostOnNetworkIOAlert(boolean)
	 * @see cloudmonitoring.CloudmonitoringPackage#getMailpublisher_PostOnNetworkIOAlert()
	 * @model default="false" dataType="org.eclipse.cmf.occi.core.Boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/monitoring/ecore!Mailpublisher!postOnNetworkIOAlert'"
	 * @generated
	 */
	boolean isPostOnNetworkIOAlert();

	/**
	 * Sets the value of the '{@link cloudmonitoring.Mailpublisher#isPostOnNetworkIOAlert <em>Post On Network IO Alert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post On Network IO Alert</em>' attribute.
	 * @see #isPostOnNetworkIOAlert()
	 * @generated
	 */
	void setPostOnNetworkIOAlert(boolean value);

	/**
	 * Returns the value of the '<em><b>Post On Disk IO Alert</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Post On Disk IO Alert</em>' attribute.
	 * @see #setPostOnDiskIOAlert(boolean)
	 * @see cloudmonitoring.CloudmonitoringPackage#getMailpublisher_PostOnDiskIOAlert()
	 * @model default="false" dataType="org.eclipse.cmf.occi.core.Boolean"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/monitoring/ecore!Mailpublisher!postOnDiskIOAlert'"
	 * @generated
	 */
	boolean isPostOnDiskIOAlert();

	/**
	 * Sets the value of the '{@link cloudmonitoring.Mailpublisher#isPostOnDiskIOAlert <em>Post On Disk IO Alert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post On Disk IO Alert</em>' attribute.
	 * @see #isPostOnDiskIOAlert()
	 * @generated
	 */
	void setPostOnDiskIOAlert(boolean value);

	/**
	 * Returns the value of the '<em><b>Nb Email</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of emails to send after a threshold is reach
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nb Email</em>' attribute.
	 * @see #setNbEmail(Integer)
	 * @see cloudmonitoring.CloudmonitoringPackage#getMailpublisher_NbEmail()
	 * @model default="2" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/monitoring/ecore!Mailpublisher!nbEmail'"
	 * @generated
	 */
	Integer getNbEmail();

	/**
	 * Sets the value of the '{@link cloudmonitoring.Mailpublisher#getNbEmail <em>Nb Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nb Email</em>' attribute.
	 * @see #getNbEmail()
	 * @generated
	 */
	void setNbEmail(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Mailpublisher::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[?] = self.entity.oclIsKindOf(monitoring::Sensor) or\n *         self.entity.oclIsKindOf(Cloudsensor)\n *       in\n *         \'Mailpublisher::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%cloudmonitoring.CloudmonitoringTables%&gt;.STR_Mailpublisher_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%cloudmonitoring.CloudmonitoringTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_monitoring_c_c_Sensor_0 = idResolver.getClass(&lt;%cloudmonitoring.CloudmonitoringTables%&gt;.CLSSid_Sensor, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity_0 = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean oclIsKindOf = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_0, TYP_monitoring_c_c_Sensor_0).booleanValue();\n\t/*@NonInvalid\052/ boolean result;\n\tif (oclIsKindOf) {\n\t\tresult = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n\t}\n\telse {\n\t\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_cloudmonitoring_c_c_Cloudsensor_0 = idResolver.getClass(&lt;%cloudmonitoring.CloudmonitoringTables%&gt;.CLSSid_Cloudsensor, null);\n\t\tfinal /*@NonInvalid\052/ boolean oclIsKindOf_0 = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity_0, TYP_cloudmonitoring_c_c_Cloudsensor_0).booleanValue();\n\t\tresult = oclIsKindOf_0;\n\t}\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%cloudmonitoring.CloudmonitoringTables%&gt;.STR_Mailpublisher_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%cloudmonitoring.CloudmonitoringTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Mailpublisher
