package day4;

public class LogicalOperators {

	public static void main(String[] args) {
		boolean b1= 10>20;
		System.out.println(b1);
		
		boolean b2= 20>15;
		System.out.println(b2);
		
		System.out.println((10>5) && (10<20));
		
		System.out.println((10>5) && (20==20));
		
		System.out.println((10>5) || (10<20));
		
		System.out.println((10>5) && (10<5));
		
		System.out.println((10>5) || (10<5));
	}

}
