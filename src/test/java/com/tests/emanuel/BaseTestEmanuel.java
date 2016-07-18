package com.tests.emanuel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.selenium.steps.LogInSteps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import utils.Constants;

public class BaseTestEmanuel {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	public String url;
	public String userName;
	public String passWord;

	Properties prop = new Properties();
	InputStream input = null;
	
	@Steps
	LogInSteps logInSteps;

	@Before
	public void dataSetup() throws IOException {

		input = new FileInputStream(Constants.CONFIG_FILE_PATH);
		prop.load(input);

		url = prop.getProperty("url");
		userName = prop.getProperty("userName");
		passWord = prop.getProperty("password");
		
		System.out.println(url);
		System.out.println(userName);
		System.out.println(passWord);
		
		logInSteps.openEvoPortalPage(url);
		logInSteps.enterUserName(userName);
		logInSteps.enterPassword(passWord);
		logInSteps.clickOnSingInButton();

	}
	
	@After
	public void dataPersistance() throws IOException{
		
		Properties prop = new Properties();
		OutputStream output = null;

		

			output = new FileOutputStream(getClass().getSimpleName() + ".properties");

			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "mkyong");
			prop.setProperty("dbpassword", "password");

			// save properties to project root folder
			prop.store(output, "Properties file");

	  }
}

