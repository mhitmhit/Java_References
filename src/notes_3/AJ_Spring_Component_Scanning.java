package notes_3;

public class AJ_Spring_Component_Scanning {

}
/**

In Spring, component scanning is a mechanism that allows the framework to automatically detect and register classes 
annotated with stereotype annotations (@Component, @Service, @Repository, @Controller) as beans in the Spring application 
context.

When the application starts up, Spring scans the classpath, looks for classes annotated with these annotations, creates 
instances (beans) of these classes, and registers them in the application context.

This automated process greatly simplifies the configuration of a Spring application by reducing the need for explicit bean 
definitions in XML or Java configuration files. It also encourages a convention-over-configuration programming model, 
which leads to cleaner and more manageable code.

The @ComponentScan annotation or <context:component-scan> element in XML is used to specify the packages that Spring 
should scan for component classes. If no specific packages are specified, Spring will scan from the package of 
the class that declares the @ComponentScan annotation and its sub-packages.






Component scanning is a feature in Spring that allows for the automatic detection and instantiation of classes 
annotated with stereotype annotations (@Component, @Service, @Repository, @Controller).

These detected classes are automatically registered as beans in the Spring application context. This means you 
don't have to explicitly define these beans in your configuration.

The process of component scanning simplifies the configuration of your Spring application and makes your code 
cleaner and easier to manage.

To use component scanning, you need to specify the packages to scan. You can do this using the @ComponentScan 
annotation or the <context:component-scan> element in XML.

Spring will scan the specified packages and any sub-packages, looking for classes with stereotype annotations.

While Spring Boot automatically sets up component scanning, you can also set it up manually in a Spring 
Framework application using a configuration class annotated with @Configuration and @ComponentScan.





Stereotype Annotations The following are the Spring stereotype annotations:
1. @Component
@Component is the main stereotype annotation. It is a class-level annotation. @Component is used across the 
application to mark the beans as Spring's managed components.

2. @Service
It is a specialization of @Component. The business logic of an application exists in the service layer, and 
the @Service annotation is used to indicate that a class belongs to the service layer.

3. @Repository
It is a specialization of @Component and is very similar to the DAO pattern. DAO classes provide CRUD operations 
for database tables.

4. @Controller
It is a specialization of @Component. The @Controller annotation indicates that a particular class is a controller. 
It is mostly used with Spring MVC applications and is used in combination with annotated methods based on 
the @RequestMapping annotation. The dispatcher scans the class and detects methods with the @RequestMapping annotation.




















*/