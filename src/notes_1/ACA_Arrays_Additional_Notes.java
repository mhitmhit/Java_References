package notes_1;

import java.util.Arrays;

public class ACA_Arrays_Additional_Notes {

	public static void main(String[] args) {
		
		// initializing arrays:
		// when no values initiated, default values are default for that data 
		// type (0 for int, null for String, false for boolean, etc)	
		
		int[] numbersArray = new int[3];
		int[] numbersArray1 = new int[] {1,2,3};
		int[] numbersArray2 = {25, -111};
		
		// getting length of an array:
		int arrayLength = numbersArray2.length;
		System.out.println("array numbersArray2 length is: " + arrayLength);
		
		
		// accessing last element of an array:
		System.out.println("last element of the array: " + numbersArray2[arrayLength-1]);
		
		numbersArray[0] = 25;
		numbersArray[1] = -1;
		
		
		// to print an array:
		System.out.println("printing an array: " + java.util.Arrays.toString(numbersArray));
		System.out.println("printing an array: " + Arrays.toString(numbersArray2));
		
		// checking array instance of
		System.out.println("is numbersArray an instance of array? " + (numbersArray instanceof int[]));
		
		// Array of objects:
		Object[] objArray = new Object[4];
		objArray[0] = "Hello";
		objArray[1] = 123;
		objArray[2] = new StringBuilder("Java");
		objArray[3] = numbersArray2;
		
	// sorting, filling, copying arrays:
		Arrays.sort(numbersArray2);
		System.out.println("sorted array: " + Arrays.toString(numbersArray2));
		
		int[] numbersArray3 = new int[10];
		Arrays.fill(numbersArray3, 1);
		System.out.println("filled array: " + Arrays.toString(numbersArray3));
		
		int[] numbersArray4 = Arrays.copyOf(numbersArray3, numbersArray3.length);
		System.out.println("copied array: " + Arrays.toString(numbersArray4));
		
	// binary search only works on sorted arrays, if there are duplicates, it may return any of the matching indexes
		int index = Arrays.binarySearch(numbersArray2, 25);
		System.out.println("index of 25 in numbersArray2: " + index);
		
	// equality check:
		int[] arrA = {1,2,3};
		int[] arrB = {1,2,3};
		System.out.println("are arrA and arrB equal? " + Arrays.equals(arrA, arrB));
		
		
		
	}
	
}