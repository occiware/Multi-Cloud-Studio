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

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.monitoring.Metric;
import org.eclipse.cmf.occi.monitoring.Publisher;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see cloudmonitoring.CloudmonitoringPackage
 * @generated
 */
public class CloudmonitoringSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CloudmonitoringPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloudmonitoringSwitch() {
		if (modelPackage == null) {
			modelPackage = CloudmonitoringPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CloudmonitoringPackage.CPU: {
				Cpu cpu = (Cpu)theEObject;
				T result = caseCpu(cpu);
				if (result == null) result = caseMainmetric(cpu);
				if (result == null) result = caseMetric(cpu);
				if (result == null) result = caseMixinBase(cpu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudmonitoringPackage.DISKIO: {
				Diskio diskio = (Diskio)theEObject;
				T result = caseDiskio(diskio);
				if (result == null) result = caseInputoutput(diskio);
				if (result == null) result = caseMetric(diskio);
				if (result == null) result = caseMixinBase(diskio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudmonitoringPackage.RAM: {
				Ram ram = (Ram)theEObject;
				T result = caseRam(ram);
				if (result == null) result = caseMainmetric(ram);
				if (result == null) result = caseMetric(ram);
				if (result == null) result = caseMixinBase(ram);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudmonitoringPackage.NETWORKIO: {
				Networkio networkio = (Networkio)theEObject;
				T result = caseNetworkio(networkio);
				if (result == null) result = caseInputoutput(networkio);
				if (result == null) result = caseMetric(networkio);
				if (result == null) result = caseMixinBase(networkio);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudmonitoringPackage.INPUTOUTPUT: {
				Inputoutput inputoutput = (Inputoutput)theEObject;
				T result = caseInputoutput(inputoutput);
				if (result == null) result = caseMetric(inputoutput);
				if (result == null) result = caseMixinBase(inputoutput);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudmonitoringPackage.SENSORCONTROL: {
				Sensorcontrol sensorcontrol = (Sensorcontrol)theEObject;
				T result = caseSensorcontrol(sensorcontrol);
				if (result == null) result = caseMixinBase(sensorcontrol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudmonitoringPackage.EMFPUBLISHER: {
				Emfpublisher emfpublisher = (Emfpublisher)theEObject;
				T result = caseEmfpublisher(emfpublisher);
				if (result == null) result = casePublishercontrol(emfpublisher);
				if (result == null) result = casePublisher(emfpublisher);
				if (result == null) result = caseMixinBase(emfpublisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudmonitoringPackage.SYSTEMOUTPUBLISHER: {
				Systemoutpublisher systemoutpublisher = (Systemoutpublisher)theEObject;
				T result = caseSystemoutpublisher(systemoutpublisher);
				if (result == null) result = casePublishercontrol(systemoutpublisher);
				if (result == null) result = casePublisher(systemoutpublisher);
				if (result == null) result = caseMixinBase(systemoutpublisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudmonitoringPackage.PUBLISHERCONTROL: {
				Publishercontrol publishercontrol = (Publishercontrol)theEObject;
				T result = casePublishercontrol(publishercontrol);
				if (result == null) result = casePublisher(publishercontrol);
				if (result == null) result = caseMixinBase(publishercontrol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudmonitoringPackage.DISK: {
				Disk disk = (Disk)theEObject;
				T result = caseDisk(disk);
				if (result == null) result = caseMainmetric(disk);
				if (result == null) result = caseMetric(disk);
				if (result == null) result = caseMixinBase(disk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudmonitoringPackage.MAILPUBLISHER: {
				Mailpublisher mailpublisher = (Mailpublisher)theEObject;
				T result = caseMailpublisher(mailpublisher);
				if (result == null) result = casePublishercontrol(mailpublisher);
				if (result == null) result = casePublisher(mailpublisher);
				if (result == null) result = caseMixinBase(mailpublisher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudmonitoringPackage.MAINMETRIC: {
				Mainmetric mainmetric = (Mainmetric)theEObject;
				T result = caseMainmetric(mainmetric);
				if (result == null) result = caseMetric(mainmetric);
				if (result == null) result = caseMixinBase(mainmetric);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CloudmonitoringPackage.SUPERVISORAPICONNECT: {
				Supervisorapiconnect supervisorapiconnect = (Supervisorapiconnect)theEObject;
				T result = caseSupervisorapiconnect(supervisorapiconnect);
				if (result == null) result = caseMixinBase(supervisorapiconnect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpu(Cpu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Diskio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Diskio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiskio(Diskio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ram</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ram</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRam(Ram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Networkio</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Networkio</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNetworkio(Networkio object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inputoutput</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inputoutput</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputoutput(Inputoutput object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sensorcontrol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sensorcontrol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSensorcontrol(Sensorcontrol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emfpublisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emfpublisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmfpublisher(Emfpublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Systemoutpublisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Systemoutpublisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemoutpublisher(Systemoutpublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publishercontrol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publishercontrol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublishercontrol(Publishercontrol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Disk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Disk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDisk(Disk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mailpublisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mailpublisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMailpublisher(Mailpublisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mainmetric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mainmetric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMainmetric(Mainmetric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Supervisorapiconnect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Supervisorapiconnect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupervisorapiconnect(Supervisorapiconnect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mixin Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMixinBase(MixinBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Metric</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetric(Metric object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisher(Publisher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CloudmonitoringSwitch
