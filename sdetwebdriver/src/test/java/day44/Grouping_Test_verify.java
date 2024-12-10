package day44;

import org.testng.annotations.Test;

public class Grouping_Test_verify {
	
	@Test(groups= {"sanity","Regression","functional"})
	void paymentbycard()
	{
		System.out.println("This is credit card payment");
	}
	@Test(groups= {"sanity","Regression","functional"})
	void payemntbyupi()
	{
		System.out.println("This is Upi payment");
	}

}
