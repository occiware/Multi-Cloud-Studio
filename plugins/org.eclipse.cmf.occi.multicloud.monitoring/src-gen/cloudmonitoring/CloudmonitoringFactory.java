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
package cloudmonitoring;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see cloudmonitoring.CloudmonitoringPackage
 * @generated
 */
public interface CloudmonitoringFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CloudmonitoringFactory eINSTANCE = cloudmonitoring.impl.CloudmonitoringFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cloudsensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloudsensor</em>'.
	 * @generated
	 */
	Cloudsensor createCloudsensor();

	/**
	 * Returns a new object of class '<em>Cpu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cpu</em>'.
	 * @generated
	 */
	Cpu createCpu();

	/**
	 * Returns a new object of class '<em>Diskio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Diskio</em>'.
	 * @generated
	 */
	Diskio createDiskio();

	/**
	 * Returns a new object of class '<em>Ram</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Ram</em>'.
	 * @generated
	 */
	Ram createRam();

	/**
	 * Returns a new object of class '<em>Networkio</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Networkio</em>'.
	 * @generated
	 */
	Networkio createNetworkio();

	/**
	 * Returns a new object of class '<em>Inputoutput</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inputoutput</em>'.
	 * @generated
	 */
	Inputoutput createInputoutput();

	/**
	 * Returns a new object of class '<em>Sensorcontrol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sensorcontrol</em>'.
	 * @generated
	 */
	Sensorcontrol createSensorcontrol();

	/**
	 * Returns a new object of class '<em>Emfpublisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Emfpublisher</em>'.
	 * @generated
	 */
	Emfpublisher createEmfpublisher();

	/**
	 * Returns a new object of class '<em>Systemoutpublisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Systemoutpublisher</em>'.
	 * @generated
	 */
	Systemoutpublisher createSystemoutpublisher();

	/**
	 * Returns a new object of class '<em>Publishercontrol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Publishercontrol</em>'.
	 * @generated
	 */
	Publishercontrol createPublishercontrol();

	/**
	 * Returns a new object of class '<em>Disk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Disk</em>'.
	 * @generated
	 */
	Disk createDisk();

	/**
	 * Returns a new object of class '<em>Mailpublisher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mailpublisher</em>'.
	 * @generated
	 */
	Mailpublisher createMailpublisher();

	/**
	 * Returns a new object of class '<em>Mainmetric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mainmetric</em>'.
	 * @generated
	 */
	Mainmetric createMainmetric();

	/**
	 * Returns a new object of class '<em>Supervisorapiconnect</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Supervisorapiconnect</em>'.
	 * @generated
	 */
	Supervisorapiconnect createSupervisorapiconnect();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CloudmonitoringPackage getCloudmonitoringPackage();

} //CloudmonitoringFactory
