package com.comcast.crm.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class FileUtility {

	public String getDataFromPropertiesFile(String Key) throws Exception {
	FileInputStream fis=new FileInputStream("./configAppData/commondata.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String data=pobj.getProperty(Key);
		return data;
		

	}

}
