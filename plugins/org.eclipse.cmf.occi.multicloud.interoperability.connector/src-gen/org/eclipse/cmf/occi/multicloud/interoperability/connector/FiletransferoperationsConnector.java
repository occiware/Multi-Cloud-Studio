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
 * Generated at Fri Jan 12 17:18:23 CET 2018 from platform:/resource/org.eclipse.cmf.occi.multicloud.interoperability/model/interoperability.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.interoperability.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://occiware.org/occi/multicloud/specialfeatures#
 * - term: filetransferoperations
 * - title: 
 */
public class FiletransferoperationsConnector extends org.eclipse.cmf.occi.multicloud.interoperability.impl.FiletransferoperationsImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(FiletransferoperationsConnector.class);

	// Start of user code Filetransferoperationsconnector_constructor
	/**
	 * Constructs a filetransferoperations connector.
	 */
	FiletransferoperationsConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code FiletransferoperationsocciCreate
	/**
	 * Called when this Filetransferoperations instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Filetransferoperations_occiRetrieve_method
	/**
	 * Called when this Filetransferoperations instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Filetransferoperations_occiUpdate_method
	/**
	 * Called when this Filetransferoperations instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code FiletransferoperationsocciDelete_method
	/**
	 * Called when this Filetransferoperations instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Filetransferoperations actions.
	//

	// Start of user code Filetransferoperations_Kind_copy_action
	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/multicloud/specialfeatures/datatransferoperations/action#
     * - term: copy
     * - title: 
	 */
	@Override
	public void copy()
	{
		LOGGER.debug("Action copy() called on " + this);

		// TODO: Implement how to copy this filetransferoperations.
	}
	// End of user code
	// Start of user code Filetransferoperations_Kind_cancel_action
	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/multicloud/specialfeatures/filetransferoperations/action#
     * - term: cancel
     * - title: 
	 */
	@Override
	public void cancel()
	{
		LOGGER.debug("Action cancel() called on " + this);

		// TODO: Implement how to cancel this filetransferoperations.
	}
	// End of user code
	// Start of user code Filetransferoperations_Kind_encryptAndCopy_action
	/**
	 * Implement OCCI action:
     * - scheme: http://occiware.org/occi/multicloud/specialfeatures/filetransferoperations/action#
     * - term: encryptandcopy
     * - title: 
	 */
	@Override
	public void encryptandcopy()
	{
		LOGGER.debug("Action encryptandcopy() called on " + this);

		// TODO: Implement how to encryptandcopy this filetransferoperations.
	}
	// End of user code
		


}	
