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
 * A representation of the model object '<em><b>Strategycompute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeUthreshold <em>Strategy Compute Uthreshold</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeBreathDown <em>Strategy Compute Breath Down</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeBreathUp <em>Strategy Compute Breath Up</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputePollTime <em>Strategy Compute Poll Time</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeLthreshold <em>Strategy Compute Lthreshold</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycompute()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='MustBeCompute'"
 * @generated
 */
public interface Strategycompute extends Strategy, MixinBase {
	/**
	 * Returns the value of the '<em><b>Strategy Compute Uthreshold</b></em>' attribute.
	 * The default value is <code>"90"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Compute Uthreshold</em>' attribute.
	 * @see #setStrategyComputeUthreshold(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycompute_StrategyComputeUthreshold()
	 * @model default="90" dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getStrategyComputeUthreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeUthreshold <em>Strategy Compute Uthreshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Compute Uthreshold</em>' attribute.
	 * @see #getStrategyComputeUthreshold()
	 * @generated
	 */
	void setStrategyComputeUthreshold(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy Compute Breath Down</b></em>' attribute.
	 * The default value is <code>"20000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Compute Breath Down</em>' attribute.
	 * @see #setStrategyComputeBreathDown(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycompute_StrategyComputeBreathDown()
	 * @model default="20000" dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getStrategyComputeBreathDown();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeBreathDown <em>Strategy Compute Breath Down</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Compute Breath Down</em>' attribute.
	 * @see #getStrategyComputeBreathDown()
	 * @generated
	 */
	void setStrategyComputeBreathDown(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy Compute Breath Up</b></em>' attribute.
	 * The default value is <code>"40000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Compute Breath Up</em>' attribute.
	 * @see #setStrategyComputeBreathUp(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycompute_StrategyComputeBreathUp()
	 * @model default="40000" dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getStrategyComputeBreathUp();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeBreathUp <em>Strategy Compute Breath Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Compute Breath Up</em>' attribute.
	 * @see #getStrategyComputeBreathUp()
	 * @generated
	 */
	void setStrategyComputeBreathUp(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy Compute Poll Time</b></em>' attribute.
	 * The default value is <code>"10000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Compute Poll Time</em>' attribute.
	 * @see #setStrategyComputePollTime(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycompute_StrategyComputePollTime()
	 * @model default="10000" dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getStrategyComputePollTime();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputePollTime <em>Strategy Compute Poll Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Compute Poll Time</em>' attribute.
	 * @see #getStrategyComputePollTime()
	 * @generated
	 */
	void setStrategyComputePollTime(Integer value);

	/**
	 * Returns the value of the '<em><b>Strategy Compute Lthreshold</b></em>' attribute.
	 * The default value is <code>"70"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Compute Lthreshold</em>' attribute.
	 * @see #setStrategyComputeLthreshold(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycompute_StrategyComputeLthreshold()
	 * @model default="70" dataType="org.eclipse.cmf.occi.core.Integer"
	 * @generated
	 */
	Integer getStrategyComputeLthreshold();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.elasticocci.Strategycompute#getStrategyComputeLthreshold <em>Strategy Compute Lthreshold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strategy Compute Lthreshold</em>' attribute.
	 * @see #getStrategyComputeLthreshold()
	 * @generated
	 */
	void setStrategyComputeLthreshold(Integer value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot body='self.entity.oclAsType(occi::Resource).links-&gt;first().target.oclIsTypeOf(infrastructure::Compute)'"
	 * @generated
	 */
	boolean MustBeCompute(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Strategycompute
