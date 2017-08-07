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
package cloudmonitoring.util;

import cloudmonitoring.*;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;

import org.eclipse.cmf.occi.monitoring.Metric;
import org.eclipse.cmf.occi.monitoring.Publisher;
import org.eclipse.cmf.occi.monitoring.Sensor;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see cloudmonitoring.CloudmonitoringPackage
 * @generated
 */
public class CloudmonitoringAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CloudmonitoringPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudmonitoringAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CloudmonitoringPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudmonitoringSwitch<Adapter> modelSwitch =
		new CloudmonitoringSwitch<Adapter>() {
			@Override
			public Adapter caseCloudsensor(Cloudsensor object) {
				return createCloudsensorAdapter();
			}
			@Override
			public Adapter caseCpu(Cpu object) {
				return createCpuAdapter();
			}
			@Override
			public Adapter caseDiskio(Diskio object) {
				return createDiskioAdapter();
			}
			@Override
			public Adapter caseRam(Ram object) {
				return createRamAdapter();
			}
			@Override
			public Adapter caseNetworkio(Networkio object) {
				return createNetworkioAdapter();
			}
			@Override
			public Adapter caseInputoutput(Inputoutput object) {
				return createInputoutputAdapter();
			}
			@Override
			public Adapter caseSensorcontrol(Sensorcontrol object) {
				return createSensorcontrolAdapter();
			}
			@Override
			public Adapter caseEmfpublisher(Emfpublisher object) {
				return createEmfpublisherAdapter();
			}
			@Override
			public Adapter caseSystemoutpublisher(Systemoutpublisher object) {
				return createSystemoutpublisherAdapter();
			}
			@Override
			public Adapter casePublishercontrol(Publishercontrol object) {
				return createPublishercontrolAdapter();
			}
			@Override
			public Adapter caseDisk(Disk object) {
				return createDiskAdapter();
			}
			@Override
			public Adapter caseMailpublisher(Mailpublisher object) {
				return createMailpublisherAdapter();
			}
			@Override
			public Adapter caseMainmetric(Mainmetric object) {
				return createMainmetricAdapter();
			}
			@Override
			public Adapter caseSupervisorapiconnect(Supervisorapiconnect object) {
				return createSupervisorapiconnectAdapter();
			}
			@Override
			public Adapter caseEntity(Entity object) {
				return createEntityAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
			}
			@Override
			public Adapter caseSensor(Sensor object) {
				return createSensorAdapter();
			}
			@Override
			public Adapter caseMixinBase(MixinBase object) {
				return createMixinBaseAdapter();
			}
			@Override
			public Adapter caseMetric(Metric object) {
				return createMetricAdapter();
			}
			@Override
			public Adapter casePublisher(Publisher object) {
				return createPublisherAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link cloudmonitoring.Cloudsensor <em>Cloudsensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudmonitoring.Cloudsensor
	 * @generated
	 */
	public Adapter createCloudsensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudmonitoring.Cpu <em>Cpu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudmonitoring.Cpu
	 * @generated
	 */
	public Adapter createCpuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudmonitoring.Diskio <em>Diskio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudmonitoring.Diskio
	 * @generated
	 */
	public Adapter createDiskioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudmonitoring.Ram <em>Ram</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudmonitoring.Ram
	 * @generated
	 */
	public Adapter createRamAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudmonitoring.Networkio <em>Networkio</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudmonitoring.Networkio
	 * @generated
	 */
	public Adapter createNetworkioAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudmonitoring.Inputoutput <em>Inputoutput</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudmonitoring.Inputoutput
	 * @generated
	 */
	public Adapter createInputoutputAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudmonitoring.Sensorcontrol <em>Sensorcontrol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudmonitoring.Sensorcontrol
	 * @generated
	 */
	public Adapter createSensorcontrolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudmonitoring.Emfpublisher <em>Emfpublisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudmonitoring.Emfpublisher
	 * @generated
	 */
	public Adapter createEmfpublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudmonitoring.Systemoutpublisher <em>Systemoutpublisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudmonitoring.Systemoutpublisher
	 * @generated
	 */
	public Adapter createSystemoutpublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudmonitoring.Publishercontrol <em>Publishercontrol</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudmonitoring.Publishercontrol
	 * @generated
	 */
	public Adapter createPublishercontrolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudmonitoring.Disk <em>Disk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudmonitoring.Disk
	 * @generated
	 */
	public Adapter createDiskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudmonitoring.Mailpublisher <em>Mailpublisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudmonitoring.Mailpublisher
	 * @generated
	 */
	public Adapter createMailpublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudmonitoring.Mainmetric <em>Mainmetric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudmonitoring.Mainmetric
	 * @generated
	 */
	public Adapter createMainmetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link cloudmonitoring.Supervisorapiconnect <em>Supervisorapiconnect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see cloudmonitoring.Supervisorapiconnect
	 * @generated
	 */
	public Adapter createSupervisorapiconnectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.monitoring.Sensor <em>Sensor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.monitoring.Sensor
	 * @generated
	 */
	public Adapter createSensorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.core.MixinBase <em>Mixin Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.core.MixinBase
	 * @generated
	 */
	public Adapter createMixinBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.monitoring.Metric <em>Metric</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.monitoring.Metric
	 * @generated
	 */
	public Adapter createMetricAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.monitoring.Publisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.monitoring.Publisher
	 * @generated
	 */
	public Adapter createPublisherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CloudmonitoringAdapterFactory
