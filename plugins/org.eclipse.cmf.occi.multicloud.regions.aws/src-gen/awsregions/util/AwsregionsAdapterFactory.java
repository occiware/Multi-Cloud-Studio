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
package awsregions.util;

import awsregions.*;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.cmf.occi.multicloud.regions.Asiapacific;
import org.eclipse.cmf.occi.multicloud.regions.Europe;
import org.eclipse.cmf.occi.multicloud.regions.Northamerica;
import org.eclipse.cmf.occi.multicloud.regions.Region;
import org.eclipse.cmf.occi.multicloud.regions.Southamerica;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see awsregions.AwsregionsPackage
 * @generated
 */
public class AwsregionsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AwsregionsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AwsregionsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AwsregionsPackage.eINSTANCE;
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
	protected AwsregionsSwitch<Adapter> modelSwitch =
		new AwsregionsSwitch<Adapter>() {
			@Override
			public Adapter caseUs_east_2(Us_east_2 object) {
				return createUs_east_2Adapter();
			}
			@Override
			public Adapter caseUs_east_1(Us_east_1 object) {
				return createUs_east_1Adapter();
			}
			@Override
			public Adapter caseEu_west_3(Eu_west_3 object) {
				return createEu_west_3Adapter();
			}
			@Override
			public Adapter caseUs_west_1(Us_west_1 object) {
				return createUs_west_1Adapter();
			}
			@Override
			public Adapter caseEu_west_1(Eu_west_1 object) {
				return createEu_west_1Adapter();
			}
			@Override
			public Adapter caseAp_south_1(Ap_south_1 object) {
				return createAp_south_1Adapter();
			}
			@Override
			public Adapter caseSa_east_1(Sa_east_1 object) {
				return createSa_east_1Adapter();
			}
			@Override
			public Adapter caseUs_west_2(Us_west_2 object) {
				return createUs_west_2Adapter();
			}
			@Override
			public Adapter caseEu_west_2(Eu_west_2 object) {
				return createEu_west_2Adapter();
			}
			@Override
			public Adapter caseAp_southeast_1(Ap_southeast_1 object) {
				return createAp_southeast_1Adapter();
			}
			@Override
			public Adapter caseCa_central_1(Ca_central_1 object) {
				return createCa_central_1Adapter();
			}
			@Override
			public Adapter caseAp_northeast_2(Ap_northeast_2 object) {
				return createAp_northeast_2Adapter();
			}
			@Override
			public Adapter caseAp_south_east2(Ap_south_east2 object) {
				return createAp_south_east2Adapter();
			}
			@Override
			public Adapter caseEu_central_1(Eu_central_1 object) {
				return createEu_central_1Adapter();
			}
			@Override
			public Adapter caseAp_northeast_1(Ap_northeast_1 object) {
				return createAp_northeast_1Adapter();
			}
			@Override
			public Adapter caseMixinBase(MixinBase object) {
				return createMixinBaseAdapter();
			}
			@Override
			public Adapter caseRegion(Region object) {
				return createRegionAdapter();
			}
			@Override
			public Adapter caseNorthamerica(Northamerica object) {
				return createNorthamericaAdapter();
			}
			@Override
			public Adapter caseEurope(Europe object) {
				return createEuropeAdapter();
			}
			@Override
			public Adapter caseAsiapacific(Asiapacific object) {
				return createAsiapacificAdapter();
			}
			@Override
			public Adapter caseSouthamerica(Southamerica object) {
				return createSouthamericaAdapter();
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
	 * Creates a new adapter for an object of class '{@link awsregions.Us_east_2 <em>Us east 2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see awsregions.Us_east_2
	 * @generated
	 */
	public Adapter createUs_east_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link awsregions.Us_east_1 <em>Us east 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see awsregions.Us_east_1
	 * @generated
	 */
	public Adapter createUs_east_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link awsregions.Eu_west_3 <em>Eu west 3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see awsregions.Eu_west_3
	 * @generated
	 */
	public Adapter createEu_west_3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link awsregions.Us_west_1 <em>Us west 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see awsregions.Us_west_1
	 * @generated
	 */
	public Adapter createUs_west_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link awsregions.Eu_west_1 <em>Eu west 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see awsregions.Eu_west_1
	 * @generated
	 */
	public Adapter createEu_west_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link awsregions.Ap_south_1 <em>Ap south 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see awsregions.Ap_south_1
	 * @generated
	 */
	public Adapter createAp_south_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link awsregions.Sa_east_1 <em>Sa east 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see awsregions.Sa_east_1
	 * @generated
	 */
	public Adapter createSa_east_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link awsregions.Us_west_2 <em>Us west 2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see awsregions.Us_west_2
	 * @generated
	 */
	public Adapter createUs_west_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link awsregions.Eu_west_2 <em>Eu west 2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see awsregions.Eu_west_2
	 * @generated
	 */
	public Adapter createEu_west_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link awsregions.Ap_southeast_1 <em>Ap southeast 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see awsregions.Ap_southeast_1
	 * @generated
	 */
	public Adapter createAp_southeast_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link awsregions.Ca_central_1 <em>Ca central 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see awsregions.Ca_central_1
	 * @generated
	 */
	public Adapter createCa_central_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link awsregions.Ap_northeast_2 <em>Ap northeast 2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see awsregions.Ap_northeast_2
	 * @generated
	 */
	public Adapter createAp_northeast_2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link awsregions.Ap_south_east2 <em>Ap south east2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see awsregions.Ap_south_east2
	 * @generated
	 */
	public Adapter createAp_south_east2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link awsregions.Eu_central_1 <em>Eu central 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see awsregions.Eu_central_1
	 * @generated
	 */
	public Adapter createEu_central_1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link awsregions.Ap_northeast_1 <em>Ap northeast 1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see awsregions.Ap_northeast_1
	 * @generated
	 */
	public Adapter createAp_northeast_1Adapter() {
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.regions.Region <em>Region</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Region
	 * @generated
	 */
	public Adapter createRegionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.regions.Northamerica <em>Northamerica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Northamerica
	 * @generated
	 */
	public Adapter createNorthamericaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.regions.Europe <em>Europe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Europe
	 * @generated
	 */
	public Adapter createEuropeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.regions.Asiapacific <em>Asiapacific</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Asiapacific
	 * @generated
	 */
	public Adapter createAsiapacificAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.cmf.occi.multicloud.regions.Southamerica <em>Southamerica</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.cmf.occi.multicloud.regions.Southamerica
	 * @generated
	 */
	public Adapter createSouthamericaAdapter() {
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

} //AwsregionsAdapterFactory
