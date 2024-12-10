package day10;

public class Employee {
	
	//Variable
	int num;
	String name;
	int age;
	String blood_grp;
	
	//New Method Creation
		
	void display()
	{
//		System.out.println(num);
//		System.out.println(name);
//		System.out.println(age);
//		System.out.println(blood_grp);
		System.out.println(name+" "+age+" "+num+" "+blood_grp);
	}
	
	
	//This is mail method
	public static void main(String[] args) 
	//Create an object and assign values to variables 
	{
		Employee emp1 = new Employee(); //object
		emp1.age=23;
		emp1.name="Jewel";
		emp1.num=07;
		emp1.blood_grp="A+";
		emp1.display();
		
	}

}
