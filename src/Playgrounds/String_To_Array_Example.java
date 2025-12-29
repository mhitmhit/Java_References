package Playgrounds;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class String_To_Array_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test1 = "yassine";
		String test2 = "elkabaili";
		String test3 = "latifa";
		
		sortedString(test1);
		sortedString(test2);
		sortedString(test3);
	}
	
	public static String sortedString(String text) {
		System.out.println("---------");
		String result = "";
		
		List<Character> arr = new ArrayList<>();
		
		for (int i=0; i<text.length(); i++) {
			arr.add(text.charAt(i));
		}
		System.out.println("arr before sorting" + arr.toString());
		
		Collections.sort(arr);
		System.out.println("arr after sorting" + arr.toString());
		return result;
	}

}
