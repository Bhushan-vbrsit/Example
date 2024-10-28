package com.qa.util;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;

	public class Config_Reader {
	private Properties prop;

	public Properties init_prop() {
		try {
		 prop=new Properties();
		FileInputStream file=new FileInputStream("F:\\Cucumber_Structure\\Practice_cucumber\\src\\test\\resource\\com\\qa\\config\\Config_Properties");
		prop.load(file);
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		return prop;
	}
	}

