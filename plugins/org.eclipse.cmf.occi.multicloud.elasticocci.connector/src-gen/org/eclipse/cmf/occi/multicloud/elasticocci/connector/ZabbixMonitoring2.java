package org.eclipse.cmf.occi.multicloud.elasticocci.connector;
import org.json.JSONObject;
import org.json.JSONException;
import com.goebl.david.Webb;
import org.json.JSONArray;
//import java.lang.*;
import java.util.ArrayList;
 
public class ZabbixMonitoring2 {

	public String  connect() {
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
			JSONObject result = webb.post("http://172.16.225.30/zabbix/api_jsonrpc.php")
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

	public   void LogoutZabbixAPI(String zabi) {
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
			JSONObject result = webb.post("http://172.16.225.30/zabbix/api_jsonrpc.php")
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

	
    
	//zabbix_obj.host_create(zabi, vm_name, ip, 10050, hostgroup, "Scalair Template OS Linux");
	public void host_create(String zabi, String host_name, String host_ip, int port_num, String  hgroup, String template) {
        try {
            JSONObject mainJObj = new JSONObject();
            JSONObject paramJObj = new JSONObject();
            JSONObject subparamJObj = new JSONObject();
			JSONObject subparamJObj2 = new JSONObject();
			JSONObject subparamJObj3 = new JSONObject();			
			int template_id = get_template(zabi, template);
			int hg_id = hostgroups_list(zabi, hgroup);
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

            JSONObject result = webb.post("http://172.16.225.30/zabbix/api_jsonrpc.php")
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
  
	public int hostgroups_list(String zabi, String hg_name) { // get host group id by name
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

            JSONObject result = webb.post("http://172.16.225.30/zabbix/api_jsonrpc.php")
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
		return id; 
    }

    public int get_template(String zabi, String byname) {
		int template_id = 0;
        try {
            JSONObject mainJObj = new JSONObject();
            JSONObject paramJObj = new JSONObject();
            JSONObject subparamJObj = new JSONObject();

            mainJObj.put("jsonrpc", "2.0");
            mainJObj.put("method", "template.get");
            paramJObj.put("output", new JSONArray(new Object[] { "name", "templateid"}));
            subparamJObj.put("host", byname);
            paramJObj.put("filter", subparamJObj);
            mainJObj.put("params", paramJObj);
            mainJObj.put("auth", zabi);
            mainJObj.put("id", "1");
            Webb webb = Webb.create();
            System.out.println("Data to send: " + mainJObj.toString());

            JSONObject result = webb.post("http://172.16.225.30/zabbix/api_jsonrpc.php")
                .header("Content-Type", "application/json")
                .useCaches(false)
                .body(mainJObj)
                .ensureSuccess()
                .asJsonObject()
                .getBody();
			
            //String output = result.getString("result");
            //System.out.println("output   " + output) ;
            JSONArray output = result.getJSONArray("result");
            //System.out.println("output" + output);
            for (int i = 0; i < output.length(); ++i) {
                JSONObject obj = output.getJSONObject(i);
            	int id11 = obj.getInt("templateid");
           		//String name = obj.getString("name");
				template_id = id11;
            	//System.out.println( name  + " with id  " + id11);
           	}

        } catch (JSONException je) {
            System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
        }
		return template_id;
    }
	
    public void host_delete(String zabi, String  ip) {
        try {
            JSONObject mainJObj = new JSONObject();
			int host_id = get_host_by_ip(zabi, ip);			

            mainJObj.put("jsonrpc", "2.0");
            mainJObj.put("method", "host.delete");
            mainJObj.put("params", new JSONArray(new Object[] { host_id }));
            mainJObj.put("auth", zabi);
            mainJObj.put("id", "1");
            Webb webb = Webb.create();
            //System.out.println("Data to send: " + mainJObj.toString());

            JSONObject result = webb.post("http://172.16.225.30/zabbix/api_jsonrpc.php")
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
    
    public int  get_host_by_ip(String zabi, String ip) { // get host id from its ip, or name in order to delete it in the the function delethost.
        int id = 0;
		try {
            JSONObject mainJObj = new JSONObject();
            JSONObject paramJObj = new JSONObject();
            //int template_id = get_template(zabi, template);

            mainJObj.put("jsonrpc", "2.0");
            mainJObj.put("method", "hostinterface.get");
			paramJObj.put("output", "extend");
			paramJObj.put("sortfield", "interfaceid");
            mainJObj.put("params", paramJObj);
            mainJObj.put("auth", zabi);
            mainJObj.put("id", "1");
            Webb webb = Webb.create();
            System.out.println("Data to send: " + mainJObj.toString());

            JSONObject result = webb.post("http://172.16.225.30/zabbix/api_jsonrpc.php")
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
                String host_ip  = obj.getString("ip");
				if ((host_ip).equals (ip)) {
					int host_id = obj.getInt("hostid");
					id = host_id;
                	//System.out.println(" the ip of this host is  " + host_id);
				}
            }

        } catch (JSONException je) {
            System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
        }
		return id;
    } 
	
    public int  getHostByName(String zabi, String vmname) { // get host id from its ip, or name in order to delete it in the the function delethost.
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
            JSONObject result = webb.post("http://172.16.225.30/zabbix/api_jsonrpc.php")
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
    
    public ArrayList<Integer>  hosts_list(String zabi, String hg_name) { //give the hosts ids (list of hosts) in a specific host group. 
        ArrayList<Integer> arr = new ArrayList<Integer>();
		//int arr[] = new int[2];
        try {
            JSONObject mainJObj = new JSONObject();
            JSONObject paramJObj = new JSONObject();
            //JSONObject subparamJObj = new JSONObject();
			int hg_id = hostgroups_list(zabi, hg_name);	
			System.out.println("hg id " + hg_id);	
            mainJObj.put("jsonrpc", "2.0");
            mainJObj.put("method", "host.get");
			paramJObj.put("groupids", hg_id);
            paramJObj.put("output", new JSONArray(new Object[] { "name", "hostid"}));
            //subparamJObj.put("name", new JSONArray(new Object[] { "Linux servers", "Zabbix servers"}));
            //paramJObj.put("filter", subparamJObj);
            mainJObj.put("params", paramJObj);
            mainJObj.put("auth", zabi);
            mainJObj.put("id", "1");
            Webb webb = Webb.create();
            System.out.println("Data to send: " + mainJObj.toString());

            JSONObject result = webb.post("http://172.16.225.30/zabbix/api_jsonrpc.php")
                .header("Content-Type", "application/json")
                .useCaches(false)
                .body(mainJObj)
                .ensureSuccess()
                .asJsonObject()
                .getBody();

            //String output = result.getString("result");
			//System.out.println("output   " + output) ;
            JSONArray output = result.getJSONArray("result");
            System.out.println("output" + output);
			for (int i = 0; i < output.length(); ++i) {
            	JSONObject obj = output.getJSONObject(i);
            	int id = obj.getInt("hostid");
				//arr[i] = id;
				arr.add(id);
            	String name = obj.getString("name");
            	System.out.println("host   " + name  + " with id  " + id);
            }

        } catch (JSONException je) {
            System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
        }
		return arr;
    }
    // cpu usage 
    public Double item_cpu_idle(String zabi, int hostid) {
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

        	JSONObject result = webb.post("http://172.16.225.30/zabbix/api_jsonrpc.php")
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
    
    public Double cpuLoad(String zabi, int hostid) {
    	Double  value = 0.0;
    	try {
        	JSONObject mainJObj = new JSONObject();
        	JSONObject paramJObj = new JSONObject();
        	JSONObject subparamJObj = new JSONObject();

        	mainJObj.put("jsonrpc", "2.0");
        	mainJObj.put("method", "item.get");
        	paramJObj.put("output", "extend");
        	paramJObj.put("hostids", hostid ); //10155
			subparamJObj.put("key_", "system.cpu.load[percpu,avg1]");
        	paramJObj.put("search", subparamJObj);
			mainJObj.put("params", paramJObj);
        	mainJObj.put("auth", zabi);
        	mainJObj.put("id", "1");
        	Webb webb = Webb.create();
        	System.out.println("Data to send: " + mainJObj.toString());

        	JSONObject result = webb.post("http://172.16.225.30/zabbix/api_jsonrpc.php")
            	.header("Content-Type", "application/json")
            	.useCaches(false)
            	.body(mainJObj)
            	.ensureSuccess()
            	.asJsonObject()
            	.getBody();
        	JSONArray output = result.getJSONArray("result");
        	value = output.getJSONObject(0).getDouble("lastvalue");
        	System.out.println("cpu load " + value);
    	}catch (JSONException je) {
        	System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
    	}
    	return value;
    }
    // total size of memory
    public int totalMemory(String zabi, int hostid) {
    	int  value = 0;
    	try {
        	JSONObject mainJObj = new JSONObject();
        	JSONObject paramJObj = new JSONObject();
        	JSONObject subparamJObj = new JSONObject();

        	mainJObj.put("jsonrpc", "2.0");
        	mainJObj.put("method", "item.get");
        	paramJObj.put("output", "extend");
        	paramJObj.put("hostids", hostid ); //10155
			subparamJObj.put("key_", "vm.memory.size[total]"); //
        	//subparamJObj.put("key_", "vm.memory.size[used]");
        	paramJObj.put("search", subparamJObj);
			mainJObj.put("params", paramJObj);
        	mainJObj.put("auth", zabi);
        	mainJObj.put("id", "1");
        	Webb webb = Webb.create();
        	System.out.println("Data to send: " + mainJObj.toString());

        	JSONObject result = webb.post("http://172.16.225.30/zabbix/api_jsonrpc.php")
            	.header("Content-Type", "application/json")
            	.useCaches(false)
            	.body(mainJObj)
            	.ensureSuccess()
            	.asJsonObject()
            	.getBody();
        	System.out.println(result);
        	JSONArray output = result.getJSONArray("result");
        	String name = output.getJSONObject(0).getString("name");
        	value = output.getJSONObject(0).getInt("lastvalue");
        	System.out.println(name +"  "+ value);
    	}catch (JSONException je) {
        	System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
    	}
    	return value;
    }
    // memory used 
    public double availableMemory(String zabi, int hostid) {
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

        	JSONObject result = webb.post("http://172.16.225.30/zabbix/api_jsonrpc.php")
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
   
    // to get cpu numbers on the machine, note that you you can use one 
    //generic function for all items (the only thing that will be changed is the key)
    public int totalCPUs(String zabi, int hostid) {
    	int  value = 0;
    	try {
        	JSONObject mainJObj = new JSONObject();
        	JSONObject paramJObj = new JSONObject();
        	JSONObject subparamJObj = new JSONObject();

        	mainJObj.put("jsonrpc", "2.0");
        	mainJObj.put("method", "item.get");
        	paramJObj.put("output", "extend");
        	paramJObj.put("hostids", hostid ); //10155
			subparamJObj.put("key_", "system.cpu.num");
        	paramJObj.put("search", subparamJObj);
			mainJObj.put("params", paramJObj);
        	mainJObj.put("auth", zabi);
        	mainJObj.put("id", "1");
        	Webb webb = Webb.create();
        	System.out.println("Data to send: " + mainJObj.toString());

        	JSONObject result = webb.post("http://172.16.225.30/zabbix/api_jsonrpc.php")
            	.header("Content-Type", "application/json")
            	.useCaches(false)
            	.body(mainJObj)
            	.ensureSuccess()
            	.asJsonObject()
            	.getBody();
        	System.out.println(result);
        	JSONArray output = result.getJSONArray("result");
        	String name = output.getJSONObject(0).getString("name");
        	value = output.getJSONObject(0).getInt("lastvalue");
        	System.out.println(name +"  "+ value);
    	}catch (JSONException je) {
        	System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
    	}
    	return value;
    }
    // you do not need to use this function, instead, you will use the generic function metrics, each metric with a key.
    
    // You don not to use this.
    public Double item_cpu_idle1(String zabi, String hg_name) {
		Double cpu_total = 0.0;  // total cpu idle for all hosts in the hostgroup
		Double cpu_average = 0.0; // average cpu idle for all hosts in the hostgroup
		Double cpu_usage = 0.0;  // average cpu usage for all hosts in the hostgroup
		int count = 0;
		ArrayList<Integer> arr = hosts_list(zabi, hg_name);
		for(int n=0;n<arr.size();n++) {//length is the property of array, size of arraylist  
			//System.out.println(arr.get(n));
			int hostidd = arr.get(n);  
        	try {
            	JSONObject mainJObj = new JSONObject();
            	JSONObject paramJObj = new JSONObject();
            	JSONObject subparamJObj = new JSONObject();

            	mainJObj.put("jsonrpc", "2.0");
            	mainJObj.put("method", "item.get");
            	paramJObj.put("output", "extend");
            	paramJObj.put("hostids", hostidd);
				subparamJObj.put("key_", "system.cpu.util[,idle]");
            	paramJObj.put("search", subparamJObj);
				mainJObj.put("params", paramJObj);
            	mainJObj.put("auth", zabi);
            	mainJObj.put("id", "1");
            	Webb webb = Webb.create();
            	//System.out.println("Data to send: " + mainJObj.toString());

            	JSONObject result = webb.post("http://172.16.225.30/zabbix/api_jsonrpc.php")
                	.header("Content-Type", "application/json")
                	.useCaches(false)
                	.body(mainJObj)
                	.ensureSuccess()
                	.asJsonObject()
                	.getBody();

            	////String output = result.getString("result");
            	////System.out.println("output   " + output) ;
            	JSONArray output = result.getJSONArray("result");
            	//System.out.println("output" + output);
            	for (int i = 0; i < output.length(); ++i) {
                	JSONObject obj = output.getJSONObject(i);
                	//String name = obj.getString("name");
            		Double  value = obj.getDouble("lastvalue");
           			//System.out.println( name  + " is  " + value);
					cpu_total +=value;
           		}	

        	} catch (JSONException je) {
            	System.out.println("Error creating JSON request to Zabbix API..." + je.getMessage());
        	}
		count +=1;
		}
		//System.out.println("cpu total    " + cpu_total);
        //System.out.println("count  " + count);	
		cpu_average = cpu_total/count;
		//System.out.println("cpu average    " + cpu_average);	
		cpu_usage = 100 - cpu_average;
		System.out.println("cpu_usage cpu_usage cpu_usage    " + cpu_usage); 
		return cpu_usage;
    }
    
	public static void main(String[] args) {
		ZabbixMonitoring2 zabbix_obj = new ZabbixMonitoring2();
		String zabi = zabbix_obj.connect();
		//System.out.println(zabi);
		//zabbix_obj.hostgroups_list(zabi);
	    //int hg_id = zabbix_obj.hostgroups_list(zabi, "Scalair scaling group");	
		//System.out.println("hg_id  " + hg_id);

		//zabbix_obj.hosts_list(zabi, "Scalair scaling group");
		////int arr[] = zabbix_obj.hosts_list(zabi);
		//ArrayList<Integer> arr = zabbix_obj.hosts_list(zabi, "Scalair scaling group");
		//for(int i=0;i<arr.size();i++) {//length is the property of array, size of arraylist  
		//System.out.println(arr.get(i));  }
		
		//zabbix_obj.item_cpu_idle(zabi);
		//zabbix_obj.item(zabi, 10155, "vm.memory.size[available]");
		//zabbix_obj.totalMemory(zabi, 10155);
		double x = zabbix_obj.availableMemory(zabi, 10166); 
		System.out.println("hhhhhh" + x);
		//zabbix_obj.cpuLoad(zabi, 10155); 
		//zabbix_obj.cpuLoad(zabi, 10155); 
		//Double xy = zabbix_obj.item_cpu_idle(zabi, "Scalair scaling group");
		//System.out.println("ouput " + xy);

		//zabbix_obj.host_create(zabi, "node1", "172.16.225.76", 10050, "Scalair scaling group", "Scalair Template OS Linux");
		//int x = zabbix_obj.get_template(zabi, "Scalair Template OS Linux");
		//zabbix_obj.host_delete(zabi, "172.16.225.76");
		//int y = zabbix_obj.get_host_by_ip(zabi, "172.16.225.76");
		//System.out.println(y);
		
		//int y = zabbix_obj.getHostByName(zabi, "vertical");
		//System.out.println(y);
		//zabbix_obj.LogoutZabbixAPI(zabi);
	}	  
}
