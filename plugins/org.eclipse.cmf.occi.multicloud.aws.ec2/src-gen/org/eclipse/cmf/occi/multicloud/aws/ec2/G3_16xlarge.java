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
package org.eclipse.cmf.occi.multicloud.aws.ec2;

import org.eclipse.cmf.occi.core.MixinBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>G3 16xlarge</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getGpus <em>Gpus</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getGpuMemory <em>Gpu Memory</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getG3_16xlarge()
 * @model
 * @generated
 */
public interface G3_16xlarge extends Acceleratedcomputing, MixinBase {
	/**
	 * Returns the value of the '<em><b>Occi Compute Memory</b></em>' attribute.
	 * The default value is <code>"488"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximum RAM in gigabytes allocated to the instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Compute Memory</em>' attribute.
	 * @see #setOcciComputeMemory(Float)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getG3_16xlarge_OcciComputeMemory()
	 * @model default="488" dataType="org.eclipse.cmf.occi.infrastructure.GiB"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/aws/ecore!G3_16xlarge!occiComputeMemory'"
	 * @generated
	 */
	Float getOcciComputeMemory();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getOcciComputeMemory <em>Occi Compute Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Compute Memory</em>' attribute.
	 * @see #getOcciComputeMemory()
	 * @generated
	 */
	void setOcciComputeMemory(Float value);

	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' attribute.
	 * The default value is <code>"g3.16xlarge"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Instance Type</em>' attribute.
	 * @see #setInstanceType(String)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getG3_16xlarge_InstanceType()
	 * @model default="g3.16xlarge" dataType="org.eclipse.cmf.occi.core.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/aws/ecore!G3_16xlarge!instanceType'"
	 * @generated
	 */
	String getInstanceType();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getInstanceType <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' attribute.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(String value);

	/**
	 * Returns the value of the '<em><b>Occi Compute Cores</b></em>' attribute.
	 * The default value is <code>"64"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of CPU cores assigned to the instance
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Occi Compute Cores</em>' attribute.
	 * @see #setOcciComputeCores(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getG3_16xlarge_OcciComputeCores()
	 * @model default="64" dataType="org.eclipse.cmf.occi.infrastructure.Core"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/aws/ecore!G3_16xlarge!occiComputeCores'"
	 * @generated
	 */
	Integer getOcciComputeCores();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getOcciComputeCores <em>Occi Compute Cores</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occi Compute Cores</em>' attribute.
	 * @see #getOcciComputeCores()
	 * @generated
	 */
	void setOcciComputeCores(Integer value);

	/**
	 * Returns the value of the '<em><b>Gpus</b></em>' attribute.
	 * The default value is <code>"4"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gpus</em>' attribute.
	 * @see #setGpus(Integer)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getG3_16xlarge_Gpus()
	 * @model default="4" dataType="org.eclipse.cmf.occi.infrastructure.Core"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/aws/ecore!G3_16xlarge!gpus'"
	 * @generated
	 */
	Integer getGpus();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getGpus <em>Gpus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gpus</em>' attribute.
	 * @see #getGpus()
	 * @generated
	 */
	void setGpus(Integer value);

	/**
	 * Returns the value of the '<em><b>Gpu Memory</b></em>' attribute.
	 * The default value is <code>"32"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gpu Memory</em>' attribute.
	 * @see #setGpuMemory(Float)
	 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package#getG3_16xlarge_GpuMemory()
	 * @model default="32" dataType="org.eclipse.cmf.occi.infrastructure.GiB"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/infrastructure/aws/ecore!G3_16xlarge!gpuMemory'"
	 * @generated
	 */
	Float getGpuMemory();

	/**
	 * Sets the value of the '{@link org.eclipse.cmf.occi.multicloud.aws.ec2.G3_16xlarge#getGpuMemory <em>Gpu Memory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gpu Memory</em>' attribute.
	 * @see #getGpuMemory()
	 * @generated
	 */
	void setGpuMemory(Float value);

} // G3_16xlarge
