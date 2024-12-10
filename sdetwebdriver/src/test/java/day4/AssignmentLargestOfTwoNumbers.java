package day4;

public class AssignmentLargestOfTwoNumbers {

	public static void main(String[] args) {
		// Largest of two number using if else
		int a= 10, b= 15;
		
		if (a>b)
		{
			System.out.println("A is The largest number"+a);
		}
		else
		{
			System.out.println("B is The largest number"+b);
		}
		// Largest of two numbers using Ternary operator
		int res =(a>b)?a:b;
		System.out.println("The largest number is"+res);
		
	}

}
