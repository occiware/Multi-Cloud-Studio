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
package org.eclipse.cmf.occi.multicloud.elasticzabbix;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zabbixapiconnect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect#getTemplateName <em>Template Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect#getHostGroupName <em>Host Group Name</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage#getZabbixapiconnect()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Zabbixapiconnect extends MixinBase, Supervisorapiconnect {
	/**
	 * Returns the value of the '<em><b>Template Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Template Name</em>' attribute.
	 * @see #setTemplateName(String)
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage#getZabbixapiconnect_TemplateName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticzabbix/ecore!Zabbixapiconnect!templateName'"
	 * @generated
	 */
	String getTemplateName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect#getTemplateName <em>Template Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Name</em>' attribute.
	 * @see #getTemplateName()
	 * @generated
	 */
	void setTemplateName(String value);

	/**
	 * Returns the value of the '<em><b>Host Group Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Host Group Name</em>' attribute.
	 * @see #setHostGroupName(String)
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage#getZabbixapiconnect_HostGroupName()
	 * @model dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticzabbix/ecore!Zabbixapiconnect!hostGroupName'"
	 * @generated
	 */
	String getHostGroupName();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect#getHostGroupName <em>Host Group Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host Group Name</em>' attribute.
	 * @see #getHostGroupName()
	 * @generated
	 */
	void setHostGroupName(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixPackage#getZabbixapiconnect_Port()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticzabbix/ecore!Zabbixapiconnect!port'"
	 * @generated
	 */
	Integer getPort();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticzabbix.Zabbixapiconnect#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let\n *     severity : Integer[1] = \'Zabbixapiconnect::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Zabbixcollector)\n *       in\n *         \'Zabbixapiconnect::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables%&gt;.STR_Zabbixapiconnect_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_elasticzabbix_c_c_Zabbixcollector = idResolver.getClass(&lt;%org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables%&gt;.CLSSid_Zabbixcollector, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_elasticzabbix_c_c_Zabbixcollector).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables%&gt;.STR_Zabbixapiconnect_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.multicloud.elasticzabbix.ElasticzabbixTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Zabbixapiconnect
