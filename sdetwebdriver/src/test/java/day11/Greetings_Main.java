package day11;

public class Greetings_Main {

	public static void main(String[] args) {
		Greetings gr = new Greetings();
		gr.m1();
		//gr.m2(); //When ever calling some string value we have store it in a variable or have to put in the print statement
		System.out.println(gr.m2());
		gr.m3("Rajendra");
		int a=gr.m4(24);
		
		System.out.println(a);
		
	}

}
