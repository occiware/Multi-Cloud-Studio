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

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.infrastructure.util.InfrastructureValidator;

import org.eclipse.cmf.occi.multicloud.accounts.util.AccountsValidator;

import org.eclipse.cmf.occi.multicloud.aws.ec2.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package
 * @generated
 */
public class Ec2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Ec2Validator INSTANCE = new Ec2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.multicloud.aws.ec2";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCCIValidator occiValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountsValidator accountsValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfrastructureValidator infrastructureValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ec2Validator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
		accountsValidator = AccountsValidator.INSTANCE;
		infrastructureValidator = InfrastructureValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Ec2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Ec2Package.INSTANCEEC2:
				return validateInstanceec2((Instanceec2)value, diagnostics, context);
			case Ec2Package.AWSACCOUNT:
				return validateAwsaccount((Awsaccount)value, diagnostics, context);
			case Ec2Package.SECURITYGROUP:
				return validateSecuritygroup((Securitygroup)value, diagnostics, context);
			case Ec2Package.SECURITYGROUPLINK:
				return validateSecuritygrouplink((Securitygrouplink)value, diagnostics, context);
			case Ec2Package.KEYPAIR:
				return validateKeypair((Keypair)value, diagnostics, context);
			case Ec2Package.KEYPAIRLINK:
				return validateKeypairlink((Keypairlink)value, diagnostics, context);
			case Ec2Package.IPPERMISSION:
				return validateIppermission((Ippermission)value, diagnostics, context);
			case Ec2Package.IPPERMISSIONLINK:
				return validateIppermissionlink((Ippermissionlink)value, diagnostics, context);
			case Ec2Package.AWSCREDENTIAL:
				return validateAwscredential((Awscredential)value, diagnostics, context);
			case Ec2Package.T2_NANO:
				return validateT2_nano((T2_nano)value, diagnostics, context);
			case Ec2Package.T2_MICRO:
				return validateT2_micro((T2_micro)value, diagnostics, context);
			case Ec2Package.T2_SMALL:
				return validateT2_small((T2_small)value, diagnostics, context);
			case Ec2Package.T2_MEDIUM:
				return validateT2_medium((T2_medium)value, diagnostics, context);
			case Ec2Package.T2_LARGE:
				return validateT2_large((T2_large)value, diagnostics, context);
			case Ec2Package.T2_XLARGE:
				return validateT2_xlarge((T2_xlarge)value, diagnostics, context);
			case Ec2Package.T2_2XLARGE:
				return validateT2_2xlarge((T2_2xlarge)value, diagnostics, context);
			case Ec2Package.M5_LARGE:
				return validateM5_large((M5_large)value, diagnostics, context);
			case Ec2Package.M5_XLARGE:
				return validateM5_xlarge((M5_xlarge)value, diagnostics, context);
			case Ec2Package.M5_2XLARGE:
				return validateM5_2xlarge((M5_2xlarge)value, diagnostics, context);
			case Ec2Package.M5_4XLARGE:
				return validateM5_4xlarge((M5_4xlarge)value, diagnostics, context);
			case Ec2Package.M5_12XLARGE:
				return validateM5_12xlarge((M5_12xlarge)value, diagnostics, context);
			case Ec2Package.M5_24XLARGE:
				return validateM5_24xlarge((M5_24xlarge)value, diagnostics, context);
			case Ec2Package.M4_LARGE:
				return validateM4_large((M4_large)value, diagnostics, context);
			case Ec2Package.M4_XLARGE:
				return validateM4_xlarge((M4_xlarge)value, diagnostics, context);
			case Ec2Package.M4_2XLARGE:
				return validateM4_2xlarge((M4_2xlarge)value, diagnostics, context);
			case Ec2Package.M4_10XLARGE:
				return validateM4_10xlarge((M4_10xlarge)value, diagnostics, context);
			case Ec2Package.M4_16XLARGE:
				return validateM4_16xlarge((M4_16xlarge)value, diagnostics, context);
			case Ec2Package.M3_MEDIUM:
				return validateM3_medium((M3_medium)value, diagnostics, context);
			case Ec2Package.M3_LARGE:
				return validateM3_large((M3_large)value, diagnostics, context);
			case Ec2Package.M3_XLARGE:
				return validateM3_xlarge((M3_xlarge)value, diagnostics, context);
			case Ec2Package.M3_2XLARGE:
				return validateM3_2xlarge((M3_2xlarge)value, diagnostics, context);
			case Ec2Package.C5_LARGE:
				return validateC5_large((C5_large)value, diagnostics, context);
			case Ec2Package.C5_XLARGE:
				return validateC5_xlarge((C5_xlarge)value, diagnostics, context);
			case Ec2Package.C5_2XLARGE:
				return validateC5_2xlarge((C5_2xlarge)value, diagnostics, context);
			case Ec2Package.C5_4XLARGE:
				return validateC5_4xlarge((C5_4xlarge)value, diagnostics, context);
			case Ec2Package.C5_9XLARGE:
				return validateC5_9xlarge((C5_9xlarge)value, diagnostics, context);
			case Ec2Package.C5_18XLARGE:
				return validateC5_18xlarge((C5_18xlarge)value, diagnostics, context);
			case Ec2Package.C4_LARGE:
				return validateC4_large((C4_large)value, diagnostics, context);
			case Ec2Package.C4_XLARGE:
				return validateC4_xlarge((C4_xlarge)value, diagnostics, context);
			case Ec2Package.C4_2XLARGE:
				return validateC4_2xlarge((C4_2xlarge)value, diagnostics, context);
			case Ec2Package.C4_4XLARGE:
				return validateC4_4xlarge((C4_4xlarge)value, diagnostics, context);
			case Ec2Package.C4_8XLARGE:
				return validateC4_8xlarge((C4_8xlarge)value, diagnostics, context);
			case Ec2Package.C3_LARGE:
				return validateC3_large((C3_large)value, diagnostics, context);
			case Ec2Package.C3_XLARGE:
				return validateC3_xlarge((C3_xlarge)value, diagnostics, context);
			case Ec2Package.C3_2XLARGE:
				return validateC3_2xlarge((C3_2xlarge)value, diagnostics, context);
			case Ec2Package.C3_4XLARGE:
				return validateC3_4xlarge((C3_4xlarge)value, diagnostics, context);
			case Ec2Package.C3_8XLARGE:
				return validateC3_8xlarge((C3_8xlarge)value, diagnostics, context);
			case Ec2Package.X1E_XLARGE:
				return validateX1e_xlarge((X1e_xlarge)value, diagnostics, context);
			case Ec2Package.X1E_2XLARGE:
				return validateX1e_2xlarge((X1e_2xlarge)value, diagnostics, context);
			case Ec2Package.X1E_4XLARGE:
				return validateX1e_4xlarge((X1e_4xlarge)value, diagnostics, context);
			case Ec2Package.X1E_8XLARGE:
				return validateX1e_8xlarge((X1e_8xlarge)value, diagnostics, context);
			case Ec2Package.X1E_16XLARGE:
				return validateX1e_16xlarge((X1e_16xlarge)value, diagnostics, context);
			case Ec2Package.X1E_32XLARGE:
				return validateX1e_32xlarge((X1e_32xlarge)value, diagnostics, context);
			case Ec2Package.X1_16XLARGE:
				return validateX1_16xlarge((X1_16xlarge)value, diagnostics, context);
			case Ec2Package.X1_32XLARGE:
				return validateX1_32xlarge((X1_32xlarge)value, diagnostics, context);
			case Ec2Package.R4_LARGE:
				return validateR4_large((R4_large)value, diagnostics, context);
			case Ec2Package.R4_XLARGE:
				return validateR4_xlarge((R4_xlarge)value, diagnostics, context);
			case Ec2Package.R4_2XLARGE:
				return validateR4_2xlarge((R4_2xlarge)value, diagnostics, context);
			case Ec2Package.R4_4XLARGE:
				return validateR4_4xlarge((R4_4xlarge)value, diagnostics, context);
			case Ec2Package.R4_8XLARGE:
				return validateR4_8xlarge((R4_8xlarge)value, diagnostics, context);
			case Ec2Package.R4_16XLARGE:
				return validateR4_16xlarge((R4_16xlarge)value, diagnostics, context);
			case Ec2Package.R3_LARGE:
				return validateR3_large((R3_large)value, diagnostics, context);
			case Ec2Package.R3_XLARGE:
				return validateR3_xlarge((R3_xlarge)value, diagnostics, context);
			case Ec2Package.R3_2XLARGE:
				return validateR3_2xlarge((R3_2xlarge)value, diagnostics, context);
			case Ec2Package.R3_4XLARGE:
				return validateR3_4xlarge((R3_4xlarge)value, diagnostics, context);
			case Ec2Package.R3_8XLARGE:
				return validateR3_8xlarge((R3_8xlarge)value, diagnostics, context);
			case Ec2Package.P3_2XLARGE:
				return validateP3_2xlarge((P3_2xlarge)value, diagnostics, context);
			case Ec2Package.P3_8XLARGE:
				return validateP3_8xlarge((P3_8xlarge)value, diagnostics, context);
			case Ec2Package.P3_16XLARGE:
				return validateP3_16xlarge((P3_16xlarge)value, diagnostics, context);
			case Ec2Package.P2_XLARGE:
				return validateP2_xlarge((P2_xlarge)value, diagnostics, context);
			case Ec2Package.P2_8XLARGE:
				return validateP2_8xlarge((P2_8xlarge)value, diagnostics, context);
			case Ec2Package.P2_16XLARGE:
				return validateP2_16xlarge((P2_16xlarge)value, diagnostics, context);
			case Ec2Package.GENERALPURPOSE:
				return validateGeneralpurpose((Generalpurpose)value, diagnostics, context);
			case Ec2Package.COMPUTEOPTIMIZED:
				return validateComputeoptimized((Computeoptimized)value, diagnostics, context);
			case Ec2Package.MEMORYOPTIMIZED:
				return validateMemoryoptimized((Memoryoptimized)value, diagnostics, context);
			case Ec2Package.ACCELERATEDCOMPUTING:
				return validateAcceleratedcomputing((Acceleratedcomputing)value, diagnostics, context);
			case Ec2Package.STORAGEOPTIMIZED:
				return validateStorageoptimized((Storageoptimized)value, diagnostics, context);
			case Ec2Package.G3_4XLARGE:
				return validateG3_4xlarge((G3_4xlarge)value, diagnostics, context);
			case Ec2Package.G3_8XLARGE:
				return validateG3_8xlarge((G3_8xlarge)value, diagnostics, context);
			case Ec2Package.G3_16XLARGE:
				return validateG3_16xlarge((G3_16xlarge)value, diagnostics, context);
			case Ec2Package.F1_2XLARGE:
				return validateF1_2xlarge((F1_2xlarge)value, diagnostics, context);
			case Ec2Package.F1_16XLARGE:
				return validateF1_16xlarge((F1_16xlarge)value, diagnostics, context);
			case Ec2Package.H1_2XLARGE:
				return validateH1_2xlarge((H1_2xlarge)value, diagnostics, context);
			case Ec2Package.H1_4XLARGE:
				return validateH1_4xlarge((H1_4xlarge)value, diagnostics, context);
			case Ec2Package.H1_8XLARGE:
				return validateH1_8xlarge((H1_8xlarge)value, diagnostics, context);
			case Ec2Package.H1_16XLARGE:
				return validateH1_16xlarge((H1_16xlarge)value, diagnostics, context);
			case Ec2Package.I3_LARGE:
				return validateI3_large((I3_large)value, diagnostics, context);
			case Ec2Package.I3_XLARGE:
				return validateI3_xlarge((I3_xlarge)value, diagnostics, context);
			case Ec2Package.I3_2XLARGE:
				return validateI3_2xlarge((I3_2xlarge)value, diagnostics, context);
			case Ec2Package.I3_4XLARGE:
				return validateI3_4xlarge((I3_4xlarge)value, diagnostics, context);
			case Ec2Package.I3_8XLARGE:
				return validateI3_8xlarge((I3_8xlarge)value, diagnostics, context);
			case Ec2Package.I3_16XLARGE:
				return validateI3_16xlarge((I3_16xlarge)value, diagnostics, context);
			case Ec2Package.I3_METAL:
				return validateI3_metal((I3_metal)value, diagnostics, context);
			case Ec2Package.D2_XLARGE:
				return validateD2_xlarge((D2_xlarge)value, diagnostics, context);
			case Ec2Package.D2_2XLARGE:
				return validateD2_2xlarge((D2_2xlarge)value, diagnostics, context);
			case Ec2Package.D2_4XLARGE:
				return validateD2_4xlarge((D2_4xlarge)value, diagnostics, context);
			case Ec2Package.D2_8XLARGE:
				return validateD2_8xlarge((D2_8xlarge)value, diagnostics, context);
			case Ec2Package.M1_SMALL:
				return validateM1_small((M1_small)value, diagnostics, context);
			case Ec2Package.T1_MICRO:
				return validateT1_micro((T1_micro)value, diagnostics, context);
			case Ec2Package.M1_MEDIUM:
				return validateM1_medium((M1_medium)value, diagnostics, context);
			case Ec2Package.M1_LARGE:
				return validateM1_large((M1_large)value, diagnostics, context);
			case Ec2Package.M1_XLARGE:
				return validateM1_xlarge((M1_xlarge)value, diagnostics, context);
			case Ec2Package.C1_MEDIUM:
				return validateC1_medium((C1_medium)value, diagnostics, context);
			case Ec2Package.C1_XLARGE:
				return validateC1_xlarge((C1_xlarge)value, diagnostics, context);
			case Ec2Package.CC2_8XLARGE:
				return validateCc2_8xlarge((Cc2_8xlarge)value, diagnostics, context);
			case Ec2Package.G2_2XLARGE:
				return validateG2_2xlarge((G2_2xlarge)value, diagnostics, context);
			case Ec2Package.G2_8XLARGE:
				return validateG2_8xlarge((G2_8xlarge)value, diagnostics, context);
			case Ec2Package.CG1_4XLARGE:
				return validateCg1_4xlarge((Cg1_4xlarge)value, diagnostics, context);
			case Ec2Package.M2_XLARGE:
				return validateM2_xlarge((M2_xlarge)value, diagnostics, context);
			case Ec2Package.M2_2XLARGE:
				return validateM2_2xlarge((M2_2xlarge)value, diagnostics, context);
			case Ec2Package.M2_4XLARGE:
				return validateM2_4xlarge((M2_4xlarge)value, diagnostics, context);
			case Ec2Package.CR1_8XLARGE:
				return validateCr1_8xlarge((Cr1_8xlarge)value, diagnostics, context);
			case Ec2Package.I2_XLARGE:
				return validateI2_xlarge((I2_xlarge)value, diagnostics, context);
			case Ec2Package.I2_2XLARGE:
				return validateI2_2xlarge((I2_2xlarge)value, diagnostics, context);
			case Ec2Package.I2_4XLARGE:
				return validateI2_4xlarge((I2_4xlarge)value, diagnostics, context);
			case Ec2Package.I2_8XLARGE:
				return validateI2_8xlarge((I2_8xlarge)value, diagnostics, context);
			case Ec2Package.HS1_8XLARGE:
				return validateHs1_8xlarge((Hs1_8xlarge)value, diagnostics, context);
			case Ec2Package.PLACEMENTGROUP:
				return validatePlacementgroup((Placementgroup)value, diagnostics, context);
			case Ec2Package.ROOTDEVICEVOLUME:
				return validateRootdevicevolume((Rootdevicevolume)value, diagnostics, context);
			case Ec2Package.STATUSTRANSITIONREASON:
				return validateStatustransitionreason((Statustransitionreason)value, diagnostics, context);
			case Ec2Package.TAGS:
				return validateTags((Tags)value, diagnostics, context);
			case Ec2Package.INSTANCEVPCINFO:
				return validateInstancevpcinfo((Instancevpcinfo)value, diagnostics, context);
			case Ec2Package.AWS_INSTANCE_STATE:
				return validateAWSInstanceState((AWSInstanceState)value, diagnostics, context);
			case Ec2Package.HYPERVISOR_TYPE:
				return validateHypervisorType((HypervisorType)value, diagnostics, context);
			case Ec2Package.INSTANCE_LIFE_CYCLE_TYPE:
				return validateInstanceLifeCycleType((InstanceLifeCycleType)value, diagnostics, context);
			case Ec2Package.MONITORING_STATE:
				return validateMonitoringState((MonitoringState)value, diagnostics, context);
			case Ec2Package.VIRTUALIZATION_TYPE:
				return validateVirtualizationType((VirtualizationType)value, diagnostics, context);
			case Ec2Package.IP_PERMISSION_TYPE:
				return validateIpPermissionType((IpPermissionType)value, diagnostics, context);
			case Ec2Package.IP_PROTOCOL:
				return validateIpProtocol((IpProtocol)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceec2(Instanceec2 instanceec2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instanceec2, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instanceec2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instanceec2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instanceec2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instanceec2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instanceec2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instanceec2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instanceec2, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instanceec2, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(instanceec2, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(instanceec2, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(instanceec2, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(instanceec2, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(instanceec2, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAwsaccount(Awsaccount awsaccount, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(awsaccount, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(awsaccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(awsaccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(awsaccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(awsaccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(awsaccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(awsaccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(awsaccount, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(awsaccount, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(awsaccount, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(awsaccount, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(awsaccount, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(awsaccount, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(awsaccount, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuritygroup(Securitygroup securitygroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(securitygroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(securitygroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(securitygroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(securitygroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(securitygroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(securitygroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(securitygroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(securitygroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(securitygroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(securitygroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(securitygroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(securitygroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(securitygroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(securitygroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuritygrouplink(Securitygrouplink securitygrouplink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(securitygrouplink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecuritygrouplink_sourceConstraint(securitygrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validateSecuritygrouplink_targetConstraint(securitygrouplink, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sourceConstraint constraint of '<em>Securitygrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SECURITYGROUPLINK__SOURCE_CONSTRAINT__EEXPRESSION = "self.source.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the sourceConstraint constraint of '<em>Securitygrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuritygrouplink_sourceConstraint(Securitygrouplink securitygrouplink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Ec2Package.eINSTANCE.getSecuritygrouplink(),
				 securitygrouplink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sourceConstraint",
				 SECURITYGROUPLINK__SOURCE_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the targetConstraint constraint of '<em>Securitygrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SECURITYGROUPLINK__TARGET_CONSTRAINT__EEXPRESSION = "self.target.oclIsKindOf(ec2::Securitygroup)";

	/**
	 * Validates the targetConstraint constraint of '<em>Securitygrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuritygrouplink_targetConstraint(Securitygrouplink securitygrouplink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Ec2Package.eINSTANCE.getSecuritygrouplink(),
				 securitygrouplink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetConstraint",
				 SECURITYGROUPLINK__TARGET_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeypair(Keypair keypair, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(keypair, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(keypair, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(keypair, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(keypair, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(keypair, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(keypair, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(keypair, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(keypair, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(keypair, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(keypair, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(keypair, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(keypair, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(keypair, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(keypair, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeypairlink(Keypairlink keypairlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(keypairlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateKeypairlink_sourceConstraint(keypairlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateKeypairlink_targetConstraint(keypairlink, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sourceConstraint constraint of '<em>Keypairlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KEYPAIRLINK__SOURCE_CONSTRAINT__EEXPRESSION = "self.source.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the sourceConstraint constraint of '<em>Keypairlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeypairlink_sourceConstraint(Keypairlink keypairlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Ec2Package.eINSTANCE.getKeypairlink(),
				 keypairlink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sourceConstraint",
				 KEYPAIRLINK__SOURCE_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the targetConstraint constraint of '<em>Keypairlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String KEYPAIRLINK__TARGET_CONSTRAINT__EEXPRESSION = "self.target.oclIsKindOf(ec2::Keypair)";

	/**
	 * Validates the targetConstraint constraint of '<em>Keypairlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKeypairlink_targetConstraint(Keypairlink keypairlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Ec2Package.eINSTANCE.getKeypairlink(),
				 keypairlink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetConstraint",
				 KEYPAIRLINK__TARGET_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIppermission(Ippermission ippermission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ippermission, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ippermission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ippermission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ippermission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ippermission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ippermission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ippermission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ippermission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ippermission, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(ippermission, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(ippermission, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(ippermission, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(ippermission, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(ippermission, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIppermissionlink(Ippermissionlink ippermissionlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ippermissionlink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateIppermissionlink_sourceConstraint(ippermissionlink, diagnostics, context);
		if (result || diagnostics != null) result &= validateIppermissionlink_targetConstraint(ippermissionlink, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the sourceConstraint constraint of '<em>Ippermissionlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IPPERMISSIONLINK__SOURCE_CONSTRAINT__EEXPRESSION = "self.source.oclIsKindOf(ec2::Securitygroup)";

	/**
	 * Validates the sourceConstraint constraint of '<em>Ippermissionlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIppermissionlink_sourceConstraint(Ippermissionlink ippermissionlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Ec2Package.eINSTANCE.getIppermissionlink(),
				 ippermissionlink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "sourceConstraint",
				 IPPERMISSIONLINK__SOURCE_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the targetConstraint constraint of '<em>Ippermissionlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String IPPERMISSIONLINK__TARGET_CONSTRAINT__EEXPRESSION = "self.target.oclIsKindOf(ec2::Ippermission)";

	/**
	 * Validates the targetConstraint constraint of '<em>Ippermissionlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIppermissionlink_targetConstraint(Ippermissionlink ippermissionlink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Ec2Package.eINSTANCE.getIppermissionlink(),
				 ippermissionlink,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "targetConstraint",
				 IPPERMISSIONLINK__TARGET_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAwscredential(Awscredential awscredential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(awscredential, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(awscredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(awscredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(awscredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(awscredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(awscredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(awscredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(awscredential, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(awscredential, diagnostics, context);
		if (result || diagnostics != null) result &= validateAwscredential_appliesConstraint(awscredential, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Awscredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String AWSCREDENTIAL__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Awsaccount)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Awscredential</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAwscredential_appliesConstraint(Awscredential awscredential, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(awscredential, context) },
						 new Object[] { awscredential },
						 context));
			}
			return false;
		}
		return accountsValidator.validateCloudcredential_appliesConstraint(awscredential, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT2_nano(T2_nano t2_nano, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(t2_nano, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(t2_nano, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(t2_nano, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(t2_nano, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(t2_nano, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(t2_nano, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(t2_nano, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(t2_nano, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(t2_nano, diagnostics, context);
		if (result || diagnostics != null) result &= validateT2_nano_appliesConstraint(t2_nano, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>T2 nano</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String T2_NANO__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>T2 nano</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT2_nano_appliesConstraint(T2_nano t2_nano, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(t2_nano, context) },
						 new Object[] { t2_nano },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(t2_nano, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT2_micro(T2_micro t2_micro, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(t2_micro, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(t2_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(t2_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(t2_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(t2_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(t2_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(t2_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(t2_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(t2_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validateT2_micro_appliesConstraint(t2_micro, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>T2 micro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String T2_MICRO__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>T2 micro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT2_micro_appliesConstraint(T2_micro t2_micro, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(t2_micro, context) },
						 new Object[] { t2_micro },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(t2_micro, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT2_small(T2_small t2_small, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(t2_small, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(t2_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(t2_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(t2_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(t2_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(t2_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(t2_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(t2_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(t2_small, diagnostics, context);
		if (result || diagnostics != null) result &= validateT2_small_appliesConstraint(t2_small, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>T2 small</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String T2_SMALL__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>T2 small</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT2_small_appliesConstraint(T2_small t2_small, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(t2_small, context) },
						 new Object[] { t2_small },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(t2_small, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT2_medium(T2_medium t2_medium, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(t2_medium, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(t2_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(t2_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(t2_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(t2_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(t2_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(t2_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(t2_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(t2_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validateT2_medium_appliesConstraint(t2_medium, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>T2 medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String T2_MEDIUM__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>T2 medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT2_medium_appliesConstraint(T2_medium t2_medium, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(t2_medium, context) },
						 new Object[] { t2_medium },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(t2_medium, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT2_large(T2_large t2_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(t2_large, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(t2_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(t2_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(t2_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(t2_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(t2_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(t2_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(t2_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(t2_large, diagnostics, context);
		if (result || diagnostics != null) result &= validateT2_large_appliesConstraint(t2_large, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>T2 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String T2_LARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>T2 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT2_large_appliesConstraint(T2_large t2_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(t2_large, context) },
						 new Object[] { t2_large },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(t2_large, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT2_xlarge(T2_xlarge t2_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(t2_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(t2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(t2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(t2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(t2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(t2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(t2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(t2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(t2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateT2_xlarge_appliesConstraint(t2_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>T2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String T2_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>T2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT2_xlarge_appliesConstraint(T2_xlarge t2_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(t2_xlarge, context) },
						 new Object[] { t2_xlarge },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(t2_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT2_2xlarge(T2_2xlarge t2_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(t2_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(t2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(t2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(t2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(t2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(t2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(t2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(t2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(t2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateT2_2xlarge_appliesConstraint(t2_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>T2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String T2_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>T2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT2_2xlarge_appliesConstraint(T2_2xlarge t2_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(t2_2xlarge, context) },
						 new Object[] { t2_2xlarge },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(t2_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM5_large(M5_large m5_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m5_large, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validateM5_large_appliesConstraint(m5_large, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M5 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M5_LARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M5 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM5_large_appliesConstraint(M5_large m5_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m5_large, context) },
						 new Object[] { m5_large },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m5_large, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM5_xlarge(M5_xlarge m5_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m5_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateM5_xlarge_appliesConstraint(m5_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M5 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M5_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M5 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM5_xlarge_appliesConstraint(M5_xlarge m5_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m5_xlarge, context) },
						 new Object[] { m5_xlarge },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m5_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM5_2xlarge(M5_2xlarge m5_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m5_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateM5_2xlarge_appliesConstraint(m5_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M5 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M5_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M5 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM5_2xlarge_appliesConstraint(M5_2xlarge m5_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m5_2xlarge, context) },
						 new Object[] { m5_2xlarge },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m5_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM5_4xlarge(M5_4xlarge m5_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m5_4xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateM5_4xlarge_appliesConstraint(m5_4xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M5 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M5_4XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M5 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM5_4xlarge_appliesConstraint(M5_4xlarge m5_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m5_4xlarge, context) },
						 new Object[] { m5_4xlarge },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m5_4xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM5_12xlarge(M5_12xlarge m5_12xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m5_12xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m5_12xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m5_12xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m5_12xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m5_12xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m5_12xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m5_12xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m5_12xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m5_12xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateM5_12xlarge_appliesConstraint(m5_12xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M5 12xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M5_12XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M5 12xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM5_12xlarge_appliesConstraint(M5_12xlarge m5_12xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m5_12xlarge, context) },
						 new Object[] { m5_12xlarge },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m5_12xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM5_24xlarge(M5_24xlarge m5_24xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m5_24xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m5_24xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m5_24xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m5_24xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m5_24xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m5_24xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m5_24xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m5_24xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m5_24xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateM5_24xlarge_appliesConstraint(m5_24xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M5 24xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M5_24XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M5 24xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM5_24xlarge_appliesConstraint(M5_24xlarge m5_24xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m5_24xlarge, context) },
						 new Object[] { m5_24xlarge },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m5_24xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM4_large(M4_large m4_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m4_large, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validateM4_large_appliesConstraint(m4_large, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M4 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M4_LARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M4 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM4_large_appliesConstraint(M4_large m4_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m4_large, context) },
						 new Object[] { m4_large },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m4_large, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM4_xlarge(M4_xlarge m4_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m4_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateM4_xlarge_appliesConstraint(m4_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M4 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M4_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M4 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM4_xlarge_appliesConstraint(M4_xlarge m4_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m4_xlarge, context) },
						 new Object[] { m4_xlarge },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m4_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM4_2xlarge(M4_2xlarge m4_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m4_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateM4_2xlarge_appliesConstraint(m4_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M4 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M4_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M4 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM4_2xlarge_appliesConstraint(M4_2xlarge m4_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m4_2xlarge, context) },
						 new Object[] { m4_2xlarge },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m4_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM4_10xlarge(M4_10xlarge m4_10xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m4_10xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m4_10xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m4_10xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m4_10xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m4_10xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m4_10xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m4_10xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m4_10xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m4_10xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateM4_10xlarge_appliesConstraint(m4_10xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M4 10xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M4_10XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M4 10xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM4_10xlarge_appliesConstraint(M4_10xlarge m4_10xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m4_10xlarge, context) },
						 new Object[] { m4_10xlarge },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m4_10xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM4_16xlarge(M4_16xlarge m4_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m4_16xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateM4_16xlarge_appliesConstraint(m4_16xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M4 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M4_16XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M4 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM4_16xlarge_appliesConstraint(M4_16xlarge m4_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m4_16xlarge, context) },
						 new Object[] { m4_16xlarge },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m4_16xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM3_medium(M3_medium m3_medium, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m3_medium, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m3_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m3_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m3_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m3_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m3_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m3_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m3_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m3_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validateM3_medium_appliesConstraint(m3_medium, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M3 medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M3_MEDIUM__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M3 medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM3_medium_appliesConstraint(M3_medium m3_medium, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m3_medium, context) },
						 new Object[] { m3_medium },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m3_medium, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM3_large(M3_large m3_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m3_large, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validateM3_large_appliesConstraint(m3_large, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M3 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M3_LARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M3 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM3_large_appliesConstraint(M3_large m3_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m3_large, context) },
						 new Object[] { m3_large },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m3_large, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM3_xlarge(M3_xlarge m3_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m3_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateM3_xlarge_appliesConstraint(m3_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M3_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM3_xlarge_appliesConstraint(M3_xlarge m3_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m3_xlarge, context) },
						 new Object[] { m3_xlarge },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m3_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM3_2xlarge(M3_2xlarge m3_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m3_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateM3_2xlarge_appliesConstraint(m3_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M3_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM3_2xlarge_appliesConstraint(M3_2xlarge m3_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m3_2xlarge, context) },
						 new Object[] { m3_2xlarge },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m3_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC5_large(C5_large c5_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c5_large, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c5_large, diagnostics, context);
		if (result || diagnostics != null) result &= validateC5_large_appliesConstraint(c5_large, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C5 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C5_LARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C5 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC5_large_appliesConstraint(C5_large c5_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c5_large, context) },
						 new Object[] { c5_large },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c5_large, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC5_xlarge(C5_xlarge c5_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c5_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c5_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateC5_xlarge_appliesConstraint(c5_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C5 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C5_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C5 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC5_xlarge_appliesConstraint(C5_xlarge c5_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c5_xlarge, context) },
						 new Object[] { c5_xlarge },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c5_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC5_2xlarge(C5_2xlarge c5_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c5_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c5_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateC5_2xlarge_appliesConstraint(c5_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C5 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C5_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C5 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC5_2xlarge_appliesConstraint(C5_2xlarge c5_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c5_2xlarge, context) },
						 new Object[] { c5_2xlarge },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c5_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC5_4xlarge(C5_4xlarge c5_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c5_4xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c5_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateC5_4xlarge_appliesConstraint(c5_4xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C5 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C5_4XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C5 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC5_4xlarge_appliesConstraint(C5_4xlarge c5_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c5_4xlarge, context) },
						 new Object[] { c5_4xlarge },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c5_4xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC5_9xlarge(C5_9xlarge c5_9xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c5_9xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c5_9xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c5_9xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c5_9xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c5_9xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c5_9xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c5_9xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c5_9xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c5_9xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateC5_9xlarge_appliesConstraint(c5_9xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C5 9xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C5_9XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C5 9xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC5_9xlarge_appliesConstraint(C5_9xlarge c5_9xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c5_9xlarge, context) },
						 new Object[] { c5_9xlarge },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c5_9xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC5_18xlarge(C5_18xlarge c5_18xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c5_18xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c5_18xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c5_18xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c5_18xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c5_18xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c5_18xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c5_18xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c5_18xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c5_18xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateC5_18xlarge_appliesConstraint(c5_18xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C5 18xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C5_18XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C5 18xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC5_18xlarge_appliesConstraint(C5_18xlarge c5_18xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c5_18xlarge, context) },
						 new Object[] { c5_18xlarge },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c5_18xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC4_large(C4_large c4_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c4_large, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validateC4_large_appliesConstraint(c4_large, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C4 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C4_LARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C4 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC4_large_appliesConstraint(C4_large c4_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c4_large, context) },
						 new Object[] { c4_large },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c4_large, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC4_xlarge(C4_xlarge c4_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c4_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateC4_xlarge_appliesConstraint(c4_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C4 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C4_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C4 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC4_xlarge_appliesConstraint(C4_xlarge c4_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c4_xlarge, context) },
						 new Object[] { c4_xlarge },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c4_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC4_2xlarge(C4_2xlarge c4_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c4_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateC4_2xlarge_appliesConstraint(c4_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C4 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C4_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C4 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC4_2xlarge_appliesConstraint(C4_2xlarge c4_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c4_2xlarge, context) },
						 new Object[] { c4_2xlarge },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c4_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC4_4xlarge(C4_4xlarge c4_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c4_4xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateC4_4xlarge_appliesConstraint(c4_4xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C4 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C4_4XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C4 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC4_4xlarge_appliesConstraint(C4_4xlarge c4_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c4_4xlarge, context) },
						 new Object[] { c4_4xlarge },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c4_4xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC4_8xlarge(C4_8xlarge c4_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c4_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateC4_8xlarge_appliesConstraint(c4_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C4 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C4_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C4 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC4_8xlarge_appliesConstraint(C4_8xlarge c4_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c4_8xlarge, context) },
						 new Object[] { c4_8xlarge },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c4_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC3_large(C3_large c3_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c3_large, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validateC3_large_appliesConstraint(c3_large, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C3 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C3_LARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C3 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC3_large_appliesConstraint(C3_large c3_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c3_large, context) },
						 new Object[] { c3_large },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c3_large, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC3_xlarge(C3_xlarge c3_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c3_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateC3_xlarge_appliesConstraint(c3_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C3_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC3_xlarge_appliesConstraint(C3_xlarge c3_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c3_xlarge, context) },
						 new Object[] { c3_xlarge },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c3_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC3_2xlarge(C3_2xlarge c3_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c3_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateC3_2xlarge_appliesConstraint(c3_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C3_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC3_2xlarge_appliesConstraint(C3_2xlarge c3_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c3_2xlarge, context) },
						 new Object[] { c3_2xlarge },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c3_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC3_4xlarge(C3_4xlarge c3_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c3_4xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateC3_4xlarge_appliesConstraint(c3_4xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C3_4XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC3_4xlarge_appliesConstraint(C3_4xlarge c3_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c3_4xlarge, context) },
						 new Object[] { c3_4xlarge },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c3_4xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC3_8xlarge(C3_8xlarge c3_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c3_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateC3_8xlarge_appliesConstraint(c3_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C3_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC3_8xlarge_appliesConstraint(C3_8xlarge c3_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c3_8xlarge, context) },
						 new Object[] { c3_8xlarge },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c3_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1e_xlarge(X1e_xlarge x1e_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(x1e_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(x1e_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(x1e_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(x1e_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(x1e_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(x1e_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(x1e_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(x1e_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(x1e_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateX1e_xlarge_appliesConstraint(x1e_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>X1e xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String X1E_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>X1e xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1e_xlarge_appliesConstraint(X1e_xlarge x1e_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(x1e_xlarge, context) },
						 new Object[] { x1e_xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(x1e_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1e_2xlarge(X1e_2xlarge x1e_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(x1e_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(x1e_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(x1e_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(x1e_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(x1e_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(x1e_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(x1e_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(x1e_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(x1e_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateX1e_2xlarge_appliesConstraint(x1e_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>X1e 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String X1E_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>X1e 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1e_2xlarge_appliesConstraint(X1e_2xlarge x1e_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(x1e_2xlarge, context) },
						 new Object[] { x1e_2xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(x1e_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1e_4xlarge(X1e_4xlarge x1e_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(x1e_4xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(x1e_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(x1e_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(x1e_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(x1e_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(x1e_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(x1e_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(x1e_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(x1e_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateX1e_4xlarge_appliesConstraint(x1e_4xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>X1e 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String X1E_4XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>X1e 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1e_4xlarge_appliesConstraint(X1e_4xlarge x1e_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(x1e_4xlarge, context) },
						 new Object[] { x1e_4xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(x1e_4xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1e_8xlarge(X1e_8xlarge x1e_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(x1e_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(x1e_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(x1e_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(x1e_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(x1e_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(x1e_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(x1e_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(x1e_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(x1e_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateX1e_8xlarge_appliesConstraint(x1e_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>X1e 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String X1E_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>X1e 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1e_8xlarge_appliesConstraint(X1e_8xlarge x1e_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(x1e_8xlarge, context) },
						 new Object[] { x1e_8xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(x1e_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1e_16xlarge(X1e_16xlarge x1e_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(x1e_16xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(x1e_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(x1e_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(x1e_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(x1e_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(x1e_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(x1e_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(x1e_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(x1e_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateX1e_16xlarge_appliesConstraint(x1e_16xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>X1e 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String X1E_16XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>X1e 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1e_16xlarge_appliesConstraint(X1e_16xlarge x1e_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(x1e_16xlarge, context) },
						 new Object[] { x1e_16xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(x1e_16xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1e_32xlarge(X1e_32xlarge x1e_32xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(x1e_32xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(x1e_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(x1e_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(x1e_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(x1e_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(x1e_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(x1e_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(x1e_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(x1e_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateX1e_32xlarge_appliesConstraint(x1e_32xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>X1e 32xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String X1E_32XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>X1e 32xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1e_32xlarge_appliesConstraint(X1e_32xlarge x1e_32xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(x1e_32xlarge, context) },
						 new Object[] { x1e_32xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(x1e_32xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1_16xlarge(X1_16xlarge x1_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(x1_16xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(x1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(x1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(x1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(x1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(x1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(x1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(x1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(x1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateX1_16xlarge_appliesConstraint(x1_16xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>X1 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String X1_16XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>X1 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1_16xlarge_appliesConstraint(X1_16xlarge x1_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(x1_16xlarge, context) },
						 new Object[] { x1_16xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(x1_16xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1_32xlarge(X1_32xlarge x1_32xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(x1_32xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(x1_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(x1_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(x1_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(x1_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(x1_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(x1_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(x1_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(x1_32xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateX1_32xlarge_appliesConstraint(x1_32xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>X1 32xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String X1_32XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>X1 32xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateX1_32xlarge_appliesConstraint(X1_32xlarge x1_32xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(x1_32xlarge, context) },
						 new Object[] { x1_32xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(x1_32xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR4_large(R4_large r4_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(r4_large, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(r4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(r4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(r4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(r4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(r4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(r4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(r4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(r4_large, diagnostics, context);
		if (result || diagnostics != null) result &= validateR4_large_appliesConstraint(r4_large, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>R4 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String R4_LARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>R4 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR4_large_appliesConstraint(R4_large r4_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(r4_large, context) },
						 new Object[] { r4_large },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(r4_large, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR4_xlarge(R4_xlarge r4_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(r4_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(r4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(r4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(r4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(r4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(r4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(r4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(r4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(r4_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateR4_xlarge_appliesConstraint(r4_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>R4 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String R4_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>R4 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR4_xlarge_appliesConstraint(R4_xlarge r4_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(r4_xlarge, context) },
						 new Object[] { r4_xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(r4_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR4_2xlarge(R4_2xlarge r4_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(r4_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(r4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(r4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(r4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(r4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(r4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(r4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(r4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(r4_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateR4_2xlarge_appliesConstraint(r4_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>R4 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String R4_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>R4 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR4_2xlarge_appliesConstraint(R4_2xlarge r4_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(r4_2xlarge, context) },
						 new Object[] { r4_2xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(r4_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR4_4xlarge(R4_4xlarge r4_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(r4_4xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(r4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(r4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(r4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(r4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(r4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(r4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(r4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(r4_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateR4_4xlarge_appliesConstraint(r4_4xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>R4 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String R4_4XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>R4 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR4_4xlarge_appliesConstraint(R4_4xlarge r4_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(r4_4xlarge, context) },
						 new Object[] { r4_4xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(r4_4xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR4_8xlarge(R4_8xlarge r4_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(r4_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(r4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(r4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(r4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(r4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(r4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(r4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(r4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(r4_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateR4_8xlarge_appliesConstraint(r4_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>R4 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String R4_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>R4 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR4_8xlarge_appliesConstraint(R4_8xlarge r4_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(r4_8xlarge, context) },
						 new Object[] { r4_8xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(r4_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR4_16xlarge(R4_16xlarge r4_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(r4_16xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(r4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(r4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(r4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(r4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(r4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(r4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(r4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(r4_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateR4_16xlarge_appliesConstraint(r4_16xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>R4 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String R4_16XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>R4 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR4_16xlarge_appliesConstraint(R4_16xlarge r4_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(r4_16xlarge, context) },
						 new Object[] { r4_16xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(r4_16xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR3_large(R3_large r3_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(r3_large, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(r3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(r3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(r3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(r3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(r3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(r3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(r3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(r3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validateR3_large_appliesConstraint(r3_large, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>R3 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String R3_LARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>R3 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR3_large_appliesConstraint(R3_large r3_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(r3_large, context) },
						 new Object[] { r3_large },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(r3_large, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR3_xlarge(R3_xlarge r3_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(r3_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(r3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(r3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(r3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(r3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(r3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(r3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(r3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(r3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateR3_xlarge_appliesConstraint(r3_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>R3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String R3_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>R3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR3_xlarge_appliesConstraint(R3_xlarge r3_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(r3_xlarge, context) },
						 new Object[] { r3_xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(r3_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR3_2xlarge(R3_2xlarge r3_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(r3_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(r3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(r3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(r3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(r3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(r3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(r3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(r3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(r3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateR3_2xlarge_appliesConstraint(r3_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>R3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String R3_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>R3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR3_2xlarge_appliesConstraint(R3_2xlarge r3_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(r3_2xlarge, context) },
						 new Object[] { r3_2xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(r3_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR3_4xlarge(R3_4xlarge r3_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(r3_4xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(r3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(r3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(r3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(r3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(r3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(r3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(r3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(r3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateR3_4xlarge_appliesConstraint(r3_4xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>R3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String R3_4XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>R3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR3_4xlarge_appliesConstraint(R3_4xlarge r3_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(r3_4xlarge, context) },
						 new Object[] { r3_4xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(r3_4xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR3_8xlarge(R3_8xlarge r3_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(r3_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(r3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(r3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(r3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(r3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(r3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(r3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(r3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(r3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateR3_8xlarge_appliesConstraint(r3_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>R3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String R3_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>R3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateR3_8xlarge_appliesConstraint(R3_8xlarge r3_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(r3_8xlarge, context) },
						 new Object[] { r3_8xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(r3_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP3_2xlarge(P3_2xlarge p3_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(p3_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(p3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(p3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(p3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(p3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(p3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(p3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(p3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(p3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateP3_2xlarge_appliesConstraint(p3_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>P3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String P3_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>P3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP3_2xlarge_appliesConstraint(P3_2xlarge p3_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(p3_2xlarge, context) },
						 new Object[] { p3_2xlarge },
						 context));
			}
			return false;
		}
		return validateAcceleratedcomputing_appliesConstraint(p3_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP3_8xlarge(P3_8xlarge p3_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(p3_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(p3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(p3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(p3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(p3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(p3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(p3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(p3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(p3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateP3_8xlarge_appliesConstraint(p3_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>P3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String P3_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>P3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP3_8xlarge_appliesConstraint(P3_8xlarge p3_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(p3_8xlarge, context) },
						 new Object[] { p3_8xlarge },
						 context));
			}
			return false;
		}
		return validateAcceleratedcomputing_appliesConstraint(p3_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP3_16xlarge(P3_16xlarge p3_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(p3_16xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(p3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(p3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(p3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(p3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(p3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(p3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(p3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(p3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateP3_16xlarge_appliesConstraint(p3_16xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>P3 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String P3_16XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>P3 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP3_16xlarge_appliesConstraint(P3_16xlarge p3_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(p3_16xlarge, context) },
						 new Object[] { p3_16xlarge },
						 context));
			}
			return false;
		}
		return validateAcceleratedcomputing_appliesConstraint(p3_16xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP2_xlarge(P2_xlarge p2_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(p2_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(p2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(p2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(p2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(p2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(p2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(p2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(p2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(p2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateP2_xlarge_appliesConstraint(p2_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>P2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String P2_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>P2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP2_xlarge_appliesConstraint(P2_xlarge p2_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(p2_xlarge, context) },
						 new Object[] { p2_xlarge },
						 context));
			}
			return false;
		}
		return validateAcceleratedcomputing_appliesConstraint(p2_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP2_8xlarge(P2_8xlarge p2_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(p2_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(p2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(p2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(p2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(p2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(p2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(p2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(p2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(p2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateP2_8xlarge_appliesConstraint(p2_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>P2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String P2_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>P2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP2_8xlarge_appliesConstraint(P2_8xlarge p2_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(p2_8xlarge, context) },
						 new Object[] { p2_8xlarge },
						 context));
			}
			return false;
		}
		return validateAcceleratedcomputing_appliesConstraint(p2_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP2_16xlarge(P2_16xlarge p2_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(p2_16xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(p2_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(p2_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(p2_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(p2_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(p2_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(p2_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(p2_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(p2_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateP2_16xlarge_appliesConstraint(p2_16xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>P2 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String P2_16XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>P2 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateP2_16xlarge_appliesConstraint(P2_16xlarge p2_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(p2_16xlarge, context) },
						 new Object[] { p2_16xlarge },
						 context));
			}
			return false;
		}
		return validateAcceleratedcomputing_appliesConstraint(p2_16xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralpurpose(Generalpurpose generalpurpose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(generalpurpose, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(generalpurpose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(generalpurpose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(generalpurpose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(generalpurpose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(generalpurpose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(generalpurpose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(generalpurpose, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(generalpurpose, diagnostics, context);
		if (result || diagnostics != null) result &= validateGeneralpurpose_appliesConstraint(generalpurpose, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Generalpurpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String GENERALPURPOSE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Generalpurpose</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGeneralpurpose_appliesConstraint(Generalpurpose generalpurpose, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(generalpurpose, context) },
						 new Object[] { generalpurpose },
						 context));
			}
			return false;
		}
		return infrastructureValidator.validateResource_tpl_appliesConstraint(generalpurpose, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputeoptimized(Computeoptimized computeoptimized, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(computeoptimized, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(computeoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(computeoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(computeoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(computeoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(computeoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(computeoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(computeoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(computeoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validateComputeoptimized_appliesConstraint(computeoptimized, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Computeoptimized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String COMPUTEOPTIMIZED__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Computeoptimized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComputeoptimized_appliesConstraint(Computeoptimized computeoptimized, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(computeoptimized, context) },
						 new Object[] { computeoptimized },
						 context));
			}
			return false;
		}
		return infrastructureValidator.validateResource_tpl_appliesConstraint(computeoptimized, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryoptimized(Memoryoptimized memoryoptimized, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(memoryoptimized, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(memoryoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(memoryoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(memoryoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(memoryoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(memoryoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(memoryoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(memoryoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(memoryoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validateMemoryoptimized_appliesConstraint(memoryoptimized, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Memoryoptimized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String MEMORYOPTIMIZED__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Memoryoptimized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMemoryoptimized_appliesConstraint(Memoryoptimized memoryoptimized, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(memoryoptimized, context) },
						 new Object[] { memoryoptimized },
						 context));
			}
			return false;
		}
		return infrastructureValidator.validateResource_tpl_appliesConstraint(memoryoptimized, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceleratedcomputing(Acceleratedcomputing acceleratedcomputing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(acceleratedcomputing, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(acceleratedcomputing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(acceleratedcomputing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(acceleratedcomputing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(acceleratedcomputing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(acceleratedcomputing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(acceleratedcomputing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(acceleratedcomputing, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(acceleratedcomputing, diagnostics, context);
		if (result || diagnostics != null) result &= validateAcceleratedcomputing_appliesConstraint(acceleratedcomputing, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Acceleratedcomputing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACCELERATEDCOMPUTING__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Acceleratedcomputing</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcceleratedcomputing_appliesConstraint(Acceleratedcomputing acceleratedcomputing, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(acceleratedcomputing, context) },
						 new Object[] { acceleratedcomputing },
						 context));
			}
			return false;
		}
		return infrastructureValidator.validateResource_tpl_appliesConstraint(acceleratedcomputing, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageoptimized(Storageoptimized storageoptimized, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(storageoptimized, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(storageoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(storageoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(storageoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(storageoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(storageoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(storageoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(storageoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(storageoptimized, diagnostics, context);
		if (result || diagnostics != null) result &= validateStorageoptimized_appliesConstraint(storageoptimized, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Storageoptimized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STORAGEOPTIMIZED__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Storageoptimized</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStorageoptimized_appliesConstraint(Storageoptimized storageoptimized, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(storageoptimized, context) },
						 new Object[] { storageoptimized },
						 context));
			}
			return false;
		}
		return infrastructureValidator.validateResource_tpl_appliesConstraint(storageoptimized, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateG3_4xlarge(G3_4xlarge g3_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(g3_4xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(g3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(g3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(g3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(g3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(g3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(g3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(g3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(g3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateG3_4xlarge_appliesConstraint(g3_4xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>G3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String G3_4XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>G3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateG3_4xlarge_appliesConstraint(G3_4xlarge g3_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(g3_4xlarge, context) },
						 new Object[] { g3_4xlarge },
						 context));
			}
			return false;
		}
		return validateAcceleratedcomputing_appliesConstraint(g3_4xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateG3_8xlarge(G3_8xlarge g3_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(g3_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(g3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(g3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(g3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(g3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(g3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(g3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(g3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(g3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateG3_8xlarge_appliesConstraint(g3_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>G3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String G3_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>G3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateG3_8xlarge_appliesConstraint(G3_8xlarge g3_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(g3_8xlarge, context) },
						 new Object[] { g3_8xlarge },
						 context));
			}
			return false;
		}
		return validateAcceleratedcomputing_appliesConstraint(g3_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateG3_16xlarge(G3_16xlarge g3_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(g3_16xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(g3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(g3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(g3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(g3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(g3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(g3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(g3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(g3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateG3_16xlarge_appliesConstraint(g3_16xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>G3 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String G3_16XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>G3 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateG3_16xlarge_appliesConstraint(G3_16xlarge g3_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(g3_16xlarge, context) },
						 new Object[] { g3_16xlarge },
						 context));
			}
			return false;
		}
		return validateAcceleratedcomputing_appliesConstraint(g3_16xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateF1_2xlarge(F1_2xlarge f1_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(f1_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(f1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(f1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(f1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(f1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(f1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(f1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(f1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(f1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateF1_2xlarge_appliesConstraint(f1_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>F1 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String F1_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>F1 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateF1_2xlarge_appliesConstraint(F1_2xlarge f1_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(f1_2xlarge, context) },
						 new Object[] { f1_2xlarge },
						 context));
			}
			return false;
		}
		return validateAcceleratedcomputing_appliesConstraint(f1_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateF1_16xlarge(F1_16xlarge f1_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(f1_16xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(f1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(f1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(f1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(f1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(f1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(f1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(f1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(f1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateF1_16xlarge_appliesConstraint(f1_16xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>F1 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String F1_16XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>F1 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateF1_16xlarge_appliesConstraint(F1_16xlarge f1_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(f1_16xlarge, context) },
						 new Object[] { f1_16xlarge },
						 context));
			}
			return false;
		}
		return validateAcceleratedcomputing_appliesConstraint(f1_16xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateH1_2xlarge(H1_2xlarge h1_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(h1_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(h1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(h1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(h1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(h1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(h1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(h1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(h1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(h1_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateH1_2xlarge_appliesConstraint(h1_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>H1 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String H1_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>H1 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateH1_2xlarge_appliesConstraint(H1_2xlarge h1_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(h1_2xlarge, context) },
						 new Object[] { h1_2xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(h1_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateH1_4xlarge(H1_4xlarge h1_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(h1_4xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(h1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(h1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(h1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(h1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(h1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(h1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(h1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(h1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateH1_4xlarge_appliesConstraint(h1_4xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>H1 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String H1_4XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>H1 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateH1_4xlarge_appliesConstraint(H1_4xlarge h1_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(h1_4xlarge, context) },
						 new Object[] { h1_4xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(h1_4xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateH1_8xlarge(H1_8xlarge h1_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(h1_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(h1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(h1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(h1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(h1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(h1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(h1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(h1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(h1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateH1_8xlarge_appliesConstraint(h1_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>H1 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String H1_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>H1 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateH1_8xlarge_appliesConstraint(H1_8xlarge h1_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(h1_8xlarge, context) },
						 new Object[] { h1_8xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(h1_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateH1_16xlarge(H1_16xlarge h1_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(h1_16xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(h1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(h1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(h1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(h1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(h1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(h1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(h1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(h1_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateH1_16xlarge_appliesConstraint(h1_16xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>H1 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String H1_16XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>H1 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateH1_16xlarge_appliesConstraint(H1_16xlarge h1_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(h1_16xlarge, context) },
						 new Object[] { h1_16xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(h1_16xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI3_large(I3_large i3_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(i3_large, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(i3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(i3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(i3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(i3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(i3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(i3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(i3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(i3_large, diagnostics, context);
		if (result || diagnostics != null) result &= validateI3_large_appliesConstraint(i3_large, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>I3 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String I3_LARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>I3 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI3_large_appliesConstraint(I3_large i3_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(i3_large, context) },
						 new Object[] { i3_large },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(i3_large, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI3_xlarge(I3_xlarge i3_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(i3_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(i3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(i3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(i3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(i3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(i3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(i3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(i3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(i3_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateI3_xlarge_appliesConstraint(i3_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>I3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String I3_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>I3 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI3_xlarge_appliesConstraint(I3_xlarge i3_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(i3_xlarge, context) },
						 new Object[] { i3_xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(i3_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI3_2xlarge(I3_2xlarge i3_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(i3_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(i3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(i3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(i3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(i3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(i3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(i3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(i3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(i3_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateI3_2xlarge_appliesConstraint(i3_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>I3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String I3_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>I3 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI3_2xlarge_appliesConstraint(I3_2xlarge i3_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(i3_2xlarge, context) },
						 new Object[] { i3_2xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(i3_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI3_4xlarge(I3_4xlarge i3_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(i3_4xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(i3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(i3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(i3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(i3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(i3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(i3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(i3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(i3_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateI3_4xlarge_appliesConstraint(i3_4xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>I3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String I3_4XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>I3 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI3_4xlarge_appliesConstraint(I3_4xlarge i3_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(i3_4xlarge, context) },
						 new Object[] { i3_4xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(i3_4xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI3_8xlarge(I3_8xlarge i3_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(i3_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(i3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(i3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(i3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(i3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(i3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(i3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(i3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(i3_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateI3_8xlarge_appliesConstraint(i3_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>I3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String I3_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>I3 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI3_8xlarge_appliesConstraint(I3_8xlarge i3_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(i3_8xlarge, context) },
						 new Object[] { i3_8xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(i3_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI3_16xlarge(I3_16xlarge i3_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(i3_16xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(i3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(i3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(i3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(i3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(i3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(i3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(i3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(i3_16xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateI3_16xlarge_appliesConstraint(i3_16xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>I3 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String I3_16XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>I3 16xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI3_16xlarge_appliesConstraint(I3_16xlarge i3_16xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(i3_16xlarge, context) },
						 new Object[] { i3_16xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(i3_16xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI3_metal(I3_metal i3_metal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(i3_metal, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(i3_metal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(i3_metal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(i3_metal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(i3_metal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(i3_metal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(i3_metal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(i3_metal, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(i3_metal, diagnostics, context);
		if (result || diagnostics != null) result &= validateI3_metal_appliesConstraint(i3_metal, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>I3 metal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String I3_METAL__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>I3 metal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI3_metal_appliesConstraint(I3_metal i3_metal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(i3_metal, context) },
						 new Object[] { i3_metal },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(i3_metal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateD2_xlarge(D2_xlarge d2_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(d2_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(d2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(d2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(d2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(d2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(d2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(d2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(d2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(d2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateD2_xlarge_appliesConstraint(d2_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>D2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String D2_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>D2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateD2_xlarge_appliesConstraint(D2_xlarge d2_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(d2_xlarge, context) },
						 new Object[] { d2_xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(d2_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateD2_2xlarge(D2_2xlarge d2_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(d2_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(d2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(d2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(d2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(d2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(d2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(d2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(d2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(d2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateD2_2xlarge_appliesConstraint(d2_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>D2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String D2_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>D2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateD2_2xlarge_appliesConstraint(D2_2xlarge d2_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(d2_2xlarge, context) },
						 new Object[] { d2_2xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(d2_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateD2_4xlarge(D2_4xlarge d2_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(d2_4xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(d2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(d2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(d2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(d2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(d2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(d2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(d2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(d2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateD2_4xlarge_appliesConstraint(d2_4xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>D2 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String D2_4XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>D2 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateD2_4xlarge_appliesConstraint(D2_4xlarge d2_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(d2_4xlarge, context) },
						 new Object[] { d2_4xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(d2_4xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateD2_8xlarge(D2_8xlarge d2_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(d2_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(d2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(d2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(d2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(d2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(d2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(d2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(d2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(d2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateD2_8xlarge_appliesConstraint(d2_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>D2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String D2_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>D2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateD2_8xlarge_appliesConstraint(D2_8xlarge d2_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(d2_8xlarge, context) },
						 new Object[] { d2_8xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(d2_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM1_small(M1_small m1_small, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m1_small, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m1_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m1_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m1_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m1_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m1_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m1_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m1_small, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m1_small, diagnostics, context);
		if (result || diagnostics != null) result &= validateM1_small_appliesConstraint(m1_small, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M1 small</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M1_SMALL__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M1 small</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM1_small_appliesConstraint(M1_small m1_small, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m1_small, context) },
						 new Object[] { m1_small },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m1_small, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT1_micro(T1_micro t1_micro, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(t1_micro, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(t1_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(t1_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(t1_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(t1_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(t1_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(t1_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(t1_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(t1_micro, diagnostics, context);
		if (result || diagnostics != null) result &= validateT1_micro_appliesConstraint(t1_micro, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>T1 micro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String T1_MICRO__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>T1 micro</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateT1_micro_appliesConstraint(T1_micro t1_micro, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(t1_micro, context) },
						 new Object[] { t1_micro },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(t1_micro, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM1_medium(M1_medium m1_medium, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m1_medium, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validateM1_medium_appliesConstraint(m1_medium, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M1 medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M1_MEDIUM__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M1 medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM1_medium_appliesConstraint(M1_medium m1_medium, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m1_medium, context) },
						 new Object[] { m1_medium },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m1_medium, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM1_large(M1_large m1_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m1_large, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m1_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m1_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m1_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m1_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m1_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m1_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m1_large, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m1_large, diagnostics, context);
		if (result || diagnostics != null) result &= validateM1_large_appliesConstraint(m1_large, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M1 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M1_LARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M1 large</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM1_large_appliesConstraint(M1_large m1_large, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m1_large, context) },
						 new Object[] { m1_large },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m1_large, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM1_xlarge(M1_xlarge m1_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m1_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateM1_xlarge_appliesConstraint(m1_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M1 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M1_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M1 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM1_xlarge_appliesConstraint(M1_xlarge m1_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m1_xlarge, context) },
						 new Object[] { m1_xlarge },
						 context));
			}
			return false;
		}
		return validateGeneralpurpose_appliesConstraint(m1_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC1_medium(C1_medium c1_medium, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c1_medium, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c1_medium, diagnostics, context);
		if (result || diagnostics != null) result &= validateC1_medium_appliesConstraint(c1_medium, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C1 medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C1_MEDIUM__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C1 medium</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC1_medium_appliesConstraint(C1_medium c1_medium, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c1_medium, context) },
						 new Object[] { c1_medium },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c1_medium, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC1_xlarge(C1_xlarge c1_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(c1_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(c1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(c1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(c1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(c1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(c1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(c1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(c1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(c1_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateC1_xlarge_appliesConstraint(c1_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>C1 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String C1_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>C1 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateC1_xlarge_appliesConstraint(C1_xlarge c1_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(c1_xlarge, context) },
						 new Object[] { c1_xlarge },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(c1_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCc2_8xlarge(Cc2_8xlarge cc2_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cc2_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cc2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cc2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cc2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cc2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cc2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cc2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cc2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cc2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateCc2_8xlarge_appliesConstraint(cc2_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Cc2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CC2_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Cc2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCc2_8xlarge_appliesConstraint(Cc2_8xlarge cc2_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(cc2_8xlarge, context) },
						 new Object[] { cc2_8xlarge },
						 context));
			}
			return false;
		}
		return validateComputeoptimized_appliesConstraint(cc2_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateG2_2xlarge(G2_2xlarge g2_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(g2_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(g2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(g2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(g2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(g2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(g2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(g2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(g2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(g2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateG2_2xlarge_appliesConstraint(g2_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>G2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String G2_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>G2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateG2_2xlarge_appliesConstraint(G2_2xlarge g2_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(g2_2xlarge, context) },
						 new Object[] { g2_2xlarge },
						 context));
			}
			return false;
		}
		return validateAcceleratedcomputing_appliesConstraint(g2_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateG2_8xlarge(G2_8xlarge g2_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(g2_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(g2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(g2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(g2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(g2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(g2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(g2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(g2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(g2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateG2_8xlarge_appliesConstraint(g2_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>G2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String G2_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>G2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateG2_8xlarge_appliesConstraint(G2_8xlarge g2_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(g2_8xlarge, context) },
						 new Object[] { g2_8xlarge },
						 context));
			}
			return false;
		}
		return validateAcceleratedcomputing_appliesConstraint(g2_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCg1_4xlarge(Cg1_4xlarge cg1_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cg1_4xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cg1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cg1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cg1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cg1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cg1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cg1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cg1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cg1_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateCg1_4xlarge_appliesConstraint(cg1_4xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Cg1 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CG1_4XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Cg1 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCg1_4xlarge_appliesConstraint(Cg1_4xlarge cg1_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(cg1_4xlarge, context) },
						 new Object[] { cg1_4xlarge },
						 context));
			}
			return false;
		}
		return validateAcceleratedcomputing_appliesConstraint(cg1_4xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM2_xlarge(M2_xlarge m2_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m2_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateM2_xlarge_appliesConstraint(m2_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M2_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM2_xlarge_appliesConstraint(M2_xlarge m2_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m2_xlarge, context) },
						 new Object[] { m2_xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(m2_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM2_2xlarge(M2_2xlarge m2_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m2_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateM2_2xlarge_appliesConstraint(m2_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M2_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM2_2xlarge_appliesConstraint(M2_2xlarge m2_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m2_2xlarge, context) },
						 new Object[] { m2_2xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(m2_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM2_4xlarge(M2_4xlarge m2_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(m2_4xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(m2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(m2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(m2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(m2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(m2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(m2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(m2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(m2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateM2_4xlarge_appliesConstraint(m2_4xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>M2 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String M2_4XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>M2 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateM2_4xlarge_appliesConstraint(M2_4xlarge m2_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(m2_4xlarge, context) },
						 new Object[] { m2_4xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(m2_4xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCr1_8xlarge(Cr1_8xlarge cr1_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(cr1_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(cr1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(cr1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(cr1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(cr1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(cr1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(cr1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(cr1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(cr1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateCr1_8xlarge_appliesConstraint(cr1_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Cr1 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String CR1_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Cr1 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCr1_8xlarge_appliesConstraint(Cr1_8xlarge cr1_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(cr1_8xlarge, context) },
						 new Object[] { cr1_8xlarge },
						 context));
			}
			return false;
		}
		return validateMemoryoptimized_appliesConstraint(cr1_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI2_xlarge(I2_xlarge i2_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(i2_xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(i2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(i2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(i2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(i2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(i2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(i2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(i2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(i2_xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateI2_xlarge_appliesConstraint(i2_xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>I2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String I2_XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>I2 xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI2_xlarge_appliesConstraint(I2_xlarge i2_xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(i2_xlarge, context) },
						 new Object[] { i2_xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(i2_xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI2_2xlarge(I2_2xlarge i2_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(i2_2xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(i2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(i2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(i2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(i2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(i2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(i2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(i2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(i2_2xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateI2_2xlarge_appliesConstraint(i2_2xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>I2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String I2_2XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>I2 2xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI2_2xlarge_appliesConstraint(I2_2xlarge i2_2xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(i2_2xlarge, context) },
						 new Object[] { i2_2xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(i2_2xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI2_4xlarge(I2_4xlarge i2_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(i2_4xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(i2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(i2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(i2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(i2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(i2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(i2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(i2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(i2_4xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateI2_4xlarge_appliesConstraint(i2_4xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>I2 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String I2_4XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>I2 4xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI2_4xlarge_appliesConstraint(I2_4xlarge i2_4xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(i2_4xlarge, context) },
						 new Object[] { i2_4xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(i2_4xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI2_8xlarge(I2_8xlarge i2_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(i2_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(i2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(i2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(i2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(i2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(i2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(i2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(i2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(i2_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateI2_8xlarge_appliesConstraint(i2_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>I2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String I2_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>I2 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateI2_8xlarge_appliesConstraint(I2_8xlarge i2_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(i2_8xlarge, context) },
						 new Object[] { i2_8xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(i2_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHs1_8xlarge(Hs1_8xlarge hs1_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(hs1_8xlarge, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(hs1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(hs1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(hs1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(hs1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(hs1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(hs1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(hs1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(hs1_8xlarge, diagnostics, context);
		if (result || diagnostics != null) result &= validateHs1_8xlarge_appliesConstraint(hs1_8xlarge, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Hs1 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String HS1_8XLARGE__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Hs1 8xlarge</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHs1_8xlarge_appliesConstraint(Hs1_8xlarge hs1_8xlarge, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO override the constraint, if desired
		// -> uncomment the scaffolding
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "appliesConstraint", getObjectLabel(hs1_8xlarge, context) },
						 new Object[] { hs1_8xlarge },
						 context));
			}
			return false;
		}
		return validateStorageoptimized_appliesConstraint(hs1_8xlarge, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacementgroup(Placementgroup placementgroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(placementgroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(placementgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(placementgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(placementgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(placementgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(placementgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(placementgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(placementgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(placementgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlacementgroup_appliesConstraint(placementgroup, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Placementgroup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PLACEMENTGROUP__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Placementgroup</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlacementgroup_appliesConstraint(Placementgroup placementgroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Ec2Package.eINSTANCE.getPlacementgroup(),
				 placementgroup,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 PLACEMENTGROUP__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRootdevicevolume(Rootdevicevolume rootdevicevolume, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(rootdevicevolume, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(rootdevicevolume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(rootdevicevolume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(rootdevicevolume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(rootdevicevolume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(rootdevicevolume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(rootdevicevolume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(rootdevicevolume, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(rootdevicevolume, diagnostics, context);
		if (result || diagnostics != null) result &= validateRootdevicevolume_appliesConstraint(rootdevicevolume, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Rootdevicevolume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ROOTDEVICEVOLUME__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Rootdevicevolume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRootdevicevolume_appliesConstraint(Rootdevicevolume rootdevicevolume, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Ec2Package.eINSTANCE.getRootdevicevolume(),
				 rootdevicevolume,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 ROOTDEVICEVOLUME__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatustransitionreason(Statustransitionreason statustransitionreason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(statustransitionreason, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(statustransitionreason, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(statustransitionreason, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(statustransitionreason, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(statustransitionreason, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(statustransitionreason, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(statustransitionreason, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(statustransitionreason, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(statustransitionreason, diagnostics, context);
		if (result || diagnostics != null) result &= validateStatustransitionreason_appliesConstraint(statustransitionreason, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Statustransitionreason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String STATUSTRANSITIONREASON__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Statustransitionreason</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStatustransitionreason_appliesConstraint(Statustransitionreason statustransitionreason, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Ec2Package.eINSTANCE.getStatustransitionreason(),
				 statustransitionreason,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 STATUSTRANSITIONREASON__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTags(Tags tags, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(tags, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(tags, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(tags, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(tags, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(tags, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(tags, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(tags, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(tags, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(tags, diagnostics, context);
		if (result || diagnostics != null) result &= validateTags_appliesConstraint(tags, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Tags</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TAGS__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Tags</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTags_appliesConstraint(Tags tags, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Ec2Package.eINSTANCE.getTags(),
				 tags,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 TAGS__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstancevpcinfo(Instancevpcinfo instancevpcinfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instancevpcinfo, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instancevpcinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instancevpcinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instancevpcinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instancevpcinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instancevpcinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instancevpcinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instancevpcinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instancevpcinfo, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstancevpcinfo_appliesConstraint(instancevpcinfo, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the appliesConstraint constraint of '<em>Instancevpcinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String INSTANCEVPCINFO__APPLIES_CONSTRAINT__EEXPRESSION = "self.entity.oclIsKindOf(ec2::Instanceec2)";

	/**
	 * Validates the appliesConstraint constraint of '<em>Instancevpcinfo</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstancevpcinfo_appliesConstraint(Instancevpcinfo instancevpcinfo, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(Ec2Package.eINSTANCE.getInstancevpcinfo(),
				 instancevpcinfo,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "appliesConstraint",
				 INSTANCEVPCINFO__APPLIES_CONSTRAINT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAWSInstanceState(AWSInstanceState awsInstanceState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHypervisorType(HypervisorType hypervisorType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstanceLifeCycleType(InstanceLifeCycleType instanceLifeCycleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMonitoringState(MonitoringState monitoringState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVirtualizationType(VirtualizationType virtualizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpPermissionType(IpPermissionType ipPermissionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIpProtocol(IpProtocol ipProtocol, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Ec2Validator
