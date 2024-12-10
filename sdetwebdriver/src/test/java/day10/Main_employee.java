package day10;

public class Main_employee {
	//We can access same package class without create different method 
	public static void main(String[] args) {
		Employee emp2 = new Employee();
		emp2.name="Test";
		emp2.age=21;
		emp2.blood_grp="b+";
		emp2.num=12;
		emp2.display();
		
		Employee emp1 = new Employee(); //object
		emp1.age=23;
		emp1.name="Jewel";
		emp1.num=07;
		emp1.blood_grp="A+";
		emp1.display();

	}

}
