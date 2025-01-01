package notes_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Notes_1 {

	public static void main(String[] args) {
		
//		adding bytes together
//		add bytes together possible ? yes, pay attention to operation value if it fits in a byte
		byte number1 = 127;
		byte number2 = 127;
		int number3 = number1 + number2;
		System.out.println(number3);
		
//		use underscore to help with readability of large numbers
		double numb1 = 1_000.323;
		System.out.println(numb1);
	
		
//      OOP Pillars:
//Encapsulation:
//concept of a class. grouping behaviors and attributes together in a single entity of Object.

//Abstraction:
//concept of a user using an object. they know the available methods, but they dont know how they are implemented.
//hiding some details, and giving access to other details.

//Polymorphism:
//concept of Overloading and Overriding.
//Overloading, is having methods with same name but parameters are different.
//Overriding, is when a method is present in different objects. the specific object method gets called.

//Inheritance:
//concept of an ObjA is an ObjB.
//referred to parent/child, superclass/child class.		
	
		
//		Arrays:
//immutable in size, no methods, works with Java.Util.Arrays class, both primitive and reference types.
//ex:
		int[] numbers = new int[3];
		//int[] numbers = {25, -1};
		numbers[0] = 25;
		numbers[1] = -1;
		System.out.println(numbers[0]);		
		
		
//		ArrayList:
//mutable in size, many methods, works with Java.Util.Collections class, need to be imported, ref types only (but can use wrappers for primitives).
		ArrayList<String> names = new ArrayList<String>();
		names.add("ali");
		names.get(0);
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		System.out.println(nums.get(0));
		
//		Array + Collection Class (Must be imported):
//Arrays is a class that act on Arrays, must be imported into the class.
//Collections is a class that act on collections (ArrayList is a collection), must be imported into the class.		
		// using Arrays Class on above ArrayLists
		Arrays.toString(numbers);
		Collections.max(nums);
		
//		conditional Ternary:
		int mark = 100;
		String result = (mark > 75) ? "pass" : "fail";
		Boolean result2 = (mark > 75) ? true : false;
		
//		forEach loop:
		String[] allFruits = { "Apple", "Orange", "Banana", "Grape", "Cherry" };
		for (String fruit : allFruits) {
			System.out.println(fruit);
		}
		
		

// -----------------------End Of Main-------------------------------------------------------------------------		
	}
//		Parameters Spread example:
//below method will take in any number of integers
	public static int add(int... values){
	    int res = 0;
	    for(int eachValue : values){
	      res += eachValue;
	    }
	    return res;
	}
	
	
} //---------------------End Of Class-------------------------------------------------------------------------





