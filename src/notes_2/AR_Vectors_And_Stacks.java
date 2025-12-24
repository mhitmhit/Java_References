package notes_2;

import java.util.EmptyStackException;
import java.util.Stack;

public class AR_Vectors_And_Stacks {
	public static void main(String[] args) {
		System.out.println("stack example ");
		// Creating an instance of Stack class
		Stack<Integer> stk = new Stack<>();
		// Checking if the stack is empty
		boolean result = stk.empty();
		System.out.println("Is the stack empty? " + result);
		// Pushing elements into stack
		stk.push(78);
		stk.push(113);
		stk.push(90);
		stk.push(120);
		// Prints elements of the stack
		System.out.println("Elements in Stack: " + stk);
		result = stk.empty();
		System.out.println("Is the stack empty? " + result);

		// Pushing elements into the stack
		pushelmnt(stk, 20);
		pushelmnt(stk, 13);
		pushelmnt(stk, 89);
		pushelmnt(stk, 90);
		pushelmnt(stk, 11);
		pushelmnt(stk, 45);
		pushelmnt(stk, 18);
		// Popping elements from the stack
		popelmnt(stk);
		popelmnt(stk);
		// Throws exception if the stack is empty
		try {
			popelmnt(stk);
		} catch (EmptyStackException e) {
			System.out.println("empty stack");
		}
	}

	// Performing push operation
	static void pushelmnt(Stack<Integer> stk, int x) {
		// Invoking push() method
		stk.push(x);
		System.out.println("push -> " + x);
		// Prints modified stack
		System.out.println("stack: " + stk);
	}

	// Performing pop operation
	static void popelmnt(Stack<Integer> stk) {
		System.out.print("pop -> ");
		// Invoking pop() method
		Integer x = stk.pop();
		System.out.println(x);
		// Prints modified stack
		System.out.println("stack: " + stk);
	}
}
/**
 * Vector class implements a growable array of objects. Like an array, it
 * contains components that can be accessed using an integer index. The
 * iterators returned by this class's iterator and listIterator methods are
 * fail-fast: if the vector is structurally modified at any time after the
 * iterator is created, in any way except through the iterator's own remove or
 * add methods, the iterator will throw a ConcurrentModificationException Vector
 * is synchronized
 * 
 * Stack The Stack class represents a last-in-first-out (LIFO) stack of objects
 * It extends the class Vector with five operations that allow a vector to be
 * treated as a stack. The usual push and pop operations are provided, as well
 * as a method to peek at the top item on the stack, a method to test whether
 * the stack is empty, and a method to search the stack for an item and discover
 * how far it is from the top. When a stack is first created, it contains no
 * items.
 * 
 * 
 * 
 * 
 * 
 * The Vector class implements a growable array of objects. Like an array, it
 * contains components that can be accessed using an integer index. However, the
 * size of a Vector can grow or shrink as needed to accommodate adding and
 * removing items after the Vector has been created.
 * 
 * As of the Java 2 platform v1.2, this class was retrofitted to implement the
 * List interface, making it a member of the Java Collections Framework. Unlike
 * the new collection implementations, Vector is synchronized. If a thread-safe
 * implementation is not needed, it is recommended to use ArrayList in place of
 * Vector.
 * 
 * The Stack class represents a last-in-first-out (LIFO) stack of objects. It
 * extends the Vector class with five operations that allow a vector to be
 * treated as a stack. The usual push and pop operations are provided, as well
 * as a method to peek at the top item on the stack, a method to test for
 * whether the stack is empty, and a method to search the stack for an item and
 * discover how far it is from the top.
 * 
 * When a stack is first created, it contains no items. A more complete and
 * consistent set of LIFO stack operations is provided by the Deque interface
 * and its implementations, which should be used in preference to this class.
 * 
 * 
 * 
 * 
 *  * Stacks are LIFO - last in, first out, like a stack of plates or books, or the puzzle game "Towers of Hanoi".
 * They are used in algorithms where it is needed to keep track of the ordering in which the elements were inserted.
 *
 * ArrayDeque fills the role of *both* queues and stacks. You could think of a Deque as a deck of cards (pronounced the
 * same) where you could remove cards from either the top or bottom. You can use ArrayDeque
 * to perform stack operations
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
