package notes_2;

public class AF_Lambdas {
/**
Lambdas are a concise way to represent an instance of a functional interface
hey enable us to treat functionality as a method argument or store functions in variables, making code shorter and more readable

(parameter list) -> expression

// Example 1
(int x, int y) -> x + y

// Example 2
() -> 42

// Example 3
(String s) -> { System.out.println(s); }

// Example 4
s -> System.out.println(s)

// Example 5
(String value1, String value2) -> {
    System.out.println(value1);
    System.out.println(value2);
};



Benefits:
 Conciseness and Readability: Lambdas allow you to express instances of single-method interfaces (functional interfaces) 
 concisely. This leads to more readable code, especially for small, self-contained functions. Reduced Boilerplate Code: By 
 using lambdas, 
 you can avoid writing verbose anonymous inner classes for simple operations. This reduces boilerplate code and makes the 
 codebase more compact and expressive.
Improved API Design: Lambdas enable the design of APIs that accept behavior as parameters, promoting flexibility and 
extensibility. This facilitates writing APIs that are more adaptable to different use cases and allows clients to customize 
behavior easily.
Functional Programming Style: Lambdas enable Java to embrace functional programming principles, such as higher-order functions, 
immutability, and referential transparency. This leads to code that is more modular, composable, and easier to reason about.
Enhanced Collections Framework: Lambdas, together with the Stream API introduced in Java 8, provide a powerful and expressive 
way to work with collections. Operations like filtering, mapping, and reducing can be performed using a 
functional and declarative style, leading to more elegant and efficient code.



interface BinaryCalculator {
    public int binaryOperation(int value1, int value2);
}

// == A Class with a main() method =============================


public class UsingLambdasAsParameters {

    // method that has a parameter of the functional interface type
    public static void printBinaryResult(int a, int b, BinaryCalculator func) {
        // perform operation, print result
        int result = func.binaryOperation(a, b);
        System.out.println(result);
    }

    // calling the method and passing in lambdas
    public static void main(String[] args) {
        printBinaryResult(3, 4, (a, b) -> a + b);
        printBinaryResult(3, 4, (a, b) -> a * b);
    }

    
}




























 */
}
