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
package org.eclipse.cmf.occi.multicloud.horizontalelasticity;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dynamic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#getDynamicGroupSize <em>Dynamic Group Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#getDynamicMaxGroupSize <em>Dynamic Max Group Size</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#getDynamicMinGroupSize <em>Dynamic Min Group Size</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getDynamic()
 * @model
 * @generated
 */
public interface Dynamic extends Horizontalelasticcontroller {
	/**
	 * Returns the value of the '<em><b>Dynamic Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Group Size</em>' attribute.
	 * @see #setDynamicGroupSize(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getDynamic_DynamicGroupSize()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Dynamic!dynamicGroupSize'"
	 * @generated
	 */
	Integer getDynamicGroupSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#getDynamicGroupSize <em>Dynamic Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Group Size</em>' attribute.
	 * @see #getDynamicGroupSize()
	 * @generated
	 */
	void setDynamicGroupSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Dynamic Max Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Max Group Size</em>' attribute.
	 * @see #setDynamicMaxGroupSize(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getDynamic_DynamicMaxGroupSize()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Dynamic!dynamicMaxGroupSize'"
	 * @generated
	 */
	Integer getDynamicMaxGroupSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#getDynamicMaxGroupSize <em>Dynamic Max Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Max Group Size</em>' attribute.
	 * @see #getDynamicMaxGroupSize()
	 * @generated
	 */
	void setDynamicMaxGroupSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Dynamic Min Group Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dynamic Min Group Size</em>' attribute.
	 * @see #setDynamicMinGroupSize(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getDynamic_DynamicMinGroupSize()
	 * @model dataType="org.eclipse.cmf.occi.core.Integer"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://org.eclipse.cmf.occi.multicloud.horizontalelasticity/ecore!Dynamic!dynamicMinGroupSize'"
	 * @generated
	 */
	Integer getDynamicMinGroupSize();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.horizontalelasticity.Dynamic#getDynamicMinGroupSize <em>Dynamic Min Group Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dynamic Min Group Size</em>' attribute.
	 * @see #getDynamicMinGroupSize()
	 * @generated
	 */
	void setDynamicMinGroupSize(Integer value);

} // Dynamic
