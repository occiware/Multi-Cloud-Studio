/**
 * Copyright (c) 2018 Inria
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
package org.eclipse.cmf.occi.multicloud.aws.ec2.connector.driver;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Keypair;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Keypairlink;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Securitygroup;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Securitygrouplink;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.AwsEC2Client;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.Instanceec2Connector;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.exceptions.AwsAccountModelException;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.exceptions.AwsOperationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.ec2.model.DescribeInstancesRequest;
import com.amazonaws.services.ec2.model.DescribeInstancesResult;
import com.amazonaws.services.ec2.model.Filter;
import com.amazonaws.services.ec2.model.Instance;
import com.amazonaws.services.ec2.model.Reservation;
import com.amazonaws.services.ec2.model.ResourceType;
import com.amazonaws.services.ec2.model.RunInstancesRequest;
import com.amazonaws.services.ec2.model.RunInstancesResult;
import com.amazonaws.services.ec2.model.StartInstancesRequest;
import com.amazonaws.services.ec2.model.StopInstancesRequest;
import com.amazonaws.services.ec2.model.Tag;
import com.amazonaws.services.ec2.model.TagSpecification;
import com.amazonaws.services.ec2.model.TerminateInstancesRequest;

/**
 * This class is for instance management on AWS level.
 * 
 * @author Christophe Gourdin
 *
 */
public class InstanceHelper {

	private static Logger LOGGER = LoggerFactory.getLogger(InstanceHelper.class);

	/**
	 * Describe ec2 instance for tag instanceName with value instanceName if no
	 * instanceId defined.
	 * 
	 * @param instanceId
	 *            if defined the describe is based on this attribute.
	 * @param instanceName
	 *            if instanceId is not defined the research is based on instanceName
	 *            tag.
	 * @return
	 * @throws AwsOperationException
	 */
	public static Instance retrieveEC2Instance(final String instanceId, final String instanceName,
			AwsEC2Client ec2Client) throws AwsOperationException {
		Filter filter = new Filter();
		if (instanceId == null) {
			filter.withName("tag-value").withValues(instanceName);
		} else {
			filter.withName("instance-id").withValues(instanceId);
		}
		List<Instance> instances = describeInstanceWithFilters(ec2Client, filter);
		if (instances != null && !instances.isEmpty()) {
			if (instances.size() > 1) {
				if (instanceId == null) {
					throw new AwsOperationException("Multiple instances found for this name : " + instanceName);
				} else {
					throw new AwsOperationException(
							"Multiple instances found for this id : " + instanceId + " and name : " + instanceName);
				}
			}
			return instances.get(0);
		}
		return null;
	}

	public List<Instance> retrieveAllForRegion(AwsEC2Client ec2Client) throws AwsOperationException {
		Filter filter = new Filter();
		return describeInstanceWithFilters(ec2Client, filter);
	}

	/**
	 * Describe instances with specific filters.
	 * 
	 * @param filters
	 *            : affinity - The affinity setting for an instance running on a
	 *            Dedicated Host (default | host). architecture - The instance
	 *            architecture (i386 | x86_64). association.public-ip - The address
	 *            of the Elastic IP address (IPv4) bound to the network interface.
	 *            association.ip-owner-id - The owner of the Elastic IP address
	 *            (IPv4) associated with the network interface.
	 *            association.allocation-id - The allocation ID returned when you
	 *            allocated the Elastic IP address (IPv4) for your network
	 *            interface. association.association-id - The association ID
	 *            returned when the network interface was associated with an IPv4
	 *            address. availability-zone - The Availability Zone of the
	 *            instance. block-device-mapping.attach-time - The attach time for
	 *            an EBS volume mapped to the instance, for example,
	 *            2010-09-15T17:15:20.000Z.
	 *            block-device-mapping.delete-on-termination - A Boolean that
	 *            indicates whether the EBS volume is deleted on instance
	 *            termination. block-device-mapping.device-name - The device name
	 *            for the EBS volume (for example, /dev/sdh or xvdh).
	 *            block-device-mapping.status - The status for the EBS volume
	 *            (attaching | attached | detaching | detached).
	 *            block-device-mapping.volume-id - The volume ID of the EBS volume.
	 *            client-token - The idempotency token you provided when you
	 *            launched the instance. dns-name - The public DNS name of the
	 *            instance. group-id - The ID of the security group for the
	 *            instance. EC2-Classic only. group-name - The name of the security
	 *            group for the instance. EC2-Classic only. host-id - The ID of the
	 *            Dedicated Host on which the instance is running, if applicable.
	 *            hypervisor - The hypervisor type of the instance (ovm | xen).
	 *            iam-instance-profile.arn - The instance profile associated with
	 *            the instance. Specified as an ARN. image-id - The ID of the image
	 *            used to launch the instance. instance-id - The ID of the instance.
	 *            instance-lifecycle - Indicates whether this is a Spot Instance or
	 *            a Scheduled Instance ( spot | scheduled). instance-state-code -
	 *            The state of the instance, as a 16-bit unsigned integer. The high
	 *            byte is an opaque internal value and should be ignored. The low
	 *            byte is set based on the state represented. The valid values are:
	 *            0 (pending), 16 (running), 32 (shutting-down), 48 (terminated), 64
	 *            (stopping), and 80 (stopped). instance-state-name - The state of
	 *            the instance (pending | running | shutting-down | terminated |
	 *            stopping | stopped). instance-type - The type of instance (for
	 *            example, t2.micro). instance.group-id - The ID of the security
	 *            group for the instance. instance.group-name - The name of the
	 *            security group for the instance. ip-address - The public IPv4
	 *            address of the instance. kernel-id - The kernel ID. key-name - The
	 *            name of the key pair used when the instance was launched.
	 *            launch-index - When launching multiple instances, this is the
	 *            index for the instance in the launch group (for example, 0, 1, 2,
	 *            and so on). launch-time - The time when the instance was launched.
	 *            monitoring-state - Indicates whether detailed monitoring is
	 *            enabled (disabled | enabled).
	 *            network-interface.addresses.private-ip-address - The private IPv4
	 *            address associated with the network interface.
	 *            network-interface.addresses.primary - Specifies whether the IPv4
	 *            address of the network interface is the primary private IPv4
	 *            address. network-interface.addresses.association.public-ip - The
	 *            ID of the association of an Elastic IP address (IPv4) with a
	 *            network interface.
	 *            network-interface.addresses.association.ip-owner-id - The owner ID
	 *            of the private IPv4 address associated with the network interface.
	 *            network-interface.attachment.attachment-id - The ID of the
	 *            interface attachment. network-interface.attachment.instance-id -
	 *            The ID of the instance to which the network interface is attached.
	 *            network-interface.attachment.instance-owner-id - The owner ID of
	 *            the instance to which the network interface is attached.
	 *            network-interface.attachment.device-index - The device index to
	 *            which the network interface is attached.
	 *            network-interface.attachment.status - The status of the attachment
	 *            (attaching | attached | detaching | detached).
	 *            network-interface.attachment.attach-time - The time that the
	 *            network interface was attached to an instance.
	 *            network-interface.attachment.delete-on-termination - Specifies
	 *            whether the attachment is deleted when an instance is terminated.
	 *            network-interface.availability-zone - The Availability Zone for
	 *            the network interface. network-interface.description - The
	 *            description of the network interface. network-interface.group-id -
	 *            The ID of a security group associated with the network interface.
	 *            network-interface.group-name - The name of a security group
	 *            associated with the network interface.
	 *            network-interface.ipv6-addresses.ipv6-address - The IPv6 address
	 *            associated with the network interface.
	 *            network-interface.mac-address - The MAC address of the network
	 *            interface. network-interface.network-interface-id - The ID of the
	 *            network interface. network-interface.owner-id - The ID of the
	 *            owner of the network interface. network-interface.private-dns-name
	 *            - The private DNS name of the network interface.
	 *            network-interface.requester-id - The requester ID for the network
	 *            interface. network-interface.requester-managed - Indicates whether
	 *            the network interface is being managed by AWS.
	 *            network-interface.status - The status of the network interface
	 *            (available) | in-use). network-interface.source-dest-check -
	 *            Whether the network interface performs source/destination
	 *            checking. A value of true means checking is enabled, and false
	 *            means checking is disabled. The value must be false for the
	 *            network interface to perform network address translation (NAT) in
	 *            your VPC. network-interface.subnet-id - The ID of the subnet for
	 *            the network interface. network-interface.vpc-id - The ID of the
	 *            VPC for the network interface. owner-id - The AWS account ID of
	 *            the instance owner. placement-group-name - The name of the
	 *            placement group for the instance. platform - The platform. Use
	 *            windows if you have Windows instances; otherwise, leave blank.
	 *            private-dns-name - The private IPv4 DNS name of the instance.
	 *            private-ip-address - The private IPv4 address of the instance.
	 *            product-code - The product code associated with the AMI used to
	 *            launch the instance. product-code.type - The type of product code
	 *            (devpay | marketplace). ramdisk-id - The RAM disk ID. reason - The
	 *            reason for the current state of the instance (for example, shows
	 *            "User Initiated [date]" when you stop or terminate the instance).
	 *            Similar to the state-reason-code filter. requester-id - The ID of
	 *            the entity that launched the instance on your behalf (for example,
	 *            AWS Management Console, Auto Scaling, and so on). reservation-id -
	 *            The ID of the instance's reservation. A reservation ID is created
	 *            any time you launch an instance. A reservation ID has a one-to-one
	 *            relationship with an instance launch request, but can be
	 *            associated with more than one instance if you launch multiple
	 *            instances using the same launch request. For example, if you
	 *            launch one instance, you'll get one reservation ID. If you launch
	 *            ten instances using the same launch request, you'll also get one
	 *            reservation ID. root-device-name - The name of the root device for
	 *            the instance (for example, /dev/sda1 or /dev/xvda).
	 *            root-device-type - The type of root device that the instance uses
	 *            (ebs | instance-store). source-dest-check - Indicates whether the
	 *            instance performs source/destination checking. A value of true
	 *            means that checking is enabled, and false means checking is
	 *            disabled. The value must be false for the instance to perform
	 *            network address translation (NAT) in your VPC.
	 *            spot-instance-request-id - The ID of the Spot instance request.
	 *            state-reason-code - The reason code for the state change.
	 *            state-reason-message - A message that describes the state change.
	 *            subnet-id - The ID of the subnet for the instance. tag:key=value -
	 *            The key/value combination of a tag assigned to the resource, where
	 *            tag:key is the tag's key. tag-key - The key of a tag assigned to
	 *            the resource. This filter is independent of the tag-value filter.
	 *            For example, if you use both the filter "tag-key=Purpose" and the
	 *            filter "tag-value=X", you get any resources assigned both the tag
	 *            key Purpose (regardless of what the tag's value is), and the tag
	 *            value X (regardless of what the tag's key is). If you want to list
	 *            only resources where Purpose is X, see the tag:key=value filter.
	 *            tag-value - The value of a tag assigned to the resource. This
	 *            filter is independent of the tag-key filter. tenancy - The tenancy
	 *            of an instance (dedicated | default | host). virtualization-type -
	 *            The virtualization type of the instance (paravirtual | hvm).
	 *            vpc-id - The ID of the VPC that the instance is running in.
	 * @return a list of ec2 (may be spot, classic ec2 and reserved instances).
	 * @throws AwsOperationException
	 */
	public static List<Instance> describeInstanceWithFilters(AwsEC2Client ec2Client, Filter... filters)
			throws AwsOperationException {
		List<Instance> instances = new ArrayList<>();
		DescribeInstancesRequest descRequest = new DescribeInstancesRequest().withFilters(filters);
		try {
			DescribeInstancesResult result = ec2Client.getClientInstance().describeInstances(descRequest);
			// TODO: Check use case with getNextToken().
			List<Reservation> reservations = result.getReservations();
			for (Reservation reservation : reservations) {
				instances.addAll(reservation.getInstances());
			}

		} catch (AmazonServiceException ase) {
			LOGGER.error(
					"AmazonServiceException thrown from aws : " + ase.getErrorCode() + " --> " + ase.getErrorMessage());
			throw new AwsOperationException(ase);
		} catch (AmazonClientException ace) {
			LOGGER.error("AmazonClientException thrown from aws : " + ace.getMessage());
			throw new AwsOperationException(ace);
		}
		// finally {
		// ec2Client.getClientInstance().shutdown();
		// }

		return instances;

	}

	/**
	 * Create a new instance from model specification.
	 * 
	 * @param instEC2Conn
	 * @throws AwsOperationException
	 * @throws AwsAccountModelException 
	 */
	public static Instance createEC2Instance(Instanceec2Connector instEC2Conn) throws AwsOperationException, AwsAccountModelException {
		RunInstancesRequest runInstancesRequest = new RunInstancesRequest();

		// Manage security group if any is declared on model,
		// if none set it to null (=> no inbound).

		// Get all security group attach to the instance on model level.
		List<Securitygroup> securityGroups = new ArrayList<>();
		List<String> securityGroupNames = new ArrayList<>();
		List<Link> links = instEC2Conn.getLinks();
		Keypair keyPair = null;
		for (Link link : links) {
			if (link instanceof Securitygrouplink) {
				// There is a security group on target.
				Resource res = link.getTarget();
				if (res instanceof Securitygroup) {
					securityGroups.add((Securitygroup) res);
					securityGroupNames.add(((Securitygroup) res).getSecurityGroupName());
				}
			}
			if (link instanceof Keypairlink) {
				Resource res = link.getTarget();
				if (res instanceof Keypair) {
					keyPair = (Keypair) res;
				}
			}
		}
		// TO ensure that security groups exist with ipPermissions defined, we must
		// create it here.
		for (Securitygroup secGroup : securityGroups) {
			secGroup.occiCreate(); // it will control before creation if the security group exist and will made a
									// diff with existant one and apply new permission if necessary.
		}
		String keyPairName;

		keyPairName = instEC2Conn.getKeyPairName();

		if (keyPair != null) {
			keyPair.occiCreate(); // it will control if key pair already exist, if this is the case this will not
			// recreate a new keypair for keypair name.
			keyPairName = keyPair.getName();
		}

		// TODO : Add block device mapping and a lot of other things to configure.
		runInstancesRequest.withImageId(instEC2Conn.getImageId()).withInstanceType(instEC2Conn.getInstanceType())
				.withMinCount(1).withMaxCount(1).withKeyName(keyPairName).withSecurityGroups(securityGroupNames);
		if (instEC2Conn.getName() != null) {
			TagSpecification tagSpec = new TagSpecification();
			Tag tag = new Tag("name", instEC2Conn.getName());
			tagSpec.setResourceType(ResourceType.Instance);
			List<Tag> tags = new ArrayList<>();
			tags.add(tag);
			tagSpec.setTags(tags);
			List<TagSpecification> tagsSpec = new ArrayList<>();
			tagsSpec.add(tagSpec);
			runInstancesRequest.withTagSpecifications(tagsSpec);
		}

		try {
			AwsEC2Client ec2Client = instEC2Conn.getClientInstance();
			RunInstancesResult result = ec2Client.getEc2Client().runInstances(runInstancesRequest);
			Instance instance = null;
			if (result != null) {
				Reservation reservation = result.getReservation();
				if (reservation != null && !reservation.getInstances().isEmpty()) {
					return reservation.getInstances().get(0);
				}
			}

			return instance;

		} catch (AmazonServiceException ase) {
			LOGGER.error(
					"AmazonServiceException thrown from aws : " + ase.getErrorCode() + " --> " + ase.getErrorMessage());
			throw new AwsOperationException(ase);
		} catch (AmazonClientException ace) {
			LOGGER.error("AmazonClientException thrown from aws : " + ace.getMessage());
			throw new AwsOperationException(ace);
		}
	}

	/**
	 * Terminate instance from an instance model.
	 * @param instEC2Conn
	 * @throws AwsOperationException 
	 * @throws AwsAccountModelException 
	 */
	public static void deleteInstance(AwsEC2Client ec2Client, String instanceId) throws AwsOperationException, AwsAccountModelException {

		List<String> instanceIds = new ArrayList<>();
		if (instanceId == null || instanceId.trim().isEmpty()) {
			throw new AwsOperationException("No instances to terminate, you didnt provide instanceId");
		}
		instanceIds.add(instanceId);
		deleteInstances(ec2Client, instanceIds);
	}

	/**
	 * 
	 * @param ec2Client
	 * @param instanceIds
	 * @throws AwsOperationException
	 */
	public static void deleteInstances(AwsEC2Client ec2Client, List<String> instanceIds) throws AwsOperationException {
		try {
			TerminateInstancesRequest terminateInstanceRequest = new TerminateInstancesRequest();
			terminateInstanceRequest.setInstanceIds(instanceIds);
			ec2Client.getClientInstance().terminateInstances(terminateInstanceRequest);
		} catch (AmazonServiceException ase) {
			LOGGER.error(
					"AmazonServiceException thrown from aws : " + ase.getErrorCode() + " --> " + ase.getErrorMessage());
			throw new AwsOperationException(ase);
		} catch (AmazonClientException ace) {
			LOGGER.error("AmazonClientException thrown from aws : " + ace.getMessage());
			throw new AwsOperationException(ace);
		}

	}

	/**
	 * Start one instance using its instanceId.
	 * @param ec2Client
	 * @param instanceId
	 * @throws AwsOperationException
	 */
	public static void startInstance(AwsEC2Client ec2Client, String instanceId) throws AwsOperationException {
		List<String> instanceIds = new ArrayList<>();
		if (instanceId == null || instanceId.trim().isEmpty()) {
			throw new AwsOperationException("Cant start the instance without its instanceId.");
		}
		instanceIds.add(instanceId);
		startInstances(ec2Client, instanceIds);
	}
	
	/**
	 * Start all instances from the list of instanceId given.
	 * @param ec2Client
	 * @param instanceIds
	 */
	public static void startInstances(AwsEC2Client ec2Client, List<String> instanceIds) throws AwsOperationException {
		StartInstancesRequest req = new StartInstancesRequest();
		req.withInstanceIds(instanceIds);
		try {
			ec2Client.getClientInstance().startInstances(req);
		} catch (AmazonServiceException ase) {
			LOGGER.error(
					"AmazonServiceException thrown from aws : " + ase.getErrorCode() + " --> " + ase.getErrorMessage());
			throw new AwsOperationException(ase);
		} catch (AmazonClientException ace) {
			LOGGER.error("AmazonClientException thrown from aws : " + ace.getMessage());
			throw new AwsOperationException(ace);
		}
	}
	
	/**
	 * Stop instance using instanceId.
	 * @param ec2Client
	 * @param instanceId
	 * @throws AwsOperationException
	 */
	public static void stopInstance(AwsEC2Client ec2Client, String instanceId) throws AwsOperationException {
		List<String> instanceIds = new ArrayList<>();
		if (instanceId == null) {
			throw new AwsOperationException("Cant stop the instance without its instanceId.");
		}
		instanceIds.add(instanceId);
		stopInstances(ec2Client, instanceIds);	
	}
	
	/**
	 * Stop a list of instances.
	 * @param ec2Client
	 * @param instanceIds
	 * @throws AwsOperationException
	 */
	public static void stopInstances(AwsEC2Client ec2Client, List<String> instanceIds) throws AwsOperationException {
		StopInstancesRequest req = new StopInstancesRequest(instanceIds);
		try {
			ec2Client.getClientInstance().stopInstances(req);
		} catch (AmazonServiceException ase) {
			LOGGER.error(
					"AmazonServiceException thrown from aws : " + ase.getErrorCode() + " --> " + ase.getErrorMessage());
			throw new AwsOperationException(ase);
		} catch (AmazonClientException ace) {
			LOGGER.error("AmazonClientException thrown from aws : " + ace.getMessage());
			throw new AwsOperationException(ace);
		}
		
	}
	
	// TODO : Manage RDS instance here.

	/**
	 * Create a RDS based instance.
	 */
	public void createRDSInstance() {

	}
	
	
}
