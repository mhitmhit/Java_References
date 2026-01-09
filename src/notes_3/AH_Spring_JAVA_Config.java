package notes_3;

public class AH_Spring_JAVA_Config {

}

/**
Java-based configuration uses annotations to configure your beans. need to create a config class that defines your beans.

@Configuration classes are used to define beans. They are similar to XML configuration files in functionality.
@Bean is used to declare a bean in a @Configuration class.
@Qualifier: This annotation is used when there are multiple beans of the same type, and you want to inject 
one of them. It allows you to specify the exact bean to be wired.
@Scope: This annotation is used to specify the scope of the beans (singleton, prototype, etc.).
@ComponentScan: This is used to specify the packages to scan for @Component annotations or its derivatives. 
Spring will automatically discover and instantiate the beans.

Type safety: As everything is done in Java, the compiler can check the code and prevent errors that can 
happen due to typos in XML files.
Autocompletion and debugging: IDEs can offer autocomplete, navigation, and debugging out-of-the-box 
for Java classes, but not necessarily for XML files.
Flexibility: Java-based configuration allows for more dynamic and complex scenarios, as it is capable of 
leveraging the full power of the Java language.








Summary

    Dependency Injection (DI) using Java-based configuration in Spring provides a more readable and maintainable 
    approach compared to XML-based configuration.
    Java-based configuration uses annotations such as @Configuration, @Bean, and @Autowired to define beans and 
    their dependencies.
    @Configuration marks a class as a configuration class, where bean definitions and dependencies are declared.
    @Bean annotates methods that define and return instances of beans.
    @ComponentScan is used to specify packages to scan for @Component annotations or its derivatives.

the packages to scan for @Component annotations or their derivatives. Spring will automatically discover and 
instantiate the beans.

    Java-based configuration promotes type safety and integrates well with IDE tools.
    It offers flexibility for dynamic and conditional bean configuration.
    It seamlessly integrates with other Java libraries and frameworks.

Java-based configuration in Spring simplifies dependency management, improves code readability, and provides a 
flexible approach to configuring and wiring 
beans in applications.























*/