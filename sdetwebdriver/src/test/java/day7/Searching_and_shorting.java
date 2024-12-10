package day7;

public class Searching_and_shorting {

	public static void main(String[] args) {
		//Search and Element
		int a[]= {10,20,30,40,50};
		int search_element=60;
		
		boolean status=false;
		
		for (int i=0; i<a.length; i++)
		{
			if (a[i]==search_element)
			{
				System.out.println("Element found "+a[i]);
				status=true;
				break;
			}
			
		}
		if (status==false)
		{
		System.out.println("Element not found");
		}

	}

}
