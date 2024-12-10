package day7;

public class Repeated_Numbers {

	public static void main(String[] args) {
		// Find the repeated nubmers
		int a[]= {10,20,10,30,40,10,20,20,22,10};
		int num=22;
		int count=0;
		
		for(int value:a)
		{
			//System.out.println(value);
			if (value==num)
			{
				count++;
			}
		}
		System.out.println(count);
		
	}

}
