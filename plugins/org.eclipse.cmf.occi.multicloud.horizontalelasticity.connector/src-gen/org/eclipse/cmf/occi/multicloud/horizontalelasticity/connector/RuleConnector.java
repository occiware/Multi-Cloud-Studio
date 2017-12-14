/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Mon Dec 11 12:24:18 CET 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.horizontalelasticity/model/horizontalelasticity.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.horizontalelasticity.connector;

import java.util.List;

import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.Cpuutilisation;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.ElasticitycontrollerImpl;
import org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl;
import org.eclipse.emf.common.util.EList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.horizontalelasticity#
 * - term: rule
 * - title: 
 */
public class RuleConnector extends org.eclipse.cmf.occi.multicloud.horizontalelasticity.impl.RuleImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(RuleConnector.class);

	// Start of user code Ruleconnector_constructor
	/**
	 * Constructs a rule connector.
	 */
	RuleConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code RuleocciCreate
	/**
	 * Called when this Rule instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		System.out.println("This has nothing with the implementation, just a test");
		//Resource res = (Resource) this.eContainer();
		//RuleImpl rule = (RuleImpl) res;
		//RuleConnector ruleconnector = (RuleConnector)rule;
		
		//List<MixinBase> mixinsBase = ruleconnector.getParts();
		String metric = "";
		EList<MixinBase> mixinsBase =this.getParts();
		for (MixinBase mixin:mixinsBase) {
			System.out.println("mixin " + mixin);
			
			System.out.println("mixin.getClass().getName() " + mixin.getClass().getName().substring(63).toLowerCase());
	
		}
		System.out.println("mixinsBase" + mixinsBase);
	///	if (mixinsBase instanceof Cpuutilisation) {
	///		Cpuutilisation cpu = (Cpuutilisation) mixinsBase;
	///		System.out.println(" cpuutilisationm" + cpu);
	///	}
		
		///metric = mixinsBase.getClass().getName();
		///System.out.println("mixinsBase.getClass().getName()" + mixinsBase.getClass().getName());
		
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Rule_occiRetrieve_method
	/**
	 * Called when this Rule instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Rule_occiUpdate_method
	/**
	 * Called when this Rule instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code RuleocciDelete_method
	/**
	 * Called when this Rule instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Rule actions.
	//

		


}	
