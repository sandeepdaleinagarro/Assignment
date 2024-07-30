package com.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	public Properties prop;
	
	public ConfigReader() {
		try {
			loadProperties();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadProperties() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream(new File("./src/test/resources/config/config.properties")));
	}
	
	public String getProperty(String propKey) {
		return prop.getProperty(propKey);
		
	}

}
