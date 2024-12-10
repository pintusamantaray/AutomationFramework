package day4;

public class IncrermenetAndDecrementOperatos {

	public static void main(String[] args)
	{
		//Incremental
		int a=5, b=10;
		int res=a++;
		
		System.out.println(res); //This is post increment
		System.out.println(a); 
	
		int res1=++b;
		
		System.out.println(res1); //This is pre increment
		System.out.println(b); 
		
		//Decremental
		int c=8, d=9;
		int res2=c--;
		
		System.out.println(res2); //This is post increment
		System.out.println(c);
		
		int res3=--d;
		
		System.out.println(res3); //This is post increment
		System.out.println(d);
		
		//Assignment
		int age=18;
		//age= age+=3; //first menthod
		age+=4; //second method
		System.out.println(age); //This is post increment
//		System.out.println(age);
	}

}
