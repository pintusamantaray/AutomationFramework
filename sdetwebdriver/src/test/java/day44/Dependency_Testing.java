package day44;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class Dependency_Testing {
	
	
	@Test
	void login()
	{
		AssertJUnit.assertTrue(true);
	}
	@Test(dependsOnMethods={"login"})
	void openapp()
	{
		AssertJUnit.assertTrue(false);
	}
	@Test(dependsOnMethods={"openapp"})
	void search()
	{
		AssertJUnit.assertTrue(true);
	}
	@Test(dependsOnMethods={"openapp"})
	void logout()
	{
		AssertJUnit.assertTrue(true);
	}
	

}
