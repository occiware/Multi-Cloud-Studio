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
 * A representation of the model object '<em><b>Strategymemory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryMode <em>Strategy Memory Mode</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDirection <em>Strategy Memory Direction</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryStepMemDecrease <em>Strategy Memory Step Mem Decrease</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryStepMemIncrease <em>Strategy Memory Step Mem Increase</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryUpperLimit <em>Strategy Memory Upper Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryLowerLimit <em>Strategy Memory Lower Limit</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDate <em>Strategy Memory Date</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryIncreaseRelationalOp <em>Strategy Memory Increase Relational Op</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDecreaseRelationalOp <em>Strategy Memory Decrease Relational Op</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Strategymemory extends MixinBase, Strategycompute {
	/**
	 * Returns the value of the '<em><b>Strategy Memory Mode</b></em>' attribute.
	 * The default value is <code>"dynamic"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.elasticocci.ModeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Mode</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ModeType
	 * @see #setStrategyMemoryMode(ModeType)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryMode()
	 * @model default="dynamic"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategymemory!StrategyMemoryMode'"
	 * @generated
	 */
	ModeType getStrategyMemoryMode();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryMode <em>Strategy Memory Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Mode</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ModeType
	 * @see #getStrategyMemoryMode()
	 * @generated
	 */
	void setStrategyMemoryMode(ModeType value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Direction</b></em>' attribute.
	 * The default value is <code>"up"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Direction</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType
	 * @see #setStrategyMemoryDirection(DirectionType)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryDirection()
	 * @model default="up"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategymemory!StrategyMemoryDirection'"
	 * @generated
	 */
	DirectionType getStrategyMemoryDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDirection <em>Strategy Memory Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Direction</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.DirectionType
	 * @see #getStrategyMemoryDirection()
	 * @generated
	 */
	void setStrategyMemoryDirection(DirectionType value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Step Mem Decrease</b></em>' attribute.
	 * The default value is <code>"0.25"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Step Mem Decrease</em>' attribute.
	 * @see #setStrategyMemoryStepMemDecrease(Double)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryStepMemDecrease()
	 * @model default="0.25" dataType="org.eclipse.cmf.occi.multicloud.elasticocci.Double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategymemory!StrategyMemoryStepMemDecrease'"
	 * @generated
	 */
	Double getStrategyMemoryStepMemDecrease();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryStepMemDecrease <em>Strategy Memory Step Mem Decrease</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Step Mem Decrease</em>' attribute.
	 * @see #getStrategyMemoryStepMemDecrease()
	 * @generated
	 */
	void setStrategyMemoryStepMemDecrease(Double value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Step Mem Increase</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Step Mem Increase</em>' attribute.
	 * @see #setStrategyMemoryStepMemIncrease(Double)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryStepMemIncrease()
	 * @model default="0.5" dataType="org.eclipse.cmf.occi.multicloud.elasticocci.Double"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategymemory!StrategyMemoryStepMemIncrease'"
	 * @generated
	 */
	Double getStrategyMemoryStepMemIncrease();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryStepMemIncrease <em>Strategy Memory Step Mem Increase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Step Mem Increase</em>' attribute.
	 * @see #getStrategyMemoryStepMemIncrease()
	 * @generated
	 */
	void setStrategyMemoryStepMemIncrease(Double value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Upper Limit</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Upper Limit</em>' attribute.
	 * @see #setStrategyMemoryUpperLimit(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryUpperLimit()
	 * @model default="5" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategymemory!StrategyMemoryUpperLimit'"
	 * @generated
	 */
	Integer getStrategyMemoryUpperLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryUpperLimit <em>Strategy Memory Upper Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Upper Limit</em>' attribute.
	 * @see #getStrategyMemoryUpperLimit()
	 * @generated
	 */
	void setStrategyMemoryUpperLimit(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Lower Limit</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Lower Limit</em>' attribute.
	 * @see #setStrategyMemoryLowerLimit(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryLowerLimit()
	 * @model default="1" dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategymemory!StrategyMemoryLowerLimit'"
	 * @generated
	 */
	Integer getStrategyMemoryLowerLimit();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryLowerLimit <em>Strategy Memory Lower Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Lower Limit</em>' attribute.
	 * @see #getStrategyMemoryLowerLimit()
	 * @generated
	 */
	void setStrategyMemoryLowerLimit(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Date</em>' attribute.
	 * @see #setStrategyMemoryDate(String)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryDate()
	 * @model dataType="org.eclipse.cmf.occi.multicloud.elasticocci.DateType"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategymemory!StrategyMemoryDate'"
	 * @generated
	 */
	String getStrategyMemoryDate();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDate <em>Strategy Memory Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Date</em>' attribute.
	 * @see #getStrategyMemoryDate()
	 * @generated
	 */
	void setStrategyMemoryDate(String value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Increase Relational Op</b></em>' attribute.
	 * The default value is <code>"greaterThan"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Increase Relational Op</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType
	 * @see #setStrategyMemoryIncreaseRelationalOp(RelationalType)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryIncreaseRelationalOp()
	 * @model default="greaterThan"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategymemory!StrategyMemoryIncreaseRelationalOp'"
	 * @generated
	 */
	RelationalType getStrategyMemoryIncreaseRelationalOp();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryIncreaseRelationalOp <em>Strategy Memory Increase Relational Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Increase Relational Op</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType
	 * @see #getStrategyMemoryIncreaseRelationalOp()
	 * @generated
	 */
	void setStrategyMemoryIncreaseRelationalOp(RelationalType value);

	/**
	 * Returns the value of the '<em><b>Strategy Memory Decrease Relational Op</b></em>' attribute.
	 * The default value is <code>"lessThan"</code>.
	 * The literals are from the enumeration {@link org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Memory Decrease Relational Op</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType
	 * @see #setStrategyMemoryDecreaseRelationalOp(RelationalType)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategymemory_StrategyMemoryDecreaseRelationalOp()
	 * @model default="lessThan"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategymemory!StrategyMemoryDecreaseRelationalOp'"
	 * @generated
	 */
	RelationalType getStrategyMemoryDecreaseRelationalOp();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategymemory#getStrategyMemoryDecreaseRelationalOp <em>Strategy Memory Decrease Relational Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Memory Decrease Relational Op</em>' attribute.
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.RelationalType
	 * @see #getStrategyMemoryDecreaseRelationalOp()
	 * @generated
	 */
	void setStrategyMemoryDecreaseRelationalOp(RelationalType value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategymemory!stop()'"
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticocci/ecore!Strategymemory!start()'"
	 * @generated
	 */
	void start();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let\n *     severity : Integer[1] = \'Strategymemory::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let\n *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Elasticcontroller)\n *       in\n *         \'Strategymemory::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables%&gt;.STR_Strategymemory_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_elasticocci_c_c_Elasticcontroller_0 = idResolver.getClass(&lt;%org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables%&gt;.CLSSid_Elasticcontroller, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_elasticocci_c_c_Elasticcontroller_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables%&gt;.STR_Strategymemory_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Strategymemory
