package day4;

public class SwitchcaseonWeekExample {

	public static void main(String[] args) {
		// This is the week example through Switch case statement compare to else if.
		int weekno =11;
		switch(weekno)
		{
		case 1: System.out.println("This is Sunday"); break;
		case 2: System.out.println("This is Monday"); break;
		case 3: System.out.println("This is Tuesday"); break;
		case 4: System.out.println("This is Wednessday"); break;
		case 5: System.out.println("This is Thrusday"); break;
		case 6: System.out.println("This is Friday"); break;
		case 7: System.out.println("This is Saturday"); break;
		default :System.out.println("Invalid input");
		}

	}

}
