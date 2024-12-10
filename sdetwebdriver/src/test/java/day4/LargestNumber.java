package day4;

public class LargestNumber {

	public static void main(String[] args) {
		int a=30, b= 15, c=20;
		
		if ((a>b) && (a>c))
		{
			System.out.println("a is the largest number");
		}
		else if ((b>a) && (b>c))
		{
			System.out.println("b is the largest number");
		}
		else 
		{
			System.out.println("c is the largest number");
		}
	}

}
