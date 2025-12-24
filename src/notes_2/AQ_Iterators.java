package notes_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class AQ_Iterators {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		// add names...
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
		  String name = it.next();
		  // do Something
		}
		
		
		
		
		
		
		
		Iterator<Integer> iterator = Arrays.asList(1, 2, 3, 4, 5).iterator();
		iterator.forEachRemaining(System.out::println);
		
		
		for (Integer i: (Iterable<Integer>) () -> iterator) {
		    System.out.println(i);
		}
		
		
		
		
	}//end of main
}
/**

Description
Iterable and Iterator Interface
The Iterable interface defines a data structure that can be directly traversed using the .iterator() method, 
which returns an Iterator. This can be useful for fine-grained control over iteration. The Iterator interface 
contains methods for traversal, including:
    hasNext()
    next()
    remove()
    


Enhanced For Loop
Any object that implements the Iterable interface can also be iterated over using a special kind of for-loop: 
the "enhanced" for loop. The syntax is as follows:



The downside of the enhanced for loop is that the index of iteration is not tracked, 
so fine-grained control over execution is not possible. However, this simplified syntax 
is beneficial for many simple iterations.

Both Iterator and Iterable are interfaces in Java that look very similar but are two different things. 
In short, if any class implements the Iterable interface, it gains the ability to iterate over an object of 
that class using an Iterator.



Iterable
An Iterable represents a collection that can be traversed. Implementing the Iterable interface allows an 
object to make use of the for-each loop. It does this by internally calling the iterator() method on the object. 


Iterator 
is an interface that allows us to iterate over some other object, which is a collection of some kind. 
To iterate over an Iterator, we can use hasNext() and next() methods in a while loop, as shown below:


Starting from Java 8, we can also easily iterate over an Iterator by using the forEachRemaining() method.


One can also use an Iterator inside a for-each loop by converting the Iterator into an Iterable using a lambda:



    Any class that implements the Iterable interface needs to override the iterator() method provided by the Iterable 
    interface. The iterator() method returns an Iterator, which can then be used to iterate over an object of that class.
    Any class implementing the Iterator interface needs to override the hasNext() and next() methods provided by the 
    Iterator interface. The hasNext() method returns true if the iteration has more elements, and the next() method 
    returns the next element in the iteration.
    The Iterator instance stores the iteration state. That means it provides utility methods to get the current element, 
    check if the next element exists, and move forward to the next element if present. 
    In other words, an Iterator remembers the current position in a collection and returns the next item in sequence if 
    present. The Iterable, on the other hand, doesn’t maintain any such iteration state.
    The contract for Iterable is that it should produce a new instance of an Iterator every time the iterator() method is 
    called. This is because the Iterator instance maintains the iteration state, and things won’t work if the implementation 
    returns the same Iterator twice.
    For an Iterable, we can move forward only in the forward direction, but some of the Iterator subinterfaces, like 
    ListIterator, allow us to move back and forth over a List.
    Additionally, Iterable doesn’t provide any method to modify its elements, nor can we modify them using the 
    for-each loop. However, Iterator allows removing elements from the underlying collection during iteration with the 
    remove() method.
    
    
























































*/
