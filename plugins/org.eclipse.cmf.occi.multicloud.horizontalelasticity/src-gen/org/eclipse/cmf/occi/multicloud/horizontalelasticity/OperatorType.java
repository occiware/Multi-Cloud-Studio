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
 * A representation of the literals of the enumeration '<em><b>Operator Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.cmf.occi.multicloud.horizontalelasticity.HorizontalelasticityPackage#getOperatorType()
 * @model
 * @generated
 */
public enum OperatorType implements Enumerator {
	/**
	 * The '<em><b>Grater Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRATER_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	GRATER_THAN(0, "GraterThan", "GraterThan"),

	/**
	 * The '<em><b>Greater Than Or Equal To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_OR_EQUAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	GREATER_THAN_OR_EQUAL_TO(1, "GreaterThanOrEqualTo", "GreaterThanOrEqualTo"),

	/**
	 * The '<em><b>Less Than</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THAN(2, "LessThan", "LessThan"),

	/**
	 * The '<em><b>Less Thanor Equal To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LESS_THANOR_EQUAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	LESS_THANOR_EQUAL_TO(3, "LessThanorEqualTo", "LessThanorEqualTo"),

	/**
	 * The '<em><b>Equal To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQUAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	EQUAL_TO(4, "EqualTo", "EqualTo"),

	/**
	 * The '<em><b>Not Equal To</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL_TO_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_EQUAL_TO(5, "NotEqualTo", "NotEqualTo");

	/**
	 * The '<em><b>Grater Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Grater Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRATER_THAN
	 * @model name="GraterThan"
	 * @generated
	 * @ordered
	 */
	public static final int GRATER_THAN_VALUE = 0;

	/**
	 * The '<em><b>Greater Than Or Equal To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Greater Than Or Equal To</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GREATER_THAN_OR_EQUAL_TO
	 * @model name="GreaterThanOrEqualTo"
	 * @generated
	 * @ordered
	 */
	public static final int GREATER_THAN_OR_EQUAL_TO_VALUE = 1;

	/**
	 * The '<em><b>Less Than</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less Than</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_THAN
	 * @model name="LessThan"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THAN_VALUE = 2;

	/**
	 * The '<em><b>Less Thanor Equal To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Less Thanor Equal To</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LESS_THANOR_EQUAL_TO
	 * @model name="LessThanorEqualTo"
	 * @generated
	 * @ordered
	 */
	public static final int LESS_THANOR_EQUAL_TO_VALUE = 3;

	/**
	 * The '<em><b>Equal To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Equal To</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQUAL_TO
	 * @model name="EqualTo"
	 * @generated
	 * @ordered
	 */
	public static final int EQUAL_TO_VALUE = 4;

	/**
	 * The '<em><b>Not Equal To</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Not Equal To</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_EQUAL_TO
	 * @model name="NotEqualTo"
	 * @generated
	 * @ordered
	 */
	public static final int NOT_EQUAL_TO_VALUE = 5;

	/**
	 * An array of all the '<em><b>Operator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperatorType[] VALUES_ARRAY =
		new OperatorType[] {
			GRATER_THAN,
			GREATER_THAN_OR_EQUAL_TO,
			LESS_THAN,
			LESS_THANOR_EQUAL_TO,
			EQUAL_TO,
			NOT_EQUAL_TO,
		};

	/**
	 * A public read-only list of all the '<em><b>Operator Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperatorType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operator Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperatorType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatorType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operator Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperatorType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperatorType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operator Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperatorType get(int value) {
		switch (value) {
			case GRATER_THAN_VALUE: return GRATER_THAN;
			case GREATER_THAN_OR_EQUAL_TO_VALUE: return GREATER_THAN_OR_EQUAL_TO;
			case LESS_THAN_VALUE: return LESS_THAN;
			case LESS_THANOR_EQUAL_TO_VALUE: return LESS_THANOR_EQUAL_TO;
			case EQUAL_TO_VALUE: return EQUAL_TO;
			case NOT_EQUAL_TO_VALUE: return NOT_EQUAL_TO;
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
	private OperatorType(int value, String name, String literal) {
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
	
} //OperatorType
