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
 * - Christophe Gourdin <christophe.gourdin@inria.fr>
 *
 * Generated at Tue Aug 08 09:43:36 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.monitoring.zabbix/model/zabbix.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.monitoring.zabbix.connector;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.cmf.occi.multicloud.monitoring.connector.exception.MonitorException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.goebl.david.Webb;

/**
 * Connector implementation for the OCCI kind: - scheme:
 * http://occiware.org/occi/multicloud/monitoring/zabbix# - term:
 * zabbixapiconnect - title: Zabbix connection to the request api
 */
public class ZabbixapiconnectConnector
		extends org.eclipse.cmf.occi.multicloud.monitoring.zabbix.impl.ZabbixapiconnectImpl {
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ZabbixapiconnectConnector.class);

	// Start of user code Zabbixapiconnectconnector_constructor
	/**
	 * Constructs a zabbixapiconnect connector.
	 */
	ZabbixapiconnectConnector() {
		LOGGER.debug("Constructor called on " + this);
		System.out.println("Constructor called on " + this);
	}
	// End of user code

	/**
	 * execute a post method query on zabbix server.
	 * 
	 * @param mainJsonObj
	 * @return JSONObject output of the post query.
	 */
	public JSONObject executePostQuery(final JSONObject mainJsonObj) {
		Webb webb = Webb.create();
		JSONObject resultJson = webb.post(httpApiAddress).header("Content-Type", "application/json").useCaches(false)
				.body(mainJsonObj).ensureSuccess().asJsonObject().getBody();
		return resultJson;
	}

	/**
	 * Connect to zabbix api system and get an authentication token result to use
	 * for later queries.
	 * 
	 * @param username
	 * @param password
	 * @param zabbixApiAddress
	 * @return a token to authenticate.
	 * @throws MonitorException
	 *             if connection failed.
	 */
	public String getAuthToken() throws MonitorException {
		// Check auth parameters.
		if (username == null || username.trim().isEmpty()) {
			throw new MonitorException("Cant connect to zabbix server without a username.");
		}
		if (password == null || password.trim().isEmpty()) {
			throw new MonitorException("Cant connect to zabbix server without a password.");
		}
		if (httpApiAddress == null || httpApiAddress.trim().isEmpty()) {
			throw new MonitorException("Cant connect to zabbix server without an http api address.");
		}

		String token;
		try {
			JSONObject mainJObj = new JSONObject();
			JSONObject paramJObj = new JSONObject();
			mainJObj.put("jsonrpc", "2.0");
			mainJObj.put("method", "user.login");

			paramJObj.put("user", username); // username
			paramJObj.put("password", password); // password

			mainJObj.put("params", paramJObj);
			mainJObj.put("id", "1");

			JSONObject result = executePostQuery(mainJObj);
			token = result.getString("result");
		} catch (JSONException je) {
			LOGGER.error("Error creating JSON request to Zabbix API on connect method..." + je.getMessage());
			throw new MonitorException(
					"Error creating JSON request to Zabbix API on connect method..." + je.getMessage());
		}
		return token;
	}

	// ex: zabbix_obj.host_create(zabi, vm_name, ip, 10050, hostgroup, "Scalair
	// Template OS Linux");

	/**
	 * Assign host to host group with a template of metrics.
	 * 
	 * @param authToken
	 * @param host_name
	 * @param host_ip
	 * @param port_num
	 * @param hgroup
	 * @param template
	 */
	public void assignHostToHostgroup(String authToken, String host_name, String host_ip, int port_num, String hgroup,
			String template) throws MonitorException {
		try {
			JSONObject mainJObj = new JSONObject();
			JSONObject paramJObj = new JSONObject();
			JSONObject subparamJObj = new JSONObject();
			JSONObject subparamJObj2 = new JSONObject();
			JSONObject subparamJObj3 = new JSONObject();
			int template_id = getTemplate(authToken, template);
			int hg_id = getHostGroupIdByName(authToken, hgroup);
			mainJObj.put("jsonrpc", "2.0");
			mainJObj.put("method", "host.create");

			paramJObj.put("host", host_name);
			subparamJObj.put("type", "1");
			subparamJObj.put("main", "1");
			subparamJObj.put("useip", "1");
			subparamJObj.put("ip", host_ip);
			subparamJObj.put("dns", "1");
			subparamJObj.put("port", port_num);
			paramJObj.put("interfaces", new JSONArray(new Object[] { subparamJObj }));

			subparamJObj2.put("groupid", hg_id);
			paramJObj.put("groups", new JSONArray(new Object[] { subparamJObj2 }));

			subparamJObj3.put("templateid", template_id);
			paramJObj.put("templates", new JSONArray(new Object[] { subparamJObj3 }));

			mainJObj.put("params", paramJObj);
			mainJObj.put("auth", authToken);
			mainJObj.put("id", "1");

			executePostQuery(mainJObj);

			// System.out.println("output " + result) ;

		} catch (JSONException je) {
			System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
			throw new MonitorException("Error creating JSON request to Zabbix API..." + je.getMessage());
		}
	}

	/**
	 * get host group id by name
	 * 
	 * @param authToken
	 * @param hg_name
	 * @return
	 */
	public int getHostGroupIdByName(String authToken, String hg_name) throws MonitorException {
		int id = 0;
		try {
			JSONObject mainJObj = new JSONObject();
			JSONObject paramJObj = new JSONObject();
			JSONObject subparamJObj = new JSONObject();

			mainJObj.put("jsonrpc", "2.0");
			mainJObj.put("method", "hostgroup.get");

			paramJObj.put("output", "extend");

			// subparamJObj.put("name", new JSONArray(new Object[] { "Linux servers",
			// "Zabbix servers"}));
			subparamJObj.put("name", hg_name); // get hg by name
			paramJObj.put("filter", subparamJObj);

			mainJObj.put("params", paramJObj);
			mainJObj.put("auth", authToken);
			mainJObj.put("id", "1");

			System.out.println("Data to send: " + mainJObj.toString());

			JSONObject result = executePostQuery(mainJObj);

			JSONArray output = result.getJSONArray("result");
			System.out.println("output" + output);
			for (int i = 0; i < output.length(); ++i) {
				JSONObject obj = output.getJSONObject(i);
				System.out.println("group name  " + obj);
				id = obj.getInt("groupid");
				String name = obj.getString("name");
				System.out.println("group   " + name + " with id  " + id);
			}

		} catch (JSONException je) {
			System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
			throw new MonitorException("Error creating JSON request to Zabbix API..." + je.getMessage());
		}
		return id;
	}

	/**
	 * Get template id by template name.
	 * 
	 * @param authToken
	 * @param byname
	 * @return
	 * @throws MonitorException
	 */
	public int getTemplate(final String authToken, final String byname) throws MonitorException {
		int template_id = 0;
		try {
			JSONObject mainJObj = new JSONObject();
			JSONObject paramJObj = new JSONObject();
			JSONObject subparamJObj = new JSONObject();

			mainJObj.put("jsonrpc", "2.0");
			mainJObj.put("method", "template.get");
			paramJObj.put("output", new JSONArray(new Object[] { "name", "templateid" }));
			subparamJObj.put("host", byname);
			paramJObj.put("filter", subparamJObj);
			mainJObj.put("params", paramJObj);
			mainJObj.put("auth", authToken);
			mainJObj.put("id", "1");

			System.out.println("Data to send: " + mainJObj.toString());

			JSONObject result = executePostQuery(mainJObj);
			JSONArray output = result.getJSONArray("result");
			// System.out.println("output" + output);
			for (int i = 0; i < output.length(); ++i) {
				JSONObject obj = output.getJSONObject(i);
				int id11 = obj.getInt("templateid");
				// String name = obj.getString("name");
				template_id = id11;
				// System.out.println( name + " with id " + id11);
			}

		} catch (JSONException je) {
			System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
			throw new MonitorException("Error creating JSON request to Zabbix API..." + je.getMessage());
		}
		return template_id;
	}

	/**
	 * Remove host from its host groups and desactive monitoring.
	 * 
	 * @param authToken
	 * @param ip
	 * @throws MonitorException
	 */
	public void deleteHost(String authToken, String ip) throws MonitorException {
		try {
			JSONObject mainJObj = new JSONObject();
			int host_id = getHostByIp(authToken, ip);

			mainJObj.put("jsonrpc", "2.0");
			mainJObj.put("method", "host.delete");
			mainJObj.put("params", new JSONArray(new Object[] { host_id }));
			mainJObj.put("auth", authToken);
			mainJObj.put("id", "1");

			executePostQuery(mainJObj);

		} catch (JSONException je) {
			System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
			throw new MonitorException("Error creating JSON request to Zabbix API..." + je.getMessage());
		}
	}

	/**
	 * Get host id from its ip, or name in order to delete it in the function
	 * delethost.
	 * 
	 * @param authToken
	 * @param ip
	 * @return
	 * @throws MonitorException
	 */
	public int getHostByIp(String authToken, String ip) throws MonitorException {
		int id = 0;
		try {
			JSONObject mainJObj = new JSONObject();
			JSONObject paramJObj = new JSONObject();
			// int template_id = get_template(zabi, template);

			mainJObj.put("jsonrpc", "2.0");
			mainJObj.put("method", "hostinterface.get");
			paramJObj.put("output", "extend");
			paramJObj.put("sortfield", "interfaceid");
			mainJObj.put("params", paramJObj);
			mainJObj.put("auth", authToken);
			mainJObj.put("id", "1");

			System.out.println("Data to send: " + mainJObj.toString());

			JSONObject result = executePostQuery(mainJObj);

			// System.out.println("output " + result) ;
			JSONArray output = result.getJSONArray("result");
			// System.out.println("output" + output);
			for (int i = 0; i < output.length(); ++i) {
				JSONObject obj = output.getJSONObject(i);
				// System.out.println("input ip" + ip);
				String host_ip = obj.getString("ip");
				if ((host_ip).equals(ip)) {
					int host_id = obj.getInt("hostid");
					id = host_id;
					// System.out.println(" the ip of this host is " + host_id);
				}
			}

		} catch (JSONException je) {
			System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
			throw new MonitorException("Error creating JSON request to Zabbix API..." + je.getMessage());
		}
		return id;
	}

	/**
	 * give the hosts ids (list of hosts) in a specific host group.
	 * 
	 * @param authToken
	 * @param hg_name
	 * @return
	 * @throws MonitorException
	 */
	public List<Integer> getHostListByHostGroupName(String authToken, String hg_name) throws MonitorException {
		List<Integer> arr = new ArrayList<Integer>();

		try {
			JSONObject mainJObj = new JSONObject();
			JSONObject paramJObj = new JSONObject();

			int hg_id = getHostGroupIdByName(authToken, hg_name);
			System.out.println("hg id " + hg_id);
			mainJObj.put("jsonrpc", "2.0");
			mainJObj.put("method", "host.get");
			paramJObj.put("groupids", hg_id);
			paramJObj.put("output", new JSONArray(new Object[] { "name", "hostid" }));
			// subparamJObj.put("name", new JSONArray(new Object[] { "Linux servers",
			// "Zabbix servers"}));
			// paramJObj.put("filter", subparamJObj);
			mainJObj.put("params", paramJObj);
			mainJObj.put("auth", authToken);
			mainJObj.put("id", "1");

			System.out.println("Data to send: " + mainJObj.toString());

			JSONObject result = executePostQuery(mainJObj);

			JSONArray output = result.getJSONArray("result");
			System.out.println("output" + output);
			for (int i = 0; i < output.length(); ++i) {
				JSONObject obj = output.getJSONObject(i);
				int id = obj.getInt("hostid");
				// arr[i] = id;
				arr.add(id);
				String name = obj.getString("name");
				System.out.println("host   " + name + " with id  " + id);
			}

		} catch (JSONException je) {
			System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
			throw new MonitorException("Error creating JSON request to Zabbix API..." + je.getMessage());
		}
		return arr;
	}

	// cpu usage
	/**
	 * Used cpu (idle value).
	 * 
	 * @param authToken
	 * @param hostid
	 * @return
	 * @throws MonitorException
	 */
	public Double cpuIdle(String authToken, int hostid) throws MonitorException {
		Double value = 0.0;
		try {
			JSONObject mainJObj = buildMainObjGetItem(authToken, hostid, "system.cpu.util[,idle]"); // hostId: 10155

			System.out.println("Data to send: " + mainJObj.toString());

			JSONObject result = executePostQuery(mainJObj);
			JSONArray output = result.getJSONArray("result");
			value = output.getJSONObject(0).getDouble("lastvalue");
			System.out.println("cpu idle " + value);
		} catch (JSONException je) {
			System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
			throw new MonitorException("Error creating JSON request to Zabbix API..." + je.getMessage());
		}
		return value;
	}

	/**
	 * Cpu utilization is calculated from cpuIdle value.
	 * 
	 * @param authToken
	 * @param hostid
	 * @return
	 * @throws MonitorException
	 */
	public Double cpuUtilization(String authToken, int hostid) throws MonitorException {
		Double value = 0.0;
		Double idle = cpuIdle(authToken, hostid);
		value = 100 - idle;
		return value;
	}

	/**
	 * Total size of memory.
	 * 
	 * @param authToken
	 * @param hostid
	 * @return
	 * @throws MonitorException
	 */
	public int totalMemory(String authToken, int hostid) throws MonitorException {
		int value = 0;
		try {
			JSONObject mainJObj = buildMainObjGetItem(authToken, hostid, "vm.memory.size[total]"); // hostId: 10155

			System.out.println("Data to send: " + mainJObj.toString());

			JSONObject result = executePostQuery(mainJObj);
			System.out.println(result);
			JSONArray output = result.getJSONArray("result");
			String name = output.getJSONObject(0).getString("name");
			value = output.getJSONObject(0).getInt("lastvalue");
			System.out.println(name + "  " + value);
		} catch (JSONException je) {
			System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
			throw new MonitorException("Error creating JSON request to Zabbix API..." + je.getMessage());
		}
		return value;
	}

	/**
	 * Used memory.
	 * 
	 * @param authToken
	 * @param hostid
	 * @return
	 * @throws MonitorException
	 */
	public int availableMemory(String authToken, int hostid) throws MonitorException {
		int value = 0;
		try {

			JSONObject mainJObj = buildMainObjGetItem(authToken, hostid, "vm.memory.size[available]"); // hostId: 10155

			System.out.println("Data to send: " + mainJObj.toString());

			JSONObject result = executePostQuery(mainJObj);
			System.out.println(result);
			JSONArray output = result.getJSONArray("result");
			String name = output.getJSONObject(0).getString("name");
			value = output.getJSONObject(0).getInt("lastvalue");
			System.out.println(name + "  " + value);
		} catch (JSONException je) {
			System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
			throw new MonitorException("Error creating JSON request to Zabbix API..." + je.getMessage());
		}
		return value;
	}

	/**
	 * to get cpu numbers on the machine, note that you you can use one generic
	 * function for all items (the only thing that will be changed is the key).
	 * 
	 * @param authToken
	 * @param hostid
	 * @return
	 * @throws MonitorException
	 */
	public int totalCPUs(final String authToken, final int hostid) throws MonitorException {
		int value = 0;
		try {
			JSONObject mainJObj = buildMainObjGetItem(authToken, hostid, "system.cpu.num"); // hostId: 10155

			System.out.println("Data to send: " + mainJObj.toString());

			JSONObject result = executePostQuery(mainJObj);
			System.out.println(result);
			JSONArray output = result.getJSONArray("result");
			String name = output.getJSONObject(0).getString("name");
			value = output.getJSONObject(0).getInt("lastvalue");
			System.out.println(name + "  " + value);
		} catch (JSONException je) {
			System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
			throw new MonitorException("Error creating JSON request to Zabbix API..." + je.getMessage());
		}
		return value;
	}

	// you do not need to use this function, instead, you will use the generic
	// function metrics, each metric with a key.

	// You don not to use this.
	public Double cpuIdle1(final String authToken, final String hg_name) throws MonitorException {
		Double cpu_total = 0.0; // total cpu idle for all hosts in the hostgroup
		Double cpu_average = 0.0; // average cpu idle for all hosts in the hostgroup
		Double cpu_usage = 0.0; // average cpu usage for all hosts in the hostgroup
		int count = 0;
		List<Integer> arr = getHostListByHostGroupName(authToken, hg_name);
		for (int n = 0; n < arr.size(); n++) {// length is the property of array, size of arraylist
			// System.out.println(arr.get(n));
			int hostidd = arr.get(n);
			try {

				JSONObject mainJObj = buildMainObjGetItem(authToken, hostidd, "system.cpu.util[,idle]");

				JSONObject result = executePostQuery(mainJObj);

				//// String output = result.getString("result");
				//// System.out.println("output " + output) ;
				JSONArray output = result.getJSONArray("result");
				// System.out.println("output" + output);
				for (int i = 0; i < output.length(); ++i) {
					JSONObject obj = output.getJSONObject(i);
					// String name = obj.getString("name");
					Double value = obj.getDouble("lastvalue");
					// System.out.println( name + " is " + value);
					cpu_total += value;
				}

			} catch (JSONException je) {
				System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
				throw new MonitorException("Error creating JSON request to Zabbix API..." + je.getMessage());
			}
			count += 1;
		}
		// System.out.println("cpu total " + cpu_total);
		// System.out.println("count " + count);
		cpu_average = cpu_total / count;
		// System.out.println("cpu average " + cpu_average);
		cpu_usage = 100 - cpu_average;
		System.out.println("cpu_usage = " + cpu_usage);
		return cpu_usage;
	}

	/**
	 * 
	 * @param authToken
	 * @param hostid
	 * @return
	 */
	public Double cpuLoad(String authToken, int hostid) throws MonitorException {
		Double value = 0.0;
		try {
			JSONObject mainJObj = buildMainObjGetItem(authToken, hostid, "system.cpu.load[percpu,avg1]");
			System.out.println("Data to send: " + mainJObj.toString());

			JSONObject result = executePostQuery(mainJObj);

			JSONArray output = result.getJSONArray("result");
			value = output.getJSONObject(0).getDouble("lastvalue");
			System.out.println("cpu load " + value);
		} catch (JSONException je) {
			System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
			throw new MonitorException("Error creating JSON request to Zabbix API..." + je.getMessage());
		}
		return value;
	}

	/**
	 * Get host id from its name in order to delete it in the the function delete
	 * host.
	 * 
	 * @param authToken
	 * @param vmname
	 * @return
	 */
	public int getHostByName(final String authToken, final String vmname) throws MonitorException {
		int id = 0;

		try {
			JSONObject mainJObj = new JSONObject();
			JSONObject paramJObj = new JSONObject();
			JSONObject subparamJObj = new JSONObject();
			// int template_id = get_template(zabi, template);

			mainJObj.put("jsonrpc", "2.0");
			mainJObj.put("method", "host.get");
			paramJObj.put("output", "extend");
			paramJObj.put("filter", subparamJObj);
			subparamJObj.put("host", new JSONArray(new Object[] { vmname }));
			// paramJObj.put("sortfield", "interfaceid");
			mainJObj.put("params", paramJObj);
			mainJObj.put("auth", authToken);
			mainJObj.put("id", "1");

			System.out.println("Data to send: " + mainJObj.toString());

			JSONObject result = executePostQuery(mainJObj);

			// System.out.println("output " + result) ;
			JSONArray output = result.getJSONArray("result");
			// System.out.println("output" + output);
			for (int i = 0; i < output.length(); ++i) {
				JSONObject obj = output.getJSONObject(i);
				// System.out.println("input ip" + ip);
				// String host_ip = obj.getString("ip");
				// if ((host_ip).equals (ip)) {
				// int host_id = obj.getInt("hostid");
				// id = host_id;
				id = obj.getInt("hostid");
				// System.out.println(" the ip of this host is " + host_id);
				// }
			}

		} catch (JSONException je) {
			System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
			throw new MonitorException("Error creating JSON request to Zabbix API..." + je.getMessage());
		}
		return id;
	}

	/**
	 * Loggout and invalidate the authToken.
	 * 
	 * @param authToken
	 */
	public void LogoutZabbixAPI(String authToken) {
		Boolean resultB = false;
		try {
			JSONObject mainJObj = new JSONObject();
			JSONObject paramJObj = new JSONObject();
			mainJObj.put("jsonrpc", "2.0");
			mainJObj.put("method", "user.logout");
			mainJObj.put("params", new JSONArray(new Object[] {}));
			mainJObj.put("id", "1");
			mainJObj.put("auth", authToken);
			System.out.println(mainJObj);

			JSONObject result = executePostQuery(mainJObj);

			resultB = result.getBoolean("result");
			if (resultB) {
				System.out.println("Zabbix API logged out: " + resultB);
			}
		} catch (JSONException je) {
			System.out.println("Error logging out from Zabbix API, the token does not expire..." + je.getMessage());
		}
	}

	/**
	 * Build a json object for getting item (only item)..
	 * 
	 * @param authToken
	 * @param hostId
	 * @param itemKey
	 * @return a new JsonObject to use for query the zabbix server.
	 * @throws JSONException
	 */
	private JSONObject buildMainObjGetItem(final String authToken, final int hostId, final String itemKey)
			throws JSONException {
		JSONObject mainJObj = new JSONObject();
		JSONObject paramJObj = new JSONObject();
		JSONObject subparamJObj = new JSONObject();

		mainJObj.put("jsonrpc", "2.0");
		mainJObj.put("method", "item.get");
		paramJObj.put("output", "extend");
		paramJObj.put("hostids", hostId);
		subparamJObj.put("key_", itemKey);
		paramJObj.put("search", subparamJObj);
		mainJObj.put("params", paramJObj);
		mainJObj.put("auth", authToken);
		mainJObj.put("id", "1");
		return mainJObj;

	}

	/*
	 * public static void main(String[] args) { ZabbixDriver zabbix_obj = new
	 * ZabbixDriver(); String zabi = zabbix_obj.getAuthToken();
	 * //System.out.println(zabi); //zabbix_obj.hostgroups_list(zabi); //int hg_id =
	 * zabbix_obj.hostgroups_list(zabi, "Scalair scaling group");
	 * //System.out.println("hg_id  " + hg_id);
	 * 
	 * //zabbix_obj.hosts_list(zabi, "Scalair scaling group"); ////int arr[] =
	 * zabbix_obj.hosts_list(zabi); //ArrayList<Integer> arr =
	 * zabbix_obj.hosts_list(zabi, "Scalair scaling group"); //for(int
	 * i=0;i<arr.size();i++) {//length is the property of array, size of arraylist
	 * //System.out.println(arr.get(i)); }
	 * 
	 * //zabbix_obj.item_cpu_idle(zabi); //zabbix_obj.item(zabi, 10155,
	 * "vm.memory.size[available]"); //zabbix_obj.totalMemory(zabi, 10155);
	 * //zabbix_obj.availableMemory(zabi, 10155); zabbix_obj.totalCPUs(zabi, 10155);
	 * //Double xy = zabbix_obj.item_cpu_idle(zabi, "Scalair scaling group");
	 * //System.out.println("ouput " + xy);
	 * 
	 * //zabbix_obj.host_create(zabi, "node1", "172.16.225.76", 10050,
	 * "Scalair scaling group", "Scalair Template OS Linux"); //int x =
	 * zabbix_obj.get_template(zabi, "Scalair Template OS Linux");
	 * //zabbix_obj.host_delete(zabi, "172.16.225.76"); //int y =
	 * zabbix_obj.get_host_by_ip(zabi, "172.16.225.76"); //System.out.println(y); }
	 */

}
