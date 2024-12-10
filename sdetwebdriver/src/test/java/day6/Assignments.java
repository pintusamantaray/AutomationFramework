package day6;

public class Assignments {

	public static void main(String[] args) {
		// TFind Sum of Elements
//		
//		int a []= {1,2,3,4,5};
//		int sum = 0;
//		for (int num : a)
//		{
//			sum += num;
//		}
//		System.out.println("Sum of the array "+sum);
		
//		//Find Even numbers
//		int arr[]= {1,2,3,4,5,6,7,8,9};
//		System.out.print("Even numbers: ");
//		for (int num : arr)
//		{
//			if (num%2==0)
//			{
//				System.out.print(num+" ");
//			}
//		}
		
		//Print Even and odd numbers from array
		int arr []= {1,2,3,4,5,6};
		System.out.print("Even numbers are: ");
		for(int even : arr)
		{
			if (even%2==0)
			{
				System.out.print(even+" ");
			}
		}
		
		System.out.println(); // This to add a new line in between even and odd numbers
		
		System.out.print("Odd numbers are: ");
		for(int odd : arr)
		{
			if (odd%2!=0)
			{
				System.out.print(odd+" ");
			}
		
		}
	}

}
