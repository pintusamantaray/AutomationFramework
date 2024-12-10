package day8;

import java.util.Arrays;

public class String_Methods {

	public static void main(String[] args) {
		//replace
		String amount = "@15,25,35";
		
		System.out.println(amount.replace("@","").replace(",", ""));
		
		//split method
		
		String s="abc@gmail,com#123";
		
		String a[]= s.split("@");
		
		System.out.println(Arrays.toString(a));
		
		String b[]=a[1].split("#");
		System.out.println(Arrays.toString(b));
		
		String c[]=b[0].split(",");
		System.out.println(Arrays.toString(c));
		
		System.out.println(a[1]);

	}

}
