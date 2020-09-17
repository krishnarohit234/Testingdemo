
package com.app.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ServiceProp {
	public Properties sars;
	public ServiceProp() {
		 File fis=new File("service.properties");
			FileInputStream fs;
			try {
				fs = new FileInputStream(fis);
				sars=new Properties();
				sars.load(fs);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
	}
	
	
	
}