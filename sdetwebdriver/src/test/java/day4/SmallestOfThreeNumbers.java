package day4;

public class SmallestOfThreeNumbers {

	public static void main(String[] args) {
		// Smallest of three numbers using else if
		int a=15, b=10, c=5;
		if ((a<b) && (a<c))
		{
			System.out.println("a is the samllest number which is "+a);
		}
		else if ((b<a) && (b<c))
		{
			System.out.println("b is the smallest number which is "+b);
		}
		else
		{
			System.out.println("C is the smallest number whic is "+c);
		}

	}

}
