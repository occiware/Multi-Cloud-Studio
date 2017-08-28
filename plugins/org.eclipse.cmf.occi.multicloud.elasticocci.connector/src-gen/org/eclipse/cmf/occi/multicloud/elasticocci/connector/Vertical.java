package org.eclipse.cmf.occi.multicloud.elasticocci.connector;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.goebl.david.Webb;

public class Vertical {
	
	public void addCPU(String vmname, int cpus) {
		try {
			JSONObject mainJObj = new JSONObject();
			JSONObject paramJObj = new JSONObject();
			mainJObj.put("kind", "http://occiware.org/occi/infrastructure/vmware#instancevmware");
			mainJObj.put("mixins", new JSONArray(new Object[] {"http://occiware.org/occi/infrastructure/vmware#vmwarefolders"}));
			//paramJObj.put("occi.compute.cores", 1);
			//paramJObj.put("occi.compute.memory", memsize);
			//paramJObj.put("inventorypath", "/INRIA/test");
			paramJObj.put("vcpu", cpus);
			mainJObj.put("attributes", paramJObj);
			Webb webb = Webb.create();
			System.out.println(mainJObj);
			JSONObject result = webb.post("http://martserver-vmware.cloudsystem.fr:8080/instances/"+vmname)
            	.header("Content-Type", "application/json")
            	.header("accept", "application/json")
                .useCaches(false)
                .body(mainJObj)
                .ensureSuccess()
                .asJsonObject()
                .getBody();
		} catch (JSONException je) {
 			System.out.println("failed to resize VM..." + je.getMessage());
		}
	}
	
	public void addMemSize(String vmname, double memSize) {
		try {
			JSONObject mainJObj = new JSONObject();
			JSONObject paramJObj = new JSONObject();
			mainJObj.put("kind", "http://occiware.org/occi/infrastructure/vmware#instancevmware");
			mainJObj.put("mixins", new JSONArray(new Object[] {"http://occiware.org/occi/infrastructure/vmware#vmwarefolders"}));
			//paramJObj.put("occi.compute.cores", 1);
			//paramJObj.put("occi.compute.memory", memsize);
			//paramJObj.put("inventorypath", "/INRIA/test");
			paramJObj.put("occi.compute.memory", memSize);
			mainJObj.put("attributes", paramJObj);
			Webb webb = Webb.create();
			System.out.println(mainJObj);
			JSONObject result = webb.post("http://martserver-vmware.cloudsystem.fr:8080/instances/"+vmname)
            	.header("Content-Type", "application/json")
            	.header("accept", "application/json")
                .useCaches(false)
                .body(mainJObj)
                .ensureSuccess()
                .asJsonObject()
                .getBody();
		} catch (JSONException je) {
 			System.out.println("failed to resize VM..." + je.getMessage());
		}
	}

	public int getCPUs(String vmname) {
		int cpusTotal = 0;
		Webb webb = Webb.create();
		try {
			JSONObject result = webb.get("http://martserver-vmware.cloudsystem.fr:8080/instances/"+vmname)
					.header("accept", "application/json")
					.useCaches(false)
					.ensureSuccess()
					.asJsonObject()
					.getBody();
			JSONObject attributes = result.getJSONObject("attributes");
			cpusTotal = attributes.getInt("vcpu");	
		} catch (JSONException je) {
 			System.out.println("failed to retrieve object" + je.getMessage());
		} 
		return cpusTotal;
	}
	
	public double getMemSize(String vmname) {
		double memSize = 0;
		Webb webb = Webb.create();
		try {
			JSONObject result = webb.get("http://martserver-vmware.cloudsystem.fr:8080/instances/"+vmname)
					.header("accept", "application/json")
					.useCaches(false)
					.ensureSuccess()
					.asJsonObject()
					.getBody();
			JSONObject attributes = result.getJSONObject("attributes");
			memSize = attributes.getDouble("occi.compute.memory");	
		} catch (JSONException je) {
 			System.out.println("failed to retrieve object" + je.getMessage());
		} 
		return memSize;
	}
	
	public static void main(String[] args) {
		Vertical ver = new Vertical();
		//vminterface.cloneVmTemplate("template","vertical");
		//ver.addCPU("vertical",2);
		//System.out.println(ver.getCPUs("vertical"));
		System.out.println(ver.getMemSize("vertical"));
		//System.out.println(ip);
		//ver.addMemSize("vertical",2.75);
		Scanner user_input = new Scanner( System.in );
		System.out.println("choose elasticity mode (manuel, dynamic, schudeled):");
		String mode = user_input.next( );
		
		switch (mode.toLowerCase()) {
        case "manuel":
        	System.out.println(mode);
            break;
        case "dynamic":
        	System.out.println(mode);
            break;
        case "scheduled":
        	System.out.println(mode);
            break;
        default: 
        	System.out.println("The keywords entered are not correct, the modes supported are: manuel, dynamic and schudeled ");
            break;
		}
	}
}
