package notes_3;

public class AF_Spring {

}
/**
 
what is spring ?
spring is a java framework to build apps easily and efficiently.
apps consist of three building layers: 
web layer: requ and resp using controllers to process and interact with layers.
service layer: bus logic, connect web and data layer, 
data layer: databases, and external data sources.

what is IOC ? inversion of control
design principle that shifts control of objects to the container or framework.
enables decoupling and loose coupling between layers by injecting dependencies into appropriate layers.
decoupling simpliefies maintenance, testing, and scalability.

 Spring BeanFacory:
 interface which is foundation of IOC container.
 responsible for managing and providing instances of objects (beans)
 serve as a registry for bean definitions, instantiation, configs, and lifecycle management.
 handles the injection of dependencies into beans.
 beans are created only when needed.
 
 IOC Container:
 interface that extends the beanfactory.
 supports dependency injections, autowiring, resolving dependencies.
 beans are created ahead of time
 
 
 
 Advantages:
-Use of POJO: The Spring Framework helps developers to develop enterprise applications using POJOs. An enterprise 
container like an application server is not required when using POJOs.
-Flexibility for configuring Spring: Spring provides both XML configuration and Java-based annotations.
-No need for a Server: The Spring Framework provides a lightweight container that can be activated without any web server 
or application server.
-No need for reinvention: Spring uses technologies such as JDK timers, ORM frameworks, Java EE, etc. Developers do not 
need to learn all those technologies or frameworks to develop applications.
-Modularity: The Spring Framework provides modularity. Developers can decide which packages can be used or ignored based 
on their requirements.
-Ease of Testability: Spring Dependency Injection simplifies the injection of test data by using JavaBean POJOs.
-Inversion of Control and APIs: The Spring Framework provides inversion of control and APIs to translate 
exceptions thrown by JDBC and Hibernate into unchecked and consistent exceptions.




Spring Core Module
The Spring Core module follows the principle of Inversion of Control, where the control of object creation and lifecycle 
management is shifted from the application code to the Spring container. The Spring Core module provides the Inversion of 
Control (IoC) container, which manages the creation and configuration of objects (beans) in a Spring application. 
The Spring Container can be implemented in two different ways, namely BeanFactory and ApplicationContext.
This module also provides functionality for managing the lifecycle of a bean and for configuring your application, either 
with XML configuration or through annotations.



 Dependency Injection (DI): Spring Core implements a powerful dependency injection container that manages object creation 
 and wiring of components. Understanding DI enables developers to write loosely coupled and easily 
 maintainable code by decoupling dependencies and promoting modularization.
Inversion of Control (IoC): Spring Core follows the principle of Inversion of Control, where the control of object 
creation and lifecycle management is shifted from the application code to the Spring container. This leads to a more 
flexible and modular application design, making it easier to manage and extend.
Bean Lifecycle Management: Spring Core provides mechanisms for managing the lifecycle of beans, including instantiation, 
initialization, and destruction. Knowing how to configure bean lifecycle callbacks allows developers to perform custom 
initialization and cleanup tasks when beans are created or destroyed.
Annotations and XML Configuration: Spring Core allows developers to configure beans and application contexts using 
annotations or XML-based configuration. Knowing how to use annotations and XML configuration provides flexibility 
and choice in configuring Spring applications according to project requirements and preferences.









Implementation

The Spring Core, beans, and context dependencies can be added to a Maven project:

<!-- https://mvnrepository.com/artifact/org.springframework/spring-core -->
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>5.3.23</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-beans</artifactId>
    <version>5.3.23</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.23</version>
</dependency>

An XML file can be created for Spring configuration.

Spring configuration is done by adding the following code to the XML file. It can be obtained from the Spring documentation.

<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- add your beans here -->
</beans>





















    Dependency Injection (DI) is a design pattern in programming that enhances the modularity and testability of 
    software. It is a form of Inversion of Control (IoC) where the responsibility of creating dependencies shifts from the 
    class to a framework or container.
    DI addresses issues like tightly coupled code, code duplication, and challenges in unit testing. It encourages 
    the creation of loosely coupled and maintainable code, which leads to efficient and scalable software systems.
    Within frameworks such as Spring, DI is a central principle, advocating for modular and testable code. It enables 
    building systems where components can be independently replaced and tested, resulting in a highly modular architecture.
    In practice, dependencies are injected into classes via constructors (Constructor Injection), setter methods 
    (Setter Injection), or directly into fields (Field Injection). Various DI containers and frameworks exist to 
    facilitate this process and manage the lifecycle of objects.
In essence, DI is a key tool in modern software development, promoting principles of modularity, testability, and 
maintainability.


Main goal is to not have classes create the objects, rather just use them.
Step 1: Identify Dependencies
Step 2: Provide Injection Points:This is usually done through the constructor (Constructor Injection), through setter 
		methods (Setter Injection), or directly into fields (Field Injection)
Step 3: Create Instances of Dependencies:
		can create in the main method, or if the project is large, we can use Spring Framework.
Step 4: Inject Dependencies: inject the created instances into the classes.
Step 5: Use Your Dependencies.







Types of Dependency Injection:
Constructor Injection
    What it is: This form of Dependency Injection is accomplished when a class receives its dependencies through 
    its constructor during the instantiation process.
    Advantages: It allows for the creation of immutable objects because once a constructor is used to set a dependency, 
    the field can be made final. This type of injection is also less prone to null pointer exceptions.
    Disadvantages: The class could end up with a large number of constructor arguments if there are many dependencies, 
    which can make the code difficult to understand.
    Best used when: The dependencies are required for the class to function and should not be changed after the class is 
    constructed.
	Large-scale enterprise applications: In large applications where various services are interacting with each other, 
	constructor injection ensures all dependencies are present at the time of object creation, making the application 
	more stable and less prone to null pointer exceptions.
	Immutable Objects: Constructor injection is useful in scenarios where you want your injected dependencies to be 
	immutable (i.e., they can't be changed after being set). This is helpful in maintaining data consistency and integrity 
	across the application.
	Mandatory Dependencies: Whenever an object has mandatory dependencies (dependencies it cannot function without), 
	constructor injection is preferred.

Setter Injection
    What it is: This type of Dependency Injection happens when a class receives its dependencies through setter methods 
    after it has been constructed.
    Advantages: It provides a way to change the dependencies of a class after it has been constructed. It also makes it 
    easier to handle optional dependencies.
    Disadvantages: The object is not guaranteed to be in a fully initialized state because it might not have received all 
    its dependencies.
    Best used when: The dependencies can be changed during the lifespan of the class or when some dependencies are optional.
	Configurable Components: Setter injection is useful in scenarios where you want to provide the option for dependencies 
	to be reconfigured even after an object has been created. This is common in applications that have pluggable or 
	interchangeable components.
	Optional Dependencies: In cases where an object can function without certain dependencies, or where default 
	dependencies can be overridden, setter injection is often used

Field Injection
    What it is: Field Injection happens when the dependencies are injected directly into the fields of a class, 
    bypassing the constructor or setters.
    Advantages: It reduces the amount of boilerplate code, as no explicit setter or constructor is needed.
    Disadvantages: It makes your classes harder to test because you can't easily replace the dependencies with mocks. 
    It also breaks encapsulation because you're modifying private fields outside of the class.
    Best used when: You need to reduce the amount of boilerplate code and you are not concerned about the testing implications.
	Simplifying Code with Spring Annotations: Field injection is commonly used in scenarios where you want to reduce 
	boilerplate code. By directly injecting dependencies into fields with Spring's @Autowired annotation, the need for 
	explicit setter or constructor methods is eliminated.
	Rapid Prototyping and Development: Field injection can speed up development time as it requires less code. This makes 
	it a good choice for prototyping or when the speed of development is a priority over other considerations such as 
	testability.
	
	

// constructor injection
@Service
public class PaymentService {
    private final BankService bankService;

    public PaymentService(BankService bankService) {
        this.bankService = bankService;
    }

    public void makePayment(double amount) {
        bankService.transferFunds(amount);
    }
}



// Setter injection
 @Service
public class NotificationService {
    private EmailService emailService;

    public void setEmailService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendNotification(String message) {
        if(emailService != null) {
            emailService.sendEmail(message);
        }
    }
}








// Field Injection
 @Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
}




 
 
 
 
 
 
 
 
 
 
 
 Notes from Video:
 Java Context:
 - classes and object interacting with each other
 - objects depend on one another. ex/ service class depends on DAO.
 - when we have IOC container (inversion of control), we are passing management of these dependencies to the Application context
 which manages all these objects (beans: objects managed by the container).
 
 Dependency container:
 - IOC container handles all the dependencies in our program.
 - 3 types of DI.
 	- constructor: invoke constructor to create our beans, and pass in fields/values as arguments to the constructor.
 	- setter: need a no arg constructor. use setter methods to assign those values afterwards.
 	- field: directly assigning value to the field.
 
 Ways to configure beans/dependency injection:
 - xml based: beans info is in xml
 - annotation based. use annotation to inject dependencies.
 - java based config: use classes and methods to provide beans instructions and to give configuration.
 
 
 








Description

Inversion of Control (IoC) is a software design principle that promotes loose coupling and modularity by 
shifting the responsibility of managing dependencies from the application itself to an external container or framework. 
In IoC, the control flow of a program is inverted, with the framework or container taking charge of creating and managing 
objects and injecting their dependencies.

Key points about Inversion of Control include:

    Decoupling Dependencies: IoC aims to decouple components and reduce their direct dependencies, allowing for easier 
    maintenance, testing, and scalability.
    Dependency Injection: IoC relies on Dependency Injection (DI), where the dependencies of a component are provided 
    externally, typically through constructor injection, setter injection, or interface injection.
    Loose Coupling: By removing the responsibility of creating and managing dependencies, IoC enables loose coupling 
    between components, promoting better code organization and reusability.
    Inversion of Control Containers: IoC containers, such as the Spring Framework in Java or .NET Core's built-in container, 
    facilitate IoC by managing the lifecycle of objects, performing dependency injection, and handling other aspects of 
    object creation and configuration.
    Dependency Inversion Principle: IoC is closely related to the Dependency Inversion Principle (DIP), which suggests 
    that high-level modules should not depend on low-level modules, but both should depend on abstractions.
    Software Frameworks and Libraries: IoC is a commonly used principle in various software frameworks and libraries, 
    providing a foundation for building flexible and modular applications.
    Benefits: Inversion of Control offers several benefits, including improved code maintainability, testability, 
    reusability, and the ability to easily swap or configure different implementations of components.
    Application Design Flexibility: IoC provides flexibility in designing applications, as it allows developers to 
    focus on implementing business logic without worrying about managing dependencies.

In summary, Inversion of Control is a powerful design principle that promotes loosely coupled and modular code by 
shifting the responsibility of managing dependencies to an external container or framework. It enhances the 
flexibility, maintainability, and testability of software applications.




Advantages of IoC
    Decoupling the task execution from the implementation.
    Easy switching between different implementations.
    Greater modularity of a program.
    Easy testing of a program by isolating the component or mocking its dependencies.
r
Bean Factory vs Application Context

The org.springframework.beans and org.springframework.context packages are the basis for the Spring framework's IoC container.
The ApplicationContext is built on top of BeanFactory.
The BeanFactory provides the configuration framework and the basic functionality, while ApplicationContext adds additional 
functionality like easy integration with Spring AOP features, message resource handling, event propagation, and contexts 
specific to the application layer, like WebApplicationContext for use in web applications.
Bean
The object that is instantiated, assembled, and managed by the IoC container is called a bean. Beans form the backbone 
of any Spring application.



Bean Definition:
define the bean:
	@Component
	public class MyBean {
	    // Bean implementation code
	}
configure component scanning:
	@Configuration
	@ComponentScan(basePackages = "com.example")
	public class AppConfig {
	    // Configuration code
	}
create app context:
	public class MainApp {
	    public static void main(String[] args) {
	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	        // Application logic
	    }
	}
retrieve and use:
	public class MainApp {
	    public static void main(String[] args) {
	        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	
	        MyBean myBean = context.getBean(MyBean.class);
	        myBean.doSomething();
	    }
	}



Bean Scope:
     * Singleton - the default scope, any time a specific bean is requested, the existing object is reused
     * Prototype - any time a bean is requested a new object is instantiated
     * Request - only used in web applications - a new object is instantiated once per web request
     * Session - only used in web applications - a new object is instantiated once per web session
     * Application - only used in web applications - a new object is instantiated once per web servlet
     * Websocket - only used in web applications - a new object is instantiated once per websocket
     

The bean lifecycle is as follows:
    Spring IOC starts
    Bean Instantiated
    Dependencies Injected
    Internal Spring processing
    Custom init method (ready for use)
    Container shutdown
    Custom destroy method


Ex/ default scope / singleton:
@Component
public class Singleton {
    
    Singleton() {
        System.out.println("Singleton bean initialized");
    }
}



Ex/ prototype scope:
@Component
@Scope(value = "prototype")
public class Prototype {
    Prototype() {
        System.out.println("Prototype class initialized");
    }

    void printMessage() {
        System.out.println("Prototype");
    }
}






















*/