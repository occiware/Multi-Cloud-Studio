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
package org.eclipse.cmf.occi.multicloud.occimonitoring.impl;

import org.eclipse.cmf.occi.multicloud.occimonitoring.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OccimonitoringFactoryImpl extends EFactoryImpl implements OccimonitoringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OccimonitoringFactory init() {
		try {
			OccimonitoringFactory theOccimonitoringFactory = (OccimonitoringFactory)EPackage.Registry.INSTANCE.getEFactory(OccimonitoringPackage.eNS_URI);
			if (theOccimonitoringFactory != null) {
				return theOccimonitoringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OccimonitoringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccimonitoringFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OccimonitoringPackage.ZABBIXINSTANCE: return createZabbixinstance();
			case OccimonitoringPackage.HOSTGROUP: return createHostgroup();
			case OccimonitoringPackage.ZABBIXTEMPLATE: return createZabbixtemplate();
			case OccimonitoringPackage.HOSTGROULINK: return createHostgroulink();
			case OccimonitoringPackage.TEMPLATELINK: return createTemplatelink();
			case OccimonitoringPackage.METRICS: return createMetrics();
			case OccimonitoringPackage.CPUUSAGE: return createCpuusage();
			case OccimonitoringPackage.MEMORYUSAGE: return createMemoryusage();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OccimonitoringPackage.DOUBLE:
				return createDoubleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OccimonitoringPackage.DOUBLE:
				return convertDoubleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zabbixinstance createZabbixinstance() {
		ZabbixinstanceImpl zabbixinstance = new ZabbixinstanceImpl();
		return zabbixinstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostgroup createHostgroup() {
		HostgroupImpl hostgroup = new HostgroupImpl();
		return hostgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zabbixtemplate createZabbixtemplate() {
		ZabbixtemplateImpl zabbixtemplate = new ZabbixtemplateImpl();
		return zabbixtemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Hostgroulink createHostgroulink() {
		HostgroulinkImpl hostgroulink = new HostgroulinkImpl();
		return hostgroulink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Templatelink createTemplatelink() {
		TemplatelinkImpl templatelink = new TemplatelinkImpl();
		return templatelink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metrics createMetrics() {
		MetricsImpl metrics = new MetricsImpl();
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cpuusage createCpuusage() {
		CpuusageImpl cpuusage = new CpuusageImpl();
		return cpuusage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memoryusage createMemoryusage() {
		MemoryusageImpl memoryusage = new MemoryusageImpl();
		return memoryusage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccimonitoringPackage getOccimonitoringPackage() {
		return (OccimonitoringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OccimonitoringPackage getPackage() {
		return OccimonitoringPackage.eINSTANCE;
	}

} //OccimonitoringFactoryImpl
