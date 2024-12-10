package day14;

class A
{
	int a;
	void display()
	{
		System.out.println(a);	
	}
}
class B extends A //Here B is the child class of A // Single inheritance //"extends" method is used for inheritance // 
{
	int b;
	void show()
	{
		System.out.println(b);
	}
}
class C extends B //This the example of multi level inheritance// here 'B' is the parent of 'C'
{
	int c;
	void print() 
	{
		System.out.println(c);
	}
}

public class InheritanceTypes {

	public static void main(String[] args) {
		/*B bobj= new B();
		System.out.println(bobj.a);
		System.out.println(bobj.b);
		
		bobj.show();
		bobj.display();
		*/
		
		C cobj=new C();
		cobj.a=100;
		cobj.b=200;
		cobj.c=300;
		cobj.display();
		cobj.print();
		cobj.show();
		
		int d =(cobj.a+cobj.b);
		
		System.out.println("The addition of a and b is: "+d);

	}

}
