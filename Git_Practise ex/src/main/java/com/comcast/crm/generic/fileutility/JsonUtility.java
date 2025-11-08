package com.comcast.crm.generic.fileutility;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonUtility {
	public String getDataFromJsonFile(String key) throws Throwable 
	{
		FileReader fileR=new FileReader("C:\\Users\\Admin\\eclipse-workspace\\ComcastCRMGUIFramework\\configAppData\\JSONdata.json");
		JSONParser Parser=new JSONParser();
		Object obj=Parser.parse(fileR);
		JSONObject map=(JSONObject)obj;	
		String data=(String) map.get(key);
		return data;
		
	}

}
