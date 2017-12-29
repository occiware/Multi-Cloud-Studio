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
package org.eclipse.cmf.occi.multicloud.aws.ec2.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Tables;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instancevpcinfo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.InstancevpcinfoImpl#getVpcId <em>Vpc Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.InstancevpcinfoImpl#getSubnetId <em>Subnet Id</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.InstancevpcinfoImpl#isSourceDestCheck <em>Source Dest Check</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstancevpcinfoImpl extends MixinBaseImpl implements Instancevpcinfo {
	/**
	 * The default value of the '{@link #getVpcId() <em>Vpc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcId()
	 * @generated
	 * @ordered
	 */
	protected static final String VPC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVpcId() <em>Vpc Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVpcId()
	 * @generated
	 * @ordered
	 */
	protected String vpcId = VPC_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnetId() <em>Subnet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetId()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnetId() <em>Subnet Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnetId()
	 * @generated
	 * @ordered
	 */
	protected String subnetId = SUBNET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #isSourceDestCheck() <em>Source Dest Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceDestCheck()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SOURCE_DEST_CHECK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSourceDestCheck() <em>Source Dest Check</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSourceDestCheck()
	 * @generated
	 * @ordered
	 */
	protected boolean sourceDestCheck = SOURCE_DEST_CHECK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstancevpcinfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.eINSTANCE.getInstancevpcinfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVpcId() {
		return vpcId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVpcId(String newVpcId) {
		String oldVpcId = vpcId;
		vpcId = newVpcId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEVPCINFO__VPC_ID, oldVpcId, vpcId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnetId() {
		return subnetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnetId(String newSubnetId) {
		String oldSubnetId = subnetId;
		subnetId = newSubnetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEVPCINFO__SUBNET_ID, oldSubnetId, subnetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSourceDestCheck() {
		return sourceDestCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceDestCheck(boolean newSourceDestCheck) {
		boolean oldSourceDestCheck = sourceDestCheck;
		sourceDestCheck = newSourceDestCheck;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.INSTANCEVPCINFO__SOURCE_DEST_CHECK, oldSourceDestCheck, sourceDestCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let
		 *     severity : Integer[1] = 'Instancevpcinfo::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[1] = self.entity.oclIsKindOf(Instanceec2)
		 *       in
		 *         'Instancevpcinfo::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, Ec2Tables.STR_Instancevpcinfo_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, Ec2Tables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_ec2_c_c_Instanceec2_0 = idResolver.getClass(Ec2Tables.CLSSid_Instanceec2, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_ec2_c_c_Instanceec2_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, Ec2Tables.STR_Instancevpcinfo_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, Ec2Tables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ec2Package.INSTANCEVPCINFO__VPC_ID:
				return getVpcId();
			case Ec2Package.INSTANCEVPCINFO__SUBNET_ID:
				return getSubnetId();
			case Ec2Package.INSTANCEVPCINFO__SOURCE_DEST_CHECK:
				return isSourceDestCheck();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Ec2Package.INSTANCEVPCINFO__VPC_ID:
				setVpcId((String)newValue);
				return;
			case Ec2Package.INSTANCEVPCINFO__SUBNET_ID:
				setSubnetId((String)newValue);
				return;
			case Ec2Package.INSTANCEVPCINFO__SOURCE_DEST_CHECK:
				setSourceDestCheck((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Ec2Package.INSTANCEVPCINFO__VPC_ID:
				setVpcId(VPC_ID_EDEFAULT);
				return;
			case Ec2Package.INSTANCEVPCINFO__SUBNET_ID:
				setSubnetId(SUBNET_ID_EDEFAULT);
				return;
			case Ec2Package.INSTANCEVPCINFO__SOURCE_DEST_CHECK:
				setSourceDestCheck(SOURCE_DEST_CHECK_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Ec2Package.INSTANCEVPCINFO__VPC_ID:
				return VPC_ID_EDEFAULT == null ? vpcId != null : !VPC_ID_EDEFAULT.equals(vpcId);
			case Ec2Package.INSTANCEVPCINFO__SUBNET_ID:
				return SUBNET_ID_EDEFAULT == null ? subnetId != null : !SUBNET_ID_EDEFAULT.equals(subnetId);
			case Ec2Package.INSTANCEVPCINFO__SOURCE_DEST_CHECK:
				return sourceDestCheck != SOURCE_DEST_CHECK_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Ec2Package.INSTANCEVPCINFO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (vpcId: ");
		result.append(vpcId);
		result.append(", subnetId: ");
		result.append(subnetId);
		result.append(", sourceDestCheck: ");
		result.append(sourceDestCheck);
		result.append(')');
		return result.toString();
	}

} //InstancevpcinfoImpl
