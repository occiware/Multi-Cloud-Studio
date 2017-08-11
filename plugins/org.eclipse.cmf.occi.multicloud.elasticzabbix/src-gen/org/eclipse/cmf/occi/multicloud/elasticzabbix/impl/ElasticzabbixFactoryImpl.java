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
package org.eclipse.cmf.occi.multicloud.elasticzabbix.impl;

import org.eclipse.cmf.occi.multicloud.elasticzabbix.*;

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
public class ElasticzabbixFactoryImpl extends EFactoryImpl implements ElasticzabbixFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ElasticzabbixFactory init() {
		try {
			ElasticzabbixFactory theElasticzabbixFactory = (ElasticzabbixFactory)EPackage.Registry.INSTANCE.getEFactory(ElasticzabbixPackage.eNS_URI);
			if (theElasticzabbixFactory != null) {
				return theElasticzabbixFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ElasticzabbixFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElasticzabbixFactoryImpl() {
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
			case ElasticzabbixPackage.ZABBIXCOLLECTOR: return createZabbixcollector();
			case ElasticzabbixPackage.ZABBIXSENSOR: return createZabbixsensor();
			case ElasticzabbixPackage.ZABBIXAPICONNECT: return createZabbixapiconnect();
			case ElasticzabbixPackage.CPU: return createCpu();
			case ElasticzabbixPackage.SUPERVISORAPICONNECT: return createSupervisorapiconnect();
			case ElasticzabbixPackage.RAM: return createRam();
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
			case ElasticzabbixPackage.PERCENT:
				return createPercentFromString(eDataType, initialValue);
			case ElasticzabbixPackage.PER_SEC:
				return createPerSecFromString(eDataType, initialValue);
			case ElasticzabbixPackage.AVERAGE:
				return createAverageFromString(eDataType, initialValue);
			case ElasticzabbixPackage.TEMPERATURE:
				return createTemperatureFromString(eDataType, initialValue);
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
			case ElasticzabbixPackage.PERCENT:
				return convertPercentToString(eDataType, instanceValue);
			case ElasticzabbixPackage.PER_SEC:
				return convertPerSecToString(eDataType, instanceValue);
			case ElasticzabbixPackage.AVERAGE:
				return convertAverageToString(eDataType, instanceValue);
			case ElasticzabbixPackage.TEMPERATURE:
				return convertTemperatureToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zabbixcollector createZabbixcollector() {
		ZabbixcollectorImpl zabbixcollector = new ZabbixcollectorImpl();
		return zabbixcollector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zabbixsensor createZabbixsensor() {
		ZabbixsensorImpl zabbixsensor = new ZabbixsensorImpl();
		return zabbixsensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Zabbixapiconnect createZabbixapiconnect() {
		ZabbixapiconnectImpl zabbixapiconnect = new ZabbixapiconnectImpl();
		return zabbixapiconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cpu createCpu() {
		CpuImpl cpu = new CpuImpl();
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Supervisorapiconnect createSupervisorapiconnect() {
		SupervisorapiconnectImpl supervisorapiconnect = new SupervisorapiconnectImpl();
		return supervisorapiconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ram createRam() {
		RamImpl ram = new RamImpl();
		return ram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createPercentFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createPerSecFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerSecToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAverageFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAverageToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createTemperatureFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemperatureToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElasticzabbixPackage getElasticzabbixPackage() {
		return (ElasticzabbixPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ElasticzabbixPackage getPackage() {
		return ElasticzabbixPackage.eINSTANCE;
	}

} //ElasticzabbixFactoryImpl
