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

import org.eclipse.cmf.occi.infrastructure.Compute;
import org.eclipse.cmf.occi.core.Link;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Hostgroup;
import org.eclipse.cmf.occi.multicloud.occimonitoring.Zabbixtemplate;
import org.eclipse.cmf.occi.multicloud.vmware.Instancevmware;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import com.goebl.david.Webb;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://org.eclipse.cmf.occi.multicloud.occimonitoring#
 * - term: zabbixinstance
 * - title: 
 */
public class ZabbixinstanceConnector extends org.eclipse.cmf.occi.multicloud.occimonitoring.impl.ZabbixinstanceImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(ZabbixinstanceConnector.class);

	// Start of user code Zabbixinstanceconnector_constructor
	/**
	 * Constructs a zabbixinstance connector.
	 */
	ZabbixinstanceConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code ZabbixinstanceocciCreate
	/**
	 * Called when this Zabbixinstance instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		String name = "";
		String ip = "";
		int hostgid = 0;
		int templateId = 0;
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
		for (Link link : this.getLinks()) {
			System.out.println(" linKKKKKKKKKK  " + link);
			//System.out.println(" host name " + link.getTarget().getTitle());
			link.getTarget().getTitle();
			if(link.getTarget() instanceof Hostgroup) {
				//Hostgroup hg = (Hostgroup)link.getTarget();
				//int hostgroupid = hg.getHostgroupIdentifier();
				Hostgroup hg = (Hostgroup)link.getTarget();
				hostgid = hg.getHostgroupIdentifier();
				System.out.println("host id " + hostgid);
			}
			if(link.getTarget() instanceof Zabbixtemplate) {
				Zabbixtemplate zt = (Zabbixtemplate)link.getTarget();
				templateId = zt.getZabbixtemplateIdentifier();
				System.out.print("templat id " + templateId);
			}
			
			if(link.getTarget() instanceof Instancevmware) {
				Instancevmware inst = (Instancevmware)link.getTarget();
				name = link.getTarget().getAttributes().get(1).getValue(); // there is no inst.getTitle();
				ip = inst.getGuestIpv4Address(); //getAttributes().get(1).getValue();
				this.setTitle(name);
				System.out.print("name " + name);
				System.out.print("ip " + ip);
				this.setZabbixinstanceIp(ip);
			}
			
		}
		int port = getZabbixinstancePort();
		System.out.print("port" + port);
		String zabi = connect();
		host_create(zabi, name, ip, port, hostgid, templateId);
		LogoutZabbixAPI(zabi);
	}
	// End of user code

	// Start of user code Zabbixinstance_occiRetrieve_method
	/**
	 * Called when this Zabbixinstance instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
		String zabi = connect();
		int id = getHostByName(zabi, getTitle());
		this.setZabbixinstanceIdentifier(id);
	}
	// End of user code

	// Start of user code Zabbixinstance_occiUpdate_method
	/**
	 * Called when this Zabbixinstance instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code ZabbixinstanceocciDelete_method
	/**
	 * Called when this Zabbixinstance instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
		String zabi = connect();
		host_delete( zabi, getTitle());
		this.setTitle(null);
		this.setZabbixinstanceIdentifier(null);
		this.setZabbixinstanceIp(null);
	}
	
	
	protected String connect() {
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
	
	protected void LogoutZabbixAPI(String zabi) {
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
	
	public void host_create(String zabi, String host_name, String host_ip, int port_num, int  hg_id, int template_id) {
        try {
            JSONObject mainJObj = new JSONObject();
            JSONObject paramJObj = new JSONObject();
            JSONObject subparamJObj = new JSONObject();
			JSONObject subparamJObj2 = new JSONObject();
			JSONObject subparamJObj3 = new JSONObject();			
			//int template_id = get_template(zabi, template);
			//int hg_id = hostgroups_list(zabi, hgroup);
			mainJObj.put("jsonrpc", "2.0");
            mainJObj.put("method", "host.create");
            
			paramJObj.put("host", host_name);
			subparamJObj.put("type", "1");
			subparamJObj.put("main", "1");
			subparamJObj.put("useip", "1");
			subparamJObj.put("ip", host_ip);
			subparamJObj.put("dns", "1");
			subparamJObj.put("port", port_num);
			paramJObj.put("interfaces", new JSONArray(new Object[] { subparamJObj}));

			subparamJObj2.put("groupid", hg_id);
            paramJObj.put("groups", new JSONArray(new Object[] { subparamJObj2 }));

			subparamJObj3.put("templateid", template_id);
			paramJObj.put("templates", new JSONArray(new Object[] { subparamJObj3 }));

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

			//System.out.println("output   " + result) ;

        } catch (JSONException je) {
            System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
        }
    }
	
	private int  getHostByName(String zabi, String vmname) { // get host id from its ip, or name in order to delete it in the the function delethost.
        int id = 0;
		try {
            JSONObject mainJObj = new JSONObject();
            JSONObject paramJObj = new JSONObject();
            JSONObject subparamJObj = new JSONObject();
            //int template_id = get_template(zabi, template);

            mainJObj.put("jsonrpc", "2.0");
            mainJObj.put("method", "host.get");
			paramJObj.put("output", "extend");
			paramJObj.put("filter", subparamJObj);
			subparamJObj.put("host", new JSONArray(new Object[] {vmname}));
			//paramJObj.put("sortfield", "interfaceid");
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

            //System.out.println("output   " + result) ;
			JSONArray output = result.getJSONArray("result");
            //System.out.println("output" + output);
            for (int i = 0; i < output.length(); ++i) {
                JSONObject obj = output.getJSONObject(i);
				//System.out.println("input ip" + ip);
                //String host_ip  = obj.getString("ip");
				//if ((host_ip).equals (ip)) {
				//	int host_id = obj.getInt("hostid");
				//	id = host_id;
				id = obj.getInt("hostid");	
                	//System.out.println(" the ip of this host is  " + host_id);
				//}
            }

        } catch (JSONException je) {
            System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
        }
		return id;
    }
	
	public void host_delete(String zabi, String  vmname) {
        try {
            JSONObject mainJObj = new JSONObject();
			int host_id = getHostByName(zabi, vmname);			

            mainJObj.put("jsonrpc", "2.0");
            mainJObj.put("method", "host.delete");
            mainJObj.put("params", new JSONArray(new Object[] { host_id }));
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

            //System.out.println("output   " + result) ;

        } catch (JSONException je) {
            System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
        }
    }
	// End of user code

	//
	// Zabbixinstance actions.
	//
}	
