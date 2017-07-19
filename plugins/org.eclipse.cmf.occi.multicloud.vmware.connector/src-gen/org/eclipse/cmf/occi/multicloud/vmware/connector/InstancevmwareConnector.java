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
 * Generated at Wed Jul 19 15:09:17 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.vmware/model/vmware.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.vmware.connector;

import org.eclipse.cmf.occi.infrastructure.RestartMethod;
import org.eclipse.cmf.occi.infrastructure.SaveMethod;
import org.eclipse.cmf.occi.infrastructure.StopMethod;
import org.eclipse.cmf.occi.infrastructure.SuspendMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/infrastructure/vmware#
 * - term: instancevmware
 * - title: 
 */
public class InstancevmwareConnector extends org.eclipse.cmf.occi.multicloud.vmware.impl.InstancevmwareImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(InstancevmwareConnector.class);

	// Start of user code Instancevmwareconnector_constructor
	/**
	 * Constructs a instancevmware connector.
	 */
	InstancevmwareConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code InstancevmwareocciCreate
	/**
	 * Called when this Instancevmware instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Instancevmware_occiRetrieve_method
	/**
	 * Called when this Instancevmware instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Instancevmware_occiUpdate_method
	/**
	 * Called when this Instancevmware instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code InstancevmwareocciDelete_method
	/**
	 * Called when this Instancevmware instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code
	
	//
	// Instancevmware actions.
	//
	/* (non-Javadoc)
	 * @see org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#start()
	 */
	@Override
	public void start() {
		
		// TODO Auto-generated method stub
		super.start();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#stop(org.eclipse.cmf.occi.infrastructure.StopMethod)
	 */
	@Override
	public void stop(StopMethod method) {
		// TODO Auto-generated method stub
		super.stop(method);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#restart(org.eclipse.cmf.occi.infrastructure.RestartMethod)
	 */
	@Override
	public void restart(RestartMethod method) {
		// TODO Auto-generated method stub
		super.restart(method);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#suspend(org.eclipse.cmf.occi.infrastructure.SuspendMethod)
	 */
	@Override
	public void suspend(SuspendMethod method) {
		// TODO Auto-generated method stub
		super.suspend(method);
	}

	/* (non-Javadoc)
	 * @see org.eclipse.cmf.occi.infrastructure.impl.ComputeImpl#save(org.eclipse.cmf.occi.infrastructure.SaveMethod, java.lang.String)
	 */
	@Override
	public void save(SaveMethod method, String name) {
		// TODO Auto-generated method stub
		super.save(method, name);
	}
}	
