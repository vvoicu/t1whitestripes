
package com.tests.andrada;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.WebDriver;

import net.thucydides.core.annotations.Managed;
import utils.Constants;

@RunWith(JUnit4.class)
public class PropertyWriteTest {

	@Managed(uniqueSession = true)
	public WebDriver webdriver;

	String filePath = Constants.CONFIG_FILE_PATH;

	@Test
	public void dataWrite() throws IOException {

		File f = new File(filePath);
		OutputStream out = new FileOutputStream(f);

		Properties prop = new Properties();
		OutputStream output = null;

		if (!f.exists()) {
			f.createNewFile();
		}

		prop.setProperty("lalala", "11");
		prop.setProperty("user", "111");
		prop.store(out, "This is an optional header comment string");

	}
}
