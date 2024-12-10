package day7;

public class Revers_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Rajendra";
		
		String revname="";
		
		for (int i =name.length()-1; i>=0; i--)
		{
			revname += name.charAt(i);
			
		}
		System.out.println("Reversed name is " + revname);

	}

}
