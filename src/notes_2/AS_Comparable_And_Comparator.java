package notes_2;

import java.util.ArrayList;
import java.util.Collections;

import notes_2_Comparable_Example.*;
import notes_2_Comparator_Example.*;

public class AS_Comparable_And_Comparator {
/**
 Comparable is an interface that defines the natural ordering for a class. A class must implement 
 Comparable if it is to be sorted by the compareTo() method.

public interface Comparable<T> {
        public int compareTo(T o);
}

The compareTo() method returns an int which is:
    Zero, if the two objects are equal
    Negative, if this object is smaller than that object
    Positive, if this object is greater than that object

We can sort the elements of:
    String objects
    Wrapper class objects
    User-defined class objects

Collections Class

The Collections class provides static methods for sorting the elements of collections. 
If collection elements are of type Set or Map, we can use TreeSet or TreeMap. However, 
we cannot sort the elements of List type collections directly. The Collections class provides 
methods for sorting the elements of List type collections.


see student example in notes2_example_files.






Comparator 
is an interface that allows you to define a total ordering on a collection of objects. A class that is to be sorted by 
compare() does not have to implement Comparator.
public interface Comparator<T> {
        public int compare(T firstObject, T secondObject);
}


We can use the Comparator interface in the following situations:
    Sorting the array or list of objects, but NOT in natural order.
    Sorting the array or list of objects where we cannot modify the source code to implement the Comparable interface.
    Using group by sort on a list or array of objects based on multiple different fields.



Summary
A comparison function that imposes a total ordering on some collection of objects.
    Comparators can be passed to a sort method (such as Collections.sort or Arrays.sort) to 
    allow precise control over the sort order.
    Comparators can also be used to control the order of certain data structures (such as sorted sets 
    or sorted maps) or to provide an ordering for collections of objects that don't have a natural ordering.
    The ordering imposed by a comparator c on a set of elements S is said to be consistent with equals if 
    and only if c.compare(e1, e2)==0 has the same boolean value as e1.equals(e2) for every e1 and e2 in S.
    Caution should be exercised when using a comparator capable of imposing an ordering inconsistent with 
    equals to order a sorted set (or sorted map).
    This interface is a member of the Java Collections Framework.
















 */
	public static void main(String[] args) {
		// Comparable Example
		ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        Collections.sort(al);
        
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
        
        
        
        // Comparator Example
        ArrayList<Student2> ar = new ArrayList<Student2>();
        ar.add(new Student2(111, "Mayank", "london"));
        ar.add(new Student2(131, "Anshul", "nyc"));
        ar.add(new Student2(121, "Solanki", "jaipur"));
        ar.add(new Student2(101, "Aggarwal", "Hongkong"));
 
        // Display message on console for better readability
        System.out.println("Unsorted");
 
        // Iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));
 
        // Sorting student entries by roll number
        Collections.sort(ar, new Sortbyroll());
 
        // Display message on console for better readability
        System.out.println("\nSorted by rollno");
 
        // Again iterating over entries to print them
        for (int i = 0; i < ar.size(); i++)
            System.out.println(ar.get(i));

		
	}
}
