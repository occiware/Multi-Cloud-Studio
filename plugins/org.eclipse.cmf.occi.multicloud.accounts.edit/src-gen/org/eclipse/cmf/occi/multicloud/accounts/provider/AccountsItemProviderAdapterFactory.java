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
package org.eclipse.cmf.occi.multicloud.accounts.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.cmf.occi.multicloud.accounts.util.AccountsAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AccountsItemProviderAdapterFactory extends AccountsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.accounts.Cloudaccount} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudaccountItemProvider cloudaccountItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.accounts.Cloudaccount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCloudaccountAdapter() {
		if (cloudaccountItemProvider == null) {
			cloudaccountItemProvider = new CloudaccountItemProvider(this);
		}

		return cloudaccountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.accounts.Cloudaccountlink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudaccountlinkItemProvider cloudaccountlinkItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.accounts.Cloudaccountlink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCloudaccountlinkAdapter() {
		if (cloudaccountlinkItemProvider == null) {
			cloudaccountlinkItemProvider = new CloudaccountlinkItemProvider(this);
		}

		return cloudaccountlinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.accounts.Basiccredential} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasiccredentialItemProvider basiccredentialItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.accounts.Basiccredential}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBasiccredentialAdapter() {
		if (basiccredentialItemProvider == null) {
			basiccredentialItemProvider = new BasiccredentialItemProvider(this);
		}

		return basiccredentialItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.accounts.Certificatecredential} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertificatecredentialItemProvider certificatecredentialItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.accounts.Certificatecredential}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCertificatecredentialAdapter() {
		if (certificatecredentialItemProvider == null) {
			certificatecredentialItemProvider = new CertificatecredentialItemProvider(this);
		}

		return certificatecredentialItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.accounts.Keypaircredential} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeypaircredentialItemProvider keypaircredentialItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.accounts.Keypaircredential}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createKeypaircredentialAdapter() {
		if (keypaircredentialItemProvider == null) {
			keypaircredentialItemProvider = new KeypaircredentialItemProvider(this);
		}

		return keypaircredentialItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cmf.occi.multicloud.accounts.Cloudcredential} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudcredentialItemProvider cloudcredentialItemProvider;

	/**
	 * This creates an adapter for a {@link org.eclipse.cmf.occi.multicloud.accounts.Cloudcredential}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCloudcredentialAdapter() {
		if (cloudcredentialItemProvider == null) {
			cloudcredentialItemProvider = new CloudcredentialItemProvider(this);
		}

		return cloudcredentialItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (cloudaccountItemProvider != null) cloudaccountItemProvider.dispose();
		if (cloudaccountlinkItemProvider != null) cloudaccountlinkItemProvider.dispose();
		if (basiccredentialItemProvider != null) basiccredentialItemProvider.dispose();
		if (certificatecredentialItemProvider != null) certificatecredentialItemProvider.dispose();
		if (keypaircredentialItemProvider != null) keypaircredentialItemProvider.dispose();
		if (cloudcredentialItemProvider != null) cloudcredentialItemProvider.dispose();
	}

}
