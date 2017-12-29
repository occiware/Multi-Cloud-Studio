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
package org.eclipse.cmf.occi.multicloud.aws.ec2.util;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.infrastructure.Resource_tpl;

import org.eclipse.cmf.occi.multicloud.accounts.Cloudaccount;
import org.eclipse.cmf.occi.multicloud.accounts.Cloudcredential;

import org.eclipse.cmf.occi.multicloud.aws.ec2.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package
 * @generated
 */
public class Ec2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Ec2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ec2Switch() {
		if (modelPackage == null) {
			modelPackage = Ec2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Ec2Package.INSTANCEEC2: {
				Instanceec2 instanceec2 = (Instanceec2)theEObject;
				T result = caseInstanceec2(instanceec2);
				if (result == null) result = caseCompute(instanceec2);
				if (result == null) result = caseResource(instanceec2);
				if (result == null) result = caseEntity(instanceec2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.AWSACCOUNT: {
				Awsaccount awsaccount = (Awsaccount)theEObject;
				T result = caseAwsaccount(awsaccount);
				if (result == null) result = caseCloudaccount(awsaccount);
				if (result == null) result = caseResource(awsaccount);
				if (result == null) result = caseEntity(awsaccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.AWSCREDENTIAL: {
				Awscredential awscredential = (Awscredential)theEObject;
				T result = caseAwscredential(awscredential);
				if (result == null) result = caseCloudcredential(awscredential);
				if (result == null) result = caseMixinBase(awscredential);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.T2_NANO: {
				T2_nano t2_nano = (T2_nano)theEObject;
				T result = caseT2_nano(t2_nano);
				if (result == null) result = caseGeneralpurpose(t2_nano);
				if (result == null) result = caseResource_tpl(t2_nano);
				if (result == null) result = caseMixinBase(t2_nano);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.T2_MICRO: {
				T2_micro t2_micro = (T2_micro)theEObject;
				T result = caseT2_micro(t2_micro);
				if (result == null) result = caseGeneralpurpose(t2_micro);
				if (result == null) result = caseResource_tpl(t2_micro);
				if (result == null) result = caseMixinBase(t2_micro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.T2_SMALL: {
				T2_small t2_small = (T2_small)theEObject;
				T result = caseT2_small(t2_small);
				if (result == null) result = caseGeneralpurpose(t2_small);
				if (result == null) result = caseResource_tpl(t2_small);
				if (result == null) result = caseMixinBase(t2_small);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.T2_MEDIUM: {
				T2_medium t2_medium = (T2_medium)theEObject;
				T result = caseT2_medium(t2_medium);
				if (result == null) result = caseGeneralpurpose(t2_medium);
				if (result == null) result = caseResource_tpl(t2_medium);
				if (result == null) result = caseMixinBase(t2_medium);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.T2_LARGE: {
				T2_large t2_large = (T2_large)theEObject;
				T result = caseT2_large(t2_large);
				if (result == null) result = caseGeneralpurpose(t2_large);
				if (result == null) result = caseResource_tpl(t2_large);
				if (result == null) result = caseMixinBase(t2_large);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.T2_XLARGE: {
				T2_xlarge t2_xlarge = (T2_xlarge)theEObject;
				T result = caseT2_xlarge(t2_xlarge);
				if (result == null) result = caseGeneralpurpose(t2_xlarge);
				if (result == null) result = caseResource_tpl(t2_xlarge);
				if (result == null) result = caseMixinBase(t2_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.T2_2XLARGE: {
				T2_2xlarge t2_2xlarge = (T2_2xlarge)theEObject;
				T result = caseT2_2xlarge(t2_2xlarge);
				if (result == null) result = caseGeneralpurpose(t2_2xlarge);
				if (result == null) result = caseResource_tpl(t2_2xlarge);
				if (result == null) result = caseMixinBase(t2_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M5_LARGE: {
				M5_large m5_large = (M5_large)theEObject;
				T result = caseM5_large(m5_large);
				if (result == null) result = caseGeneralpurpose(m5_large);
				if (result == null) result = caseResource_tpl(m5_large);
				if (result == null) result = caseMixinBase(m5_large);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M5_XLARGE: {
				M5_xlarge m5_xlarge = (M5_xlarge)theEObject;
				T result = caseM5_xlarge(m5_xlarge);
				if (result == null) result = caseGeneralpurpose(m5_xlarge);
				if (result == null) result = caseResource_tpl(m5_xlarge);
				if (result == null) result = caseMixinBase(m5_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M5_2XLARGE: {
				M5_2xlarge m5_2xlarge = (M5_2xlarge)theEObject;
				T result = caseM5_2xlarge(m5_2xlarge);
				if (result == null) result = caseGeneralpurpose(m5_2xlarge);
				if (result == null) result = caseResource_tpl(m5_2xlarge);
				if (result == null) result = caseMixinBase(m5_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M5_4XLARGE: {
				M5_4xlarge m5_4xlarge = (M5_4xlarge)theEObject;
				T result = caseM5_4xlarge(m5_4xlarge);
				if (result == null) result = caseGeneralpurpose(m5_4xlarge);
				if (result == null) result = caseResource_tpl(m5_4xlarge);
				if (result == null) result = caseMixinBase(m5_4xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M5_12XLARGE: {
				M5_12xlarge m5_12xlarge = (M5_12xlarge)theEObject;
				T result = caseM5_12xlarge(m5_12xlarge);
				if (result == null) result = caseGeneralpurpose(m5_12xlarge);
				if (result == null) result = caseResource_tpl(m5_12xlarge);
				if (result == null) result = caseMixinBase(m5_12xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M5_24XLARGE: {
				M5_24xlarge m5_24xlarge = (M5_24xlarge)theEObject;
				T result = caseM5_24xlarge(m5_24xlarge);
				if (result == null) result = caseGeneralpurpose(m5_24xlarge);
				if (result == null) result = caseResource_tpl(m5_24xlarge);
				if (result == null) result = caseMixinBase(m5_24xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M4_LARGE: {
				M4_large m4_large = (M4_large)theEObject;
				T result = caseM4_large(m4_large);
				if (result == null) result = caseGeneralpurpose(m4_large);
				if (result == null) result = caseResource_tpl(m4_large);
				if (result == null) result = caseMixinBase(m4_large);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M4_XLARGE: {
				M4_xlarge m4_xlarge = (M4_xlarge)theEObject;
				T result = caseM4_xlarge(m4_xlarge);
				if (result == null) result = caseGeneralpurpose(m4_xlarge);
				if (result == null) result = caseResource_tpl(m4_xlarge);
				if (result == null) result = caseMixinBase(m4_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M4_2XLARGE: {
				M4_2xlarge m4_2xlarge = (M4_2xlarge)theEObject;
				T result = caseM4_2xlarge(m4_2xlarge);
				if (result == null) result = caseGeneralpurpose(m4_2xlarge);
				if (result == null) result = caseResource_tpl(m4_2xlarge);
				if (result == null) result = caseMixinBase(m4_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M4_10XLARGE: {
				M4_10xlarge m4_10xlarge = (M4_10xlarge)theEObject;
				T result = caseM4_10xlarge(m4_10xlarge);
				if (result == null) result = caseGeneralpurpose(m4_10xlarge);
				if (result == null) result = caseResource_tpl(m4_10xlarge);
				if (result == null) result = caseMixinBase(m4_10xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M4_16XLARGE: {
				M4_16xlarge m4_16xlarge = (M4_16xlarge)theEObject;
				T result = caseM4_16xlarge(m4_16xlarge);
				if (result == null) result = caseGeneralpurpose(m4_16xlarge);
				if (result == null) result = caseResource_tpl(m4_16xlarge);
				if (result == null) result = caseMixinBase(m4_16xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M3_MEDIUM: {
				M3_medium m3_medium = (M3_medium)theEObject;
				T result = caseM3_medium(m3_medium);
				if (result == null) result = caseGeneralpurpose(m3_medium);
				if (result == null) result = caseResource_tpl(m3_medium);
				if (result == null) result = caseMixinBase(m3_medium);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M3_LARGE: {
				M3_large m3_large = (M3_large)theEObject;
				T result = caseM3_large(m3_large);
				if (result == null) result = caseGeneralpurpose(m3_large);
				if (result == null) result = caseResource_tpl(m3_large);
				if (result == null) result = caseMixinBase(m3_large);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M3_XLARGE: {
				M3_xlarge m3_xlarge = (M3_xlarge)theEObject;
				T result = caseM3_xlarge(m3_xlarge);
				if (result == null) result = caseGeneralpurpose(m3_xlarge);
				if (result == null) result = caseResource_tpl(m3_xlarge);
				if (result == null) result = caseMixinBase(m3_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M3_2XLARGE: {
				M3_2xlarge m3_2xlarge = (M3_2xlarge)theEObject;
				T result = caseM3_2xlarge(m3_2xlarge);
				if (result == null) result = caseGeneralpurpose(m3_2xlarge);
				if (result == null) result = caseResource_tpl(m3_2xlarge);
				if (result == null) result = caseMixinBase(m3_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C5_LARGE: {
				C5_large c5_large = (C5_large)theEObject;
				T result = caseC5_large(c5_large);
				if (result == null) result = caseComputeoptimized(c5_large);
				if (result == null) result = caseResource_tpl(c5_large);
				if (result == null) result = caseMixinBase(c5_large);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C5_XLARGE: {
				C5_xlarge c5_xlarge = (C5_xlarge)theEObject;
				T result = caseC5_xlarge(c5_xlarge);
				if (result == null) result = caseComputeoptimized(c5_xlarge);
				if (result == null) result = caseResource_tpl(c5_xlarge);
				if (result == null) result = caseMixinBase(c5_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C5_2XLARGE: {
				C5_2xlarge c5_2xlarge = (C5_2xlarge)theEObject;
				T result = caseC5_2xlarge(c5_2xlarge);
				if (result == null) result = caseComputeoptimized(c5_2xlarge);
				if (result == null) result = caseResource_tpl(c5_2xlarge);
				if (result == null) result = caseMixinBase(c5_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C5_4XLARGE: {
				C5_4xlarge c5_4xlarge = (C5_4xlarge)theEObject;
				T result = caseC5_4xlarge(c5_4xlarge);
				if (result == null) result = caseComputeoptimized(c5_4xlarge);
				if (result == null) result = caseResource_tpl(c5_4xlarge);
				if (result == null) result = caseMixinBase(c5_4xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C5_9XLARGE: {
				C5_9xlarge c5_9xlarge = (C5_9xlarge)theEObject;
				T result = caseC5_9xlarge(c5_9xlarge);
				if (result == null) result = caseComputeoptimized(c5_9xlarge);
				if (result == null) result = caseResource_tpl(c5_9xlarge);
				if (result == null) result = caseMixinBase(c5_9xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C5_18XLARGE: {
				C5_18xlarge c5_18xlarge = (C5_18xlarge)theEObject;
				T result = caseC5_18xlarge(c5_18xlarge);
				if (result == null) result = caseComputeoptimized(c5_18xlarge);
				if (result == null) result = caseResource_tpl(c5_18xlarge);
				if (result == null) result = caseMixinBase(c5_18xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C4_LARGE: {
				C4_large c4_large = (C4_large)theEObject;
				T result = caseC4_large(c4_large);
				if (result == null) result = caseComputeoptimized(c4_large);
				if (result == null) result = caseResource_tpl(c4_large);
				if (result == null) result = caseMixinBase(c4_large);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C4_XLARGE: {
				C4_xlarge c4_xlarge = (C4_xlarge)theEObject;
				T result = caseC4_xlarge(c4_xlarge);
				if (result == null) result = caseComputeoptimized(c4_xlarge);
				if (result == null) result = caseResource_tpl(c4_xlarge);
				if (result == null) result = caseMixinBase(c4_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C4_2XLARGE: {
				C4_2xlarge c4_2xlarge = (C4_2xlarge)theEObject;
				T result = caseC4_2xlarge(c4_2xlarge);
				if (result == null) result = caseComputeoptimized(c4_2xlarge);
				if (result == null) result = caseResource_tpl(c4_2xlarge);
				if (result == null) result = caseMixinBase(c4_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C4_4XLARGE: {
				C4_4xlarge c4_4xlarge = (C4_4xlarge)theEObject;
				T result = caseC4_4xlarge(c4_4xlarge);
				if (result == null) result = caseComputeoptimized(c4_4xlarge);
				if (result == null) result = caseResource_tpl(c4_4xlarge);
				if (result == null) result = caseMixinBase(c4_4xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C4_8XLARGE: {
				C4_8xlarge c4_8xlarge = (C4_8xlarge)theEObject;
				T result = caseC4_8xlarge(c4_8xlarge);
				if (result == null) result = caseComputeoptimized(c4_8xlarge);
				if (result == null) result = caseResource_tpl(c4_8xlarge);
				if (result == null) result = caseMixinBase(c4_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C3_LARGE: {
				C3_large c3_large = (C3_large)theEObject;
				T result = caseC3_large(c3_large);
				if (result == null) result = caseComputeoptimized(c3_large);
				if (result == null) result = caseResource_tpl(c3_large);
				if (result == null) result = caseMixinBase(c3_large);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C3_XLARGE: {
				C3_xlarge c3_xlarge = (C3_xlarge)theEObject;
				T result = caseC3_xlarge(c3_xlarge);
				if (result == null) result = caseComputeoptimized(c3_xlarge);
				if (result == null) result = caseResource_tpl(c3_xlarge);
				if (result == null) result = caseMixinBase(c3_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C3_2XLARGE: {
				C3_2xlarge c3_2xlarge = (C3_2xlarge)theEObject;
				T result = caseC3_2xlarge(c3_2xlarge);
				if (result == null) result = caseComputeoptimized(c3_2xlarge);
				if (result == null) result = caseResource_tpl(c3_2xlarge);
				if (result == null) result = caseMixinBase(c3_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C3_4XLARGE: {
				C3_4xlarge c3_4xlarge = (C3_4xlarge)theEObject;
				T result = caseC3_4xlarge(c3_4xlarge);
				if (result == null) result = caseComputeoptimized(c3_4xlarge);
				if (result == null) result = caseResource_tpl(c3_4xlarge);
				if (result == null) result = caseMixinBase(c3_4xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C3_8XLARGE: {
				C3_8xlarge c3_8xlarge = (C3_8xlarge)theEObject;
				T result = caseC3_8xlarge(c3_8xlarge);
				if (result == null) result = caseComputeoptimized(c3_8xlarge);
				if (result == null) result = caseResource_tpl(c3_8xlarge);
				if (result == null) result = caseMixinBase(c3_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.X1E_XLARGE: {
				X1e_xlarge x1e_xlarge = (X1e_xlarge)theEObject;
				T result = caseX1e_xlarge(x1e_xlarge);
				if (result == null) result = caseMemoryoptimized(x1e_xlarge);
				if (result == null) result = caseResource_tpl(x1e_xlarge);
				if (result == null) result = caseMixinBase(x1e_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.X1E_2XLARGE: {
				X1e_2xlarge x1e_2xlarge = (X1e_2xlarge)theEObject;
				T result = caseX1e_2xlarge(x1e_2xlarge);
				if (result == null) result = caseMemoryoptimized(x1e_2xlarge);
				if (result == null) result = caseResource_tpl(x1e_2xlarge);
				if (result == null) result = caseMixinBase(x1e_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.X1E_4XLARGE: {
				X1e_4xlarge x1e_4xlarge = (X1e_4xlarge)theEObject;
				T result = caseX1e_4xlarge(x1e_4xlarge);
				if (result == null) result = caseMemoryoptimized(x1e_4xlarge);
				if (result == null) result = caseResource_tpl(x1e_4xlarge);
				if (result == null) result = caseMixinBase(x1e_4xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.X1E_8XLARGE: {
				X1e_8xlarge x1e_8xlarge = (X1e_8xlarge)theEObject;
				T result = caseX1e_8xlarge(x1e_8xlarge);
				if (result == null) result = caseMemoryoptimized(x1e_8xlarge);
				if (result == null) result = caseResource_tpl(x1e_8xlarge);
				if (result == null) result = caseMixinBase(x1e_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.X1E_16XLARGE: {
				X1e_16xlarge x1e_16xlarge = (X1e_16xlarge)theEObject;
				T result = caseX1e_16xlarge(x1e_16xlarge);
				if (result == null) result = caseMemoryoptimized(x1e_16xlarge);
				if (result == null) result = caseResource_tpl(x1e_16xlarge);
				if (result == null) result = caseMixinBase(x1e_16xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.X1E_32XLARGE: {
				X1e_32xlarge x1e_32xlarge = (X1e_32xlarge)theEObject;
				T result = caseX1e_32xlarge(x1e_32xlarge);
				if (result == null) result = caseMemoryoptimized(x1e_32xlarge);
				if (result == null) result = caseResource_tpl(x1e_32xlarge);
				if (result == null) result = caseMixinBase(x1e_32xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.X1_16XLARGE: {
				X1_16xlarge x1_16xlarge = (X1_16xlarge)theEObject;
				T result = caseX1_16xlarge(x1_16xlarge);
				if (result == null) result = caseMemoryoptimized(x1_16xlarge);
				if (result == null) result = caseResource_tpl(x1_16xlarge);
				if (result == null) result = caseMixinBase(x1_16xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.X1_32XLARGE: {
				X1_32xlarge x1_32xlarge = (X1_32xlarge)theEObject;
				T result = caseX1_32xlarge(x1_32xlarge);
				if (result == null) result = caseMemoryoptimized(x1_32xlarge);
				if (result == null) result = caseResource_tpl(x1_32xlarge);
				if (result == null) result = caseMixinBase(x1_32xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.R4_LARGE: {
				R4_large r4_large = (R4_large)theEObject;
				T result = caseR4_large(r4_large);
				if (result == null) result = caseMemoryoptimized(r4_large);
				if (result == null) result = caseResource_tpl(r4_large);
				if (result == null) result = caseMixinBase(r4_large);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.R4_XLARGE: {
				R4_xlarge r4_xlarge = (R4_xlarge)theEObject;
				T result = caseR4_xlarge(r4_xlarge);
				if (result == null) result = caseMemoryoptimized(r4_xlarge);
				if (result == null) result = caseResource_tpl(r4_xlarge);
				if (result == null) result = caseMixinBase(r4_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.R4_2XLARGE: {
				R4_2xlarge r4_2xlarge = (R4_2xlarge)theEObject;
				T result = caseR4_2xlarge(r4_2xlarge);
				if (result == null) result = caseMemoryoptimized(r4_2xlarge);
				if (result == null) result = caseResource_tpl(r4_2xlarge);
				if (result == null) result = caseMixinBase(r4_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.R4_4XLARGE: {
				R4_4xlarge r4_4xlarge = (R4_4xlarge)theEObject;
				T result = caseR4_4xlarge(r4_4xlarge);
				if (result == null) result = caseMemoryoptimized(r4_4xlarge);
				if (result == null) result = caseResource_tpl(r4_4xlarge);
				if (result == null) result = caseMixinBase(r4_4xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.R4_8XLARGE: {
				R4_8xlarge r4_8xlarge = (R4_8xlarge)theEObject;
				T result = caseR4_8xlarge(r4_8xlarge);
				if (result == null) result = caseMemoryoptimized(r4_8xlarge);
				if (result == null) result = caseResource_tpl(r4_8xlarge);
				if (result == null) result = caseMixinBase(r4_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.R4_16XLARGE: {
				R4_16xlarge r4_16xlarge = (R4_16xlarge)theEObject;
				T result = caseR4_16xlarge(r4_16xlarge);
				if (result == null) result = caseMemoryoptimized(r4_16xlarge);
				if (result == null) result = caseResource_tpl(r4_16xlarge);
				if (result == null) result = caseMixinBase(r4_16xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.R3_LARGE: {
				R3_large r3_large = (R3_large)theEObject;
				T result = caseR3_large(r3_large);
				if (result == null) result = caseMemoryoptimized(r3_large);
				if (result == null) result = caseResource_tpl(r3_large);
				if (result == null) result = caseMixinBase(r3_large);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.R3_XLARGE: {
				R3_xlarge r3_xlarge = (R3_xlarge)theEObject;
				T result = caseR3_xlarge(r3_xlarge);
				if (result == null) result = caseMemoryoptimized(r3_xlarge);
				if (result == null) result = caseResource_tpl(r3_xlarge);
				if (result == null) result = caseMixinBase(r3_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.R3_2XLARGE: {
				R3_2xlarge r3_2xlarge = (R3_2xlarge)theEObject;
				T result = caseR3_2xlarge(r3_2xlarge);
				if (result == null) result = caseMemoryoptimized(r3_2xlarge);
				if (result == null) result = caseResource_tpl(r3_2xlarge);
				if (result == null) result = caseMixinBase(r3_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.R3_4XLARGE: {
				R3_4xlarge r3_4xlarge = (R3_4xlarge)theEObject;
				T result = caseR3_4xlarge(r3_4xlarge);
				if (result == null) result = caseMemoryoptimized(r3_4xlarge);
				if (result == null) result = caseResource_tpl(r3_4xlarge);
				if (result == null) result = caseMixinBase(r3_4xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.R3_8XLARGE: {
				R3_8xlarge r3_8xlarge = (R3_8xlarge)theEObject;
				T result = caseR3_8xlarge(r3_8xlarge);
				if (result == null) result = caseMemoryoptimized(r3_8xlarge);
				if (result == null) result = caseResource_tpl(r3_8xlarge);
				if (result == null) result = caseMixinBase(r3_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.P3_2XLARGE: {
				P3_2xlarge p3_2xlarge = (P3_2xlarge)theEObject;
				T result = caseP3_2xlarge(p3_2xlarge);
				if (result == null) result = caseAcceleratedcomputing(p3_2xlarge);
				if (result == null) result = caseResource_tpl(p3_2xlarge);
				if (result == null) result = caseMixinBase(p3_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.P3_8XLARGE: {
				P3_8xlarge p3_8xlarge = (P3_8xlarge)theEObject;
				T result = caseP3_8xlarge(p3_8xlarge);
				if (result == null) result = caseAcceleratedcomputing(p3_8xlarge);
				if (result == null) result = caseResource_tpl(p3_8xlarge);
				if (result == null) result = caseMixinBase(p3_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.P3_16XLARGE: {
				P3_16xlarge p3_16xlarge = (P3_16xlarge)theEObject;
				T result = caseP3_16xlarge(p3_16xlarge);
				if (result == null) result = caseAcceleratedcomputing(p3_16xlarge);
				if (result == null) result = caseResource_tpl(p3_16xlarge);
				if (result == null) result = caseMixinBase(p3_16xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.P2_XLARGE: {
				P2_xlarge p2_xlarge = (P2_xlarge)theEObject;
				T result = caseP2_xlarge(p2_xlarge);
				if (result == null) result = caseAcceleratedcomputing(p2_xlarge);
				if (result == null) result = caseResource_tpl(p2_xlarge);
				if (result == null) result = caseMixinBase(p2_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.P2_8XLARGE: {
				P2_8xlarge p2_8xlarge = (P2_8xlarge)theEObject;
				T result = caseP2_8xlarge(p2_8xlarge);
				if (result == null) result = caseAcceleratedcomputing(p2_8xlarge);
				if (result == null) result = caseResource_tpl(p2_8xlarge);
				if (result == null) result = caseMixinBase(p2_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.P2_16XLARGE: {
				P2_16xlarge p2_16xlarge = (P2_16xlarge)theEObject;
				T result = caseP2_16xlarge(p2_16xlarge);
				if (result == null) result = caseAcceleratedcomputing(p2_16xlarge);
				if (result == null) result = caseResource_tpl(p2_16xlarge);
				if (result == null) result = caseMixinBase(p2_16xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.GENERALPURPOSE: {
				Generalpurpose generalpurpose = (Generalpurpose)theEObject;
				T result = caseGeneralpurpose(generalpurpose);
				if (result == null) result = caseResource_tpl(generalpurpose);
				if (result == null) result = caseMixinBase(generalpurpose);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.COMPUTEOPTIMIZED: {
				Computeoptimized computeoptimized = (Computeoptimized)theEObject;
				T result = caseComputeoptimized(computeoptimized);
				if (result == null) result = caseResource_tpl(computeoptimized);
				if (result == null) result = caseMixinBase(computeoptimized);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.MEMORYOPTIMIZED: {
				Memoryoptimized memoryoptimized = (Memoryoptimized)theEObject;
				T result = caseMemoryoptimized(memoryoptimized);
				if (result == null) result = caseResource_tpl(memoryoptimized);
				if (result == null) result = caseMixinBase(memoryoptimized);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.ACCELERATEDCOMPUTING: {
				Acceleratedcomputing acceleratedcomputing = (Acceleratedcomputing)theEObject;
				T result = caseAcceleratedcomputing(acceleratedcomputing);
				if (result == null) result = caseResource_tpl(acceleratedcomputing);
				if (result == null) result = caseMixinBase(acceleratedcomputing);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.STORAGEOPTIMIZED: {
				Storageoptimized storageoptimized = (Storageoptimized)theEObject;
				T result = caseStorageoptimized(storageoptimized);
				if (result == null) result = caseResource_tpl(storageoptimized);
				if (result == null) result = caseMixinBase(storageoptimized);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.G3_4XLARGE: {
				G3_4xlarge g3_4xlarge = (G3_4xlarge)theEObject;
				T result = caseG3_4xlarge(g3_4xlarge);
				if (result == null) result = caseAcceleratedcomputing(g3_4xlarge);
				if (result == null) result = caseResource_tpl(g3_4xlarge);
				if (result == null) result = caseMixinBase(g3_4xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.G3_8XLARGE: {
				G3_8xlarge g3_8xlarge = (G3_8xlarge)theEObject;
				T result = caseG3_8xlarge(g3_8xlarge);
				if (result == null) result = caseAcceleratedcomputing(g3_8xlarge);
				if (result == null) result = caseResource_tpl(g3_8xlarge);
				if (result == null) result = caseMixinBase(g3_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.G3_16XLARGE: {
				G3_16xlarge g3_16xlarge = (G3_16xlarge)theEObject;
				T result = caseG3_16xlarge(g3_16xlarge);
				if (result == null) result = caseAcceleratedcomputing(g3_16xlarge);
				if (result == null) result = caseResource_tpl(g3_16xlarge);
				if (result == null) result = caseMixinBase(g3_16xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.F1_2XLARGE: {
				F1_2xlarge f1_2xlarge = (F1_2xlarge)theEObject;
				T result = caseF1_2xlarge(f1_2xlarge);
				if (result == null) result = caseAcceleratedcomputing(f1_2xlarge);
				if (result == null) result = caseResource_tpl(f1_2xlarge);
				if (result == null) result = caseMixinBase(f1_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.F1_16XLARGE: {
				F1_16xlarge f1_16xlarge = (F1_16xlarge)theEObject;
				T result = caseF1_16xlarge(f1_16xlarge);
				if (result == null) result = caseAcceleratedcomputing(f1_16xlarge);
				if (result == null) result = caseResource_tpl(f1_16xlarge);
				if (result == null) result = caseMixinBase(f1_16xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.H1_2XLARGE: {
				H1_2xlarge h1_2xlarge = (H1_2xlarge)theEObject;
				T result = caseH1_2xlarge(h1_2xlarge);
				if (result == null) result = caseStorageoptimized(h1_2xlarge);
				if (result == null) result = caseResource_tpl(h1_2xlarge);
				if (result == null) result = caseMixinBase(h1_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.H1_4XLARGE: {
				H1_4xlarge h1_4xlarge = (H1_4xlarge)theEObject;
				T result = caseH1_4xlarge(h1_4xlarge);
				if (result == null) result = caseStorageoptimized(h1_4xlarge);
				if (result == null) result = caseResource_tpl(h1_4xlarge);
				if (result == null) result = caseMixinBase(h1_4xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.H1_8XLARGE: {
				H1_8xlarge h1_8xlarge = (H1_8xlarge)theEObject;
				T result = caseH1_8xlarge(h1_8xlarge);
				if (result == null) result = caseStorageoptimized(h1_8xlarge);
				if (result == null) result = caseResource_tpl(h1_8xlarge);
				if (result == null) result = caseMixinBase(h1_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.H1_16XLARGE: {
				H1_16xlarge h1_16xlarge = (H1_16xlarge)theEObject;
				T result = caseH1_16xlarge(h1_16xlarge);
				if (result == null) result = caseStorageoptimized(h1_16xlarge);
				if (result == null) result = caseResource_tpl(h1_16xlarge);
				if (result == null) result = caseMixinBase(h1_16xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.I3_LARGE: {
				I3_large i3_large = (I3_large)theEObject;
				T result = caseI3_large(i3_large);
				if (result == null) result = caseStorageoptimized(i3_large);
				if (result == null) result = caseResource_tpl(i3_large);
				if (result == null) result = caseMixinBase(i3_large);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.I3_XLARGE: {
				I3_xlarge i3_xlarge = (I3_xlarge)theEObject;
				T result = caseI3_xlarge(i3_xlarge);
				if (result == null) result = caseStorageoptimized(i3_xlarge);
				if (result == null) result = caseResource_tpl(i3_xlarge);
				if (result == null) result = caseMixinBase(i3_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.I3_2XLARGE: {
				I3_2xlarge i3_2xlarge = (I3_2xlarge)theEObject;
				T result = caseI3_2xlarge(i3_2xlarge);
				if (result == null) result = caseStorageoptimized(i3_2xlarge);
				if (result == null) result = caseResource_tpl(i3_2xlarge);
				if (result == null) result = caseMixinBase(i3_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.I3_4XLARGE: {
				I3_4xlarge i3_4xlarge = (I3_4xlarge)theEObject;
				T result = caseI3_4xlarge(i3_4xlarge);
				if (result == null) result = caseStorageoptimized(i3_4xlarge);
				if (result == null) result = caseResource_tpl(i3_4xlarge);
				if (result == null) result = caseMixinBase(i3_4xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.I3_8XLARGE: {
				I3_8xlarge i3_8xlarge = (I3_8xlarge)theEObject;
				T result = caseI3_8xlarge(i3_8xlarge);
				if (result == null) result = caseStorageoptimized(i3_8xlarge);
				if (result == null) result = caseResource_tpl(i3_8xlarge);
				if (result == null) result = caseMixinBase(i3_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.I3_16XLARGE: {
				I3_16xlarge i3_16xlarge = (I3_16xlarge)theEObject;
				T result = caseI3_16xlarge(i3_16xlarge);
				if (result == null) result = caseStorageoptimized(i3_16xlarge);
				if (result == null) result = caseResource_tpl(i3_16xlarge);
				if (result == null) result = caseMixinBase(i3_16xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.I3_METAL: {
				I3_metal i3_metal = (I3_metal)theEObject;
				T result = caseI3_metal(i3_metal);
				if (result == null) result = caseStorageoptimized(i3_metal);
				if (result == null) result = caseResource_tpl(i3_metal);
				if (result == null) result = caseMixinBase(i3_metal);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.D2_XLARGE: {
				D2_xlarge d2_xlarge = (D2_xlarge)theEObject;
				T result = caseD2_xlarge(d2_xlarge);
				if (result == null) result = caseStorageoptimized(d2_xlarge);
				if (result == null) result = caseResource_tpl(d2_xlarge);
				if (result == null) result = caseMixinBase(d2_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.D2_2XLARGE: {
				D2_2xlarge d2_2xlarge = (D2_2xlarge)theEObject;
				T result = caseD2_2xlarge(d2_2xlarge);
				if (result == null) result = caseStorageoptimized(d2_2xlarge);
				if (result == null) result = caseResource_tpl(d2_2xlarge);
				if (result == null) result = caseMixinBase(d2_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.D2_4XLARGE: {
				D2_4xlarge d2_4xlarge = (D2_4xlarge)theEObject;
				T result = caseD2_4xlarge(d2_4xlarge);
				if (result == null) result = caseStorageoptimized(d2_4xlarge);
				if (result == null) result = caseResource_tpl(d2_4xlarge);
				if (result == null) result = caseMixinBase(d2_4xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.D2_8XLARGE: {
				D2_8xlarge d2_8xlarge = (D2_8xlarge)theEObject;
				T result = caseD2_8xlarge(d2_8xlarge);
				if (result == null) result = caseStorageoptimized(d2_8xlarge);
				if (result == null) result = caseResource_tpl(d2_8xlarge);
				if (result == null) result = caseMixinBase(d2_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M1_SMALL: {
				M1_small m1_small = (M1_small)theEObject;
				T result = caseM1_small(m1_small);
				if (result == null) result = caseGeneralpurpose(m1_small);
				if (result == null) result = caseResource_tpl(m1_small);
				if (result == null) result = caseMixinBase(m1_small);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.T1_MICRO: {
				T1_micro t1_micro = (T1_micro)theEObject;
				T result = caseT1_micro(t1_micro);
				if (result == null) result = caseGeneralpurpose(t1_micro);
				if (result == null) result = caseResource_tpl(t1_micro);
				if (result == null) result = caseMixinBase(t1_micro);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M1_MEDIUM: {
				M1_medium m1_medium = (M1_medium)theEObject;
				T result = caseM1_medium(m1_medium);
				if (result == null) result = caseGeneralpurpose(m1_medium);
				if (result == null) result = caseResource_tpl(m1_medium);
				if (result == null) result = caseMixinBase(m1_medium);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M1_LARGE: {
				M1_large m1_large = (M1_large)theEObject;
				T result = caseM1_large(m1_large);
				if (result == null) result = caseGeneralpurpose(m1_large);
				if (result == null) result = caseResource_tpl(m1_large);
				if (result == null) result = caseMixinBase(m1_large);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M1_XLARGE: {
				M1_xlarge m1_xlarge = (M1_xlarge)theEObject;
				T result = caseM1_xlarge(m1_xlarge);
				if (result == null) result = caseGeneralpurpose(m1_xlarge);
				if (result == null) result = caseResource_tpl(m1_xlarge);
				if (result == null) result = caseMixinBase(m1_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C1_MEDIUM: {
				C1_medium c1_medium = (C1_medium)theEObject;
				T result = caseC1_medium(c1_medium);
				if (result == null) result = caseComputeoptimized(c1_medium);
				if (result == null) result = caseResource_tpl(c1_medium);
				if (result == null) result = caseMixinBase(c1_medium);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.C1_XLARGE: {
				C1_xlarge c1_xlarge = (C1_xlarge)theEObject;
				T result = caseC1_xlarge(c1_xlarge);
				if (result == null) result = caseComputeoptimized(c1_xlarge);
				if (result == null) result = caseResource_tpl(c1_xlarge);
				if (result == null) result = caseMixinBase(c1_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.CC2_8XLARGE: {
				Cc2_8xlarge cc2_8xlarge = (Cc2_8xlarge)theEObject;
				T result = caseCc2_8xlarge(cc2_8xlarge);
				if (result == null) result = caseComputeoptimized(cc2_8xlarge);
				if (result == null) result = caseResource_tpl(cc2_8xlarge);
				if (result == null) result = caseMixinBase(cc2_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.G2_2XLARGE: {
				G2_2xlarge g2_2xlarge = (G2_2xlarge)theEObject;
				T result = caseG2_2xlarge(g2_2xlarge);
				if (result == null) result = caseAcceleratedcomputing(g2_2xlarge);
				if (result == null) result = caseResource_tpl(g2_2xlarge);
				if (result == null) result = caseMixinBase(g2_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.G2_8XLARGE: {
				G2_8xlarge g2_8xlarge = (G2_8xlarge)theEObject;
				T result = caseG2_8xlarge(g2_8xlarge);
				if (result == null) result = caseAcceleratedcomputing(g2_8xlarge);
				if (result == null) result = caseResource_tpl(g2_8xlarge);
				if (result == null) result = caseMixinBase(g2_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.CG1_4XLARGE: {
				Cg1_4xlarge cg1_4xlarge = (Cg1_4xlarge)theEObject;
				T result = caseCg1_4xlarge(cg1_4xlarge);
				if (result == null) result = caseAcceleratedcomputing(cg1_4xlarge);
				if (result == null) result = caseResource_tpl(cg1_4xlarge);
				if (result == null) result = caseMixinBase(cg1_4xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M2_XLARGE: {
				M2_xlarge m2_xlarge = (M2_xlarge)theEObject;
				T result = caseM2_xlarge(m2_xlarge);
				if (result == null) result = caseMemoryoptimized(m2_xlarge);
				if (result == null) result = caseResource_tpl(m2_xlarge);
				if (result == null) result = caseMixinBase(m2_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M2_2XLARGE: {
				M2_2xlarge m2_2xlarge = (M2_2xlarge)theEObject;
				T result = caseM2_2xlarge(m2_2xlarge);
				if (result == null) result = caseMemoryoptimized(m2_2xlarge);
				if (result == null) result = caseResource_tpl(m2_2xlarge);
				if (result == null) result = caseMixinBase(m2_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.M2_4XLARGE: {
				M2_4xlarge m2_4xlarge = (M2_4xlarge)theEObject;
				T result = caseM2_4xlarge(m2_4xlarge);
				if (result == null) result = caseMemoryoptimized(m2_4xlarge);
				if (result == null) result = caseResource_tpl(m2_4xlarge);
				if (result == null) result = caseMixinBase(m2_4xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.CR1_8XLARGE: {
				Cr1_8xlarge cr1_8xlarge = (Cr1_8xlarge)theEObject;
				T result = caseCr1_8xlarge(cr1_8xlarge);
				if (result == null) result = caseMemoryoptimized(cr1_8xlarge);
				if (result == null) result = caseResource_tpl(cr1_8xlarge);
				if (result == null) result = caseMixinBase(cr1_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.I2_XLARGE: {
				I2_xlarge i2_xlarge = (I2_xlarge)theEObject;
				T result = caseI2_xlarge(i2_xlarge);
				if (result == null) result = caseStorageoptimized(i2_xlarge);
				if (result == null) result = caseResource_tpl(i2_xlarge);
				if (result == null) result = caseMixinBase(i2_xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.I2_2XLARGE: {
				I2_2xlarge i2_2xlarge = (I2_2xlarge)theEObject;
				T result = caseI2_2xlarge(i2_2xlarge);
				if (result == null) result = caseStorageoptimized(i2_2xlarge);
				if (result == null) result = caseResource_tpl(i2_2xlarge);
				if (result == null) result = caseMixinBase(i2_2xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.I2_4XLARGE: {
				I2_4xlarge i2_4xlarge = (I2_4xlarge)theEObject;
				T result = caseI2_4xlarge(i2_4xlarge);
				if (result == null) result = caseStorageoptimized(i2_4xlarge);
				if (result == null) result = caseResource_tpl(i2_4xlarge);
				if (result == null) result = caseMixinBase(i2_4xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.I2_8XLARGE: {
				I2_8xlarge i2_8xlarge = (I2_8xlarge)theEObject;
				T result = caseI2_8xlarge(i2_8xlarge);
				if (result == null) result = caseStorageoptimized(i2_8xlarge);
				if (result == null) result = caseResource_tpl(i2_8xlarge);
				if (result == null) result = caseMixinBase(i2_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.HS1_8XLARGE: {
				Hs1_8xlarge hs1_8xlarge = (Hs1_8xlarge)theEObject;
				T result = caseHs1_8xlarge(hs1_8xlarge);
				if (result == null) result = caseStorageoptimized(hs1_8xlarge);
				if (result == null) result = caseResource_tpl(hs1_8xlarge);
				if (result == null) result = caseMixinBase(hs1_8xlarge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.PLACEMENTGROUP: {
				Placementgroup placementgroup = (Placementgroup)theEObject;
				T result = casePlacementgroup(placementgroup);
				if (result == null) result = caseMixinBase(placementgroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.ROOTDEVICEVOLUME: {
				Rootdevicevolume rootdevicevolume = (Rootdevicevolume)theEObject;
				T result = caseRootdevicevolume(rootdevicevolume);
				if (result == null) result = caseMixinBase(rootdevicevolume);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.STATUSTRANSITIONREASON: {
				Statustransitionreason statustransitionreason = (Statustransitionreason)theEObject;
				T result = caseStatustransitionreason(statustransitionreason);
				if (result == null) result = caseMixinBase(statustransitionreason);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.TAGS: {
				Tags tags = (Tags)theEObject;
				T result = caseTags(tags);
				if (result == null) result = caseMixinBase(tags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Ec2Package.INSTANCEVPCINFO: {
				Instancevpcinfo instancevpcinfo = (Instancevpcinfo)theEObject;
				T result = caseInstancevpcinfo(instancevpcinfo);
				if (result == null) result = caseMixinBase(instancevpcinfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instanceec2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instanceec2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstanceec2(Instanceec2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Awsaccount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Awsaccount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwsaccount(Awsaccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Awscredential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Awscredential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAwscredential(Awscredential object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>T2 nano</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>T2 nano</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT2_nano(T2_nano object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>T2 micro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>T2 micro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT2_micro(T2_micro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>T2 small</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>T2 small</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT2_small(T2_small object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>T2 medium</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>T2 medium</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT2_medium(T2_medium object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>T2 large</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>T2 large</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT2_large(T2_large object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>T2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>T2 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT2_xlarge(T2_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>T2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>T2 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT2_2xlarge(T2_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M5 large</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M5 large</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM5_large(M5_large object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M5 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M5 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM5_xlarge(M5_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M5 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M5 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM5_2xlarge(M5_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M5 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M5 4xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM5_4xlarge(M5_4xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M5 12xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M5 12xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM5_12xlarge(M5_12xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M5 24xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M5 24xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM5_24xlarge(M5_24xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M4 large</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M4 large</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM4_large(M4_large object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M4 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M4 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM4_xlarge(M4_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M4 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M4 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM4_2xlarge(M4_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M4 10xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M4 10xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM4_10xlarge(M4_10xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M4 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M4 16xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM4_16xlarge(M4_16xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M3 medium</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M3 medium</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM3_medium(M3_medium object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M3 large</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M3 large</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM3_large(M3_large object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M3 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM3_xlarge(M3_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M3 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM3_2xlarge(M3_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C5 large</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C5 large</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC5_large(C5_large object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C5 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C5 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC5_xlarge(C5_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C5 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C5 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC5_2xlarge(C5_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C5 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C5 4xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC5_4xlarge(C5_4xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C5 9xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C5 9xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC5_9xlarge(C5_9xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C5 18xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C5 18xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC5_18xlarge(C5_18xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C4 large</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C4 large</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC4_large(C4_large object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C4 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C4 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC4_xlarge(C4_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C4 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C4 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC4_2xlarge(C4_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C4 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C4 4xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC4_4xlarge(C4_4xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C4 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C4 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC4_8xlarge(C4_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C3 large</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C3 large</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC3_large(C3_large object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C3 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC3_xlarge(C3_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C3 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC3_2xlarge(C3_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C3 4xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC3_4xlarge(C3_4xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C3 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC3_8xlarge(C3_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>X1e xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>X1e xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX1e_xlarge(X1e_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>X1e 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>X1e 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX1e_2xlarge(X1e_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>X1e 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>X1e 4xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX1e_4xlarge(X1e_4xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>X1e 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>X1e 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX1e_8xlarge(X1e_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>X1e 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>X1e 16xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX1e_16xlarge(X1e_16xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>X1e 32xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>X1e 32xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX1e_32xlarge(X1e_32xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>X1 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>X1 16xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX1_16xlarge(X1_16xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>X1 32xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>X1 32xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseX1_32xlarge(X1_32xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>R4 large</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>R4 large</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseR4_large(R4_large object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>R4 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>R4 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseR4_xlarge(R4_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>R4 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>R4 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseR4_2xlarge(R4_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>R4 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>R4 4xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseR4_4xlarge(R4_4xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>R4 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>R4 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseR4_8xlarge(R4_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>R4 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>R4 16xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseR4_16xlarge(R4_16xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>R3 large</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>R3 large</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseR3_large(R3_large object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>R3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>R3 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseR3_xlarge(R3_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>R3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>R3 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseR3_2xlarge(R3_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>R3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>R3 4xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseR3_4xlarge(R3_4xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>R3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>R3 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseR3_8xlarge(R3_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>P3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>P3 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP3_2xlarge(P3_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>P3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>P3 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP3_8xlarge(P3_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>P3 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>P3 16xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP3_16xlarge(P3_16xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>P2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>P2 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP2_xlarge(P2_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>P2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>P2 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP2_8xlarge(P2_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>P2 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>P2 16xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseP2_16xlarge(P2_16xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generalpurpose</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generalpurpose</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGeneralpurpose(Generalpurpose object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Computeoptimized</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Computeoptimized</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComputeoptimized(Computeoptimized object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memoryoptimized</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memoryoptimized</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemoryoptimized(Memoryoptimized object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acceleratedcomputing</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acceleratedcomputing</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceleratedcomputing(Acceleratedcomputing object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Storageoptimized</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Storageoptimized</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStorageoptimized(Storageoptimized object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>G3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>G3 4xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG3_4xlarge(G3_4xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>G3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>G3 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG3_8xlarge(G3_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>G3 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>G3 16xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG3_16xlarge(G3_16xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>F1 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>F1 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseF1_2xlarge(F1_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>F1 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>F1 16xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseF1_16xlarge(F1_16xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H1 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H1 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH1_2xlarge(H1_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H1 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H1 4xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH1_4xlarge(H1_4xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H1 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H1 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH1_8xlarge(H1_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H1 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H1 16xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH1_16xlarge(H1_16xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I3 large</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I3 large</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI3_large(I3_large object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I3 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI3_xlarge(I3_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I3 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI3_2xlarge(I3_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I3 4xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI3_4xlarge(I3_4xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I3 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI3_8xlarge(I3_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I3 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I3 16xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI3_16xlarge(I3_16xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I3 metal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I3 metal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI3_metal(I3_metal object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>D2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>D2 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseD2_xlarge(D2_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>D2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>D2 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseD2_2xlarge(D2_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>D2 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>D2 4xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseD2_4xlarge(D2_4xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>D2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>D2 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseD2_8xlarge(D2_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M1 small</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M1 small</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM1_small(M1_small object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>T1 micro</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>T1 micro</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseT1_micro(T1_micro object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M1 medium</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M1 medium</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM1_medium(M1_medium object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M1 large</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M1 large</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM1_large(M1_large object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M1 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M1 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM1_xlarge(M1_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C1 medium</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C1 medium</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC1_medium(C1_medium object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>C1 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>C1 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseC1_xlarge(C1_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cc2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cc2 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCc2_8xlarge(Cc2_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>G2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>G2 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG2_2xlarge(G2_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>G2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>G2 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseG2_8xlarge(G2_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cg1 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cg1 4xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCg1_4xlarge(Cg1_4xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M2 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM2_xlarge(M2_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M2 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM2_2xlarge(M2_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>M2 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>M2 4xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseM2_4xlarge(M2_4xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cr1 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cr1 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCr1_8xlarge(Cr1_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I2 xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI2_xlarge(I2_xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I2 2xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI2_2xlarge(I2_2xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I2 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I2 4xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI2_4xlarge(I2_4xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>I2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>I2 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseI2_8xlarge(I2_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hs1 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hs1 8xlarge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHs1_8xlarge(Hs1_8xlarge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Placementgroup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Placementgroup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlacementgroup(Placementgroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rootdevicevolume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rootdevicevolume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRootdevicevolume(Rootdevicevolume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statustransitionreason</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statustransitionreason</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatustransitionreason(Statustransitionreason object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTags(Tags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instancevpcinfo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instancevpcinfo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstancevpcinfo(Instancevpcinfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntity(Entity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompute(Compute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloudaccount</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloudaccount</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudaccount(Cloudaccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixinBase(MixinBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloudcredential</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloudcredential</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudcredential(Cloudcredential object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource tpl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource tpl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource_tpl(Resource_tpl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Ec2Switch
