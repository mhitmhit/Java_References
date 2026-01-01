package notes_3;

public class AA_Optionals {
/**
Optional class in Java is a container object that may or may not contain a non-null value. It was introduced in 
Java 8 as a way to handle scenarios where methods might return null values. Optional encourages developers to explicitly 
handle the case where the value may be absent. This makes the code more expressive and 
helps to avoid unexpected null pointer exceptions.

 of(value): Creates an Optional containing the specified non-null value. If the specified value is null, it throws a 
 NullPointerException.
    Example: Optional.of("biscuits")

ofNullable(value): Creates an Optional containing the specified value, which may be null. If the specified value is null, 
it returns an empty Optional.
    Example: Optional.ofNullable(null)

empty(): Returns an empty Optional instance. Represents the absence of a value.
    Example: Optional.empty()

isPresent(): Returns true if the Optional contains a non-null value, otherwise returns false.
    Example: optional.isPresent()

ifPresent(consumer): If a value is present, performs the given action with the value, otherwise does nothing. Note that 
this method does not return a value.
    Example: optional.ifPresent(value -> System.out.println(value))

get(): If a value is present, returns the value, otherwise throws a NoSuchElementException.
    Example: optional.get()

orElse(other): If a value is present, returns the value, otherwise returns the specified other value.
    Example: optional.orElse("some other value")

orElseGet(Supplier): If a value is present, returns the value, otherwise returns the result produced by the specified Supplier.
    Example: optional.orElseGet(() -> "some other value")

orElseThrow(Supplier): If a value is present, returns the value, otherwise throws an exception created by the provided Supplier.
    Example: optional.orElseThrow(() -> new RuntimeException("Value not present"))

map(Function): If a value is present, applies the given mapping function to it and returns an Optional containing the result, 
otherwise returns an empty Optional.
    Example: optional.map(value -> value.toUpperCase())

flatMap(Function): If a value is present, applies the given mapping function to it, which must return an Optional, and returns 
the result, otherwise returns an empty Optional.
    Example: optional.flatMap(value -> Optional.of(value.toUpperCase()))

filter(Predicate): If a value is present and matches the given predicate, returns an Optional containing the value, otherwise 
returns an empty Optional.
    Example: optional.filter(value -> value.length() > 5)




        Optional<String> empty = Optional.empty();
        System.out.println(empty);
 
        // It returns a non-empty Optional
        Optional<String> value = Optional.of(str[2]);
        System.out.println(value);
        
        // It returns value of an Optional.
        // If value is not present, it throws
        // an NoSuchElementException
        System.out.println(value.get());
 
        // It returns hashCode of the value
        System.out.println(value.hashCode());
 
        // It returns true if value is present,
        // otherwise false
        System.out.println(value.isPresent());
        
        
        
        
        











































 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
}
