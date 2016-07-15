package com.tests.andrada;

import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import net.serenitybdd.junit.runners.SerenityRunner;

@RunWith(SerenityRunner.class)
@SuiteClasses({
	
		FilterAndTableTest.class,
		FilterCheckboxesTest.class,
		FilterListTest.class,
		FutureVacationsCheckboxTest.class,
		
		
})
public class TestSuiteForMyRequests {
}
