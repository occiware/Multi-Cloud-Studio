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
import java.util.Optional;

import org.eclipse.cmf.occi.core.util.OcciHelper;
import org.eclipse.cmf.occi.infrastructure.Architecture;
import org.eclipse.cmf.occi.infrastructure.ComputeStatus;
import org.eclipse.cmf.occi.infrastructure.RestartMethod;
import org.eclipse.cmf.occi.infrastructure.SaveMethod;
import org.eclipse.cmf.occi.infrastructure.StopMethod;
import org.eclipse.cmf.occi.infrastructure.SuspendMethod;
import org.eclipse.cmf.occi.multicloud.aws.ec2.AWSInstanceState;
import org.eclipse.cmf.occi.multicloud.aws.ec2.HypervisorType;
import org.eclipse.cmf.occi.multicloud.aws.ec2.InstanceLifeCycleType;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Instancevpcinfo;
import org.eclipse.cmf.occi.multicloud.aws.ec2.MonitoringState;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Placementgroup;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Rootdevicevolume;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Statustransitionreason;
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
import com.amazonaws.services.ec2.model.Placement;
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
		// TODO: ModifyInstanceAttribute : see : https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyInstanceAttribute.html
		// TODO : Dont forget to manage tag : "name". 
		
	}
	// End of user code

	// Start of user code Instanceec2occiDelete_method
	/**
	 * Called when this Instanceec2 instance will be deleted.
	 */
	@Override
	public void occiDelete() {
		LOGGER.debug("occiDelete() called on " + this);
		
		try {
			AwsEC2Client ec2Client = this.getClientInstance();
			InstanceHelper.deleteInstance(ec2Client, this.getInstanceId());
		} catch (AwsAccountModelException ex) {
			throw new RuntimeException(ex.getMessage());
		} catch (AwsOperationException ex) {
			throw new RuntimeException(ex.getCause().getMessage());
		}
		
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
		try {
			AwsEC2Client ec2Client = this.getClientInstance();
			retrieveCompute();
			if (this.getAwsInstanceStatus().equals(AWSInstanceState.NOTEXIST)) {
				createCompute(); // Create the instance first.
			}
			// After creation, start the instance.
			InstanceHelper.startInstance(ec2Client, this.getInstanceId());
		} catch (AwsAccountModelException ex) {
			throw new RuntimeException(ex.getMessage());
		} catch (AwsOperationException ex) {
			throw new RuntimeException(ex.getCause().getMessage());
		}
		
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
		stop(StopMethod.GRACEFUL);
		start();
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
		LOGGER.warn("You cannot suspend an AWS EC2 instance.");
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
		occiDelete();
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
		// TODO : Create a snapshot or an AMI...
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
		try {
			AwsEC2Client ec2Client = this.getClientInstance();
			retrieveCompute();
			if (this.getAwsInstanceStatus().equals(AWSInstanceState.RUNNING)) {
				InstanceHelper.stopInstance(ec2Client, this.getInstanceId());
			} else {
				globalMessage = "Cant stop the instance, please check if instance status is RUNNING or OcciComputeStatus is ACTIVE. Its maybe a transitive status wait before operate.";
				levelMessage = Level.ERROR;
				LOGGER.error(globalMessage);
			}
			
		} catch (AwsAccountModelException ex) {
			throw new RuntimeException(ex.getMessage());
		} catch (AwsOperationException ex) {
			throw new RuntimeException(ex.getCause().getMessage());
		}
	}

	// End of user code

	// Start of user code createCompute
	/**
	 * Create a new compute (if it doesnt exist on real AWS infrastructure.
	 */
	public void createCompute() {
		try {
			
			// check if it already exist.
			retrieveCompute();
			if (this.getAwsInstanceStatus().equals(AWSInstanceState.NOTEXIST)) {
				// Create effectively the compute.
				Instance instance = InstanceHelper.createEC2Instance(this);
				mapInstanceAWStoInstanceAWSOCCI(instance);
			}
			
		} catch (AwsAccountModelException ex) {
			throw new RuntimeException(ex.getMessage());
		} catch (AwsOperationException ex) {
			throw new RuntimeException(ex.getCause().getMessage());
		}
		globalMessage = "Instance " + getInstanceId() + " has been created !";
		levelMessage = Level.INFO;
		LOGGER.info(globalMessage);
	}
	// End of user code

	// Start of user code getClientInstance
	/**
	 * For resource satellite, it uses the same client.
	 * 
	 * @return
	 */
	public AwsEC2Client getClientInstance() throws AwsAccountModelException {
		AwsEC2Client ec2Client = ModelUtils.getClientInstance(this);
		if (ec2Client == null) {
			// Must never arrive.
			globalMessage = "Client is not instanciated, its maybe a bug, please report it.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			throw new AwsAccountModelException(globalMessage);
		}
		if (!ec2Client.checkConnection(this)) {
			// Must return true if connection is established.
			globalMessage = "No connection to aws has been established, please check your credentials or your configuration.";
			levelMessage = Level.ERROR;
			LOGGER.error(globalMessage);
			throw new AwsAccountModelException(globalMessage);
		}
		return ec2Client; 
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
					mapInstanceAWStoInstanceAWSOCCI(instance);
					
				} else {
					// TODO : Dialog box information.
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
	 * 
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
		case TERMINATED:
			result = ComputeStatus.INACTIVE;
			break;
		}
		return result;
	}
	// End of user code
	
	/**
	 * Map between instance EC2 datas and instance EC2 OCCI model.
	 */
	private void mapInstanceAWStoInstanceAWSOCCI(Instance instance) {
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
		DateFormat launchTimeFrmt = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT,
				locale);
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
		// TODO : Check if it can be retrieve via EC2_METADATA_INSTANCE, cf
		// https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/com/amazonaws/util/EC2MetadataUtils.html
		this.setOcciComputeHostname(host);
		this.setOcciComputeShare(0);
		// How to use occi compute speed ? via Monitoring ?
		this.setOcciComputeSpeed(0.0f);

		String stateMessage = null;
		if (instance.getStateReason() != null && instance.getStateReason().getCode() != null
				&& instance.getStateReason().getMessage() != null) {
			stateMessage = instance.getStateReason().getCode() + " --> "
					+ instance.getStateReason().getMessage();
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
		// TODO : How to active sriovnetsupport ? see :
		// https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/sriov-networking.html
		this.setSriovNetSupport(instance.getSriovNetSupport());

		this.setVirtualizationType(VirtualizationType.getByName(instance.getVirtualizationType()));

		// Update values on the different mixins applied.
		// InstanceVPCInfo
		Optional<Instancevpcinfo> instanceVPCInfoOpt = OcciHelper.getMixinBase(this.getParts(),
				Instancevpcinfo.class);

		// PlacementGroup
		Optional<Placementgroup> placementGroupOpt = OcciHelper.getMixinBase(this.getParts(),
				Placementgroup.class);

		// RootDeviceVolume
		Optional<Rootdevicevolume> rootDeviceVolumeOpt = OcciHelper.getMixinBase(this.getParts(),
				Rootdevicevolume.class);

		// StatusTransitionReason
		Optional<Statustransitionreason> statusTransitionReasonOpt = OcciHelper
				.getMixinBase(this.getParts(), Statustransitionreason.class);

		if (instanceVPCInfoOpt.isPresent()) {
			Instancevpcinfo instanceVpcInfo = instanceVPCInfoOpt.get();
			instanceVpcInfo.setSourceDestCheck(instance.getSourceDestCheck());
			instanceVpcInfo.setSubnetId(instance.getSubnetId());
			instanceVpcInfo.setVpcId(instance.getVpcId());
		}
		if (placementGroupOpt.isPresent()) {
			Placement placement = instance.getPlacement();
			Placementgroup placementGroupMixin = placementGroupOpt.get();
			if (placement != null) {
				placementGroupMixin.setAffinity(placement.getAffinity());
				placementGroupMixin.setGroupName(placement.getGroupName());
				placementGroupMixin.setHostId(placement.getHostId());
				placementGroupMixin.setSpreadDomain(placement.getSpreadDomain());
				placementGroupMixin.setTenancy(placement.getTenancy());
				placementGroupMixin.setZoneName(placement.getAvailabilityZone());
				this.setZoneName(placement.getAvailabilityZone());
			} else {
				placementGroupMixin.setAffinity(null);
				placementGroupMixin.setGroupName(null);
				placementGroupMixin.setHostId(null);
				placementGroupMixin.setSpreadDomain(null);
				placementGroupMixin.setTenancy(null);
				placementGroupMixin.setZoneName(null);
				this.setZoneName(null);
			}
		}
		if (rootDeviceVolumeOpt.isPresent()) {
			Rootdevicevolume rootDevVolumeMixin = rootDeviceVolumeOpt.get();
			rootDevVolumeMixin.setRootDeviceName(instance.getRootDeviceName());
			rootDevVolumeMixin.setRootDeviceType(instance.getRootDeviceType());
		}
		if (statusTransitionReasonOpt.isPresent()) {
			Statustransitionreason statusTransMixin = statusTransitionReasonOpt.get();
			if (instance.getStateReason() != null) {
				statusTransMixin.setStateTransitionCode(instance.getStateReason().getCode());
				statusTransMixin.setStateTransitionMessage(instance.getStateReason().getMessage()
						+ " --> Transition reason : " + instance.getStateTransitionReason());
			}
		}
		
	}
	// End of user code

}
