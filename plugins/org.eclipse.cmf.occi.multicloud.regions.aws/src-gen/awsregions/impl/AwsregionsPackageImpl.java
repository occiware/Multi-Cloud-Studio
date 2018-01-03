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
package awsregions.impl;

import awsregions.Ap_northeast_1;
import awsregions.Ap_northeast_2;
import awsregions.Ap_south_1;
import awsregions.Ap_south_east2;
import awsregions.Ap_southeast_1;
import awsregions.AwsregionsFactory;
import awsregions.AwsregionsPackage;
import awsregions.Ca_central_1;
import awsregions.Eu_central_1;
import awsregions.Eu_west_1;
import awsregions.Eu_west_2;
import awsregions.Eu_west_3;
import awsregions.Sa_east_1;
import awsregions.Us_east_1;
import awsregions.Us_east_2;
import awsregions.Us_west_1;
import awsregions.Us_west_2;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.cmf.occi.multicloud.regions.RegionsPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AwsregionsPackageImpl extends EPackageImpl implements AwsregionsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass us_east_2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass us_east_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eu_west_3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass us_west_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eu_west_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ap_south_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sa_east_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass us_west_2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eu_west_2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ap_southeast_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ca_central_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ap_northeast_2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ap_south_east2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eu_central_1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ap_northeast_1EClass = null;

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
	 * @see awsregions.AwsregionsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AwsregionsPackageImpl() {
		super(eNS_URI, AwsregionsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AwsregionsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AwsregionsPackage init() {
		if (isInited) return (AwsregionsPackage)EPackage.Registry.INSTANCE.getEPackage(AwsregionsPackage.eNS_URI);

		// Obtain or create and register package
		AwsregionsPackageImpl theAwsregionsPackage = (AwsregionsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AwsregionsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AwsregionsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		RegionsPackage.eINSTANCE.eClass();
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAwsregionsPackage.createPackageContents();

		// Initialize created meta-data
		theAwsregionsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAwsregionsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AwsregionsPackage.eNS_URI, theAwsregionsPackage);
		return theAwsregionsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUs_east_2() {
		return us_east_2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_2_RegionName() {
		return (EAttribute)us_east_2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_2_Country() {
		return (EAttribute)us_east_2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_2_RegionId() {
		return (EAttribute)us_east_2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_2_City() {
		return (EAttribute)us_east_2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUs_east_1() {
		return us_east_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_1_RegionName() {
		return (EAttribute)us_east_1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_1_Country() {
		return (EAttribute)us_east_1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_1_RegionId() {
		return (EAttribute)us_east_1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_east_1_City() {
		return (EAttribute)us_east_1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEu_west_3() {
		return eu_west_3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_3_RegionName() {
		return (EAttribute)eu_west_3EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_3_Country() {
		return (EAttribute)eu_west_3EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_3_RegionId() {
		return (EAttribute)eu_west_3EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_3_City() {
		return (EAttribute)eu_west_3EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUs_west_1() {
		return us_west_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_1_RegionName() {
		return (EAttribute)us_west_1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_1_Country() {
		return (EAttribute)us_west_1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_1_RegionId() {
		return (EAttribute)us_west_1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_1_City() {
		return (EAttribute)us_west_1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEu_west_1() {
		return eu_west_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_1_RegionName() {
		return (EAttribute)eu_west_1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_1_Country() {
		return (EAttribute)eu_west_1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_1_RegionId() {
		return (EAttribute)eu_west_1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_1_City() {
		return (EAttribute)eu_west_1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAp_south_1() {
		return ap_south_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_1_Country() {
		return (EAttribute)ap_south_1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_1_RegionName() {
		return (EAttribute)ap_south_1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_1_RegionId() {
		return (EAttribute)ap_south_1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_1_City() {
		return (EAttribute)ap_south_1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSa_east_1() {
		return sa_east_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSa_east_1_Country() {
		return (EAttribute)sa_east_1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSa_east_1_RegionName() {
		return (EAttribute)sa_east_1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSa_east_1_RegionId() {
		return (EAttribute)sa_east_1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSa_east_1_City() {
		return (EAttribute)sa_east_1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUs_west_2() {
		return us_west_2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_2_RegionName() {
		return (EAttribute)us_west_2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_2_Country() {
		return (EAttribute)us_west_2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_2_RegionId() {
		return (EAttribute)us_west_2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUs_west_2_City() {
		return (EAttribute)us_west_2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEu_west_2() {
		return eu_west_2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_2_RegionName() {
		return (EAttribute)eu_west_2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_2_Country() {
		return (EAttribute)eu_west_2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_2_RegionId() {
		return (EAttribute)eu_west_2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_west_2_City() {
		return (EAttribute)eu_west_2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAp_southeast_1() {
		return ap_southeast_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_southeast_1_Country() {
		return (EAttribute)ap_southeast_1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_southeast_1_RegionName() {
		return (EAttribute)ap_southeast_1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_southeast_1_RegionId() {
		return (EAttribute)ap_southeast_1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_southeast_1_City() {
		return (EAttribute)ap_southeast_1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCa_central_1() {
		return ca_central_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCa_central_1_RegionName() {
		return (EAttribute)ca_central_1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCa_central_1_Country() {
		return (EAttribute)ca_central_1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCa_central_1_RegionId() {
		return (EAttribute)ca_central_1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCa_central_1_City() {
		return (EAttribute)ca_central_1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAp_northeast_2() {
		return ap_northeast_2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_2_Country() {
		return (EAttribute)ap_northeast_2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_2_RegionName() {
		return (EAttribute)ap_northeast_2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_2_RegionId() {
		return (EAttribute)ap_northeast_2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_2_City() {
		return (EAttribute)ap_northeast_2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAp_south_east2() {
		return ap_south_east2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_east2_Country() {
		return (EAttribute)ap_south_east2EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_east2_RegionName() {
		return (EAttribute)ap_south_east2EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_east2_RegionId() {
		return (EAttribute)ap_south_east2EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_south_east2_City() {
		return (EAttribute)ap_south_east2EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEu_central_1() {
		return eu_central_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_central_1_Country() {
		return (EAttribute)eu_central_1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_central_1_RegionId() {
		return (EAttribute)eu_central_1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_central_1_City() {
		return (EAttribute)eu_central_1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEu_central_1_RegionName() {
		return (EAttribute)eu_central_1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAp_northeast_1() {
		return ap_northeast_1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_1_Country() {
		return (EAttribute)ap_northeast_1EClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_1_RegionName() {
		return (EAttribute)ap_northeast_1EClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_1_RegionId() {
		return (EAttribute)ap_northeast_1EClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAp_northeast_1_City() {
		return (EAttribute)ap_northeast_1EClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsregionsFactory getAwsregionsFactory() {
		return (AwsregionsFactory)getEFactoryInstance();
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
		us_east_2EClass = createEClass(US_EAST_2);
		createEAttribute(us_east_2EClass, US_EAST_2__REGION_NAME);
		createEAttribute(us_east_2EClass, US_EAST_2__COUNTRY);
		createEAttribute(us_east_2EClass, US_EAST_2__REGION_ID);
		createEAttribute(us_east_2EClass, US_EAST_2__CITY);

		us_east_1EClass = createEClass(US_EAST_1);
		createEAttribute(us_east_1EClass, US_EAST_1__REGION_NAME);
		createEAttribute(us_east_1EClass, US_EAST_1__COUNTRY);
		createEAttribute(us_east_1EClass, US_EAST_1__REGION_ID);
		createEAttribute(us_east_1EClass, US_EAST_1__CITY);

		eu_west_3EClass = createEClass(EU_WEST_3);
		createEAttribute(eu_west_3EClass, EU_WEST_3__REGION_NAME);
		createEAttribute(eu_west_3EClass, EU_WEST_3__COUNTRY);
		createEAttribute(eu_west_3EClass, EU_WEST_3__REGION_ID);
		createEAttribute(eu_west_3EClass, EU_WEST_3__CITY);

		us_west_1EClass = createEClass(US_WEST_1);
		createEAttribute(us_west_1EClass, US_WEST_1__REGION_NAME);
		createEAttribute(us_west_1EClass, US_WEST_1__COUNTRY);
		createEAttribute(us_west_1EClass, US_WEST_1__REGION_ID);
		createEAttribute(us_west_1EClass, US_WEST_1__CITY);

		eu_west_1EClass = createEClass(EU_WEST_1);
		createEAttribute(eu_west_1EClass, EU_WEST_1__REGION_NAME);
		createEAttribute(eu_west_1EClass, EU_WEST_1__COUNTRY);
		createEAttribute(eu_west_1EClass, EU_WEST_1__REGION_ID);
		createEAttribute(eu_west_1EClass, EU_WEST_1__CITY);

		ap_south_1EClass = createEClass(AP_SOUTH_1);
		createEAttribute(ap_south_1EClass, AP_SOUTH_1__COUNTRY);
		createEAttribute(ap_south_1EClass, AP_SOUTH_1__REGION_NAME);
		createEAttribute(ap_south_1EClass, AP_SOUTH_1__REGION_ID);
		createEAttribute(ap_south_1EClass, AP_SOUTH_1__CITY);

		sa_east_1EClass = createEClass(SA_EAST_1);
		createEAttribute(sa_east_1EClass, SA_EAST_1__COUNTRY);
		createEAttribute(sa_east_1EClass, SA_EAST_1__REGION_NAME);
		createEAttribute(sa_east_1EClass, SA_EAST_1__REGION_ID);
		createEAttribute(sa_east_1EClass, SA_EAST_1__CITY);

		us_west_2EClass = createEClass(US_WEST_2);
		createEAttribute(us_west_2EClass, US_WEST_2__REGION_NAME);
		createEAttribute(us_west_2EClass, US_WEST_2__COUNTRY);
		createEAttribute(us_west_2EClass, US_WEST_2__REGION_ID);
		createEAttribute(us_west_2EClass, US_WEST_2__CITY);

		eu_west_2EClass = createEClass(EU_WEST_2);
		createEAttribute(eu_west_2EClass, EU_WEST_2__REGION_NAME);
		createEAttribute(eu_west_2EClass, EU_WEST_2__COUNTRY);
		createEAttribute(eu_west_2EClass, EU_WEST_2__REGION_ID);
		createEAttribute(eu_west_2EClass, EU_WEST_2__CITY);

		ap_southeast_1EClass = createEClass(AP_SOUTHEAST_1);
		createEAttribute(ap_southeast_1EClass, AP_SOUTHEAST_1__COUNTRY);
		createEAttribute(ap_southeast_1EClass, AP_SOUTHEAST_1__REGION_NAME);
		createEAttribute(ap_southeast_1EClass, AP_SOUTHEAST_1__REGION_ID);
		createEAttribute(ap_southeast_1EClass, AP_SOUTHEAST_1__CITY);

		ca_central_1EClass = createEClass(CA_CENTRAL_1);
		createEAttribute(ca_central_1EClass, CA_CENTRAL_1__REGION_NAME);
		createEAttribute(ca_central_1EClass, CA_CENTRAL_1__COUNTRY);
		createEAttribute(ca_central_1EClass, CA_CENTRAL_1__REGION_ID);
		createEAttribute(ca_central_1EClass, CA_CENTRAL_1__CITY);

		ap_northeast_2EClass = createEClass(AP_NORTHEAST_2);
		createEAttribute(ap_northeast_2EClass, AP_NORTHEAST_2__COUNTRY);
		createEAttribute(ap_northeast_2EClass, AP_NORTHEAST_2__REGION_NAME);
		createEAttribute(ap_northeast_2EClass, AP_NORTHEAST_2__REGION_ID);
		createEAttribute(ap_northeast_2EClass, AP_NORTHEAST_2__CITY);

		ap_south_east2EClass = createEClass(AP_SOUTH_EAST2);
		createEAttribute(ap_south_east2EClass, AP_SOUTH_EAST2__COUNTRY);
		createEAttribute(ap_south_east2EClass, AP_SOUTH_EAST2__REGION_NAME);
		createEAttribute(ap_south_east2EClass, AP_SOUTH_EAST2__REGION_ID);
		createEAttribute(ap_south_east2EClass, AP_SOUTH_EAST2__CITY);

		eu_central_1EClass = createEClass(EU_CENTRAL_1);
		createEAttribute(eu_central_1EClass, EU_CENTRAL_1__COUNTRY);
		createEAttribute(eu_central_1EClass, EU_CENTRAL_1__REGION_ID);
		createEAttribute(eu_central_1EClass, EU_CENTRAL_1__CITY);
		createEAttribute(eu_central_1EClass, EU_CENTRAL_1__REGION_NAME);

		ap_northeast_1EClass = createEClass(AP_NORTHEAST_1);
		createEAttribute(ap_northeast_1EClass, AP_NORTHEAST_1__COUNTRY);
		createEAttribute(ap_northeast_1EClass, AP_NORTHEAST_1__REGION_NAME);
		createEAttribute(ap_northeast_1EClass, AP_NORTHEAST_1__REGION_ID);
		createEAttribute(ap_northeast_1EClass, AP_NORTHEAST_1__CITY);
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
		RegionsPackage theRegionsPackage = (RegionsPackage)EPackage.Registry.INSTANCE.getEPackage(RegionsPackage.eNS_URI);
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		us_east_2EClass.getESuperTypes().add(theRegionsPackage.getNorthamerica());
		us_east_2EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		us_east_1EClass.getESuperTypes().add(theRegionsPackage.getNorthamerica());
		us_east_1EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		eu_west_3EClass.getESuperTypes().add(theRegionsPackage.getEurope());
		eu_west_3EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		us_west_1EClass.getESuperTypes().add(theRegionsPackage.getNorthamerica());
		us_west_1EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		eu_west_1EClass.getESuperTypes().add(theRegionsPackage.getEurope());
		eu_west_1EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ap_south_1EClass.getESuperTypes().add(theRegionsPackage.getAsiapacific());
		ap_south_1EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		sa_east_1EClass.getESuperTypes().add(theRegionsPackage.getSouthamerica());
		sa_east_1EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		us_west_2EClass.getESuperTypes().add(theRegionsPackage.getNorthamerica());
		us_west_2EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		eu_west_2EClass.getESuperTypes().add(theRegionsPackage.getEurope());
		eu_west_2EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ap_southeast_1EClass.getESuperTypes().add(theRegionsPackage.getAsiapacific());
		ap_southeast_1EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ca_central_1EClass.getESuperTypes().add(theRegionsPackage.getNorthamerica());
		ca_central_1EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ap_northeast_2EClass.getESuperTypes().add(theRegionsPackage.getAsiapacific());
		ap_northeast_2EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ap_south_east2EClass.getESuperTypes().add(theRegionsPackage.getAsiapacific());
		ap_south_east2EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		eu_central_1EClass.getESuperTypes().add(theRegionsPackage.getEurope());
		eu_central_1EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ap_northeast_1EClass.getESuperTypes().add(theRegionsPackage.getAsiapacific());
		ap_northeast_1EClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(us_east_2EClass, Us_east_2.class, "Us_east_2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUs_east_2_RegionName(), theOCCIPackage.getString(), "regionName", "US East (Ohio)", 0, 1, Us_east_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUs_east_2_Country(), theOCCIPackage.getString(), "country", "USA", 0, 1, Us_east_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUs_east_2_RegionId(), theOCCIPackage.getString(), "regionId", "us-east-2", 0, 1, Us_east_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUs_east_2_City(), theOCCIPackage.getString(), "city", "Columbus", 0, 1, Us_east_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(us_east_1EClass, Us_east_1.class, "Us_east_1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUs_east_1_RegionName(), theOCCIPackage.getString(), "regionName", "US East (N. Virginia)", 0, 1, Us_east_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUs_east_1_Country(), theOCCIPackage.getString(), "country", "USA", 0, 1, Us_east_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUs_east_1_RegionId(), theOCCIPackage.getString(), "regionId", "us-east-1", 0, 1, Us_east_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUs_east_1_City(), theOCCIPackage.getString(), "city", "Ashburn, Sterling, Charlottesville", 0, 1, Us_east_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eu_west_3EClass, Eu_west_3.class, "Eu_west_3", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEu_west_3_RegionName(), theOCCIPackage.getString(), "regionName", "EU (Paris)", 0, 1, Eu_west_3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEu_west_3_Country(), theOCCIPackage.getString(), "country", "France", 0, 1, Eu_west_3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEu_west_3_RegionId(), theOCCIPackage.getString(), "regionId", "eu-west-3", 0, 1, Eu_west_3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEu_west_3_City(), theOCCIPackage.getString(), "city", "Paris", 0, 1, Eu_west_3.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(us_west_1EClass, Us_west_1.class, "Us_west_1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUs_west_1_RegionName(), theOCCIPackage.getString(), "regionName", "US West (N. California)", 0, 1, Us_west_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUs_west_1_Country(), theOCCIPackage.getString(), "country", "USA", 0, 1, Us_west_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUs_west_1_RegionId(), theOCCIPackage.getString(), "regionId", "us-west-1", 0, 1, Us_west_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUs_west_1_City(), theOCCIPackage.getString(), "city", "Palo Alto", 0, 1, Us_west_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eu_west_1EClass, Eu_west_1.class, "Eu_west_1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEu_west_1_RegionName(), theOCCIPackage.getString(), "regionName", "EU (Ireland)", 0, 1, Eu_west_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEu_west_1_Country(), theOCCIPackage.getString(), "country", "Ireland", 0, 1, Eu_west_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEu_west_1_RegionId(), theOCCIPackage.getString(), "regionId", "eu-west-1", 0, 1, Eu_west_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEu_west_1_City(), theOCCIPackage.getString(), "city", "Dublin", 0, 1, Eu_west_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ap_south_1EClass, Ap_south_1.class, "Ap_south_1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAp_south_1_Country(), theOCCIPackage.getString(), "country", "India", 0, 1, Ap_south_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAp_south_1_RegionName(), theOCCIPackage.getString(), "regionName", "Asia Pacific (Mumbai)", 0, 1, Ap_south_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAp_south_1_RegionId(), theOCCIPackage.getString(), "regionId", "ap-south-1", 0, 1, Ap_south_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAp_south_1_City(), theOCCIPackage.getString(), "city", "Bombay", 0, 1, Ap_south_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sa_east_1EClass, Sa_east_1.class, "Sa_east_1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSa_east_1_Country(), theOCCIPackage.getString(), "country", "Brazil", 0, 1, Sa_east_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSa_east_1_RegionName(), theOCCIPackage.getString(), "regionName", "South America (S\u00e3o Paulo)", 0, 1, Sa_east_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSa_east_1_RegionId(), theOCCIPackage.getString(), "regionId", "sa-east-1", 0, 1, Sa_east_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSa_east_1_City(), theOCCIPackage.getString(), "city", "S\u00e3o Paulo", 0, 1, Sa_east_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(us_west_2EClass, Us_west_2.class, "Us_west_2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUs_west_2_RegionName(), theOCCIPackage.getString(), "regionName", "US West (Oregon)", 0, 1, Us_west_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUs_west_2_Country(), theOCCIPackage.getString(), "country", "USA", 0, 1, Us_west_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUs_west_2_RegionId(), theOCCIPackage.getString(), "regionId", "us-west-2", 0, 1, Us_west_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUs_west_2_City(), theOCCIPackage.getString(), "city", "Oregon", 0, 1, Us_west_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eu_west_2EClass, Eu_west_2.class, "Eu_west_2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEu_west_2_RegionName(), theOCCIPackage.getString(), "regionName", "EU (London)", 0, 1, Eu_west_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEu_west_2_Country(), theOCCIPackage.getString(), "country", "United Kingdom", 0, 1, Eu_west_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEu_west_2_RegionId(), theOCCIPackage.getString(), "regionId", "eu-west-2", 0, 1, Eu_west_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEu_west_2_City(), theOCCIPackage.getString(), "city", "London", 0, 1, Eu_west_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ap_southeast_1EClass, Ap_southeast_1.class, "Ap_southeast_1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAp_southeast_1_Country(), theOCCIPackage.getString(), "country", "Singapore", 0, 1, Ap_southeast_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAp_southeast_1_RegionName(), theOCCIPackage.getString(), "regionName", "Asia Pacific (Singapore)", 0, 1, Ap_southeast_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAp_southeast_1_RegionId(), theOCCIPackage.getString(), "regionId", "ap-southeast-1", 0, 1, Ap_southeast_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAp_southeast_1_City(), theOCCIPackage.getString(), "city", "Singapore", 0, 1, Ap_southeast_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ca_central_1EClass, Ca_central_1.class, "Ca_central_1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCa_central_1_RegionName(), theOCCIPackage.getString(), "regionName", "Canada (Central)", 0, 1, Ca_central_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCa_central_1_Country(), theOCCIPackage.getString(), "country", "Canada", 0, 1, Ca_central_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCa_central_1_RegionId(), theOCCIPackage.getString(), "regionId", "ca-central-1", 0, 1, Ca_central_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCa_central_1_City(), theOCCIPackage.getString(), "city", "Toronto", 0, 1, Ca_central_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ap_northeast_2EClass, Ap_northeast_2.class, "Ap_northeast_2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAp_northeast_2_Country(), theOCCIPackage.getString(), "country", "South Korea", 0, 1, Ap_northeast_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAp_northeast_2_RegionName(), theOCCIPackage.getString(), "regionName", "Asia Pacific (Seoul)", 0, 1, Ap_northeast_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAp_northeast_2_RegionId(), theOCCIPackage.getString(), "regionId", "ap-northeast-2", 0, 1, Ap_northeast_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAp_northeast_2_City(), theOCCIPackage.getString(), "city", "Seoul", 0, 1, Ap_northeast_2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ap_south_east2EClass, Ap_south_east2.class, "Ap_south_east2", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAp_south_east2_Country(), theOCCIPackage.getString(), "country", "Australia", 0, 1, Ap_south_east2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAp_south_east2_RegionName(), theOCCIPackage.getString(), "regionName", "Asia Pacific (Sydney)", 0, 1, Ap_south_east2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAp_south_east2_RegionId(), theOCCIPackage.getString(), "regionId", "ap-southeast-2", 0, 1, Ap_south_east2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAp_south_east2_City(), theOCCIPackage.getString(), "city", "Sydney", 0, 1, Ap_south_east2.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eu_central_1EClass, Eu_central_1.class, "Eu_central_1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEu_central_1_Country(), theOCCIPackage.getString(), "country", "Germany", 0, 1, Eu_central_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEu_central_1_RegionId(), theOCCIPackage.getString(), "regionId", "eu-central-1", 0, 1, Eu_central_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEu_central_1_City(), theOCCIPackage.getString(), "city", "Frankfurt", 0, 1, Eu_central_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEu_central_1_RegionName(), theOCCIPackage.getString(), "regionName", "EU (Frankfurt)", 0, 1, Eu_central_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ap_northeast_1EClass, Ap_northeast_1.class, "Ap_northeast_1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAp_northeast_1_Country(), theOCCIPackage.getString(), "country", "Japan", 0, 1, Ap_northeast_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAp_northeast_1_RegionName(), theOCCIPackage.getString(), "regionName", "Asia Pacific (Tokyo)", 0, 1, Ap_northeast_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAp_northeast_1_RegionId(), theOCCIPackage.getString(), "regionId", "ap-northeast-1", 0, 1, Ap_northeast_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAp_northeast_1_City(), theOCCIPackage.getString(), "city", "Tokyo", 0, 1, Ap_northeast_1.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
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
	}

} //AwsregionsPackageImpl
