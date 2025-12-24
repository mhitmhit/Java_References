package notes_2;

public class AE_Functional_Interfaces {
/**
 functional programming is more like building programs by relying on functions to transform data. Instead of having objects 
 interact, 
 we may write a series of function calls that process and transform the data step-by-step.
 
  we can have a variable be of the functional interface type, and then we can assign it a lambda as its implementation:
  Functionaln interface var = Lambda expression;
  
   functional interface types as parameters in methods. When the method is called, we can pass in a lambda
   someMethodCall( lambda );

  While OOP uses objects and object interactions to build programs, functional programming is more like 
  building programs by relying on functions to transform data.
In Java, we can use lambda expressions and method references as our “first-class citizen” functions, and we 
can use functional interface variables and parameters as the locations in our code where we can place these functions.
Functional interfaces are interfaces that have only one abstract method.
The Java 8 JDK comes with many built-in functional interfaces.


benefits:
 Lambda Expressions: Functional interfaces enable the use of lambda expressions, which provide a concise way to express 
 instances of single-method interfaces. Lambda expressions make code more readable and maintainable by reducing boilerplate code.
Stream API: Many methods in the Stream API, such as filter, map, and reduce, accept functional interfaces as parameters. 
Understanding functional interfaces allows you to leverage the power of the Stream API to perform operations on collections 
in a declarative and functional style.
Parallel Processing: Functional interfaces enable parallel processing of collections using features like parallel streams. 
Parallel streams internally use functional interfaces to split the workload and execute operations concurrently, which can lead 
to improved performance for certain types of tasks.
Functional Programming Paradigm: Functional interfaces are a key component of the functional programming paradigm, which 
promotes writing code in a declarative and composable manner. Understanding functional interfaces can help developers embrace 
functional programming principles and write more modular and reusable code.





public interface Prettifier {
     * This method should take in an Object, translate it to a pretty String, and return the String.
     * 
     * @param obj - the Object to prettify
     * @return - A pretty String
     
    public abstract String prettify(Object obj);

}

public class Main {
    public static void main(String[] args) {
        
    // ---- Functional Programming ----------------------- //

      // write functionality
      Prettifier prettifierImpl = x -> "*~*~ " + x + " ~*~*";
      
      // use functionality
      Integer myInteger = 5;
      String result = prettifierImpl.prettify(myInteger);
      System.out.println(result); // output: *~*~ 5 ~*~*

      // swap implementations
      prettifierImpl = x -> "+-+- " + x + " -+-+";
      result = prettifierImpl.prettify(myInteger);
      System.out.println(result); // output: +-+- 5 -+-+

    }
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 
 */
}
