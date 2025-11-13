package notes_1;

public class AM_OOP_Overview_Notes {
	
//	Objects have:
//		- state
//		- behavior
		
		
	
//  OOP Pillars:
//Encapsulation:
//concept of a class. grouping behaviors and attributes together in a single entity of Object.
//using getters and setters for hiding fields and some methods from public access


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
	
	
//Composition:
// concept of an ObjA is made of ObjB, ObjC....
// ObjA class have ObjB, ObjC as a Variable

	
//Static: means something belongs to the class, not the object.
	
	
//final: when used with variables: variables are constant and cannot be changed.
//		: when used with a class: class cannot be extended.
	
	
	
	
// POJO / BEAN  / JAVABean / Entity / DTO:
//	class with only instance fields. used to house data and pass data between functional classes.
//	usually no methods, or few methods, might have getters and setters.
//	many dbs use POJOs to read/write data.
	
	
// RECORDS:
//  immutable. better suited for data transfers that do not need to be modified.
//	newly introduced to replace POJOs
//	see Student_Record.java file in notes_1 package
// 	helps in creating Objects quickly

	
//	Study guide:
//
//		Constructor vs Method
//		Constructor :
//		A constructor is used to initialize the state of an object.
//		A constructor must not have a return type.
//		The constructor is invoked implicitly.
//		The Java compiler provides a default constructor if you don't have any constructor in a class.
//		The constructor name must be same as the class name.
//		Method :
//		A method is used to expose the behavior of an object.
//		A method must have a return type.
//		The method is invoked explicitly.
//		The method is not provided by the compiler in any case.
//		The method name may or may not be same as class name.
//
//
//		Inheritence types:
//		single. one parent and one child. a extend b.
//		multilevel: c extend b, b extend a
//		hierarchichal: b extend a, c extend a
//		multiple (not allowed in Java): c extend a,b. if a and b have same method, wont know which to call.
//
//
//
//		Method Overloading vs Method Overriding
//		Method Overloading :
//		Method overloading is used to increase the readability of the program.
//		Method overloading is performed within class.
//		In case of method overloading, parameter must be different.
//		Method overloading is the example of compile time polymorphism.
//		In java, method overloading can't be performed by changing return type of the method only. Return type can be same or different in method overloading. But you must have to change the parameter.
//		Method Overriding :
//		Method overriding is used to provide the specific implementation of the method that is already provided by its super class.
//		Method overriding occurs in two classes that have IS-A (inheritance) relationship.
//		In case of method overriding, parameter must be same.
//		Method overriding is the example of run time polymorphism.
//		Return type must be same or covariant in method overriding.
//
//
//
//
//
//		There are 4 types of java access modifiers:
//		private: access in class only.
//		default: access in class, package.
//		protected: access in class, package, subclasses of other packages
//		public: access from anywhere
//
//
//
//		Abstraction can be done with:
//		abstract class
//		interface
//
//
//		Objects:
//		generalization: when multiple objects share same attributes, these attributes can be combineds in a superclass (parent class).
//		specialization: when an object have a unique attribute, these attributes can be added to a subclass
//
//		Abstract Class
//		A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract  methods. It needs to be extended and its method implemented. It cannot be instantiated.
//		Some points to remember :
//		An abstract class must be declared with an abstract keyword.
//		It can have abstract and non-abstract methods.
//		It cannot be instantiated.
//		It can have constructors and static methods also.
//		It can have final methods which will force the subclass not to change the body of the method.
//
//
//
//
//
//
//		Decision Making Structures
//		Decision making structures have one or more conditions to be evaluated or tested by the program, along with a statement or statements that are to be executed if the condition is determined to be true, and optionally, other statements to be executed if the condition is determined to be false.
//
//
//		Loops In Java
//		There may be a situation when you need to execute a block of code several number of times. In general, statements are executed sequentially: The first statement in a function is executed first, followed by the second, and so on.
//		Programming languages provide various control structures that allow for more complicated execution paths.
//		A loop statement allows us to execute a statement or group of statements multiple times and following is the general form of a loop statement in most of the programming languages.
//
//
//		Enhanced For Loop
//		As of Java 5, the enhanced for loop was introduced. This is mainly used to traverse collection of elements including arrays.
//
//
//
//		Usage of "this" keyword
//		There can be a lot of usage of java this keyword. In java, this is a reference variable that refers to the current object.
//		Here is given the 6 usage of java this keyword.
//		this can be used to refer current class instance variable.
//		this can be used to invoke current class method (implicitly)
//		this() can be used to invoke current class constructor.
//		this can be passed as an argument in the method call.
//		this can be passed as argument in the constructor call.
//		this can be used to return the current class instance from the method.
//
//
//
//		Usage of "super" keyword
//		The super keyword in Java is a reference variable which is used to refer immediate parent class object.
//		Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.
//		super can be used to refer immediate parent class instance variable.
//		super can be used to invoke immediate parent class method.
//		super() can be used to invoke immediate parent class constructor.
//
//
//
//
//		Static Keyword
//		The static keyword in Java is used for memory management mainly. We can apply java static keyword with variables, methods, blocks and nested class. The static keyword belongs to the class than an instance of the class.
//		The static can be:
//		Variable (also known as a class variable)
//		Method (also known as a class method)
//		Block
//		Nested class
//
//
//
//		Final Keyword
//		The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:
//		variable: to stop value change.
//		method: to stop overiding.
//		class: to stop inheritence.
//		The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only
//
//
//
//
//
//
//		Interface?
//		An interface is a reference type in Java. It is similar to class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
//		Along with abstract methods, an interface may also contain constants, default methods, static methods, and nested types. Method bodies exist only for default methods and static methods.
//		Writing an interface is similar to writing a class. But a class describes the attributes and behaviors of an object. And an interface contains behaviors that a class implements.
//		Unless the class that implements the interface is abstract, all the methods of the interface need to be defined in the class.
//
//
//
//		Similarities between an interface and a class
//		An interface can contain any number of methods.
//		An interface is written in a file with a .java extension, with the name of the interface matching the name of the file.
//		The byte code of an interface appears in a .class file.
//		Interfaces appear in packages, and their corresponding bytecode file must be in a directory structure that matches the package name.
//
//
//
//		Differences between an interface and a class
//		You cannot instantiate an interface.
//		An interface does not contain any constructors.
//		All of the methods in an interface are abstract.
//		An interface cannot contain instance fields. The only fields that can appear in an interface must be declared both static and final.
//		An interface is not extended by a class, it is implemented by a class.
//		An interface can extend multiple interfaces.
//		A class can implement multiple interfaces.
//
//
//
//		Exceptions?
//		Exceptions are events that occur during the execution of programs that disrupt the normal flow of instructions (e.g. divide by zero, array access out of bound, etc.).
//		In Java, an exception is an object that wraps an error event that occurred within a method and contains:
//		Information about the error including its type
//		The state of the program when the error occurred
//		Optionally, other custom information
//		Categories of Exceptions :
//		Checked Exceptions: compiler error
//		Unchecked Exceptions: errors and run time exceptions
//		Errors
//
//
//
//
//
//		Array
//		Normally, an array is a collection of similar type of elements that have a contiguous memory location.
//		Java array is an object which contains elements of a similar data type. It is a data structure where we store similar elements. We can store only a fixed set of elements in a Java array.
//		Array in java is index-based, the first element of the array is stored at the 0 index.
//
//
//
//
//		Advantages
//		Code Optimization: It makes the code optimized, we can retrieve or sort the data efficiently.
//		Random access: We can get any data located at an index position
//
//
//		Disadvantages
//		Size Limit: We can store only the fixed size of elements in the array. It doesn't grow its size at runtime. To solve this problem, collection framework is used in Java which grows automatically.
//
//
//
//		Types of Array
//		There are two types of array.
//		Single Dimensional Array
//		Multidimensional Array
//
//
//
//		Queue
//		The Queue interface is available in java.util package and extends the Collection interface. The queue collection is used to hold the elements about to be processed and provides various operations like the insertion, removal etc. It is an ordered list of objects with its use limited to insert elements at the end of the list and deleting elements from the start of list i.e. it follows the FIFO or the First-In-First-Out principle.
//		LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations.
//
//
//
//		Collection Interface
//		The Collection interface is the foundation upon which the collections framework is built. It declares the core methods that all collections will have.
//		A collections framework is a unified architecture for representing and manipulating collections. All collections frameworks contain the following :
//		Interfaces − These are abstract data types that represent collections. Interfaces allow collections to be manipulated independently of the details of their representation. In object-oriented languages, interfaces generally form a hierarchy.
//		Implementations, i.e., Classes − These are the concrete implementations of the collection interfaces. In essence, they are reusable data structures.
//		Algorithms − These are the methods that perform useful computations, such as searching and sorting, on objects that implement collection interfaces. The algorithms are said to be polymorphic: that is, the same method can be used on many different implementations of the appropriate collection interface.
//		In addition to collections, the framework defines several map interfaces and classes. Maps store key/value pairs. Although maps are not collections in the proper use of the term, but they are fully integrated with collections.
//
//
//
//		The List Interface
//		The List interface extends Collection and declares the behavior of a collection that stores a sequence of elements.
//		Elements can be inserted or accessed by their position in the list, using a zero-based index.
//		A list may contain duplicate elements.
//		In addition to the methods defined by Collection, List defines some of its own, which are summarized in the following table.
//		Several of the list methods will throw an UnsupportedOperationException if the collection cannot be modified, and a ClassCastException is generated when one object is incompatible with another.
//
//
//
//		ArrayList
//		ArrayList is a part of collection framework and is present in java.util package. It provides us dynamic arrays in Java. Though, it may be slower than standard arrays but can be helpful in programs where lots of manipulation in the array is needed.
//		ArrayList inherits AbstractList class and implements List interface.
//		ArrayList is initialized by a size, however the size can increase if collection grows or shrunk if objects are removed from the collection.
//		Java ArrayList allows us to randomly access the list.
//		ArrayList can not be used for primitive types, like int, char, etc. We need a wrapper class for such cases.
//		Code to create a generic integer ArrayList :
//		ArrayList<Integer> arrli = new ArrayList<Integer>();
//		Note : More examples are given below.
//
//
//
//		The Set Interface
//		A Set is a Collection that cannot contain duplicate elements. It models the mathematical set abstraction.
//		The Set interface contains only methods inherited from Collection and adds the restriction that duplicate elements are prohibited.
//		Set also adds a stronger contract on the behavior of the equals and hashCode operations, allowing Set instances to be compared meaningfully even if their implementation types differ.
//
//
//
//		The Map Interface
//		The Map interface maps unique keys to values. A key is an object that you use to retrieve a value at a later date.
//		Given a key and a value, you can store the value in a Map object. After the value is stored, you can retrieve it by using its key.
//		Several methods throw a NoSuchElementException when no items exist in the invoking map.
//		A ClassCastException is thrown when an object is incompatible with the elements in a map.
//		A NullPointerException is thrown if an attempt is made to use a null object and null is not allowed in the map.
//		An Unsup
//		portedOperationException is thrown when an attempt is made to change an unmodifiable map.
//
//
//		Relational Database Management System
//		A relational database management system (RDBMS) is a program that allows you to create, update, and administer a relational database. Most relational database management systems use the SQL language to access the database.
//
//
//		Why do we need SQL?
//		Allows users to access data in the relational database management systems.
//		Allows users to describe the data.
//		Allows users to define the data in a database and manipulate that data.
//		Allows to embed within other languages using SQL modules, libraries & pre-compilers.
//		Allows users to create and drop databases and tables.
//		Allows users to create view, stored procedure, functions in a database.
//		Allows users to set permissions on tables, procedures and views.
//
//
//
//		Primary Key
//		A primary key is a field in a table which uniquely identifies each row/record in a database table. Primary keys must contain unique values. A primary key column cannot have NULL values.
//		A table can have only one primary key, which may consist of single or multiple fields. When multiple fields are used as a primary key, they are called a composite key.
//		If a table has a primary key defined on any field(s), then you cannot have two records having the same value of that field(s).
//
//
//
//		SQL Statements
//		DDL - Data Definition Language - CREATE, ALTER, DROP
//		DML - Data Manipulation Language - SELECT, INSERT, UPDATE, DELETE
//		DCL - Data Control Language - GRANT, REVOKE
//		TCL - Transaction Control Language - SAVEPOINT, ROLLBACK, COMMIT
//
//
//
//		Different Types Of Joins
//		INNER JOIN
//		LEFT JOIN
//		RIGHT JOIN
//		FULL JOIN
//	
	
	
}
