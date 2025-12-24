package notes_2;

public class AG_Method_References {
/**
 method references are a feature introduced in Java 8 that provides a shorthand way of referring to methods 
 without having to explicitly call them. A method reference is a compact and readable way to refer to a method 
 in cases where a lambda expression simply calls an existing method. Instead of writing out a full lambda expression, 
 you can just use the method's name along with a special syntax.
For a reference to a static method, the lefthand side of the operator is the class that contains the method 
we want, and the righthand side is the name of the static method itself.
Need to have the signature satisfied.ie/ inputs/outputs are same in the interface.
Steps:
-	Create the functional interface.ie/ interface with one abstract method.
-	Create a Ref Var of the interface, and assign the method you want to call (the method that will do the work, 
either we created it or a java built in method) – use method reference
-	Use refVarName.MethodName to call it
Benefits:
•  Readability and Conciseness: Method references allow you to express code more concisely by referring to existing 
methods or constructors directly. This leads to clearer and more readable code, especially when working with functional 
interfaces. 
•  Functional Programming Paradigm: Method references align with the functional programming paradigm by treating methods 
as first-class citizens. They allow you to pass behavior as parameters to methods, enabling functional-style programming 
in Java. 
•  Integration with Existing APIs: Many existing APIs in Java, such as the Stream API and the Comparator interface, 
support method references. Using method references allows you to seamlessly integrate with these APIs and take advantage 
of their functionality.

There are four kinds of method references:
A reference to a static method
Math::max
A reference to an instance method of a particular object
// lambda that returns a character's index in a named String object by calling the indexOf() method
c -> myString.indexOf(c)

// method reference that does the same thing
myString::indexOf



// our named object
String myString = "hello";

// referencing an instance method using our named object
myString::toUpperCase
A reference to an instance method of an arbitrary object of a particular type (object not stored in a variable) – in this 
case, we use the type and let JVM decide from the context.
String::startsWith
A reference to a constructor
String::new

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
}
