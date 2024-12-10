package day6;

public class Arrays {

	public static void main(String[] args) {
		
		//One Dimensional Array
		
		/*int a[]= {100,200,300,400,500};
		//System.out.println(a.length);
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}*/
		
		//Two/Multi Dimensional Array
		
		int a[][]= { {10,20,30},
					{30,40,50}, 
					{50,60,70},
					{60,70,80} };
		
		//Find the size of the array
		/*System.out.println("Length of the row is "+a.length);
		System.out.println("Length columns in 4th row is "+a[0].length);
		//How to read specific value from array Ex second row 1st column value should be 60
		System.out.println(a[2][1]);*/
		
		//how to run in a loop by length formula
		/*for(int r=0;r<a.length;r++)
		{
			for(int c=0;c<=a[r].length-1;c++)
			{
				//System.out.println(a[r][c]);
				//To get the output in table format
				System.out.print(a[r][c]+ " ");
			}
			System.out.println();
		}*/
		
		//How to run in loop by hard coded
		/*for(int r=0; r<=3;r++)
		{
			for(int c=0;c<=2; c++)
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}*/
		//Enhanced for loop
		for (int data[]:a)
		{
			for(int x:data)
			{
				System.out.print(x+" ");
			}
			System.out.println();
		}
	}

}
