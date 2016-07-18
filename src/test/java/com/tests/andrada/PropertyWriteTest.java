
	package com.tests.andrada;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Managed;
import utils.Constants;

public class PropertyWriteTest {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	public String url;
	public String userName;
	public String passWord;
	
	@Before
	public void dataSetup() {

		Properties prop = new Properties();
		InputStream output = null;

		try {

			output = new FileInputStream(Constants.CONFIG_FILE_PATH);

			// load a properties file
			prop.load(output);
			
			url = prop.getProperty(" url");
			userName = prop.getProperty("userName");
			passWord = prop.getProperty("password");
//			// get the property value and print it out
//			System.out.println(prop.getProperty("url"));
//			System.out.println(prop.getProperty("userName"));
//			System.out.println(prop.getProperty("password"));

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}
