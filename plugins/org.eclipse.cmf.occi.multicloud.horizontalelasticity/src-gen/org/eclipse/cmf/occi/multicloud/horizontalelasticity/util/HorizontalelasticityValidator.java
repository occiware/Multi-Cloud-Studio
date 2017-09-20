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
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.util;

import java.util.Map;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.cmf.occi.multicloud.horizontalelasticity.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage
 * @generated
 */
public class HorizontalelasticityValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final HorizontalelasticityValidator INSTANCE = new HorizontalelasticityValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.cmf.occi.multicloud.horizontalelasticity";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Instancegrouplink'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int INSTANCEGROUPLINK__TARGET_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Target Constraint' of 'Linkbalancer'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int LINKBALANCER__TARGET_CONSTRAINT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

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
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HorizontalelasticityValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return HorizontalelasticityPackage.eINSTANCE;
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
			case HorizontalelasticityPackage.HORIZONTALGROUP:
				return validateHorizontalgroup((Horizontalgroup)value, diagnostics, context);
			case HorizontalelasticityPackage.LOADBALANCER:
				return validateLoadbalancer((Loadbalancer)value, diagnostics, context);
			case HorizontalelasticityPackage.INSTANCE:
				return validateInstance((Instance)value, diagnostics, context);
			case HorizontalelasticityPackage.HORIZONTALELASTICCONTOLLER:
				return validateHorizontalelasticcontoller((Horizontalelasticcontoller)value, diagnostics, context);
			case HorizontalelasticityPackage.SCALINGSTRATEGY:
				return validateScalingstrategy((Scalingstrategy)value, diagnostics, context);
			case HorizontalelasticityPackage.MANUAL:
				return validateManual((Manual)value, diagnostics, context);
			case HorizontalelasticityPackage.DYNAMIC:
				return validateDynamic((Dynamic)value, diagnostics, context);
			case HorizontalelasticityPackage.INSTANCEGROUPLINK:
				return validateInstancegrouplink((Instancegrouplink)value, diagnostics, context);
			case HorizontalelasticityPackage.LINKBALANCER:
				return validateLinkbalancer((Linkbalancer)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalgroup(Horizontalgroup horizontalgroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(horizontalgroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(horizontalgroup, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(horizontalgroup, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLoadbalancer(Loadbalancer loadbalancer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(loadbalancer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(loadbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(loadbalancer, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstance(Instance instance, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instance, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(instance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(instance, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(instance, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHorizontalelasticcontoller(Horizontalelasticcontoller horizontalelasticcontoller, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(horizontalelasticcontoller, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(horizontalelasticcontoller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(horizontalelasticcontoller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(horizontalelasticcontoller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(horizontalelasticcontoller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(horizontalelasticcontoller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(horizontalelasticcontoller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(horizontalelasticcontoller, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(horizontalelasticcontoller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(horizontalelasticcontoller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(horizontalelasticcontoller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(horizontalelasticcontoller, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(horizontalelasticcontoller, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScalingstrategy(Scalingstrategy scalingstrategy, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(scalingstrategy, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(scalingstrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(scalingstrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(scalingstrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(scalingstrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(scalingstrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(scalingstrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(scalingstrategy, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(scalingstrategy, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(scalingstrategy, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(scalingstrategy, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(scalingstrategy, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(scalingstrategy, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManual(Manual manual, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manual, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manual, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manual, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(manual, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(manual, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(manual, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(manual, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDynamic(Dynamic dynamic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(dynamic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(dynamic, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(dynamic, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstancegrouplink(Instancegrouplink instancegrouplink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(instancegrouplink, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(instancegrouplink, diagnostics, context);
		if (result || diagnostics != null) result &= validateInstancegrouplink_targetConstraint(instancegrouplink, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Instancegrouplink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstancegrouplink_targetConstraint(Instancegrouplink instancegrouplink, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return instancegrouplink.targetConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkbalancer(Linkbalancer linkbalancer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(linkbalancer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_LinkKindIsInParent(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_sourceReferenceInvariant(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateLink_targetReferenceInvariant(linkbalancer, diagnostics, context);
		if (result || diagnostics != null) result &= validateLinkbalancer_targetConstraint(linkbalancer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the targetConstraint constraint of '<em>Linkbalancer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkbalancer_targetConstraint(Linkbalancer linkbalancer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return linkbalancer.targetConstraint(diagnostics, context);
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

} //HorizontalelasticityValidator
