package com.tests.emanuel;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tests.LogInTest;

@RunWith(Suite.class)
@SuiteClasses({
	
	LogInTest.class,
	NewVacationRequestTest.class,
	VacationTypeTest.class,
	
	
})

public class NewVacationRequestTestSuite {

}
