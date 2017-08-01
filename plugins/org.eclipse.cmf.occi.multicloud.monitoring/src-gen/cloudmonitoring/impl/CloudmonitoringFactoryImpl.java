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

import cloudmonitoring.*;

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
public class CloudmonitoringFactoryImpl extends EFactoryImpl implements CloudmonitoringFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CloudmonitoringFactory init() {
		try {
			CloudmonitoringFactory theCloudmonitoringFactory = (CloudmonitoringFactory)EPackage.Registry.INSTANCE.getEFactory(CloudmonitoringPackage.eNS_URI);
			if (theCloudmonitoringFactory != null) {
				return theCloudmonitoringFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CloudmonitoringFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudmonitoringFactoryImpl() {
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
			case CloudmonitoringPackage.SSHCOLLECTOR: return createSshcollector();
			case CloudmonitoringPackage.ZABBIXCOLLECTOR: return createZabbixcollector();
			case CloudmonitoringPackage.CPU: return createCpu();
			case CloudmonitoringPackage.DISKIO: return createDiskio();
			case CloudmonitoringPackage.RAM: return createRam();
			case CloudmonitoringPackage.NETWORKIO: return createNetworkio();
			case CloudmonitoringPackage.INPUTOUTPUT: return createInputoutput();
			case CloudmonitoringPackage.SENSORCONTROL: return createSensorcontrol();
			case CloudmonitoringPackage.EMFPUBLISHER: return createEmfpublisher();
			case CloudmonitoringPackage.SYSTEMOUTPUBLISHER: return createSystemoutpublisher();
			case CloudmonitoringPackage.PUBLISHERCONTROL: return createPublishercontrol();
			case CloudmonitoringPackage.DISK: return createDisk();
			case CloudmonitoringPackage.MAILPUBLISHER: return createMailpublisher();
			case CloudmonitoringPackage.MAINMETRIC: return createMainmetric();
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
			case CloudmonitoringPackage.IO_UNIT:
				return createIOUnitFromString(eDataType, initialValue);
			case CloudmonitoringPackage.MONITOR_STATE:
				return createMonitorStateFromString(eDataType, initialValue);
			case CloudmonitoringPackage.PERCENT:
				return createPercentFromString(eDataType, initialValue);
			case CloudmonitoringPackage.AVERAGE:
				return createAverageFromString(eDataType, initialValue);
			case CloudmonitoringPackage.PER_SEC:
				return createPerSecFromString(eDataType, initialValue);
			case CloudmonitoringPackage.TEMPERATURE:
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
			case CloudmonitoringPackage.IO_UNIT:
				return convertIOUnitToString(eDataType, instanceValue);
			case CloudmonitoringPackage.MONITOR_STATE:
				return convertMonitorStateToString(eDataType, instanceValue);
			case CloudmonitoringPackage.PERCENT:
				return convertPercentToString(eDataType, instanceValue);
			case CloudmonitoringPackage.AVERAGE:
				return convertAverageToString(eDataType, instanceValue);
			case CloudmonitoringPackage.PER_SEC:
				return convertPerSecToString(eDataType, instanceValue);
			case CloudmonitoringPackage.TEMPERATURE:
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
	public Sshcollector createSshcollector() {
		SshcollectorImpl sshcollector = new SshcollectorImpl();
		return sshcollector;
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
	public Cpu createCpu() {
		CpuImpl cpu = new CpuImpl();
		return cpu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Diskio createDiskio() {
		DiskioImpl diskio = new DiskioImpl();
		return diskio;
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
	public Networkio createNetworkio() {
		NetworkioImpl networkio = new NetworkioImpl();
		return networkio;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inputoutput createInputoutput() {
		InputoutputImpl inputoutput = new InputoutputImpl();
		return inputoutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensorcontrol createSensorcontrol() {
		SensorcontrolImpl sensorcontrol = new SensorcontrolImpl();
		return sensorcontrol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Emfpublisher createEmfpublisher() {
		EmfpublisherImpl emfpublisher = new EmfpublisherImpl();
		return emfpublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Systemoutpublisher createSystemoutpublisher() {
		SystemoutpublisherImpl systemoutpublisher = new SystemoutpublisherImpl();
		return systemoutpublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Publishercontrol createPublishercontrol() {
		PublishercontrolImpl publishercontrol = new PublishercontrolImpl();
		return publishercontrol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disk createDisk() {
		DiskImpl disk = new DiskImpl();
		return disk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mailpublisher createMailpublisher() {
		MailpublisherImpl mailpublisher = new MailpublisherImpl();
		return mailpublisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mainmetric createMainmetric() {
		MainmetricImpl mainmetric = new MainmetricImpl();
		return mainmetric;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IOUnit createIOUnitFromString(EDataType eDataType, String initialValue) {
		IOUnit result = IOUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIOUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonitorState createMonitorStateFromString(EDataType eDataType, String initialValue) {
		MonitorState result = MonitorState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMonitorStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
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
	public CloudmonitoringPackage getCloudmonitoringPackage() {
		return (CloudmonitoringPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CloudmonitoringPackage getPackage() {
		return CloudmonitoringPackage.eINSTANCE;
	}

} //CloudmonitoringFactoryImpl
