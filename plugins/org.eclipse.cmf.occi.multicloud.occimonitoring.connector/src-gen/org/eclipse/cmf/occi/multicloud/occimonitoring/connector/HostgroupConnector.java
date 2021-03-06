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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.goebl.david.Webb;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.occimonitoring#
 * - term: hostgroup
 * - title: 
 */
public class HostgroupConnector extends org.eclipse.cmf.occi.multicloud.occimonitoring.impl.HostgroupImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(HostgroupConnector.class);

	// Start of user code Hostgroupconnector_constructor
	/**
	 * Constructs a hostgroup connector.
	 */
	HostgroupConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code HostgroupocciCreate
	/**
	 * Called when this Hostgroup instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Hostgroup_occiRetrieve_method
	/**
	 * Called when this Hostgroup instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
		String zabi = connect();
		String hg_name  = getTitle();
		int id = 0;
        try {
            JSONObject mainJObj = new JSONObject();
            JSONObject paramJObj = new JSONObject();
			JSONObject subparamJObj = new JSONObject();

            mainJObj.put("jsonrpc", "2.0");
            mainJObj.put("method", "hostgroup.get");

            paramJObj.put("output", "extend");
			
			//subparamJObj.put("name", new JSONArray(new Object[] { "Linux servers", "Zabbix servers"}));
			subparamJObj.put("name", hg_name); // get hg by name
			paramJObj.put("filter", subparamJObj);

            mainJObj.put("params", paramJObj);
            mainJObj.put("auth", zabi);
			mainJObj.put("id", "1");

            Webb webb = Webb.create();

            System.out.println("Data to send: " + mainJObj.toString());

            JSONObject result = webb.post("http://172.16.225.37/zabbix/api_jsonrpc.php")
                .header("Content-Type", "application/json")
                .useCaches(false)
                .body(mainJObj)
                .ensureSuccess()
                .asJsonObject()
                .getBody();
			
			//String output = result.getString("result");
			JSONArray output = result.getJSONArray("result");
			System.out.println("output" + output);
			for (int i = 0; i < output.length(); ++i) {
            	JSONObject obj = output.getJSONObject(i);
				System.out.println("group name  " + obj);
    			id = obj.getInt("groupid");
    			String name = obj.getString("name");
				System.out.println("group   " + name  + " with id  " + id);
			}

        } catch (JSONException je) {
            System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
        }
        setHostgroupIdentifier(id);
        LogoutZabbixAPI(zabi);
		//return id; 
	}
	// End of user code

	// Start of user code Hostgroup_occiUpdate_method
	/**
	 * Called when this Hostgroup instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code HostgroupocciDelete_method
	/**
	 * Called when this Hostgroup instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
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
	
	// End of user code

	//
	// Hostgroup actions.
	//
}	
