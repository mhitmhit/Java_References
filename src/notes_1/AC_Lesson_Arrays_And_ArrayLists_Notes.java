package notes_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class AC_Lesson_Arrays_And_ArrayLists_Notes {
	public static void main(String[] args) {
		
//	Arrays:
//immutable in size, no methods, works with Java.Util.Arrays class, 
	//both primitive and reference types.
	// Arrays can hold primitives or objects (reference types).
	
	//ex:
//	int[] numbersArray = new int[3];
	
//	int[] numbers = {25, -1};
//	numbersArray[0] = 25;
//	numbersArray[1] = -1;
//	//System.out.println(numbersArray[0]);		
//	
//	
//	
	
		
////	ArrayList:	(not thread safe)	
//		 add(int index, E element) - adds an element at the given index.
//		 get(int index) - retrieves an element at a given index.
//		 indexOf(Object o) - retrieves the index of the given element.
//		 listIterator() / listIterator(int index) - returns an iterator at either the beginning of the list or at the specified index.
//		 remove(int index) - removes an element at the given index.
//		 set(int index, E element) - replaces the element at the given index with the given element.
//		 subList(int fromIndex, int toIndex) - returns a sub-list of the elements in the specified range.

			List<String> list = new ArrayList<>();
			list.add("Hello");
			list.add("there");
			list.add("how");
			list.add("you?");
			System.out.println(list); // [Hello, there, how, you?]
			list.add(3, "are");
			System.out.println(list); // [Hello, there, how, are, you?]		

			
////mutable in size, many methods, works with Java.Util.Collections class, need to be imported, ref types only (but can use wrappers for primitives).
//	ArrayList<String> namesArrayList = new ArrayList<String>();
//	namesArrayList.add("ali");
//	namesArrayList.get(0);
//	
//	ArrayList<Integer> numsArrayList = new ArrayList<Integer>();
//	numsArrayList.add(1);
	//System.out.println(numsArrayList.get(0));
//	
//	
//	Array + Collection Class (Must be imported):
//Arrays is a class that act on Arrays, must be imported into the class.
//Collections is a class that act on collections (ArrayList is a collection), must be imported into the class.		
	
	
	// using Arrays Class on above ArrayLists
//	Arrays.toString(numbersArray);
//	Collections.max(numsArrayList);
			
			
			
			
			
// iterating through an ArrayList:			
			// using enhanced for loop
			for (String element : list) {
			  System.out.println(element);
			}

			// iterating forwards with ListIterator
//			                      [ "hi", "how", "are", "you?" ]
//			                         0      1      2       3
//			                      ^
			ListIterator<String> iterator1 = list.listIterator();
			while (iterator1.hasNext()) {
			  System.out.println(iterator1.next()); 
			}

			// iterating backwards with ListIterator
//			                      [ "hi", "how", "are", "you?" ]
//			                         0      1      2       3
//			                                                 ^
			ListIterator<String> iterator2 = list.listIterator(list.size());
			while (iterator2.hasPrevious()) {
			  System.out.println(iterator2.previous()); 
	
			}
	}
}
