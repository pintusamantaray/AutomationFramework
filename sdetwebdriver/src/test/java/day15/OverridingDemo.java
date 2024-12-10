package day15;

class bank
{
	double roi()
	{
		return 7;
	}
}

class ICICI extends bank
{
	double roi()
	{
		return 10.5;
	}
}

class SBI extends bank
{
	double roi()
	{
		return 9.5;
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		SBI intrestrate= new SBI();
		intrestrate.roi();
		

	}

}
