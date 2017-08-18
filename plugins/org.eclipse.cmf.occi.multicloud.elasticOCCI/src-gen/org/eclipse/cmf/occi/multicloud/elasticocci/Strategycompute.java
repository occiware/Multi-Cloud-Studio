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

import org.eclipse.cmf.occi.core.MixinBase;

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
 * @model
 * @generated
 */
public interface Strategycompute extends MixinBase, Strategy {
	/**
	 * Returns the value of the '<em><b>Strategy Compute Uthreshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Compute Uthreshold</em>' attribute.
	 * @see #setStrategyComputeUthreshold(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycompute_StrategyComputeUthreshold()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticOCCI/ecore!Strategycompute!StrategyComputeUthreshold'"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Compute Breath Down</em>' attribute.
	 * @see #setStrategyComputeBreathDown(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycompute_StrategyComputeBreathDown()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticOCCI/ecore!Strategycompute!StrategyComputeBreathDown'"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Compute Breath Up</em>' attribute.
	 * @see #setStrategyComputeBreathUp(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycompute_StrategyComputeBreathUp()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticOCCI/ecore!Strategycompute!StrategyComputeBreathUp'"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Compute Poll Time</em>' attribute.
	 * @see #setStrategyComputePollTime(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycompute_StrategyComputePollTime()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticOCCI/ecore!Strategycompute!StrategyComputePollTime'"
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strategy Compute Lthreshold</em>' attribute.
	 * @see #setStrategyComputeLthreshold(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.elasticocci.ElasticocciPackage#getStrategycompute_StrategyComputeLthreshold()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticOCCI/ecore!Strategycompute!StrategyComputeLthreshold'"
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
	 * <!-- begin-model-doc -->
	 * 
	 * @param metricUtilization 
	 * @param op 
	 * @param threshold 
	 * <!-- end-model-doc -->
	 * @model metricUtilizationDataType="org.eclipse.cmf.occi.multicloud.elasticocci.Double" opDataType="org.eclipse.cmf.occi.core.String" thresholdDataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/elasticOCCI/ecore!Strategycompute!createpolicy(http://occiware.org/occi/multicloud/elasticOCCI/ecore!Double,String,Integer)'"
	 * @generated
	 */
	void createpolicy(Double metricUtilization, String op, Integer threshold);

} // Strategycompute
