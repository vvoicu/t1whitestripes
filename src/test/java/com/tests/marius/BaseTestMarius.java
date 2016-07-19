package com.tests.marius;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Managed;
import utils.Constants;

public class BaseTestMarius {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	public String url;
	public String userName;
	public String passWord;

	@Before
	public void datSetup() {

		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(Constants.CONFIG_FILE_PATH);

			// load a properties file
			prop.load(input);

			url = prop.getProperty("url");
			userName = prop.getProperty("userName");
			passWord = prop.getProperty("password");
			// // get the property value and print it out
			// System.out.println(prop.getProperty("url"));
			// System.out.println(prop.getProperty("userName"));
			// System.out.println(prop.getProperty("password"));

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

//	@After
//	public void dataPersistance() throws IOException {
//		Properties prop = new Properties();
//		OutputStream output = null;
//
//		// output = new FileOutputStream("configMariusOutput.properties");
//		output = new FileOutputStream(getClass().getSimpleName() + ". properties");
//
//		prop.setProperty("randomNumber", "73");
//		prop.setProperty("me", "Myself");
//
//		prop.store(output, "Generate random number from test");
//	}

}
