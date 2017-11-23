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
 * - term: cpuusage
 * - title: 
 */
public class CpuusageConnector extends org.eclipse.cmf.occi.multicloud.occimonitoring.impl.CpuusageImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(CpuusageConnector.class);

	// Start of user code Cpuusageconnector_constructor
	/**
	 * Constructs a cpuusage connector.
	 */
	CpuusageConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
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
	// End of user code
	// Start of user code Cpuusage_Kind_getmetric_action
	/**
	 * Implement OCCI action:
     * - scheme: http://org.eclipse.cmf.occi.multicloud.occimonitoring/cpuusage/action#
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
		double cpuUsage = item_cpu_idle( zabi, hostid);
		((ZabbixinstanceConnector)zi).LogoutZabbixAPI(zabi);
		this.setCpuUsageCpuUsage(cpuUsage);
		
		//////////////////////////////////////////////////////////////
		//ZabbixinstanceConnector test = new ZabbixinstanceConnector();
		//System.out.println("id " + ((ZabbixinstanceConnector)zi));
		///System.out.println("id " + ((ZabbixinstanceConnector)zi).getZabbixinstancePort()); // this should work
		// TODO: Implement how to getmetric this cpuusage.
	}
	
	private Double item_cpu_idle(String zabi, int hostid) {
    	Double  value = 0.0;
    	try {
        	JSONObject mainJObj = new JSONObject();
        	JSONObject paramJObj = new JSONObject();
        	JSONObject subparamJObj = new JSONObject();

        	mainJObj.put("jsonrpc", "2.0");
        	mainJObj.put("method", "item.get");
        	paramJObj.put("output", "extend");
        	paramJObj.put("hostids", hostid ); //10155
			subparamJObj.put("key_", "system.cpu.util[,idle]");
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
        	JSONArray output = result.getJSONArray("result");
        	value = output.getJSONObject(0).getDouble("lastvalue");
        	//System.out.println("cpu idle " + value);
    	}catch (JSONException je) {
        	System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
    	}
    	Double cpuUsed = 100 - value;
    	return cpuUsed;
    }
	
		// End of user code

}	
