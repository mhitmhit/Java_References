package notes_1;

import java.util.Scanner;

public class AG_Input_Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int currentYear = 2022;
		//System.out.println(getInputFromConsole(currentYear));
		System.out.println(getInputFromScanner(currentYear));
		
	}
	
	// using Console
	public static String getInputFromConsole(int currentYear) {
		String name = System.console().readLine("enter your name: ");
		String dob = System.console().readLine("enter the year you were born: ");
		int age = currentYear - Integer.parseInt(dob);
		return "Hi "+name+" welcome to java notes - your age is: "+age ;
	}
	
	
	
	// using Scanner
	public static String getInputFromScanner(int currentYear) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter your name: ");
		
		String name = sc.next();
		System.out.println("enter the year you were born: ");
		
		String dob = sc.next();
		
		int age = currentYear - Integer.parseInt(dob);
		sc.close();
		return "Hi "+name+" welcome to java notes - your age is: "+age ;
	}


}
