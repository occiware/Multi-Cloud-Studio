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
package org.eclipse.cmf.occi.multicloud.interoperability.impl;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.cmf.occi.multicloud.interoperability.InteroperabilityPackage;
import org.eclipse.cmf.occi.multicloud.interoperability.Sshtransfer;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sshtransfer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.SshtransferImpl#getSrcusername <em>Srcusername</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.SshtransferImpl#getSrcpassword <em>Srcpassword</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.SshtransferImpl#getSrcprivateKeyPath <em>Srcprivate Key Path</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.SshtransferImpl#getTargetusername <em>Targetusername</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.SshtransferImpl#getTargetpassword <em>Targetpassword</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.SshtransferImpl#getTargetprivatekeypath <em>Targetprivatekeypath</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.interoperability.impl.SshtransferImpl#getSshport <em>Sshport</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SshtransferImpl extends MixinBaseImpl implements Sshtransfer {
	/**
	 * The default value of the '{@link #getSrcusername() <em>Srcusername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcusername()
	 * @generated
	 * @ordered
	 */
	protected static final String SRCUSERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcusername() <em>Srcusername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcusername()
	 * @generated
	 * @ordered
	 */
	protected String srcusername = SRCUSERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrcpassword() <em>Srcpassword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcpassword()
	 * @generated
	 * @ordered
	 */
	protected static final String SRCPASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcpassword() <em>Srcpassword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcpassword()
	 * @generated
	 * @ordered
	 */
	protected String srcpassword = SRCPASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrcprivateKeyPath() <em>Srcprivate Key Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcprivateKeyPath()
	 * @generated
	 * @ordered
	 */
	protected static final String SRCPRIVATE_KEY_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrcprivateKeyPath() <em>Srcprivate Key Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrcprivateKeyPath()
	 * @generated
	 * @ordered
	 */
	protected String srcprivateKeyPath = SRCPRIVATE_KEY_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetusername() <em>Targetusername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetusername()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGETUSERNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetusername() <em>Targetusername</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetusername()
	 * @generated
	 * @ordered
	 */
	protected String targetusername = TARGETUSERNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetpassword() <em>Targetpassword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetpassword()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGETPASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetpassword() <em>Targetpassword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetpassword()
	 * @generated
	 * @ordered
	 */
	protected String targetpassword = TARGETPASSWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetprivatekeypath() <em>Targetprivatekeypath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetprivatekeypath()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGETPRIVATEKEYPATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetprivatekeypath() <em>Targetprivatekeypath</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetprivatekeypath()
	 * @generated
	 * @ordered
	 */
	protected String targetprivatekeypath = TARGETPRIVATEKEYPATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getSshport() <em>Sshport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshport()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SSHPORT_EDEFAULT = new Integer(22);

	/**
	 * The cached value of the '{@link #getSshport() <em>Sshport</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSshport()
	 * @generated
	 * @ordered
	 */
	protected Integer sshport = SSHPORT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SshtransferImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InteroperabilityPackage.Literals.SSHTRANSFER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrcusername() {
		return srcusername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcusername(String newSrcusername) {
		String oldSrcusername = srcusername;
		srcusername = newSrcusername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.SSHTRANSFER__SRCUSERNAME, oldSrcusername, srcusername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrcpassword() {
		return srcpassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcpassword(String newSrcpassword) {
		String oldSrcpassword = srcpassword;
		srcpassword = newSrcpassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.SSHTRANSFER__SRCPASSWORD, oldSrcpassword, srcpassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrcprivateKeyPath() {
		return srcprivateKeyPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrcprivateKeyPath(String newSrcprivateKeyPath) {
		String oldSrcprivateKeyPath = srcprivateKeyPath;
		srcprivateKeyPath = newSrcprivateKeyPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.SSHTRANSFER__SRCPRIVATE_KEY_PATH, oldSrcprivateKeyPath, srcprivateKeyPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetusername() {
		return targetusername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetusername(String newTargetusername) {
		String oldTargetusername = targetusername;
		targetusername = newTargetusername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.SSHTRANSFER__TARGETUSERNAME, oldTargetusername, targetusername));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetpassword() {
		return targetpassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetpassword(String newTargetpassword) {
		String oldTargetpassword = targetpassword;
		targetpassword = newTargetpassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.SSHTRANSFER__TARGETPASSWORD, oldTargetpassword, targetpassword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetprivatekeypath() {
		return targetprivatekeypath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetprivatekeypath(String newTargetprivatekeypath) {
		String oldTargetprivatekeypath = targetprivatekeypath;
		targetprivatekeypath = newTargetprivatekeypath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.SSHTRANSFER__TARGETPRIVATEKEYPATH, oldTargetprivatekeypath, targetprivatekeypath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSshport() {
		return sshport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSshport(Integer newSshport) {
		Integer oldSshport = sshport;
		sshport = newSshport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InteroperabilityPackage.SSHTRANSFER__SSHPORT, oldSshport, sshport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InteroperabilityPackage.SSHTRANSFER__SRCUSERNAME:
				return getSrcusername();
			case InteroperabilityPackage.SSHTRANSFER__SRCPASSWORD:
				return getSrcpassword();
			case InteroperabilityPackage.SSHTRANSFER__SRCPRIVATE_KEY_PATH:
				return getSrcprivateKeyPath();
			case InteroperabilityPackage.SSHTRANSFER__TARGETUSERNAME:
				return getTargetusername();
			case InteroperabilityPackage.SSHTRANSFER__TARGETPASSWORD:
				return getTargetpassword();
			case InteroperabilityPackage.SSHTRANSFER__TARGETPRIVATEKEYPATH:
				return getTargetprivatekeypath();
			case InteroperabilityPackage.SSHTRANSFER__SSHPORT:
				return getSshport();
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
			case InteroperabilityPackage.SSHTRANSFER__SRCUSERNAME:
				setSrcusername((String)newValue);
				return;
			case InteroperabilityPackage.SSHTRANSFER__SRCPASSWORD:
				setSrcpassword((String)newValue);
				return;
			case InteroperabilityPackage.SSHTRANSFER__SRCPRIVATE_KEY_PATH:
				setSrcprivateKeyPath((String)newValue);
				return;
			case InteroperabilityPackage.SSHTRANSFER__TARGETUSERNAME:
				setTargetusername((String)newValue);
				return;
			case InteroperabilityPackage.SSHTRANSFER__TARGETPASSWORD:
				setTargetpassword((String)newValue);
				return;
			case InteroperabilityPackage.SSHTRANSFER__TARGETPRIVATEKEYPATH:
				setTargetprivatekeypath((String)newValue);
				return;
			case InteroperabilityPackage.SSHTRANSFER__SSHPORT:
				setSshport((Integer)newValue);
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
			case InteroperabilityPackage.SSHTRANSFER__SRCUSERNAME:
				setSrcusername(SRCUSERNAME_EDEFAULT);
				return;
			case InteroperabilityPackage.SSHTRANSFER__SRCPASSWORD:
				setSrcpassword(SRCPASSWORD_EDEFAULT);
				return;
			case InteroperabilityPackage.SSHTRANSFER__SRCPRIVATE_KEY_PATH:
				setSrcprivateKeyPath(SRCPRIVATE_KEY_PATH_EDEFAULT);
				return;
			case InteroperabilityPackage.SSHTRANSFER__TARGETUSERNAME:
				setTargetusername(TARGETUSERNAME_EDEFAULT);
				return;
			case InteroperabilityPackage.SSHTRANSFER__TARGETPASSWORD:
				setTargetpassword(TARGETPASSWORD_EDEFAULT);
				return;
			case InteroperabilityPackage.SSHTRANSFER__TARGETPRIVATEKEYPATH:
				setTargetprivatekeypath(TARGETPRIVATEKEYPATH_EDEFAULT);
				return;
			case InteroperabilityPackage.SSHTRANSFER__SSHPORT:
				setSshport(SSHPORT_EDEFAULT);
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
			case InteroperabilityPackage.SSHTRANSFER__SRCUSERNAME:
				return SRCUSERNAME_EDEFAULT == null ? srcusername != null : !SRCUSERNAME_EDEFAULT.equals(srcusername);
			case InteroperabilityPackage.SSHTRANSFER__SRCPASSWORD:
				return SRCPASSWORD_EDEFAULT == null ? srcpassword != null : !SRCPASSWORD_EDEFAULT.equals(srcpassword);
			case InteroperabilityPackage.SSHTRANSFER__SRCPRIVATE_KEY_PATH:
				return SRCPRIVATE_KEY_PATH_EDEFAULT == null ? srcprivateKeyPath != null : !SRCPRIVATE_KEY_PATH_EDEFAULT.equals(srcprivateKeyPath);
			case InteroperabilityPackage.SSHTRANSFER__TARGETUSERNAME:
				return TARGETUSERNAME_EDEFAULT == null ? targetusername != null : !TARGETUSERNAME_EDEFAULT.equals(targetusername);
			case InteroperabilityPackage.SSHTRANSFER__TARGETPASSWORD:
				return TARGETPASSWORD_EDEFAULT == null ? targetpassword != null : !TARGETPASSWORD_EDEFAULT.equals(targetpassword);
			case InteroperabilityPackage.SSHTRANSFER__TARGETPRIVATEKEYPATH:
				return TARGETPRIVATEKEYPATH_EDEFAULT == null ? targetprivatekeypath != null : !TARGETPRIVATEKEYPATH_EDEFAULT.equals(targetprivatekeypath);
			case InteroperabilityPackage.SSHTRANSFER__SSHPORT:
				return SSHPORT_EDEFAULT == null ? sshport != null : !SSHPORT_EDEFAULT.equals(sshport);
		}
		return super.eIsSet(featureID);
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
		result.append(" (srcusername: ");
		result.append(srcusername);
		result.append(", srcpassword: ");
		result.append(srcpassword);
		result.append(", srcprivateKeyPath: ");
		result.append(srcprivateKeyPath);
		result.append(", targetusername: ");
		result.append(targetusername);
		result.append(", targetpassword: ");
		result.append(targetpassword);
		result.append(", targetprivatekeypath: ");
		result.append(targetprivatekeypath);
		result.append(", sshport: ");
		result.append(sshport);
		result.append(')');
		return result.toString();
	}

} //SshtransferImpl
