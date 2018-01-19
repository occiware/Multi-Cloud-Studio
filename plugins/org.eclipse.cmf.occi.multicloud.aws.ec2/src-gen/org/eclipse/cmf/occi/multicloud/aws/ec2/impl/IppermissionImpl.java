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

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.cmf.occi.multicloud.aws.ec2.Ec2Package;
import org.eclipse.cmf.occi.multicloud.aws.ec2.IpPermissionType;
import org.eclipse.cmf.occi.multicloud.aws.ec2.IpProtocol;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ippermission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.IppermissionImpl#getToPort <em>To Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.IppermissionImpl#getFromPort <em>From Port</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.IppermissionImpl#getIpProtocol <em>Ip Protocol</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.IppermissionImpl#getIpv4Ranges <em>Ipv4 Ranges</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.IppermissionImpl#getIpv6Ranges <em>Ipv6 Ranges</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.IppermissionImpl#getTraffic <em>Traffic</em>}</li>
 *   <li>{@link org.eclipse.cmf.occi.multicloud.aws.ec2.impl.IppermissionImpl#isAuthorized <em>Authorized</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IppermissionImpl extends ResourceImpl implements Ippermission {
	/**
	 * The default value of the '{@link #getToPort() <em>To Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TO_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToPort() <em>To Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPort()
	 * @generated
	 * @ordered
	 */
	protected Integer toPort = TO_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromPort() <em>From Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPort()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FROM_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromPort() <em>From Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPort()
	 * @generated
	 * @ordered
	 */
	protected Integer fromPort = FROM_PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpProtocol() <em>Ip Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final IpProtocol IP_PROTOCOL_EDEFAULT = IpProtocol.TCP;

	/**
	 * The cached value of the '{@link #getIpProtocol() <em>Ip Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpProtocol()
	 * @generated
	 * @ordered
	 */
	protected IpProtocol ipProtocol = IP_PROTOCOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpv4Ranges() <em>Ipv4 Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpv4Ranges()
	 * @generated
	 * @ordered
	 */
	protected static final String IPV4_RANGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpv4Ranges() <em>Ipv4 Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpv4Ranges()
	 * @generated
	 * @ordered
	 */
	protected String ipv4Ranges = IPV4_RANGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getIpv6Ranges() <em>Ipv6 Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpv6Ranges()
	 * @generated
	 * @ordered
	 */
	protected static final String IPV6_RANGES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIpv6Ranges() <em>Ipv6 Ranges</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpv6Ranges()
	 * @generated
	 * @ordered
	 */
	protected String ipv6Ranges = IPV6_RANGES_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraffic() <em>Traffic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraffic()
	 * @generated
	 * @ordered
	 */
	protected static final IpPermissionType TRAFFIC_EDEFAULT = IpPermissionType.INBOUND;

	/**
	 * The cached value of the '{@link #getTraffic() <em>Traffic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraffic()
	 * @generated
	 * @ordered
	 */
	protected IpPermissionType traffic = TRAFFIC_EDEFAULT;

	/**
	 * The default value of the '{@link #isAuthorized() <em>Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthorized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AUTHORIZED_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAuthorized() <em>Authorized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAuthorized()
	 * @generated
	 * @ordered
	 */
	protected boolean authorized = AUTHORIZED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IppermissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ec2Package.eINSTANCE.getIppermission();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getToPort() {
		return toPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToPort(Integer newToPort) {
		Integer oldToPort = toPort;
		toPort = newToPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.IPPERMISSION__TO_PORT, oldToPort, toPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFromPort() {
		return fromPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromPort(Integer newFromPort) {
		Integer oldFromPort = fromPort;
		fromPort = newFromPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.IPPERMISSION__FROM_PORT, oldFromPort, fromPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpProtocol getIpProtocol() {
		return ipProtocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpProtocol(IpProtocol newIpProtocol) {
		IpProtocol oldIpProtocol = ipProtocol;
		ipProtocol = newIpProtocol == null ? IP_PROTOCOL_EDEFAULT : newIpProtocol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.IPPERMISSION__IP_PROTOCOL, oldIpProtocol, ipProtocol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpv4Ranges() {
		return ipv4Ranges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpv4Ranges(String newIpv4Ranges) {
		String oldIpv4Ranges = ipv4Ranges;
		ipv4Ranges = newIpv4Ranges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.IPPERMISSION__IPV4_RANGES, oldIpv4Ranges, ipv4Ranges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIpv6Ranges() {
		return ipv6Ranges;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpv6Ranges(String newIpv6Ranges) {
		String oldIpv6Ranges = ipv6Ranges;
		ipv6Ranges = newIpv6Ranges;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.IPPERMISSION__IPV6_RANGES, oldIpv6Ranges, ipv6Ranges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IpPermissionType getTraffic() {
		return traffic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraffic(IpPermissionType newTraffic) {
		IpPermissionType oldTraffic = traffic;
		traffic = newTraffic == null ? TRAFFIC_EDEFAULT : newTraffic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.IPPERMISSION__TRAFFIC, oldTraffic, traffic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAuthorized() {
		return authorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorized(boolean newAuthorized) {
		boolean oldAuthorized = authorized;
		authorized = newAuthorized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Ec2Package.IPPERMISSION__AUTHORIZED, oldAuthorized, authorized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Ec2Package.IPPERMISSION__TO_PORT:
				return getToPort();
			case Ec2Package.IPPERMISSION__FROM_PORT:
				return getFromPort();
			case Ec2Package.IPPERMISSION__IP_PROTOCOL:
				return getIpProtocol();
			case Ec2Package.IPPERMISSION__IPV4_RANGES:
				return getIpv4Ranges();
			case Ec2Package.IPPERMISSION__IPV6_RANGES:
				return getIpv6Ranges();
			case Ec2Package.IPPERMISSION__TRAFFIC:
				return getTraffic();
			case Ec2Package.IPPERMISSION__AUTHORIZED:
				return isAuthorized();
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
			case Ec2Package.IPPERMISSION__TO_PORT:
				setToPort((Integer)newValue);
				return;
			case Ec2Package.IPPERMISSION__FROM_PORT:
				setFromPort((Integer)newValue);
				return;
			case Ec2Package.IPPERMISSION__IP_PROTOCOL:
				setIpProtocol((IpProtocol)newValue);
				return;
			case Ec2Package.IPPERMISSION__IPV4_RANGES:
				setIpv4Ranges((String)newValue);
				return;
			case Ec2Package.IPPERMISSION__IPV6_RANGES:
				setIpv6Ranges((String)newValue);
				return;
			case Ec2Package.IPPERMISSION__TRAFFIC:
				setTraffic((IpPermissionType)newValue);
				return;
			case Ec2Package.IPPERMISSION__AUTHORIZED:
				setAuthorized((Boolean)newValue);
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
			case Ec2Package.IPPERMISSION__TO_PORT:
				setToPort(TO_PORT_EDEFAULT);
				return;
			case Ec2Package.IPPERMISSION__FROM_PORT:
				setFromPort(FROM_PORT_EDEFAULT);
				return;
			case Ec2Package.IPPERMISSION__IP_PROTOCOL:
				setIpProtocol(IP_PROTOCOL_EDEFAULT);
				return;
			case Ec2Package.IPPERMISSION__IPV4_RANGES:
				setIpv4Ranges(IPV4_RANGES_EDEFAULT);
				return;
			case Ec2Package.IPPERMISSION__IPV6_RANGES:
				setIpv6Ranges(IPV6_RANGES_EDEFAULT);
				return;
			case Ec2Package.IPPERMISSION__TRAFFIC:
				setTraffic(TRAFFIC_EDEFAULT);
				return;
			case Ec2Package.IPPERMISSION__AUTHORIZED:
				setAuthorized(AUTHORIZED_EDEFAULT);
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
			case Ec2Package.IPPERMISSION__TO_PORT:
				return TO_PORT_EDEFAULT == null ? toPort != null : !TO_PORT_EDEFAULT.equals(toPort);
			case Ec2Package.IPPERMISSION__FROM_PORT:
				return FROM_PORT_EDEFAULT == null ? fromPort != null : !FROM_PORT_EDEFAULT.equals(fromPort);
			case Ec2Package.IPPERMISSION__IP_PROTOCOL:
				return ipProtocol != IP_PROTOCOL_EDEFAULT;
			case Ec2Package.IPPERMISSION__IPV4_RANGES:
				return IPV4_RANGES_EDEFAULT == null ? ipv4Ranges != null : !IPV4_RANGES_EDEFAULT.equals(ipv4Ranges);
			case Ec2Package.IPPERMISSION__IPV6_RANGES:
				return IPV6_RANGES_EDEFAULT == null ? ipv6Ranges != null : !IPV6_RANGES_EDEFAULT.equals(ipv6Ranges);
			case Ec2Package.IPPERMISSION__TRAFFIC:
				return traffic != TRAFFIC_EDEFAULT;
			case Ec2Package.IPPERMISSION__AUTHORIZED:
				return authorized != AUTHORIZED_EDEFAULT;
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
		result.append(" (toPort: ");
		result.append(toPort);
		result.append(", fromPort: ");
		result.append(fromPort);
		result.append(", ipProtocol: ");
		result.append(ipProtocol);
		result.append(", ipv4Ranges: ");
		result.append(ipv4Ranges);
		result.append(", ipv6Ranges: ");
		result.append(ipv6Ranges);
		result.append(", traffic: ");
		result.append(traffic);
		result.append(", authorized: ");
		result.append(authorized);
		result.append(')');
		return result.toString();
	}

} //IppermissionImpl
