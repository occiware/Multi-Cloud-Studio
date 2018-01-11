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
 * Generated at Wed Jan 10 16:11:17 CET 2018 from platform:/resource/org.eclipse.cmf.occi.multicloud.aws.ec2/model/ec2.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.aws.ec2.connector;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.eclipse.cmf.occi.infrastructure.Architecture;
import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.infrastructure.RestartMethod;
import org.eclipse.cmf.occi.infrastructure.SaveMethod;
import org.eclipse.cmf.occi.infrastructure.StopMethod;
import org.eclipse.cmf.occi.infrastructure.SuspendMethod;
import org.eclipse.cmf.occi.multicloud.aws.ec2.AWSInstanceState;
import org.eclipse.cmf.occi.multicloud.aws.ec2.HypervisorType;
import org.eclipse.cmf.occi.multicloud.aws.ec2.InstanceLifeCycleType;
import org.eclipse.cmf.occi.multicloud.aws.ec2.MonitoringState;
import org.eclipse.cmf.occi.multicloud.aws.ec2.VirtualizationType;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.driver.InstanceHelper;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.driver.KeyPairHelper;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.exceptions.AwsAccountModelException;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.exceptions.AwsOperationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;

import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.ec2.model.InstanceLifecycleType;
import com.amazonaws.services.ec2.model.InstanceState;
import com.amazonaws.services.ec2.model.KeyPairInfo;
import com.amazonaws.services.ec2.model.Tag;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/infrastructure/aws# - term: instanceec2 - title:
 */
public class Instanceec2Connector extends org.eclipse.cmf.occi.multicloud.aws.ec2.impl.Instanceec2Impl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(Instanceec2Connector.class);

	// Message to end users management.
	private String titleMessage = "";
	private String globalMessage = "";
	private Level levelMessage = null;

	// Start of user code Instanceec2connector_constructor
	/**
	 * Constructs a instanceec2 connector.
	 */
	Instanceec2Connector() {
		LOGGER.debug("Constructor called on " + this);
		System.out.println("Instanceec2Connector constructor called ==> " + this);
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//

	// Start of user code Instanceec2occiCreate
	/**
	 * Called when this Instanceec2 instance is completely created.
	 */
	@Override
	public void occiCreate() {
		// This will create EC2 instance, if this instance doesnt already exist on this
		// region for this instanceId.
		LOGGER.debug("occiCreate() called on " + this);
		titleMessage = "Create a new instance : " + getTitle();
		createCompute();

	}
	// End of user code

	// Start of user code Instanceec2_occiRetrieve_method
	/**
	 * Called when this Instanceec2 instance must be retrieved.
	 */
	@Override
	public void occiRetrieve() {
		LOGGER.debug("occiRetrieve() called on " + this);
		retrieveCompute();
	}
	// End of user code

	// Start of user code Instanceec2_occiUpdate_method
	/**
	 * Called when this Instanceec2 instance is completely updated.
	 */
	@Override
	public void occiUpdate() {
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Instanceec2occiDelete_method
	/**
	 * Called when this Instanceec2 instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		
	}
	// End of user code

	//
	// Instanceec2 actions.
	//

	// Start of user code Instanceec2_Kind_Start_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/compute/action# - term: start -
	 * title: Start the system
	 */
	@Override
	public void start() {
		LOGGER.debug("Action start() called on " + this);

		// TODO: Implement how to start this instanceec2.
	}

	// End of user code
	// Start of user code Instanceec2_Kind_Restart_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/compute/action# - term: restart -
	 * title: Restart the system (graceful, warm or cold)
	 */
	@Override
	public void restart(final RestartMethod method) {
		LOGGER.debug("Action restart(" + "method=" + method + ") called on " + this);

		// TODO: Implement how to restart this instanceec2.
	}

	// End of user code
	// Start of user code Instanceec2_Kind_Suspend_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/compute/action# - term: suspend -
	 * title: Suspend the system (hibernate or in RAM)
	 */
	@Override
	public void suspend(final SuspendMethod method) {
		LOGGER.debug("Action suspend(" + "method=" + method + ") called on " + this);

		// TODO: Implement how to suspend this instanceec2.
	}

	// End of user code
	// Start of user code Instanceec2_Kind_terminate_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://occiware.org/occi/infrastructure/aws/instanceec2/action# - term:
	 * terminate - title: Terminate - delete the instance on provider
	 */
	@Override
	public void terminate() {
		LOGGER.debug("Action terminate() called on " + this);

		// TODO: Implement how to terminate this instanceec2.
	}

	// End of user code
	// Start of user code Instanceec2_Kind_Save_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/compute/action# - term: save -
	 * title: Save the system (hot, deferred)
	 */
	@Override
	public void save(final SaveMethod method, final String name) {
		LOGGER.debug("Action save(" + "method=" + method + "name=" + name + ") called on " + this);

		// TODO: Implement how to save this instanceec2.
	}

	// End of user code
	// Start of user code Instanceec2_Kind_Stop_action
	/**
	 * Implement OCCI action: - scheme:
	 * http://schemas.ogf.org/occi/infrastructure/compute/action# - term: stop -
	 * title: Stop the system (graceful, acpioff or poweroff)
	 */
	@Override
	public void stop(final StopMethod method) {
		LOGGER.debug("Action stop(" + "method=" + method + ") called on " + this);

		// TODO: Implement how to stop this instanceec2.
	}

	// End of user code

	// Start of user code createCompute
	public void createCompute() {
		try {
			if (!getClientInstance().checkConnection(this)) {

				// Must return true if connection is established.
				globalMessage = "No connection to aws has been established, please check your credentials or your configuration.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
				return;

			}

			if (this.getInstanceId() != null) {
				// check if it already exist.

			}
		} catch (AwsAccountModelException ex) {
			throw new RuntimeException(ex.getMessage());
		}
	}
	// End of user code

	// Start of user code getClientInstance
	/**
	 * For resource satellite, it uses the same client.
	 * 
	 * @return
	 */
	public AwsEC2Client getClientInstance() throws AwsAccountModelException {
		return ModelUtils.getClientInstance(this);
	}
	// End of user code
	
	// Start of user code retrieveCompute
	public void retrieveCompute() {
		
		try {
			AwsEC2Client ec2Client = getClientInstance();
			if (ec2Client != null) {
				// Retrieve infos.
				Instance instance = InstanceHelper.retrieveEC2Instance(this.getInstanceId(), this.getName(), ec2Client);
				if (instance != null) {
					
					// set attribute from cloud provider.
					this.setImageId(instance.getImageId());
					this.setInstanceId(instance.getInstanceId());
					this.setAmiLaunchIndex(instance.getAmiLaunchIndex());
					// instance aws state.
					AWSInstanceState awsState = AWSInstanceState.getByName(instance.getState().getName());
					// OCCI Compute state (error, active, inactive, suspended)
					this.setOcciComputeState(determineOcciComputeStatus(awsState));
					
					this.setAwsInstanceStatus(awsState);
					this.setEbsOptimizedIO(instance.getEbsOptimized());
					this.setEnaSupport(instance.getEnaSupport());
					// Hypervisor type (xen etc.)
					this.setHypervisor(HypervisorType.getByName(instance.getHypervisor()));
					this.setInstanceLifeCycle(InstanceLifeCycleType.getByName(instance.getInstanceLifecycle()));
					this.setInstanceType(instance.getInstanceType());
					this.setKernelId(instance.getKernelId());
					this.setKeyPairName(instance.getKeyName());
					
					// Launch time, formatted with current locale like (24/01/2018 22:45).
					Locale locale = Locale.getDefault();
					DateFormat launchTimeFrmt = DateFormat.getDateTimeInstance(
							DateFormat.SHORT,
							DateFormat.SHORT, locale);
					this.setLaunchTime(launchTimeFrmt.format(instance.getLaunchTime().getTime()));
					
					// MonitoringState
					this.setMonitoringState(MonitoringState.getByName(instance.getMonitoring().getState()));
					
					// Read tag "name".
					List<Tag> tags = instance.getTags();
					for (Tag tag : tags) {
						if (tag.getKey().equals("name")) {
							this.setName(tag.getValue());
							break;
						}
					}
					// architecture from aws : i386 | x86_64
					String awsArchitecture = instance.getArchitecture();
					Architecture occiArch;
					if (awsArchitecture.equals("i386")) {
						occiArch = Architecture.X86;
					} else {
						occiArch = Architecture.X64;
					}
					this.setOcciComputeArchitecture(occiArch);
					// Occi compute core, this follow the resource_template applied.
					
					String host = instance.getPrivateDnsName().split("\\.")[0];
					// TODO : Check if it can be retrieve via EC2_METADATA_INSTANCE, cf https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/util/EC2MetadataUtils.html
					this.setOcciComputeHostname(host);
					this.setOcciComputeShare(0);
					// How to use occi compute speed ? via Monitoring ?
					this.setOcciComputeSpeed(0.0f);
					
					String stateMessage = null;
					if (instance.getStateReason() != null && instance.getStateReason().getCode() != null && instance.getStateReason().getMessage() != null) {
						stateMessage = instance.getStateReason().getCode() + " --> " + instance.getStateReason().getMessage();
					}
					if (instance.getStateTransitionReason() != null) {
						stateMessage = stateMessage + "->" + instance.getStateTransitionReason();
					}
					
					if (stateMessage != null) {
						this.setOcciComputeStateMessage(stateMessage);
					}
					
					this.setPlatform(instance.getPlatform());
					this.setPrivateDNSName(instance.getPrivateDnsName());
					this.setPrivateIpV4Address(instance.getPrivateIpAddress());
					this.setPublicDNSName(instance.getPublicDnsName());
					this.setPublicIpv4Address(instance.getPublicIpAddress());
					this.setRamDiskId(instance.getRamdiskId());
					// TODO : How to active sriovnetsupport ? see : https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/sriov-networking.html
					this.setSriovNetSupport(instance.getSriovNetSupport());
					
					this.setVirtualizationType(VirtualizationType.getByName(instance.getVirtualizationType()));
					this.setZoneName(instance.getPlacement().getAvailabilityZone());
					
					// TODO : Update mixin values if mixin applied.
					// InstanceVPCInfo
					// PlacementGroup
					// RootDeviceVolume
					// StatusTransitionReason
					
					
					
					
				} else {
					LOGGER.warn("instance doesnt exist on your aws account.");
					this.setAwsInstanceStatus(AWSInstanceState.NOTEXIST);
					this.setOcciComputeState(ComputeStatus.INACTIVE);
				}

			}
			
		} catch (AwsOperationException ex) {
			throw new RuntimeException(ex.getCause().getMessage());
		} catch (AwsAccountModelException ex) {
			throw new RuntimeException(ex.getMessage());
		}
		
	}
	// End of user code
	
	// Start of user code determineOcciComputeStatus
	/**
	 * Aws status to Occi status.
	 * @param awsState
	 * @return a ComputeStatus
	 */
	private ComputeStatus determineOcciComputeStatus(AWSInstanceState awsState) {
		ComputeStatus result = ComputeStatus.INACTIVE;
		switch (awsState) {
		case NOTEXIST:
			result = ComputeStatus.INACTIVE;
			break;
		case PENDING:
			result = ComputeStatus.ACTIVE;
			break;
		case REBOOTING:
			result = ComputeStatus.ACTIVE;
			break;
		case STOPPING:
			result = ComputeStatus.INACTIVE;
			break;
		case RUNNING:
			result = ComputeStatus.ACTIVE;
			break;
		case SHUTTINGDOWN:
			result = ComputeStatus.INACTIVE;
			break;
		case STOPPED:
			result = ComputeStatus.INACTIVE;
			break;
		case TERMINATED :
			result = ComputeStatus.INACTIVE;
			break;
		}
		return result;
	}
	// End of user code
	
}
