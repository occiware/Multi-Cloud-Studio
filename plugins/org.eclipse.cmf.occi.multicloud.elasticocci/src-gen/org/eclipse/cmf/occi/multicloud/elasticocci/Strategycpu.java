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
package org.eclipse.cmf.occi.multicloud.elasticocci;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strategycpu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUUpperLimit <em>Strategy CPU Upper Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPULowerLimit <em>Strategy CPU Lower Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUMode <em>Strategy CPU Mode</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDirection <em>Strategy CPU Direction</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUStepCPUDecrease <em>Strategy CPU Step CPU Decrease</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUStepCPUIncrease <em>Strategy CPU Step CPU Increase</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDate <em>Strategy CPU Date</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Strategycpu extends MixinBase, Strategycompute {
	/**
	 * Returns the value of the '<em><b>Strategy CPU Upper Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Upper Limit</em>' attribute.
	 * @see #setStrategyCPUUpperLimit(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPUUpperLimit()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategycpu!StrategyCPUUpperLimit'"
	 * @generated
	 */
	Integer getStrategyCPUUpperLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUUpperLimit <em>Strategy CPU Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Upper Limit</em>' attribute.
	 * @see #getStrategyCPUUpperLimit()
	 * @generated
	 */
	void setStrategyCPUUpperLimit(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy CPU Lower Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Lower Limit</em>' attribute.
	 * @see #setStrategyCPULowerLimit(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPULowerLimit()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategycpu!StrategyCPULowerLimit'"
	 * @generated
	 */
	Integer getStrategyCPULowerLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPULowerLimit <em>Strategy CPU Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Lower Limit</em>' attribute.
	 * @see #getStrategyCPULowerLimit()
	 * @generated
	 */
	void setStrategyCPULowerLimit(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy CPU Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.elasticocci.ModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Mode</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ModeType
	 * @see #setStrategyCPUMode(ModeType)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPUMode()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategycpu!StrategyCPUMode'"
	 * @generated
	 */
	ModeType getStrategyCPUMode();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUMode <em>Strategy CPU Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Mode</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ModeType
	 * @see #getStrategyCPUMode()
	 * @generated
	 */
	void setStrategyCPUMode(ModeType value);

	/**
	 * Returns the value of the '<em><b>Strategy CPU Direction</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Direction</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType
	 * @see #setStrategyCPUDirection(DirectionType)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPUDirection()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategycpu!StrategyCPUDirection'"
	 * @generated
	 */
	DirectionType getStrategyCPUDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDirection <em>Strategy CPU Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Direction</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType
	 * @see #getStrategyCPUDirection()
	 * @generated
	 */
	void setStrategyCPUDirection(DirectionType value);

	/**
	 * Returns the value of the '<em><b>Strategy CPU Step CPU Decrease</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Step CPU Decrease</em>' attribute.
	 * @see #setStrategyCPUStepCPUDecrease(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPUStepCPUDecrease()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategycpu!StrategyCPUStepCPUDecrease'"
	 * @generated
	 */
	Integer getStrategyCPUStepCPUDecrease();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUStepCPUDecrease <em>Strategy CPU Step CPU Decrease</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Step CPU Decrease</em>' attribute.
	 * @see #getStrategyCPUStepCPUDecrease()
	 * @generated
	 */
	void setStrategyCPUStepCPUDecrease(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy CPU Step CPU Increase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Step CPU Increase</em>' attribute.
	 * @see #setStrategyCPUStepCPUIncrease(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPUStepCPUIncrease()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategycpu!StrategyCPUStepCPUIncrease'"
	 * @generated
	 */
	Integer getStrategyCPUStepCPUIncrease();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUStepCPUIncrease <em>Strategy CPU Step CPU Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Step CPU Increase</em>' attribute.
	 * @see #getStrategyCPUStepCPUIncrease()
	 * @generated
	 */
	void setStrategyCPUStepCPUIncrease(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy CPU Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy CPU Date</em>' attribute.
	 * @see #setStrategyCPUDate(String)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycpu_StrategyCPUDate()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.elasticocci.DateType"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategycpu!StrategyCPUDate'"
	 * @generated
	 */
	String getStrategyCPUDate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycpu#getStrategyCPUDate <em>Strategy CPU Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy CPU Date</em>' attribute.
	 * @see #getStrategyCPUDate()
	 * @generated
	 */
	void setStrategyCPUDate(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategycpu!start()'"
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategycpu!stop()'"
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Strategycpu::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Elasticcontroller)\n *       in\n *         \'Strategycpu::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables%&gt;.STR_Strategycpu_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_elasticocci_c_c_Elasticcontroller_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables%&gt;.CLSSid_Elasticcontroller, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_elasticocci_c_c_Elasticcontroller_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables%&gt;.STR_Strategycpu_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Strategycpu
