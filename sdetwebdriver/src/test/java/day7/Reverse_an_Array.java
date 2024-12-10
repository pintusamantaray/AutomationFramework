package day7;

public class Reverse_an_Array {

	public static void main(String[] args) {
		
		int a[]= {100,300,400,500,200};
		
		//Arrays.sort(a);
		
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
		String name="Rajendra";
		String reversed="";
		for (int j=name.length()-1;j>=0;j--)
			
		{
			reversed += name.charAt(j);	
		}
		System.out.println(reversed);

	}

}
