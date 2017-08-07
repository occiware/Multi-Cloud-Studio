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
package cloudmonitoring.impl;

import cloudmonitoring.CloudmonitoringPackage;
import cloudmonitoring.CloudmonitoringTables;
import cloudmonitoring.Mailpublisher;
import cloudmonitoring.MonitorState;
import cloudmonitoring.Publishercontrol;

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.monitoring.Publisher;

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
 * An implementation of the model object '<em><b>Mailpublisher</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link cloudmonitoring.impl.MailpublisherImpl#getPublisherState <em>Publisher State</em>}</li>
 *   <li>{@link cloudmonitoring.impl.MailpublisherImpl#getMailAddress <em>Mail Address</em>}</li>
 *   <li>{@link cloudmonitoring.impl.MailpublisherImpl#isPostOnCpuAlert <em>Post On Cpu Alert</em>}</li>
 *   <li>{@link cloudmonitoring.impl.MailpublisherImpl#isPostOnRamAlert <em>Post On Ram Alert</em>}</li>
 *   <li>{@link cloudmonitoring.impl.MailpublisherImpl#isPostOnNetworkIOAlert <em>Post On Network IO Alert</em>}</li>
 *   <li>{@link cloudmonitoring.impl.MailpublisherImpl#isPostOnDiskIOAlert <em>Post On Disk IO Alert</em>}</li>
 *   <li>{@link cloudmonitoring.impl.MailpublisherImpl#getNbEmail <em>Nb Email</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MailpublisherImpl extends MixinBaseImpl implements Mailpublisher {
	/**
	 * The default value of the '{@link #getPublisherState() <em>Publisher State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherState()
	 * @generated
	 * @ordered
	 */
	protected static final MonitorState PUBLISHER_STATE_EDEFAULT = MonitorState.ON;

	/**
	 * The cached value of the '{@link #getPublisherState() <em>Publisher State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherState()
	 * @generated
	 * @ordered
	 */
	protected MonitorState publisherState = PUBLISHER_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMailAddress() <em>Mail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String MAIL_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMailAddress() <em>Mail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMailAddress()
	 * @generated
	 * @ordered
	 */
	protected String mailAddress = MAIL_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #isPostOnCpuAlert() <em>Post On Cpu Alert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostOnCpuAlert()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POST_ON_CPU_ALERT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPostOnCpuAlert() <em>Post On Cpu Alert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostOnCpuAlert()
	 * @generated
	 * @ordered
	 */
	protected boolean postOnCpuAlert = POST_ON_CPU_ALERT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPostOnRamAlert() <em>Post On Ram Alert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostOnRamAlert()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POST_ON_RAM_ALERT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPostOnRamAlert() <em>Post On Ram Alert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostOnRamAlert()
	 * @generated
	 * @ordered
	 */
	protected boolean postOnRamAlert = POST_ON_RAM_ALERT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPostOnNetworkIOAlert() <em>Post On Network IO Alert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostOnNetworkIOAlert()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POST_ON_NETWORK_IO_ALERT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPostOnNetworkIOAlert() <em>Post On Network IO Alert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostOnNetworkIOAlert()
	 * @generated
	 * @ordered
	 */
	protected boolean postOnNetworkIOAlert = POST_ON_NETWORK_IO_ALERT_EDEFAULT;

	/**
	 * The default value of the '{@link #isPostOnDiskIOAlert() <em>Post On Disk IO Alert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostOnDiskIOAlert()
	 * @generated
	 * @ordered
	 */
	protected static final boolean POST_ON_DISK_IO_ALERT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPostOnDiskIOAlert() <em>Post On Disk IO Alert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPostOnDiskIOAlert()
	 * @generated
	 * @ordered
	 */
	protected boolean postOnDiskIOAlert = POST_ON_DISK_IO_ALERT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbEmail() <em>Nb Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEmail()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NB_EMAIL_EDEFAULT = new Integer(2);

	/**
	 * The cached value of the '{@link #getNbEmail() <em>Nb Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbEmail()
	 * @generated
	 * @ordered
	 */
	protected Integer nbEmail = NB_EMAIL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MailpublisherImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CloudmonitoringPackage.Literals.MAILPUBLISHER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorState getPublisherState() {
		return publisherState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherState(MonitorState newPublisherState) {
		MonitorState oldPublisherState = publisherState;
		publisherState = newPublisherState == null ? PUBLISHER_STATE_EDEFAULT : newPublisherState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.MAILPUBLISHER__PUBLISHER_STATE, oldPublisherState, publisherState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMailAddress() {
		return mailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMailAddress(String newMailAddress) {
		String oldMailAddress = mailAddress;
		mailAddress = newMailAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.MAILPUBLISHER__MAIL_ADDRESS, oldMailAddress, mailAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPostOnCpuAlert() {
		return postOnCpuAlert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostOnCpuAlert(boolean newPostOnCpuAlert) {
		boolean oldPostOnCpuAlert = postOnCpuAlert;
		postOnCpuAlert = newPostOnCpuAlert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.MAILPUBLISHER__POST_ON_CPU_ALERT, oldPostOnCpuAlert, postOnCpuAlert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPostOnRamAlert() {
		return postOnRamAlert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostOnRamAlert(boolean newPostOnRamAlert) {
		boolean oldPostOnRamAlert = postOnRamAlert;
		postOnRamAlert = newPostOnRamAlert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.MAILPUBLISHER__POST_ON_RAM_ALERT, oldPostOnRamAlert, postOnRamAlert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPostOnNetworkIOAlert() {
		return postOnNetworkIOAlert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostOnNetworkIOAlert(boolean newPostOnNetworkIOAlert) {
		boolean oldPostOnNetworkIOAlert = postOnNetworkIOAlert;
		postOnNetworkIOAlert = newPostOnNetworkIOAlert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.MAILPUBLISHER__POST_ON_NETWORK_IO_ALERT, oldPostOnNetworkIOAlert, postOnNetworkIOAlert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPostOnDiskIOAlert() {
		return postOnDiskIOAlert;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostOnDiskIOAlert(boolean newPostOnDiskIOAlert) {
		boolean oldPostOnDiskIOAlert = postOnDiskIOAlert;
		postOnDiskIOAlert = newPostOnDiskIOAlert;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.MAILPUBLISHER__POST_ON_DISK_IO_ALERT, oldPostOnDiskIOAlert, postOnDiskIOAlert));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNbEmail() {
		return nbEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbEmail(Integer newNbEmail) {
		Integer oldNbEmail = nbEmail;
		nbEmail = newNbEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CloudmonitoringPackage.MAILPUBLISHER__NB_EMAIL, oldNbEmail, nbEmail));
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
		 *   let severity : Integer[1] = 'Mailpublisher::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let
		 *         result : occi::Boolean[?] = self.entity.oclIsKindOf(monitoring::Sensor) or
		 *         self.entity.oclIsKindOf(Cloudsensor)
		 *       in
		 *         'Mailpublisher::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, CloudmonitoringTables.STR_Mailpublisher_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, CloudmonitoringTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_monitoring_c_c_Sensor_0 = idResolver.getClass(CloudmonitoringTables.CLSSid_Sensor, null);
			final /*@NonInvalid*/ Entity entity_0 = this.getEntity();
			final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_0, TYP_monitoring_c_c_Sensor_0).booleanValue();
			/*@NonInvalid*/ boolean result;
			if (oclIsKindOf) {
				result = ValueUtil.TRUE_VALUE;
			}
			else {
				final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_cloudmonitoring_c_c_Cloudsensor_0 = idResolver.getClass(CloudmonitoringTables.CLSSid_Cloudsensor, null);
				final /*@NonInvalid*/ boolean oclIsKindOf_0 = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity_0, TYP_cloudmonitoring_c_c_Cloudsensor_0).booleanValue();
				result = oclIsKindOf_0;
			}
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, CloudmonitoringTables.STR_Mailpublisher_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, CloudmonitoringTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void enable() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/monitoring/ecore!Publishercontrol!enable()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void disable() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://occiware.org/occi/multicloud/monitoring/ecore!Publishercontrol!disable()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CloudmonitoringPackage.MAILPUBLISHER__PUBLISHER_STATE:
				return getPublisherState();
			case CloudmonitoringPackage.MAILPUBLISHER__MAIL_ADDRESS:
				return getMailAddress();
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_CPU_ALERT:
				return isPostOnCpuAlert();
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_RAM_ALERT:
				return isPostOnRamAlert();
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_NETWORK_IO_ALERT:
				return isPostOnNetworkIOAlert();
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_DISK_IO_ALERT:
				return isPostOnDiskIOAlert();
			case CloudmonitoringPackage.MAILPUBLISHER__NB_EMAIL:
				return getNbEmail();
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
			case CloudmonitoringPackage.MAILPUBLISHER__PUBLISHER_STATE:
				setPublisherState((MonitorState)newValue);
				return;
			case CloudmonitoringPackage.MAILPUBLISHER__MAIL_ADDRESS:
				setMailAddress((String)newValue);
				return;
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_CPU_ALERT:
				setPostOnCpuAlert((Boolean)newValue);
				return;
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_RAM_ALERT:
				setPostOnRamAlert((Boolean)newValue);
				return;
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_NETWORK_IO_ALERT:
				setPostOnNetworkIOAlert((Boolean)newValue);
				return;
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_DISK_IO_ALERT:
				setPostOnDiskIOAlert((Boolean)newValue);
				return;
			case CloudmonitoringPackage.MAILPUBLISHER__NB_EMAIL:
				setNbEmail((Integer)newValue);
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
			case CloudmonitoringPackage.MAILPUBLISHER__PUBLISHER_STATE:
				setPublisherState(PUBLISHER_STATE_EDEFAULT);
				return;
			case CloudmonitoringPackage.MAILPUBLISHER__MAIL_ADDRESS:
				setMailAddress(MAIL_ADDRESS_EDEFAULT);
				return;
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_CPU_ALERT:
				setPostOnCpuAlert(POST_ON_CPU_ALERT_EDEFAULT);
				return;
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_RAM_ALERT:
				setPostOnRamAlert(POST_ON_RAM_ALERT_EDEFAULT);
				return;
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_NETWORK_IO_ALERT:
				setPostOnNetworkIOAlert(POST_ON_NETWORK_IO_ALERT_EDEFAULT);
				return;
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_DISK_IO_ALERT:
				setPostOnDiskIOAlert(POST_ON_DISK_IO_ALERT_EDEFAULT);
				return;
			case CloudmonitoringPackage.MAILPUBLISHER__NB_EMAIL:
				setNbEmail(NB_EMAIL_EDEFAULT);
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
			case CloudmonitoringPackage.MAILPUBLISHER__PUBLISHER_STATE:
				return publisherState != PUBLISHER_STATE_EDEFAULT;
			case CloudmonitoringPackage.MAILPUBLISHER__MAIL_ADDRESS:
				return MAIL_ADDRESS_EDEFAULT == null ? mailAddress != null : !MAIL_ADDRESS_EDEFAULT.equals(mailAddress);
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_CPU_ALERT:
				return postOnCpuAlert != POST_ON_CPU_ALERT_EDEFAULT;
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_RAM_ALERT:
				return postOnRamAlert != POST_ON_RAM_ALERT_EDEFAULT;
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_NETWORK_IO_ALERT:
				return postOnNetworkIOAlert != POST_ON_NETWORK_IO_ALERT_EDEFAULT;
			case CloudmonitoringPackage.MAILPUBLISHER__POST_ON_DISK_IO_ALERT:
				return postOnDiskIOAlert != POST_ON_DISK_IO_ALERT_EDEFAULT;
			case CloudmonitoringPackage.MAILPUBLISHER__NB_EMAIL:
				return NB_EMAIL_EDEFAULT == null ? nbEmail != null : !NB_EMAIL_EDEFAULT.equals(nbEmail);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Publisher.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Publishercontrol.class) {
			switch (derivedFeatureID) {
				case CloudmonitoringPackage.MAILPUBLISHER__PUBLISHER_STATE: return CloudmonitoringPackage.PUBLISHERCONTROL__PUBLISHER_STATE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Publisher.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == Publishercontrol.class) {
			switch (baseFeatureID) {
				case CloudmonitoringPackage.PUBLISHERCONTROL__PUBLISHER_STATE: return CloudmonitoringPackage.MAILPUBLISHER__PUBLISHER_STATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Publisher.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == Publishercontrol.class) {
			switch (baseOperationID) {
				case CloudmonitoringPackage.PUBLISHERCONTROL___ENABLE: return CloudmonitoringPackage.MAILPUBLISHER___ENABLE;
				case CloudmonitoringPackage.PUBLISHERCONTROL___DISABLE: return CloudmonitoringPackage.MAILPUBLISHER___DISABLE;
				case CloudmonitoringPackage.PUBLISHERCONTROL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP: return CloudmonitoringPackage.MAILPUBLISHER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
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
			case CloudmonitoringPackage.MAILPUBLISHER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case CloudmonitoringPackage.MAILPUBLISHER___ENABLE:
				enable();
				return null;
			case CloudmonitoringPackage.MAILPUBLISHER___DISABLE:
				disable();
				return null;
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
		result.append(" (publisherState: ");
		result.append(publisherState);
		result.append(", mailAddress: ");
		result.append(mailAddress);
		result.append(", postOnCpuAlert: ");
		result.append(postOnCpuAlert);
		result.append(", postOnRamAlert: ");
		result.append(postOnRamAlert);
		result.append(", postOnNetworkIOAlert: ");
		result.append(postOnNetworkIOAlert);
		result.append(", postOnDiskIOAlert: ");
		result.append(postOnDiskIOAlert);
		result.append(", nbEmail: ");
		result.append(nbEmail);
		result.append(')');
		return result.toString();
	}

} //MailpublisherImpl
