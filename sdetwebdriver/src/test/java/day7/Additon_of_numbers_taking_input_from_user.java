package day7;

import java.util.Scanner;

public class Additon_of_numbers_taking_input_from_user {

	public static void main(String[] args) {
		// Add numbers form user input
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter second number: ");
		int num2= sc.nextInt();
		System.out.println("The adition of two numbers is: "+(num1 + num2));

	}

}
