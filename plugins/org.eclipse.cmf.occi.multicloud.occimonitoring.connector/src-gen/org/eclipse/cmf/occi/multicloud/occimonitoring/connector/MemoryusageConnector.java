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
 * Generated at Tue Oct 03 17:45:32 CEST 2017 from platform:/resource/org.eclipse.cmf.occi.multicloud.occimonitoring/model/occimonitoring.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package org.eclipse.cmf.occi.multicloud.occimonitoring.connector;

import org.eclipse.cmf.occi.core.Resource;
import org.eclipse.cmf.occi.multicloud.occimonitoring.impl.ZabbixinstanceImpl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.goebl.david.Webb;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.occimonitoring#
 * - term: memoryusage
 * - title: 
 */
public class MemoryusageConnector extends org.eclipse.cmf.occi.multicloud.occimonitoring.impl.MemoryusageImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(MemoryusageConnector.class);

	// Start of user code Memoryusageconnector_constructor
	/**
	 * Constructs a memoryusage connector.
	 */
	MemoryusageConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	// Start of user code Memoryusage_Kind_getmetric_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.occimonitoring/memoryusage/action#
     * - term: getmetric
     * - title: 
	 */
	@Override
	public void getmetric()
	{
		LOGGER.debug("Action getmetric() called on " + this);
		Resource res = (Resource) this.eContainer();
		ZabbixinstanceImpl zi = (ZabbixinstanceImpl) res;
		String zabi = ((ZabbixinstanceConnector)zi).connect();
		System.out.println("zi.getZabbixinstancePort() " +zi.getZabbixinstancePort());
		int hostid = zi.getZabbixinstanceIdentifier();
		double memused = availableMemory( zabi, hostid);
		((ZabbixinstanceConnector)zi).LogoutZabbixAPI(zabi);
		this.setMemoryUsageMemUsage(memused);;

		LOGGER.debug("Action getmetric() called on " + this);
		//String zabi = connect();
		//double memused = availableMemory(zabi, 10192);
		//LogoutZabbixAPI(zabi);
		//this.setMemoryUsageMemUsage(memused);
		// memory used % = ((total - mem avail) / total)*100

		// TODO: Implement how to getmetric this memoryusage.
	}
		// End of user code
	private double availableMemory(String zabi, int hostid) {
    	double  value = 0;
    	try {
        	JSONObject mainJObj = new JSONObject();
        	JSONObject paramJObj = new JSONObject();
        	JSONObject subparamJObj = new JSONObject();

        	mainJObj.put("jsonrpc", "2.0");
        	mainJObj.put("method", "item.get");
        	paramJObj.put("output", "extend");
        	paramJObj.put("hostids", hostid ); //10155
			subparamJObj.put("key_", "vm.memory.size[available]");
        	paramJObj.put("search", subparamJObj);
			mainJObj.put("params", paramJObj);
        	mainJObj.put("auth", zabi);
        	mainJObj.put("id", "1");
        	Webb webb = Webb.create();
        	//System.out.println("Data to send: " + mainJObj.toString());

        	JSONObject result = webb.post("http://172.16.225.37/zabbix/api_jsonrpc.php")
            	.header("Content-Type", "application/json")
            	.useCaches(false)
            	.body(mainJObj)
            	.ensureSuccess()
            	.asJsonObject()
            	.getBody();
        	//System.out.println(result);
        	JSONArray output = result.getJSONArray("result");
        	String name = output.getJSONObject(0).getString("name");
        	value = output.getJSONObject(0).getDouble("lastvalue");
        	//System.out.println(name +"  "+ value);
    	}catch (JSONException je) {
        	System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
    	}
    	value = (value/1073741824);
    	return value;
    }
   
	private String  connect() {
		String str = "";
		try {
			JSONObject mainJObj = new JSONObject();
			JSONObject paramJObj = new JSONObject();
			mainJObj.put("jsonrpc", "2.0");
			mainJObj.put("method", "user.login");
 			
			paramJObj.put("user", "Admin"); // username
			paramJObj.put("password", "zabbixyehia"); // passwor
 
			mainJObj.put("params", paramJObj);
			mainJObj.put("id", "1");
 
			Webb webb = Webb.create();
			JSONObject result = webb.post("http://172.16.225.37/zabbix/api_jsonrpc.php")
            	.header("Content-Type", "application/json")
                .useCaches(false)
                .body(mainJObj)
                .ensureSuccess()
                .asJsonObject()
                .getBody();
		str =  result.getString("result");
		} catch (JSONException je) {
 			System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
		}
		return str;
	}
	
	private void LogoutZabbixAPI(String zabi) {
		Boolean str = false;
		try {
			JSONObject mainJObj = new JSONObject();
			JSONObject paramJObj = new JSONObject();
			mainJObj.put("jsonrpc", "2.0");
			mainJObj.put("method", "user.logout");
			mainJObj.put("params", new JSONArray(new Object[] {}));
			mainJObj.put("id", "1");
			mainJObj.put("auth", zabi);
			System.out.println(mainJObj);
			Webb webb = Webb.create();
			JSONObject result = webb.post("http://172.16.225.37/zabbix/api_jsonrpc.php")
            	.header("Content-Type", "application/json")
                .useCaches(false)
                .body(mainJObj)
                .ensureSuccess()
                .asJsonObject()
                .getBody();
		str =  result.getBoolean("result");
		if (str == true){
			System.out.println("Zabbix API logged out: " + str);
		}
		} catch (JSONException je) {
 			System.out.println("Error logging out from Zabbix API, the token does not expire..." + je.getMessage());
		}
	}

}	
