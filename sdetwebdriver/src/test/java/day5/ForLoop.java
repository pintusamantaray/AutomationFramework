package day5;

public class ForLoop {

	public static void main(String[] args) {
		// For loop example print 1 to 100 using for loop
		/*for (int i=1;i<100;i++)
		{
			System.out.println(i);
		}*/
		//Print only Even numbers from 1 to 100
		
		for (int i=1; i<100; i++)
		{
			if (i%2==0)
			{
				System.out.println(i + " Even");
			}
			else
				System.out.println(i + " Odd");
		}

	}

}