package day13;

public class ThisKeyword {

	
	
	int x,y; //This is called class variables
	
	ThisKeyword(int a, int b) //This is called local variables
	{
		x=a;
		y=b;	
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) {
		ThisKeyword key= new ThisKeyword(100,200);
		
		key.display();
		

	}

}
