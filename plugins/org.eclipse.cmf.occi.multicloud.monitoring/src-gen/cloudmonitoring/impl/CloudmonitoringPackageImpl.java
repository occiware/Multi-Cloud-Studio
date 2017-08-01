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

import cloudmonitoring.CloudmonitoringFactory;
import cloudmonitoring.CloudmonitoringPackage;
import cloudmonitoring.Cpu;
import cloudmonitoring.Disk;
import cloudmonitoring.Diskio;
import cloudmonitoring.Emfpublisher;
import cloudmonitoring.IOUnit;
import cloudmonitoring.Inputoutput;
import cloudmonitoring.Mailpublisher;
import cloudmonitoring.Mainmetric;
import cloudmonitoring.MonitorState;
import cloudmonitoring.Networkio;
import cloudmonitoring.Publishercontrol;
import cloudmonitoring.Ram;
import cloudmonitoring.Sensorcontrol;
import cloudmonitoring.Sshcollector;
import cloudmonitoring.Systemoutpublisher;
import cloudmonitoring.Zabbixcollector;

import cloudmonitoring.util.CloudmonitoringValidator;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.monitoring.MonitoringPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CloudmonitoringPackageImpl extends EPackageImpl implements CloudmonitoringPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sshcollectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zabbixcollectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diskioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass networkioEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputoutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensorcontrolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emfpublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemoutpublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publishercontrolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass diskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mailpublisherEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mainmetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ioUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum monitorStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType averageEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType perSecEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType temperatureEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see cloudmonitoring.CloudmonitoringPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CloudmonitoringPackageImpl() {
		super(eNS_URI, CloudmonitoringFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CloudmonitoringPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CloudmonitoringPackage init() {
		if (isInited) return (CloudmonitoringPackage)EPackage.Registry.INSTANCE.getEPackage(CloudmonitoringPackage.eNS_URI);

		// Obtain or create and register package
		CloudmonitoringPackageImpl theCloudmonitoringPackage = (CloudmonitoringPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CloudmonitoringPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CloudmonitoringPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		MonitoringPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCloudmonitoringPackage.createPackageContents();

		// Initialize created meta-data
		theCloudmonitoringPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCloudmonitoringPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CloudmonitoringValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCloudmonitoringPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CloudmonitoringPackage.eNS_URI, theCloudmonitoringPackage);
		return theCloudmonitoringPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSshcollector() {
		return sshcollectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSshcollector_Label() {
		return (EAttribute)sshcollectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getZabbixcollector() {
		return zabbixcollectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZabbixcollector_Username() {
		return (EAttribute)zabbixcollectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZabbixcollector_Password() {
		return (EAttribute)zabbixcollectorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getZabbixcollector_HttpApiAddress() {
		return (EAttribute)zabbixcollectorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCpu() {
		return cpuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpu_LoadAvg() {
		return (EAttribute)cpuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCpu__AppliesConstraint__DiagnosticChain_Map() {
		return cpuEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiskio() {
		return diskioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiskio_DiskWrite() {
		return (EAttribute)diskioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiskio_DiskRead() {
		return (EAttribute)diskioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDiskio__AppliesConstraint__DiagnosticChain_Map() {
		return diskioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRam() {
		return ramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRam_Free() {
		return (EAttribute)ramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRam_Swap() {
		return (EAttribute)ramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRam__AppliesConstraint__DiagnosticChain_Map() {
		return ramEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNetworkio() {
		return networkioEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkio_NetworkIn() {
		return (EAttribute)networkioEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNetworkio_NetworkOut() {
		return (EAttribute)networkioEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNetworkio__AppliesConstraint__DiagnosticChain_Map() {
		return networkioEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputoutput() {
		return inputoutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInputoutput_Unit() {
		return (EAttribute)inputoutputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInputoutput__AppliesConstraint__DiagnosticChain_Map() {
		return inputoutputEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensorcontrol() {
		return sensorcontrolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSensorcontrol_MonitorState() {
		return (EAttribute)sensorcontrolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorcontrol__Startmonitoring() {
		return sensorcontrolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorcontrol__Stopmonitoring() {
		return sensorcontrolEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensorcontrol__AppliesConstraint__DiagnosticChain_Map() {
		return sensorcontrolEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmfpublisher() {
		return emfpublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEmfpublisher__AppliesConstraint__DiagnosticChain_Map() {
		return emfpublisherEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemoutpublisher() {
		return systemoutpublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSystemoutpublisher__AppliesConstraint__DiagnosticChain_Map() {
		return systemoutpublisherEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublishercontrol() {
		return publishercontrolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishercontrol_PublisherState() {
		return (EAttribute)publishercontrolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPublishercontrol__Enable() {
		return publishercontrolEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPublishercontrol__Disable() {
		return publishercontrolEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPublishercontrol__AppliesConstraint__DiagnosticChain_Map() {
		return publishercontrolEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisk() {
		return diskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisk_Swap() {
		return (EAttribute)diskEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisk_Free() {
		return (EAttribute)diskEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisk_VolumeName() {
		return (EAttribute)diskEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDisk__AppliesConstraint__DiagnosticChain_Map() {
		return diskEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMailpublisher() {
		return mailpublisherEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailpublisher_MailAddress() {
		return (EAttribute)mailpublisherEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailpublisher_PostOnCpuAlert() {
		return (EAttribute)mailpublisherEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailpublisher_PostOnRamAlert() {
		return (EAttribute)mailpublisherEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailpublisher_PostOnNetworkIOAlert() {
		return (EAttribute)mailpublisherEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailpublisher_PostOnDiskIOAlert() {
		return (EAttribute)mailpublisherEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMailpublisher_NbEmail() {
		return (EAttribute)mailpublisherEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMailpublisher__AppliesConstraint__DiagnosticChain_Map() {
		return mailpublisherEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMainmetric() {
		return mainmetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainmetric_ThresholdUsage() {
		return (EAttribute)mainmetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainmetric_Utilization() {
		return (EAttribute)mainmetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainmetric_Temperature() {
		return (EAttribute)mainmetricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMainmetric_ThresholdTemperature() {
		return (EAttribute)mainmetricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMainmetric__AppliesConstraint__DiagnosticChain_Map() {
		return mainmetricEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIOUnit() {
		return ioUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMonitorState() {
		return monitorStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPercent() {
		return percentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAverage() {
		return averageEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPerSec() {
		return perSecEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTemperature() {
		return temperatureEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudmonitoringFactory getCloudmonitoringFactory() {
		return (CloudmonitoringFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		sshcollectorEClass = createEClass(SSHCOLLECTOR);
		createEAttribute(sshcollectorEClass, SSHCOLLECTOR__LABEL);

		zabbixcollectorEClass = createEClass(ZABBIXCOLLECTOR);
		createEAttribute(zabbixcollectorEClass, ZABBIXCOLLECTOR__USERNAME);
		createEAttribute(zabbixcollectorEClass, ZABBIXCOLLECTOR__PASSWORD);
		createEAttribute(zabbixcollectorEClass, ZABBIXCOLLECTOR__HTTP_API_ADDRESS);

		cpuEClass = createEClass(CPU);
		createEAttribute(cpuEClass, CPU__LOAD_AVG);
		createEOperation(cpuEClass, CPU___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		diskioEClass = createEClass(DISKIO);
		createEAttribute(diskioEClass, DISKIO__DISK_WRITE);
		createEAttribute(diskioEClass, DISKIO__DISK_READ);
		createEOperation(diskioEClass, DISKIO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		ramEClass = createEClass(RAM);
		createEAttribute(ramEClass, RAM__FREE);
		createEAttribute(ramEClass, RAM__SWAP);
		createEOperation(ramEClass, RAM___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		networkioEClass = createEClass(NETWORKIO);
		createEAttribute(networkioEClass, NETWORKIO__NETWORK_IN);
		createEAttribute(networkioEClass, NETWORKIO__NETWORK_OUT);
		createEOperation(networkioEClass, NETWORKIO___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		inputoutputEClass = createEClass(INPUTOUTPUT);
		createEAttribute(inputoutputEClass, INPUTOUTPUT__UNIT);
		createEOperation(inputoutputEClass, INPUTOUTPUT___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		sensorcontrolEClass = createEClass(SENSORCONTROL);
		createEAttribute(sensorcontrolEClass, SENSORCONTROL__MONITOR_STATE);
		createEOperation(sensorcontrolEClass, SENSORCONTROL___STARTMONITORING);
		createEOperation(sensorcontrolEClass, SENSORCONTROL___STOPMONITORING);
		createEOperation(sensorcontrolEClass, SENSORCONTROL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		emfpublisherEClass = createEClass(EMFPUBLISHER);
		createEOperation(emfpublisherEClass, EMFPUBLISHER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		systemoutpublisherEClass = createEClass(SYSTEMOUTPUBLISHER);
		createEOperation(systemoutpublisherEClass, SYSTEMOUTPUBLISHER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		publishercontrolEClass = createEClass(PUBLISHERCONTROL);
		createEAttribute(publishercontrolEClass, PUBLISHERCONTROL__PUBLISHER_STATE);
		createEOperation(publishercontrolEClass, PUBLISHERCONTROL___ENABLE);
		createEOperation(publishercontrolEClass, PUBLISHERCONTROL___DISABLE);
		createEOperation(publishercontrolEClass, PUBLISHERCONTROL___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		diskEClass = createEClass(DISK);
		createEAttribute(diskEClass, DISK__SWAP);
		createEAttribute(diskEClass, DISK__FREE);
		createEAttribute(diskEClass, DISK__VOLUME_NAME);
		createEOperation(diskEClass, DISK___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		mailpublisherEClass = createEClass(MAILPUBLISHER);
		createEAttribute(mailpublisherEClass, MAILPUBLISHER__MAIL_ADDRESS);
		createEAttribute(mailpublisherEClass, MAILPUBLISHER__POST_ON_CPU_ALERT);
		createEAttribute(mailpublisherEClass, MAILPUBLISHER__POST_ON_RAM_ALERT);
		createEAttribute(mailpublisherEClass, MAILPUBLISHER__POST_ON_NETWORK_IO_ALERT);
		createEAttribute(mailpublisherEClass, MAILPUBLISHER__POST_ON_DISK_IO_ALERT);
		createEAttribute(mailpublisherEClass, MAILPUBLISHER__NB_EMAIL);
		createEOperation(mailpublisherEClass, MAILPUBLISHER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		mainmetricEClass = createEClass(MAINMETRIC);
		createEAttribute(mainmetricEClass, MAINMETRIC__THRESHOLD_USAGE);
		createEAttribute(mainmetricEClass, MAINMETRIC__UTILIZATION);
		createEAttribute(mainmetricEClass, MAINMETRIC__TEMPERATURE);
		createEAttribute(mainmetricEClass, MAINMETRIC__THRESHOLD_TEMPERATURE);
		createEOperation(mainmetricEClass, MAINMETRIC___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		// Create enums
		ioUnitEEnum = createEEnum(IO_UNIT);
		monitorStateEEnum = createEEnum(MONITOR_STATE);

		// Create data types
		percentEDataType = createEDataType(PERCENT);
		averageEDataType = createEDataType(AVERAGE);
		perSecEDataType = createEDataType(PER_SEC);
		temperatureEDataType = createEDataType(TEMPERATURE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		MonitoringPackage theMonitoringPackage = (MonitoringPackage)EPackage.Registry.INSTANCE.getEPackage(MonitoringPackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sshcollectorEClass.getESuperTypes().add(theMonitoringPackage.getCollector());
		zabbixcollectorEClass.getESuperTypes().add(theMonitoringPackage.getCollector());
		cpuEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		cpuEClass.getESuperTypes().add(this.getMainmetric());
		diskioEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		diskioEClass.getESuperTypes().add(this.getInputoutput());
		ramEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ramEClass.getESuperTypes().add(this.getMainmetric());
		networkioEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		networkioEClass.getESuperTypes().add(this.getInputoutput());
		inputoutputEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		inputoutputEClass.getESuperTypes().add(theMonitoringPackage.getMetric());
		sensorcontrolEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		emfpublisherEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		emfpublisherEClass.getESuperTypes().add(this.getPublishercontrol());
		systemoutpublisherEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		systemoutpublisherEClass.getESuperTypes().add(this.getPublishercontrol());
		publishercontrolEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		publishercontrolEClass.getESuperTypes().add(theMonitoringPackage.getPublisher());
		diskEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		diskEClass.getESuperTypes().add(this.getMainmetric());
		mailpublisherEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		mailpublisherEClass.getESuperTypes().add(this.getPublishercontrol());
		mainmetricEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		mainmetricEClass.getESuperTypes().add(theMonitoringPackage.getMetric());

		// Initialize classes, features, and operations; add parameters
		initEClass(sshcollectorEClass, Sshcollector.class, "Sshcollector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSshcollector_Label(), theOCCIPackage.getString(), "label", null, 0, 1, Sshcollector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zabbixcollectorEClass, Zabbixcollector.class, "Zabbixcollector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZabbixcollector_Username(), theOCCIPackage.getString(), "username", null, 0, 1, Zabbixcollector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZabbixcollector_Password(), theOCCIPackage.getString(), "password", null, 0, 1, Zabbixcollector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getZabbixcollector_HttpApiAddress(), theOCCIPackage.getString(), "httpApiAddress", null, 0, 1, Zabbixcollector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cpuEClass, Cpu.class, "Cpu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCpu_LoadAvg(), this.getAverage(), "loadAvg", null, 0, 1, Cpu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getCpu__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(diskioEClass, Diskio.class, "Diskio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDiskio_DiskWrite(), this.getPerSec(), "diskWrite", null, 0, 1, Diskio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDiskio_DiskRead(), this.getPerSec(), "diskRead", null, 0, 1, Diskio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDiskio__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ramEClass, Ram.class, "Ram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRam_Free(), this.getPercent(), "free", null, 0, 1, Ram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRam_Swap(), this.getPercent(), "swap", null, 0, 1, Ram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getRam__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(networkioEClass, Networkio.class, "Networkio", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNetworkio_NetworkIn(), this.getPerSec(), "networkIn", null, 0, 1, Networkio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNetworkio_NetworkOut(), this.getPerSec(), "networkOut", null, 0, 1, Networkio.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getNetworkio__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(inputoutputEClass, Inputoutput.class, "Inputoutput", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInputoutput_Unit(), this.getIOUnit(), "unit", null, 0, 1, Inputoutput.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getInputoutput__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sensorcontrolEClass, Sensorcontrol.class, "Sensorcontrol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSensorcontrol_MonitorState(), this.getMonitorState(), "monitorState", "off", 0, 1, Sensorcontrol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSensorcontrol__Startmonitoring(), null, "startmonitoring", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSensorcontrol__Stopmonitoring(), null, "stopmonitoring", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSensorcontrol__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(emfpublisherEClass, Emfpublisher.class, "Emfpublisher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getEmfpublisher__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(systemoutpublisherEClass, Systemoutpublisher.class, "Systemoutpublisher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSystemoutpublisher__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(publishercontrolEClass, Publishercontrol.class, "Publishercontrol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublishercontrol_PublisherState(), this.getMonitorState(), "publisherState", "on", 0, 1, Publishercontrol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPublishercontrol__Enable(), null, "enable", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPublishercontrol__Disable(), null, "disable", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPublishercontrol__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(diskEClass, Disk.class, "Disk", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDisk_Swap(), this.getPercent(), "swap", null, 0, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisk_Free(), this.getPercent(), "free", null, 0, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDisk_VolumeName(), theOCCIPackage.getString(), "volumeName", null, 0, 1, Disk.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDisk__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mailpublisherEClass, Mailpublisher.class, "Mailpublisher", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMailpublisher_MailAddress(), theOCCIPackage.getString(), "mailAddress", null, 0, 1, Mailpublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMailpublisher_PostOnCpuAlert(), theOCCIPackage.getBoolean(), "postOnCpuAlert", "false", 0, 1, Mailpublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMailpublisher_PostOnRamAlert(), theOCCIPackage.getBoolean(), "postOnRamAlert", "false", 0, 1, Mailpublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMailpublisher_PostOnNetworkIOAlert(), theOCCIPackage.getBoolean(), "postOnNetworkIOAlert", "false", 0, 1, Mailpublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMailpublisher_PostOnDiskIOAlert(), theOCCIPackage.getBoolean(), "postOnDiskIOAlert", "false", 0, 1, Mailpublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMailpublisher_NbEmail(), theOCCIPackage.getInteger(), "nbEmail", "2", 0, 1, Mailpublisher.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMailpublisher__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(mainmetricEClass, Mainmetric.class, "Mainmetric", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMainmetric_ThresholdUsage(), this.getPercent(), "thresholdUsage", "80.0", 0, 1, Mainmetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMainmetric_Utilization(), this.getPercent(), "utilization", "0.0", 0, 1, Mainmetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMainmetric_Temperature(), this.getTemperature(), "temperature", null, 0, 1, Mainmetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMainmetric_ThresholdTemperature(), this.getTemperature(), "thresholdTemperature", "80.0", 0, 1, Mainmetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getMainmetric__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(ioUnitEEnum, IOUnit.class, "IOUnit");
		addEEnumLiteral(ioUnitEEnum, IOUnit.BYTE_PER_SEC);
		addEEnumLiteral(ioUnitEEnum, IOUnit.KILO_BYTE_PER_SEC);
		addEEnumLiteral(ioUnitEEnum, IOUnit.MEGA_BYTE_PER_SEC);
		addEEnumLiteral(ioUnitEEnum, IOUnit.GIGA_BYTE_PER_SEC);

		initEEnum(monitorStateEEnum, MonitorState.class, "MonitorState");
		addEEnumLiteral(monitorStateEEnum, MonitorState.ON);
		addEEnumLiteral(monitorStateEEnum, MonitorState.OFF);

		// Initialize data types
		initEDataType(percentEDataType, Double.class, "Percent", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(averageEDataType, Double.class, "Average", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(perSecEDataType, Double.class, "PerSec", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(temperatureEDataType, Double.class, "Temperature", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
		   });	
		addAnnotation
		  (cpuEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (diskioEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (ramEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (networkioEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (inputoutputEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (sensorcontrolEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (emfpublisherEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (systemoutpublisherEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (publishercontrolEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (diskEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (mailpublisherEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });	
		addAnnotation
		  (mainmetricEClass, 
		   source, 
		   new String[] {
			 "constraints", "appliesConstraint"
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (percentEDataType, 
		   source, 
		   new String[] {
			 "MinInclusive", "0.0"
		   });	
		addAnnotation
		  (averageEDataType, 
		   source, 
		   new String[] {
			 "MinInclusive", "0.0",
			 "MinExclusive", ""
		   });	
		addAnnotation
		  (perSecEDataType, 
		   source, 
		   new String[] {
			 "MinInclusive", "0.0"
		   });
	}

} //CloudmonitoringPackageImpl
