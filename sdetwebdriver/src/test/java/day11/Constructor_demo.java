package day11;

public class Constructor_demo {
	
	int x,y;
	Constructor_demo ()  //default constructor
	{
		x=100;
		y=200;
		
	}
	Constructor_demo(int a, int b)
	{
		x=a;
		y=b;	
	}
	void sum()
	{
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor_demo cd =new Constructor_demo();  //Default Constructor
		Constructor_demo cd =new Constructor_demo(20,30);
		cd.sum();	
	}

}
