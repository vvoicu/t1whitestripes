package com.tests.marius;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import org.junit.Test;
import org.junit.runner.RunWith;
import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
public class PropertyWriteTestMarius extends BaseTestMarius {
//  public static void main(String[] args) {
//	
//	Properties prop = new Properties();
//	OutputStream output = null;
//  }

	@Test
	public void propertyWriteTestMarius() throws IOException {
		Properties prop = new Properties();
		OutputStream output = null;

		// output = new FileOutputStream("configMariusOutput.properties");
		output = new FileOutputStream(getClass().getSimpleName() + ".properties");

		prop.setProperty("randomNumber", "124");
		prop.setProperty("me", "Myself");

		prop.store(output, "Generate random number from test");
	}
  
}