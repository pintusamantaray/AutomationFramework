package day5;

public class WhileLoopDemo {

	public static void main(String[] args) {
		//Example1 Print 1 t0 10
//		int i = 1;    //initialization
//		while(i<=10)  //Condition
//		{
//			System.out.println(i);
//			i++;   //incremental
//		}
		//Example2 Print Hello 5 times
//		int i =1;
//		while (i<5)
//		{
//			System.out.println("Hello");
//			i++;
//		}
		
		//Example3 only Even numbers between 1 to 100
		//Approach 1 with if else
		
		/*int i =1;
		while(i<=100)
		{
			if (i%2==0)
			{
			System.out.println(i);	
			}
			i++;
		}*/
		
		//Approch2 with i+=
		
		/*int i= 2;
		while (i<100)
		{
			System.out.println(i);
			i+=2;
		}*/
		
		//Specify Even or Odd number
		/*int i = 1;
		while (i<=10)
		{
			if (i%2==0)
			{
				System.out.println("The number is Even number "+i);
			}
			else
			{
				System.out.println("The number is odd "+i);
			}
			i++;
		}*/
		//Descending order
		/*int i = 10;
		while (i>=1)
		{
			System.out.println(i);
			i--;
			
		}*/
	}

}
