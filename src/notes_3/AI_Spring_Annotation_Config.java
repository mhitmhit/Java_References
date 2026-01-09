package notes_3;

public class AI_Spring_Annotation_Config {

}
/**

Annotation-based configuration is another type of configuration that uses component annotations only, such as @Component, 
@Service, @Repository, and @Controller for declaring beans, and @Autowired for dependency injection.

    @Component is a general-purpose stereotype annotation indicating that the class is a Spring component.
    @Service, @Repository, and @Controller are specializations of @Component for specific use cases.
    @Autowired: It is used to achieve dependency injection. The Spring container auto-wires beans by looking at the 
    classes in the classpath, matching them by type or by name.

Benefits of Annotation-Based Configuration:

    Simplicity: Using annotations often leads to cleaner and more readable code as the metadata (annotations) are placed 
    right next to the code they are related to.
    Elimination of XML configuration: Annotations eliminate the need for XML configuration files, providing a means to move 
    towards a zero-XML configuration. XML files can get quite verbose and difficult to manage in large projects.
    Improved productivity: With annotations, developers can avoid writing long XML configuration files and spend more time 
    writing business logic.
    Type Safety: Since annotations are strongly typed, errors will be caught at compile time rather than at runtime, as 
    could happen with string-based XML configurations.
    Better for Collaboration and Control: With annotations, the configurations are done in the code, so it is easier for 
    multiple team members to understand what is happening in the codebase and maintain version control.
    Contextual Configuration: Annotations allow configurations to be applied right where they are needed, making the 
    configuration context-specific and easier to understand.



Annotation-based configuration is an alternative to XML-based configuration that was introduced in Spring 2.5. It 
uses annotations to handle dependency injection, bean creation, and configuration.
The key annotations are the @Autowired, @Service, @Controller, and @Repository annotations.
There are many benefits to using annotation-based configuration, such as simplicity, elimination of XML configuration, 
and type safety.




























*/