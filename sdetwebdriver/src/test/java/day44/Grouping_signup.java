package day44;

import org.testng.annotations.Test;

public class Grouping_signup {
	
	@Test(groups= {"Regression"})
	void signupbymail()
	{
		System.out.println("This is mail signup");
	}
	@Test(groups= {"Regression"})
	void signupbyfacebook()
	{
		System.out.println("This is by facebook signup");
	}
	@Test(groups= {"Regression"})
	void singuobynumber()
	{
		System.out.println("This is number signup");
	}

}
