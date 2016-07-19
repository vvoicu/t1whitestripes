package marius.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.tests.marius.CreateMultipleVacationRequestsTest;
import com.tests.marius.EvoPortalTestMarius;

@SuiteClasses({
	
	CreateMultipleVacationRequestsTest.class,
	EvoPortalTestMarius.class,
})

@RunWith(Suite.class)
public class PMUserTestSuite {


}