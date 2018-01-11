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
import org.eclipse.cmf.occi.multicloud.aws.ec2.IpPermissionType;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermission;
import org.eclipse.cmf.occi.multicloud.aws.ec2.Ippermissionlink;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.AwsEC2Client;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.SecuritygroupConnector;
import org.eclipse.cmf.occi.multicloud.aws.ec2.connector.exceptions.AwsOperationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.services.ec2.model.AuthorizeSecurityGroupEgressRequest;
import com.amazonaws.services.ec2.model.AuthorizeSecurityGroupIngressRequest;
import com.amazonaws.services.ec2.model.CreateSecurityGroupRequest;
import com.amazonaws.services.ec2.model.CreateSecurityGroupResult;
import com.amazonaws.services.ec2.model.DeleteSecurityGroupRequest;
import com.amazonaws.services.ec2.model.DescribeKeyPairsRequest;
import com.amazonaws.services.ec2.model.DescribeKeyPairsResult;
import com.amazonaws.services.ec2.model.DescribeSecurityGroupReferencesRequest;
import com.amazonaws.services.ec2.model.DescribeSecurityGroupsRequest;
import com.amazonaws.services.ec2.model.DescribeSecurityGroupsResult;
import com.amazonaws.services.ec2.model.IpPermission;
import com.amazonaws.services.ec2.model.IpRange;
import com.amazonaws.services.ec2.model.Ipv6Range;
import com.amazonaws.services.ec2.model.KeyPairInfo;
import com.amazonaws.services.ec2.model.SecurityGroup;

public class SecurityGroupHelper {

	private static Logger LOGGER = LoggerFactory.getLogger(SecurityGroupHelper.class);

	/**
	 * Check if a security group exist.
	 * 
	 * @param ec2Client
	 * @param securityGroupName
	 * @return
	 * @throws AwsOperationException
	 */
	public static boolean isExistSecurityGroup(AwsEC2Client ec2Client, final String securityGroupName)
			throws AwsOperationException {

		DescribeSecurityGroupsRequest req = new DescribeSecurityGroupsRequest().withGroupNames(securityGroupName);
		try {
			DescribeSecurityGroupsResult result = ec2Client.getClientInstance().describeSecurityGroups(req);
			List<SecurityGroup> securityGroups = result.getSecurityGroups();
			if (securityGroups != null && !securityGroups.isEmpty()) {
				return true;
			}
			return false;
		} catch (AmazonServiceException ase) {
			LOGGER.error(
					"AmazonServiceException thrown from aws : " + ase.getErrorCode() + " --> " + ase.getErrorMessage());
			throw new AwsOperationException(ase);
		} catch (AmazonClientException ace) {
			LOGGER.error("AmazonClientException thrown from aws : " + ace.getMessage());
			throw new AwsOperationException(ace);
		}
	}

	public static SecurityGroup describeSecurityGroup(AwsEC2Client ec2Client, final String securityGroupId)
			throws AwsOperationException {
		DescribeSecurityGroupsRequest req = new DescribeSecurityGroupsRequest().withGroupIds(securityGroupId);
		try {
			DescribeSecurityGroupsResult result = ec2Client.getClientInstance().describeSecurityGroups(req);
			List<SecurityGroup> securityGroups = result.getSecurityGroups();
			if (securityGroups != null && !securityGroups.isEmpty()) {
				return securityGroups.get(0);
			}
			return null;
		} catch (AmazonServiceException ase) {
			LOGGER.error(
					"AmazonServiceException thrown from aws : " + ase.getErrorCode() + " --> " + ase.getErrorMessage());
			throw new AwsOperationException(ase);
		} catch (AmazonClientException ace) {
			LOGGER.error("AmazonClientException thrown from aws : " + ace.getMessage());
			throw new AwsOperationException(ace);
		}
	}

	public static SecurityGroup createSecurityGroup(AwsEC2Client ec2Client,
			SecuritygroupConnector securitygroupConnector) throws AwsOperationException {
		SecurityGroup securityGroup = null;
		// Get target resources (ipPermissions inbound and outbound traffic and
		// authorized or not).
		List<Link> links = securitygroupConnector.getLinks();
		List<Ippermission> ipPermissionsModel = new ArrayList<>();
		List<IpPermission> ipPermissionsIngress = new ArrayList<>();
		List<IpPermission> ipPermissionsEgress = new ArrayList<>();
		for (Link link : links) {
			if (link instanceof Ippermissionlink) {
				// Retrieve from the model all ippermisions linked to this securityGroup model.
				Resource res = link.getTarget();
				ipPermissionsModel.add((Ippermission) res);
			}
		}

		// create the security group.
		CreateSecurityGroupRequest csgr = new CreateSecurityGroupRequest(securitygroupConnector.getSecurityGroupName(),
				securitygroupConnector.getSecurityGroupDescription());
		try {
			CreateSecurityGroupResult result = ec2Client.getClientInstance().createSecurityGroup(csgr);

			// Authorize ip permissions if ippermission are present for this security group.
			for (Ippermission ipPermission : ipPermissionsModel) {
				IpPermission ipPermissionEC2 = new IpPermission();
				// Get ranges array for ipv4 or ipv6.
				List<IpRange> ipv4Ranges = getIpv4Ranges(ipPermission);
				List<Ipv6Range> ipv6Ranges = getIpv6Ranges(ipPermission);
				if (ipv4Ranges.isEmpty() && ipv6Ranges.isEmpty()) {
					if (ipPermission.getSummary() != null) {
						LOGGER.warn("Ip permission : " + ipPermission.getSummary()
								+ " cannot be authorized, ip ranges (v4 or v6) are not set.");
					} else {
						LOGGER.warn("some Ip permission cannot be autorized.");
					}
					// By pass to the follower.
					continue;
				}

				ipPermissionEC2.withFromPort(ipPermission.getFromPort()).withToPort(ipPermission.getToPort())
						.withIpProtocol(ipPermission.getIpProtocol().getName());
				if (!ipv4Ranges.isEmpty()) {
					ipPermissionEC2.withIpv4Ranges(ipv4Ranges);
				}
				if (!ipv6Ranges.isEmpty()) {
					ipPermissionEC2.withIpv6Ranges(ipv6Ranges);
				}

				// Authorize...
				if (ipPermission.getTraffic().equals(IpPermissionType.INBOUND)) {
					ipPermissionsIngress.add(ipPermissionEC2);
				} else {
					ipPermissionsEgress.add(ipPermissionEC2);
				}
			}

			if (!ipPermissionsIngress.isEmpty()) {
				AuthorizeSecurityGroupIngressRequest asgir = new AuthorizeSecurityGroupIngressRequest();

				asgir.withGroupName(securitygroupConnector.getSecurityGroupName())
						.withIpPermissions(ipPermissionsIngress);
			}
			if (!ipPermissionsEgress.isEmpty()) {
				AuthorizeSecurityGroupEgressRequest asger = new AuthorizeSecurityGroupEgressRequest();
				asger.withGroupId(result.getGroupId()).withIpPermissions(ipPermissionsEgress);

			}
			return describeSecurityGroup(ec2Client, result.getGroupId());

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
	 * Delete a security group, must be call only if no instances is up with this security group.
	 * @param ec2Client
	 * @param securityGroupId
	 *            (ex: sg-0a42d66a)
	 * @throws AwsOperationException
	 */
	public static void deleteSecurityGroup(AwsEC2Client ec2Client, final String securityGroupId)
			throws AwsOperationException {

		try {
			DeleteSecurityGroupRequest req = new DeleteSecurityGroupRequest().withGroupId(securityGroupId);
			ec2Client.getClientInstance().deleteSecurityGroup(req);
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
	 * Get ipRanges ipv4 from ip permission model.
	 * 
	 * @param ipPermissionModel
	 * @return
	 */
	private static List<IpRange> getIpv4Ranges(Ippermission ipPermissionModel) {
		List<IpRange> ipRanges = new ArrayList<>();
		String ipv4Ranges;
		if ((ipPermissionModel == null || ipPermissionModel.getIpv4Ranges() != null)
				&& !ipPermissionModel.getIpv4Ranges().trim().isEmpty()) {
			ipv4Ranges = ipPermissionModel.getIpv4Ranges();
			if (ipv4Ranges.endsWith(";")) {
				ipv4Ranges.substring(0, ipv4Ranges.length() - 1); // remove ; from end of string.
			}
			String[] ranges = ipPermissionModel.getIpv4Ranges().split(";");
			for (String range : ranges) {
				ipRanges.add(new IpRange().withCidrIp(range));
			}
		}
		return ipRanges;

	}

	/**
	 * Get ipRanges ipv6 from ip permission model.
	 * 
	 * @param ipPermissionModel
	 * @return
	 */
	private static List<Ipv6Range> getIpv6Ranges(Ippermission ipPermissionModel) {
		List<Ipv6Range> ipRanges = new ArrayList<>();
		String ipv6Ranges;
		if ((ipPermissionModel == null || ipPermissionModel.getIpv6Ranges() != null)
				&& !ipPermissionModel.getIpv6Ranges().trim().isEmpty()) {
			ipv6Ranges = ipPermissionModel.getIpv4Ranges();
			if (ipv6Ranges.endsWith(";")) {
				ipv6Ranges.substring(0, ipv6Ranges.length() - 1); // remove ; from end of string.
			}
			String[] ranges = ipPermissionModel.getIpv6Ranges().split(";");
			for (String range : ranges) {
				ipRanges.add(new Ipv6Range().withCidrIpv6(range));
			}
		}
		return ipRanges;

	}

}
