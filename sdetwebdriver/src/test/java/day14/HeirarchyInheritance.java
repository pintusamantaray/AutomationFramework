package day14;
class Parrent
{
	void display(int a)
	{
		System.out.println(a);
	}
}
class Child1 extends Parrent
{
	void show(int b)
	{
		System.out.println(b);
	}
}
class Child2 extends Parrent ///This is not related to Child1..This is is child of parrent only
{
	void print(int c)
	{
		System.out.println(c);
	}
}

public class HeirarchyInheritance {

	public static void main(String[] args) {
		Child2 ch= new Child2();
		ch.display(100);
		ch.print(200);
		
		Child1 ch1=new Child1();
		ch1.show(50);
		ch1.display(300);

	}

}
