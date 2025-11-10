package notes_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Looping_Notes {

	public static void main(String[] args) {
		
//		conditional Ternary:
		int mark = 100;
		String result = (mark > 75) ? "pass" : "fail";
		Boolean result2 = (mark > 75) ? true : false;
		
		
		
//		forEach loop:
		String[] allFruits = { "Apple", "Orange", "Banana", "Grape", "Cherry" };
		for (String fruit : allFruits) {
			System.out.println(fruit);
		}
		
		
		// Parameter Spread Example:
		System.out.println("------------------");
		System.out.println("spreading example");
		System.out.println(adding_Example(1, 2, 10));
		
		
		

// -----------------------End Of Main-------------------------------------------------------------------------		
	}
//		Parameters Spread example:
//below method will take in any number of integers
	public static int adding_Example(int... values){
		// call example: adding_Example(1, 2, 10)
	    int res = 0;
	    for(int eachValue : values){
	    	System.out.println(eachValue);
	      res += eachValue;
	    }
	    return res;
	}
	
	
} //---------------------End Of Class-------------------------------------------------------------------------





