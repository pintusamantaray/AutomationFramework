package day10;

public class TestPc {
	
	int age;
	String name;
	String dept;
	int sal;
	void display()
	{
		System.out.println(name +" "+age+" "+dept);
	}
	
	void calculate()
	{
		System.out.println(age+sal);
	}

	public static void main(String[] args) {
		
		TestPc emp1= new TestPc();
		emp1.age= 23;
		emp1.name="Rajendra";
		emp1.dept="Automation";
		emp1.display();
		
		TestPc emp2= new TestPc();
		emp2.age=32;
		emp2.name="Jemwl";
		emp2.dept="HR";
		emp2.sal=15000;
		emp2.display();
		emp2.calculate();
	}

}
