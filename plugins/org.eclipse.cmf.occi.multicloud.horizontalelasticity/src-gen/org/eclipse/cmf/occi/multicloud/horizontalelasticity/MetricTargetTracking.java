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
package org.eclipse.cmf.occi.multicloud.horizontalelasticity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Metric Target Tracking</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getMetricTargetTracking()
 * @model
 * @generated
 */
public enum MetricTargetTracking implements Enumerator {
	/**
	 * The '<em><b>Average Cpu Utilisation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_CPU_UTILISATION_VALUE
	 * @generated
	 * @ordered
	 */
	AVERAGE_CPU_UTILISATION(0, "AverageCpuUtilisation", "AverageCpuUtilisation"),

	/**
	 * The '<em><b>LB Request Countper Target</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LB_REQUEST_COUNTPER_TARGET_VALUE
	 * @generated
	 * @ordered
	 */
	LB_REQUEST_COUNTPER_TARGET(1, "LBRequestCountperTarget", "LBRequestCountperTarget"),

	/**
	 * The '<em><b>Average Networkin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_NETWORKIN_VALUE
	 * @generated
	 * @ordered
	 */
	AVERAGE_NETWORKIN(2, "AverageNetworkin", "AverageNetworkin"),

	/**
	 * The '<em><b>Average Networkout</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_NETWORKOUT_VALUE
	 * @generated
	 * @ordered
	 */
	AVERAGE_NETWORKOUT(3, "AverageNetworkout", "AverageNetworkout");

	/**
	 * The '<em><b>Average Cpu Utilisation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Average Cpu Utilisation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_CPU_UTILISATION
	 * @model name="AverageCpuUtilisation"
	 * @generated
	 * @ordered
	 */
	public static final int AVERAGE_CPU_UTILISATION_VALUE = 0;

	/**
	 * The '<em><b>LB Request Countper Target</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LB Request Countper Target</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LB_REQUEST_COUNTPER_TARGET
	 * @model name="LBRequestCountperTarget"
	 * @generated
	 * @ordered
	 */
	public static final int LB_REQUEST_COUNTPER_TARGET_VALUE = 1;

	/**
	 * The '<em><b>Average Networkin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Average Networkin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_NETWORKIN
	 * @model name="AverageNetworkin"
	 * @generated
	 * @ordered
	 */
	public static final int AVERAGE_NETWORKIN_VALUE = 2;

	/**
	 * The '<em><b>Average Networkout</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Average Networkout</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AVERAGE_NETWORKOUT
	 * @model name="AverageNetworkout"
	 * @generated
	 * @ordered
	 */
	public static final int AVERAGE_NETWORKOUT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Metric Target Tracking</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MetricTargetTracking[] VALUES_ARRAY =
		new MetricTargetTracking[] {
			AVERAGE_CPU_UTILISATION,
			LB_REQUEST_COUNTPER_TARGET,
			AVERAGE_NETWORKIN,
			AVERAGE_NETWORKOUT,
		};

	/**
	 * A public read-only list of all the '<em><b>Metric Target Tracking</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MetricTargetTracking> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Metric Target Tracking</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MetricTargetTracking get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MetricTargetTracking result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metric Target Tracking</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MetricTargetTracking getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MetricTargetTracking result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Metric Target Tracking</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MetricTargetTracking get(int value) {
		switch (value) {
			case AVERAGE_CPU_UTILISATION_VALUE: return AVERAGE_CPU_UTILISATION;
			case LB_REQUEST_COUNTPER_TARGET_VALUE: return LB_REQUEST_COUNTPER_TARGET;
			case AVERAGE_NETWORKIN_VALUE: return AVERAGE_NETWORKIN;
			case AVERAGE_NETWORKOUT_VALUE: return AVERAGE_NETWORKOUT;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MetricTargetTracking(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MetricTargetTracking
