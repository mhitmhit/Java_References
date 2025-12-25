package notes_2;

public class AU_Singleton_Design_Pattern {

}
/**
Singleton Pattern

A Singleton is a design pattern which allows the creation of an object in memory only once in an 
application and can be shared across multiple classes. It can be useful for services in an application, or other 
resources like a connection or thread pool.

There are many benefits to using a Singleton:
    There will only be 1 instance, which allows coordination across a system.
    There is a clear way to fetch the correct instance, for example, a getInstance() method
    The programmer has complete control over instantiation.
    It is a global access point
    The singleton is not created until it is used, often referred to as lazy instantiation.

However, there are also drawbacks to using a Singleton:
    Harder to work with in multithreaded environments.
    Different components can be given too much control over other components.

Overall, there are many situations to use a Singleton, for instance:
    Where other creational patterns need to limit the number of objects.
    Facade (another common design pattern) objects are often singletons.
    State objects may break if there are duplicates.
    Objects used by many different pieces, such as game boards or memory.


 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
