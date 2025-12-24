package notes_2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class AO_Collections {
/**






 Collection extends *Iterable.
 
 		*List			ArrayList
 						Vector
 						LinkedList
 		*Queue			LinkedList
 						PriorityQueue (returns elements in a sorted order)
 						DeQueue (double sided Queue)
 		*Set			HashSet
 						LinkedHashSet
 		SortedSet		TreeSet
 
 
 
 
 *Map					HashMap
 						HashTable
 		SortedMap		TreeMap
 		
 		
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 Description
Collections Framework

The Collections Framework in Java is a set of classes and interfaces that implement commonly used data structures. 
A collection is a single object that acts as a container for other objects. The Collections API is organized in a 
class hierarchy shown in the simplified version below:

Collection API class hierarchy

The important interfaces in the Collections API are:

    Iterable - guarantees that the collection can be iterated over.
    List - an ordered collection.
    Set - a collection that does not contain duplicates.
    Queue - a collection that operates on a first-in-first-out (FIFO) basis.
    Map - contains key/value pairs and does not extend Iterable.

Collection Interface

    The basic interface of the Collections Framework is the Collection interface, which is the root interface of 
    all collections in the API.
    It is placed at the top of the collection hierarchy in Java and provides the basic operations for adding and 
    removing elements in the collection.
    List, Queue, and Set are three interfaces that extend the Collection interface.
    An important note is that the Map interface does not extend the Collection interface, though it is considered 
    part of the Java Collection API.
    Another important note is that the Collection interface extends the Iterable interface. The Iterable interface 
    has only one method called iterator(). The function of the iterator method is to return the iterator object, 
    which allows us to iterate over the elements of the collection.

List Interface

    This interface represents a collection of elements arranged in sequential order.
    A list retains the order in which elements are added using indexes.
    This same sequence is used to retrieve elements.
    With lists, a developer can insert elements into the list at any location.
    The list allows storing duplicate elements in Java.
    ArrayList, Vector, and LinkedList are three concrete subclasses that implement the List interface.

Set Interface

    This interface represents a collection of elements that contains unique elements.
    The Set interface does not maintain any order while storing elements.
    When retrieving elements, they are not guaranteed to be retrieved in the same order as they were added to the collection.
    A set does not allow any duplicate elements.
    The HashSet, LinkedHashSet, and TreeSet classes implement the Set interface. TreeSet also implements the SortedSet 
    interface, which extends the Set interface.
    A set can be iterated using an iterator, but it cannot be iterated using a list iterator.

SortedSet Interface

    This interface extends a set whose iterator traverses its elements according to their natural ordering.
    TreeSet implements the SortedSet interface.

Queue Interface

    A queue is an ordered collection in which new elements are added at one end (the rear) and removed from the 
    other end (the front), similar to a queue in a supermarket.
    This interface represents a special type of list whose elements are removed only from the head.
    LinkedList, PriorityQueue, ArrayQueue, PriorityBlockingQueue, and LinkedBlockingQueue are the concrete subclasses 
    that implement the Queue interface.

Deque Interface (Deck)

    A deque (double-ended queue) is a sub-interface of the Queue interface.
    This interface was added to the Collection Framework in Java SE 6.
    The Deque interface extends the Queue interface and uses its methods to implement a deque.
    A deque is a linear collection of elements in which elements can be inserted and removed from either end.
    LinkedList and ArrayDeque classes implement the Deque interface.



Map Interface

    The Map interface does not inherit from the Collection interface. It represents an object that stores and 
    retrieves elements in the form of key/value pairs, and their location within the map is determined by a key.
    Maps utilize hashing techniques to manage key-value pairs.
    Maps do not allow for duplicate keys; however, duplicate values are allowed.
    The HashMap, Hashtable, LinkedHashMap, and TreeMap classes implement the Map interface.

SortedMap Interface

    This interface represents a map whose elements are stored in their natural ordering. It extends the Map interface, 
    which is implemented by the TreeMap class.

Methods of the Collection Interface:

The Collection interface consists of a total of fifteen methods for manipulating elements in the collection. 
They are as follows:

    add(): This method is used to add or insert an element into the collection. The general syntax for the add() 
    method is as follows:
        add(Object element): boolean
        This method returns true when the element is successfully added. Otherwise, it returns false if the element is 
        already present and the collection doesn’t allow duplicates.
    addAll(): This method adds a collection of elements to the collection. It returns true if the elements are added; 
    otherwise, it returns false. The general syntax for this method is as follows:
        addAll(Collection c): boolean
    clear(): This method clears or removes all the elements from the collection. The general form of this method is as follows:
        clear(): void
    contains(): It checks whether an element is present in a collection. That is, it is used to search for an element. 
    The general syntax for the contains() method is as follows:
        contains(Object element): boolean
        This method returns true if the element is present; otherwise, it returns false.
    containsAll(): This method checks whether a specified collection of elements is present. It returns true if the 
    calling collection contains all specified elements; otherwise, it returns false. The general syntax is as follows:
        containsAll(Collection c): boolean
    equals(): It checks for equality with another object. The general form is as follows:
        equals(Object element): boolean
    hashCode(): It returns the hash code number for the collection. Its return type is an integer. The general 
    form for this method is:
        hashCode(): int
    isEmpty(): It returns true if a collection is empty. That is, this method returns true if the collection 
    contains no elements.
        isEmpty(): boolean
    iterator(): It returns an iterator. The general form is given below:
        iterator(): Iterator
    remove(): It removes a specified element from the collection. The general syntax is given below:
        remove(Object element): boolean
        This method returns true if the element was removed; otherwise, it returns false.
    removeAll(): The removeAll() method removes all elements from the collection. It returns true if all 
    elements are removed; otherwise, it returns false.
        removeAll(Collection c): boolean
    retainAll(): This method is used to remove all elements from the collection except the specified collection. 
    It returns true if all specified elements are removed; otherwise, it returns false.
        retainAll(Collection c): boolean
    size(): The size() method returns the total number of elements in the collection. Its return type is an integer. 
    The general syntax is given below:
        size(): int
    toArray(): It returns the elements of a collection in the form of an array. The array elements are copies of the 
    collection elements. The general syntax is given below:
        toArray(Object array[]): Object[]


















A HashSet implements Set and is backed by a HashMap. It:

    Guarantees no ordering when iterating.
    Allows one null value.
    Allows fast insertion and traversal.
    Does not maintain the order in which you insert elements.

A TreeSet is a Set whose elements maintain sorted order when inserted.

    Internally, it is backed by a Sorted Tree.
    Insertion and removal of elements are slow because the elements must maintain sorted order.
    It cannot contain any null values since null cannot be compared to any object.






A HashSet implements Set and is backed by a HashMap. It:
    Guarantees no ordering when iterating.
    Allows one null value.
    Allows fast insertion and traversal.
    Does not maintain the order in which you insert elements.




TreeSet
A TreeSet is a Set whose elements maintain sorted order when inserted. Internally, it is backed by a Sorted Tree. 
Insertion and removal of elements are slow because the elements must maintain sorted order. It cannot contain any null 
values since null cannot be compared to any object.

The methods declared by Set are summarized as follows:

    add( ): Adds an object to the collection.

    clear( ): Removes all objects from the collection.

    contains( ): Returns true if a specified object is an element within the collection.

    isEmpty( ): Returns true if the collection has no elements.

    iterator( ): Returns an Iterator object for the collection, which may be used to retrieve an object.

    remove( ): Removes a specified object from the collection.

    size( ): Returns the number of elements in the collection.











Implementation 			HashSet is implemented using HashTable. 				TreeSet is implemented using a tree structure.
Null Object 			HashSet allows a null object. 							TreeSet does not allow the null object; it throws a NullPointerException.
Methods 				HashSet uses the equals method to compare two objects. 	TreeSet uses the compare method to compare two objects.
Heterogeneous objects 	HashSet allows heterogeneous objects. 					TreeSet does not allow heterogeneous objects as it requires elements to be comparable to each other.
Ordering 				HashSet does not maintain any order. 					TreeSet maintains objects in sorted order.

















Queues in Java work in a similar way. Queues place objects on a 
“waiting list,” typically based on First-In-First-Out (FIFO),
A Queue can be shared among threads and used to block progress until space is available
offer() – Inserts a new element onto the Queue
poll() – Removes an element from the front of the Queue
peek() – Inspects the element at the front of the Queue without removing it




The BlockingQueue interface supports additional operations that force threads to wait on the Queue 
depending on the current state. A thread may wait on the Queue to be non-empty when attempting a retrieval 
or for it to become empty when adding a new element.
Standard Blocking Queues include LinkedBlockingQueue, SynchronousQueue, and ArrayBlockingQueue.
Transfer Queues


The TransferQueue interface extends the BlockingQueue interface but is tailored toward the producer-consumer 
pattern. It controls the flow of information from producer to consumer, creating backpressure in the system.
Java includes one implementation of the TransferQueue interface: LinkedTransferQueue.
Deques



Deque (pronounced "deck") is short for Double-Ended Queue and is analogous to a deck of cards – elements may be 
taken from both the start and end of the Deque. Much like the traditional Queue, the Deque provides methods to add, 
retrieve, and peek at elements held at both the top and bottom. Deques can be used to implement a stack with 
Last-In-First-Out (LIFO) behavior.




 * Queues are FIFO - first in, first out, like a checkout line. They are used in algorithms where it is needed to keep
 * track of the order that the elements were inserted in. For instance, tech support tickets may be
 * waiting in a queue until a tech support specialist can clear them.



 * ArrayDeque fills the role of *both* queues and stacks. You could think of a Deque as a deck of cards (pronounced the
 * same) where you could remove cards  from either the top or bottom. You can use ArrayDeque
 
 
 * PriorityQueue is another implementation of Queue that has additional functionality
 * to handle multiple 'priorities' of item
 
 
 
 
 






---------------------------------------
Map Interface

Map does not implement the Collection interface; however, it is considered to be part of the 
Collections framework. A Map is useful if you have to search, update, or delete elements based on a key. 
It is used to identify a value by a key, and each entry in a map is a key-value pair. A Map contains unique keys.

Because it does not implement Iterable, Maps cannot be iterated over directly. Instead, one must either:
    use the entrySet() method to iterate over the set of Map.Entry
    use the keySet() method to iterate over the set of keys
    use the values() method to return a Collection of values that can then be iterated over.

There are two interfaces for implementing Map in Java: Map and SortedMap, and three classes: HashMap, LinkedHashMap, and TreeMap.

HashMap
HashMap is a Map that:
    Stores elements in key-value pairs.
    Provides fast insertion and retrieval of elements by key.
    Does not maintain the order of insertion.
    Permits one null key and null values.

TreeMap
TreeMap is a Map whose:
    Keys are stored in a sorted tree structure.
    Main benefit is that keys are always in a sorted order.
    Insertion and retrieval are slower.
    Cannot contain null keys, as null cannot be compared for sorting.

HashTable
HashTable is an older, thread-safe implementation of a HashMap. 
It does not allow null keys or null values.




++++++++++++++++++++

Hashtable

    The Hashtable class implements a hash table, which maps keys to values.
    Any non-null object can be used as a key or as a value.
    To successfully store and retrieve objects from a Hashtable, the objects used as keys 
    must implement the hashCode method and the equals method.
    Key features:
        Hash is synchronized.
        Hashtable stores key/value pairs in a hash table.
        In Hashtable, we specify an object that is used as a key, and the value we want to 
        associate with that key. The key is then hashed, and the resulting hash code is used as the index at which 
        the value is stored within the table.

HashMap

    Now we will discuss HashMap, which is a hashtable-based implementation. It extends the AbstractMap class and 
    implements the Map interface. A HashMap works on the principle of hashing.
    This Map implementation usually acts as a bucketed hash table, but when buckets get too large, they are 
    transformed into nodes of TreeNodes, each structured similarly to those in java.util.TreeMap.
    On the other hand, TreeMap extends the AbstractMap class and implements the NavigableMap interface. A TreeMap 
    stores map elements in a Red-Black tree, which is a self-balancing binary search tree.

Order
HashMap doesn't provide any guarantees about the order in which the elements are arranged in the Map.









LinkedList
 is a data structure that is internally composed of nodes that contain data and a reference to the next 
 node. A Doubly-Linked List is composed of nodes that contain references to the next and previous nodes. Java’s 
 implementation of a LinkedList implements both the List interface and the Deque interface, meaning it can act as 
 either a list or a queue. The main advantages of a LinkedList are efficient insertion and deletion operations and 
 the ability for it to be used as a foundation for stacks, queues, and other complex data structures.


An ArrayList is a concrete class that implements List.
    It is a data structure that contains an array within it but can resize dynamically.
    It is useful for storing ordered elements and accessing elements using an index.

A LinkedList implements both the List and Queue interfaces, so it has all methods in both interfaces.
    The data structure is composed of nodes that reference one another.
    It is useful for manipulating a collection of ordered elements and for creating stacks and queues.








PriorityQueue class is a queue data structure implementation that processes the queue items based on their 
priorities. Note that PriorityQueue is different from other standard queues that implement the FIFO (First-In-First-Out) 
algorithm.

    PriorityQueue is an unbounded queue that grows dynamically.
    The default initial capacity is '11', which can be overridden using the initialCapacity parameter in the 
    appropriate constructor.
    It does not allow null objects.
    The queue items must be Comparable to determine their priorities.
    By default, the items in the priority queue are ordered in natural order.
    A Comparator can be used for custom ordering of objects in the queue.
    A priority queue relying on natural ordering does not permit the insertion of non-comparable objects (doing so 
    may result in ClassCastException).
    The queue retrieval operations poll, remove, peek, and element access the element at the head of the queue.
    The head of the PriorityQueue is the least element based on the natural ordering or the Comparator-based ordering.
    If multiple objects with the same priority are present, then the queue can poll any one of them randomly.
    PriorityQueue is not thread-safe. Use PriorityBlockingQueue in concurrent environments.
    It provides O(log(n)) time performance for add() and poll() methods.
    The Iterator provided by the method iterator() is not guaranteed to traverse the elements of the priority queue 
    in any particular order. If you need ordered traversal, consider using Arrays.sort(pq.toArray()).

PriorityQueue Constructors
The PriorityQueue class provides seven different ways to construct a priority queue in Java.
    PriorityQueue() : constructs an empty queue with the default initial capacity (11) that orders its elements according to their natural ordering.
    PriorityQueue(Collection c) : constructs an empty queue containing the elements in the specified collection.
    PriorityQueue(int initialCapacity) : constructs an empty queue with the specified initial capacity that orders its elements according to their natural ordering.
    PriorityQueue(int initialCapacity, Comparator comparator) : constructs an empty queue with the specified initial capacity that orders its elements according to the specified comparator.
    PriorityQueue(PriorityQueue c) : creates a priority queue containing the elements in the specified priority queue. The elements are ordered according to their natural ordering.
    PriorityQueue(SortedSet c) : creates a priority queue containing the elements in the specified sorted set. The elements are ordered according to their natural ordering.
    PriorityQueue(Comparator comparator) : creates a PriorityQueue with the default initial capacity and whose elements are ordered according to the specified comparator.



PriorityQueue Methods
    Adding Items
        boolean add(object) : inserts the specified element into this priority queue. If the queue is full, it throws an exception.
        boolean offer(object) : inserts the specified element into this priority queue. If the queue is full, it returns false.
    Accessing Items
        Object element() : retrieves, but does not remove, the head of this queue, or throws NoSuchElementException if this queue is empty.
        Object peek() : retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
    Removing Items
        boolean remove(object) : removes a single instance of the specified element from this queue, if it is present.
        Object poll() : retrieves and removes the head of this queue, or returns null if this queue is empty.
        void clear() : removes all of the elements from this priority queue.
    Other Methods
        Comparator comparator() : returns the comparator used to order the elements in this queue, or null if this queue is sorted according to the natural ordering of its elements.
        boolean contains(Object o) : returns true if this queue contains the specified element.
        Iterator iterator() : returns an iterator over the elements in this queue.
        int size() : returns the number of elements in this queue.
        Object[] toArray() : returns an array containing all of the elements in this queue.










 */
	
	  public static void main(String[] args) {
		  System.out.println("\nhashMap example -------------");
		  Map <String, Integer> ages = new HashMap<>();
		  //HashMap<String, Integer> ages = new HashMap<>();

	        // Adding key-value pairs to the HashMap
	        ages.put("Alice", 30);
	        ages.put("Bob", 25);
	        ages.put("Charlie", 35);
	        ages.put("David", 40);

	        // Iterating over the entries of the HashMap
	        System.out.println("Ages:");
	        
	        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
	            String name = entry.getKey();
	            int age = entry.getValue();
	            System.out.println(name + ": " + age);
	        }  
	        
	        
	        
	        
	        
	        System.out.println("\nhashSet example -------------");
	        Set<String> anime = new HashSet<>();
	        
	        HashSet<Integer> anime2 = new HashSet<Integer>();
	        
	        anime.add("test 1");
	        anime2.add(1);
	        
	        
	        Iterator<String> iter = anime.iterator();
	        while(iter.hasNext()) {
	        	System.out.println(iter.next());
	        }
		  
		  
	        System.out.println("\nQueue example -------------");
		  Queue<Integer> ticketCount = new LinkedList<>();
		  ticketCount.add(2);
		  ticketCount.add(3);
		  ticketCount.offer(10);
		  
		  Iterator<Integer> it = ticketCount.iterator();
		  while(it.hasNext()) {
			  System.out.println(it.next());
		  }
		  
		  System.out.println("return the head and error if empty: " + ticketCount.element() );
		  System.out.println("return the head and null if empty: " + ticketCount.peek() );
		  System.out.println("return the head and remove head + null if empty: " + ticketCount.poll() );
		  
		  
		  
		  
		  
		  System.out.println("\nPriorityQueue example -------------");
		  PriorityQueue<Integer> prQueue = new PriorityQueue<>();
		  
		  
		  
		  
		  
		  System.out.println("\nHashMap example -------------");
		  Map<String, Integer> hm
          = new HashMap<String, Integer>();

		  // Inserting pairs in the above Map
		  // using put() method
		  hm.put("a", 100);
		  hm.put("b", 200);
		  hm.put("c", 300);
		  hm.put("d", 400);
		
		  // Traversing through the Map using a for-each loop
		  for (Map.Entry<String, Integer> me :
		          hm.entrySet()) {
		
		          // Printing keys
		          System.out.print(me.getKey() + ":");
		          System.out.println(me.getValue());
		  }
		  
		  
		  
		  
		  
		  
		  
		  
		  System.out.println("\nHashTable example -------------");
		  	Hashtable<Integer, String> ht1 = new Hashtable<>();
		  
	        // Initialization of a Hashtable
	        // using Generics
	        Hashtable<Integer, String> ht2 = new Hashtable<Integer, String>();
	  
	        // Inserting the Elements
	        // using put() method
	        ht1.put(1, "one");
	        ht1.put(2, "two");
	        ht1.put(3, "three");
	  
	        ht2.put(4, "four");
	        ht2.put(5, "five");
	        ht2.put(6, "six");
	  
	        ht1.remove(4);
	        
	        // Print mappings to the console
	        System.out.println("Mappings of ht1: " + ht1);
	        System.out.println("Mappings of ht2: " + ht2);  
		  
		  
		  
		  
		  
		  
		  
	        System.out.println("\nLinkedList and ArrayList example -------------");
	        ArrayList<Integer> myArrayList = new ArrayList<>();
	        LinkedList<Integer> myLinkedList = new LinkedList<>();

	        // adding elements to our collections
	        Collections.addAll(myArrayList,
	                              1, 2, 3, 4, 5);

	        Collections.addAll(myLinkedList,
	              1, 2, 3, 4, 5);

	        // printing our collections
	        System.out.println(myArrayList); // [1, 2, 3, 4, 5]
	        System.out.println(myLinkedList); // [1, 2, 3, 4, 5]

	        // demonstrating that ArrayLists can resize, unlike arrays
	        System.out.println(myArrayList.size()); // 5
	        Collections.addAll(myArrayList,
	              6, 7, 8, 9);
	        System.out.println(myArrayList.size()); // 9
	     // using indexes
	        System.out.println(myArrayList.get(3)); // 4
	        System.out.println(myLinkedList.indexOf(1)); // 0

	        // LinkedList-specific operations
	          // deque operations
	        myLinkedList.addFirst(0);
	        myLinkedList.addLast(6);
	        System.out.println(myLinkedList); // [0, 1, 2, 3, 4, 5, 6]

	          // Queue operations
	        System.out.println(myLinkedList.peek()); // 0
	        myLinkedList.offer(7);
	        myLinkedList.poll();
	        System.out.println(myLinkedList); // [1, 2, 3, 4, 5, 6, 7]

	          // Stack operations
	        LinkedList<Integer> myStack = new LinkedList<>();
	        myStack.push(1);
	        myStack.push(2);
	        myStack.push(3);
	        myStack.push(4);
	        myStack.push(5);
	        System.out.println(myStack); // [5, 4, 3, 2, 1]

	        myStack.push(6);
	        System.out.println(myStack.peek()); // 6
	        System.out.println(myStack); // [6, 5, 4, 3, 2, 1]

	        myStack.pop();
	        System.out.println(myStack); // [5, 4, 3, 2, 1]

		  
		  
	        System.out.println("\nDeque example -------------");
	        Deque<String> deck = new ArrayDeque<>();
	        
	        
	        
	        
	        
	        
		  
		  }// end of main
} // end of class
