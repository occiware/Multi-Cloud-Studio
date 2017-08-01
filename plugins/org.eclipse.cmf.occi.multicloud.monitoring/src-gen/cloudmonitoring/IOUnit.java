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

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>IO Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * Units for IO metrics (network / storage)
 * <!-- end-model-doc -->
 * @see cloudmonitoring.CloudmonitoringPackage#getIOUnit()
 * @model
 * @generated
 */
public enum IOUnit implements Enumerator {
	/**
	 * The '<em><b>Byte Per Sec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BYTE_PER_SEC_VALUE
	 * @generated
	 * @ordered
	 */
	BYTE_PER_SEC(0, "bytePerSec", "bytePerSec"),

	/**
	 * The '<em><b>Kilo Byte Per Sec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILO_BYTE_PER_SEC_VALUE
	 * @generated
	 * @ordered
	 */
	KILO_BYTE_PER_SEC(1, "kiloBytePerSec", "kiloBytePerSec"),

	/**
	 * The '<em><b>Mega Byte Per Sec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEGA_BYTE_PER_SEC_VALUE
	 * @generated
	 * @ordered
	 */
	MEGA_BYTE_PER_SEC(2, "megaBytePerSec", "megaBytePerSec"),

	/**
	 * The '<em><b>Giga Byte Per Sec</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIGA_BYTE_PER_SEC_VALUE
	 * @generated
	 * @ordered
	 */
	GIGA_BYTE_PER_SEC(3, "gigaBytePerSec", "gigaBytePerSec");

	/**
	 * The '<em><b>Byte Per Sec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nb of bytes per seconds type
	 * <!-- end-model-doc -->
	 * @see #BYTE_PER_SEC
	 * @model name="bytePerSec"
	 * @generated
	 * @ordered
	 */
	public static final int BYTE_PER_SEC_VALUE = 0;

	/**
	 * The '<em><b>Kilo Byte Per Sec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of kilo bytes per seconds type
	 * <!-- end-model-doc -->
	 * @see #KILO_BYTE_PER_SEC
	 * @model name="kiloBytePerSec"
	 * @generated
	 * @ordered
	 */
	public static final int KILO_BYTE_PER_SEC_VALUE = 1;

	/**
	 * The '<em><b>Mega Byte Per Sec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nb of megabytes per seconds type
	 * <!-- end-model-doc -->
	 * @see #MEGA_BYTE_PER_SEC
	 * @model name="megaBytePerSec"
	 * @generated
	 * @ordered
	 */
	public static final int MEGA_BYTE_PER_SEC_VALUE = 2;

	/**
	 * The '<em><b>Giga Byte Per Sec</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Number of giga bytes per seconds type
	 * <!-- end-model-doc -->
	 * @see #GIGA_BYTE_PER_SEC
	 * @model name="gigaBytePerSec"
	 * @generated
	 * @ordered
	 */
	public static final int GIGA_BYTE_PER_SEC_VALUE = 3;

	/**
	 * An array of all the '<em><b>IO Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IOUnit[] VALUES_ARRAY =
		new IOUnit[] {
			BYTE_PER_SEC,
			KILO_BYTE_PER_SEC,
			MEGA_BYTE_PER_SEC,
			GIGA_BYTE_PER_SEC,
		};

	/**
	 * A public read-only list of all the '<em><b>IO Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IOUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>IO Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IOUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IOUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IO Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IOUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IOUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IO Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IOUnit get(int value) {
		switch (value) {
			case BYTE_PER_SEC_VALUE: return BYTE_PER_SEC;
			case KILO_BYTE_PER_SEC_VALUE: return KILO_BYTE_PER_SEC;
			case MEGA_BYTE_PER_SEC_VALUE: return MEGA_BYTE_PER_SEC;
			case GIGA_BYTE_PER_SEC_VALUE: return GIGA_BYTE_PER_SEC;
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
	private IOUnit(int value, String name, String literal) {
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
	
} //IOUnit
