package com.tests.andrada;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tests.LogInTest;



@RunWith(Suite.class)
@SuiteClasses({
		LogInTest.class,
		FilterAndTableTest.class,
		FilterCheckboxesTest.class,
		FilterListTest.class,
		FutureVacationsCheckboxTest.class,
		
		
})
public class TestSuiteForMyRequests {
}
