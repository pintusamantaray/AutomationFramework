package day44;

import org.testng.annotations.Test;

public class Grouping_Test {
	
	@Test(groups= {"sanity"})
	void loginbymail()
	{
		System.out.println("This is login by Email");
	}
	@Test(groups= {"sanity"})
	void loginbyfacebook()
	{
		System.out.println("this is login by facebook");
	}
	@Test(groups= {"sanity"})
	void loginbyphone()
	{
		System.out.println("This is login by phone number");
	}

}
