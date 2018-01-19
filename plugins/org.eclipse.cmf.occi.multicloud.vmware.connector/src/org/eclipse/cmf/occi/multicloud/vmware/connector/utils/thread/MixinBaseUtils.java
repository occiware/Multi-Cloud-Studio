/**
 * Copyright (c) 2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 */
package org.eclipse.cmf.occi.multicloud.vmware.connector.utils.thread;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.cmf.occi.core.AttributeState;
import org.eclipse.cmf.occi.core.Entity;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.MixinBase;
import org.eclipse.cmf.occi.core.OCCIFactory;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.multicloud.accounts.Cloudaccount;
import org.eclipse.cmf.occi.multicloud.accounts.Cloudaccountlink;
import org.eclipse.cmf.occi.multicloud.vmware.Vcentercredential;
import org.eclipse.cmf.occi.multicloud.vmware.connector.Ssh_user_dataConnector;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @author Christophe Gourdin
 *
 */
public class MixinBaseUtils {
	private static Logger LOGGER = LoggerFactory.getLogger(MixinBaseUtils.class);

	private static final String DELETE_ATTR = "delete";
	private static final String ADD_ATTR = "add";
	private static final String UPDATE_ATTR = "update";
	
	
	/**
	 * Create, update or delete some attributes on model MixinBase.
	 *  
	 * @param mixinBase
	 * @param attrsToCreate 
	 * @param attrsToUpdate
	 * @param attrsToDelete
	 */
	public static void updateAttributes(final MixinBase mixinBase, final Map<String, String> attrsToCreate,
			final Map<String, String> attrsToUpdate, final List<String> attrsToDelete) {
		
		if (!UIDialog.isStandAlone()) {
			LOGGER.info("Updating attributes : UI Mode.");
			// Cloud designer usage.
			TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(mixinBase.eResource().getResourceSet());
			Command cmd = new RecordingCommand(domain) {
				@Override
				protected void doExecute() {
					executeOperations(mixinBase, attrsToCreate, attrsToUpdate, attrsToDelete);
				}
			};
			try {
				TransactionalCommandStack transactionCmd = (TransactionalCommandStack) domain.getCommandStack();
				transactionCmd.execute(cmd, null); // default options
			} catch (RollbackException rbe) {
				LOGGER.error(rbe.getStatus().toString());
			} catch (InterruptedException ex) {
				LOGGER.error(ex.getMessage());
			}
		} else {
			LOGGER.warn("This method (MixinBaseUtils.updateAttributes(....) must be called only on a designer environment (GUI) !");
		}
	}
	
	/**
	 * Launch update operations.
	 * @param MixinBase
	 * @param attrsToCreate
	 * @param attrsToUpdate
	 * @param attrsToDelete
	 */
	private static void executeOperations(MixinBase mixinBase, Map<String, String> attrsToCreate,
			Map<String, String> attrsToUpdate, List<String> attrsToDelete) {
		String attrName;
		String attrValue;
		
		for (Map.Entry<String, String> attr : attrsToCreate.entrySet()) {
			attrName = attr.getKey();
			attrValue = attr.getValue();
			LOGGER.info("attr to create : " + attr.getKey() + " ==> " + attr.getValue());
			
			AttributeState attrState = createAttribute(attrName, attrValue);
			executeOperation(mixinBase, ADD_ATTR, attrState, null, null);
		}
		for (Map.Entry<String, String> attr : attrsToUpdate.entrySet()) {
			attrName = attr.getKey();
			attrValue = attr.getValue();
			LOGGER.info("attr to update : " + attr.getKey() + " ==> " + attr.getValue());
			AttributeState attrState = getAttributeStateObject(mixinBase, attrName);
			executeOperation(mixinBase, UPDATE_ATTR, attrState, attrName, attrValue);
		}
		
		for (String name : attrsToDelete) {
			LOGGER.info("attr to delete : " + name);
			AttributeState attrState = getAttributeStateObject(mixinBase, name);
			executeOperation(mixinBase, DELETE_ATTR, attrState, name, null);
		}
		
		
	}

	private static void executeOperation(final MixinBase mixinBase, final String operation, final AttributeState attr,
			final String attrName, final String attrValue) {
		switch (operation) {
		case UPDATE_ATTR:

			if (attr != null) {
				attr.setValue(attrValue);
			}
			break;

		case DELETE_ATTR:

			Iterator<AttributeState> it = mixinBase.getAttributes().iterator();
			while (it.hasNext()) {
				if (it.next().equals(attr)) {
					it.remove();
					break;
				}
			}
			break;

		case ADD_ATTR:
			mixinBase.getAttributes().add(attr);
			break;
		}
	}

	/**
	 * Create an attribute without add this to the entity connector object.
	 * 
	 * @param name
	 * @param value
	 * @return AttributeState object.
	 */
	private static AttributeState createAttribute(final String name, final String value) {
		AttributeState attr = OCCIFactory.eINSTANCE.createAttributeState();
		attr.setName(name);
		attr.setValue(value);
		return attr;
	}

	/**
	 * Get an attribute state object for key parameter.
	 * 
	 * @param key
	 *            ex: occi.core.title.
	 * @return an AttributeState object, if attribute doesnt exist, null value
	 *         is returned.
	 */
	private static AttributeState getAttributeStateObject(MixinBase mixinBase, final String key) {
		AttributeState attr = null;
		if (key == null) {
			return attr;
		}
		// Load the corresponding attribute state.
		for (AttributeState attrState : mixinBase.getAttributes()) {
			if (attrState.getName().equals(key)) {
				attr = attrState;
				break;
			}
		}

		return attr;
	}
	
	/**
	 * Get the mixin base instance "vcentercredential" for a resource to apply
	 * 
	 * @return a vCenterCredential mixin, if none set, this will return a null value.
	 */
	public static Vcentercredential getVcenterCredMixin(Entity entity) {
		Cloudaccount cloudAccount = null;
		Vcentercredential vCred = null; 
		
		if (entity instanceof Cloudaccount) {
			cloudAccount = (Cloudaccount) entity;
			vCred = getVcenterCred(cloudAccount);
			return vCred;
		}
		
		// If entity is a link find if resource target or resource source has cloud account source resource set, if none return null.
		if (entity instanceof Link) {
			if (entity instanceof Cloudaccountlink) {
				cloudAccount = (Cloudaccount)((Cloudaccountlink)entity).getSource();
			} else {
				// Find cloudAccount on linked resources.
				Resource res = ((Link)entity).getSource();
				if (res instanceof Cloudaccount) {
					cloudAccount = (Cloudaccount)res;
				} else {
					List<Link> links = res.getRlinks();
					for (Link link : links) {
						if (link instanceof Cloudaccountlink) {
							cloudAccount = (Cloudaccount)((Cloudaccountlink)link).getSource();
							break;
						}
					}
				}
				
				
			}
			
		} else {
			// Entity is an instance of resource.
			Resource res = (Resource) entity;
			List<Link> links = res.getRlinks(); // Research on links from target resources.
			for (Link link : links) {
				if (link instanceof Cloudaccountlink) {
					cloudAccount = (Cloudaccount)((Cloudaccountlink)link).getSource();
					break;
				}
			}
		}
		
		vCred = getVcenterCred(cloudAccount);
		return vCred;
	}
	
	/**
	 * 
	 * @param cloudAccount
	 * @return null if none or if cloudAccount is null.
	 */
	public static Vcentercredential getVcenterCred(Cloudaccount cloudAccount) {
		if (cloudAccount == null) {
			return null;
		}
		List<MixinBase> mixinCreds = cloudAccount.getParts();
		Vcentercredential vCred = null;
		for (MixinBase mixinB : mixinCreds) {
			if (mixinB instanceof Vcentercredential) {
				vCred = (Vcentercredential) mixinB;
				break;
			}
		}
		return vCred;
	}
	
}
