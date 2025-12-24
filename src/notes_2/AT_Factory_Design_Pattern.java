package notes_2;

public class AT_Factory_Design_Pattern {

}
/**
Factory is a design pattern which creates objects in which the precise type may not be known until runtime. 
There are several reasons to use the factory pattern:
    If you don't know the exact types needed before running the code.
    If you want to hide the creational logic, which prevents end user creating things that they shouldn't.
    If you need an easy way to extend internal components.
    Depending on implementation, the factory pattern can be used to reuse objects, instead of making new ones, 
    which saves space.
Some extra benefits of using the factory pattern:
    Single responsibility is upheld by putting all of the construction code in a single function.
    Open/Closed principle is upheld by allowing new subclasses to easily implement and be added, without negatively 
    affecting any of the already written classes.
    Abstracts the actual creation of the objects away from the user.


  
  
  Real World Application
The Factory design pattern offers flexibility, encapsulation, and separation of concerns within an application, 
so it can be widely usable across a variety of situations and projects. Many libraries and frameworks will implement a 
factory design pattern to ensure proper creation of required objects, but allows for the implementor using the library or 
framework to specify their own use cases. 
Other examples of Factory Design patterns are as follows:
    Object Creation with Complex Initialization: When an object requires complex initialization or configuration, 
    the Factory Design Pattern can be employed. The factory encapsulates the creation logic and hides the complexity, 
    providing a clean interface for creating objects.
    Dependency Injection: In Dependency Injection frameworks, the Factory Design Pattern is often used to create and manage 
    instances of classes with complex dependencies. The factory can handle the resolution of dependencies and provide the 
    appropriate instances to the requesting components.
    Database Access: In database applications, the Factory Design Pattern can be used to create database connections or data 
    access objects. The factory can handle the creation of the database-specific objects based on the configuration or other 
    criteria.
    Logging: In logging frameworks, the Factory Design Pattern can be used to create logger objects. The factory can determine 
    the appropriate logger implementation based on the specified configuration, such as logging level, destination, or 
    formatting.
    GUI Component Creation: In graphical user interface (GUI) development, the Factory Design Pattern can be employed to create 
    different types of GUI components based on user preferences or application settings. The factory can generate the 
    appropriate components, such as buttons, panels, or dialogs, based on the desired style or behavior.
Note that this is not an exhaustive list of when and where to apply the Factory design pattern, but hopefully this list 
illustrates how useful it can be!

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
 
 */
