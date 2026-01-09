package notes_3;

public class AL_Spring_Boot {

}
/**

 * Spring Boot is a powerful framework within the Spring ecosystem that
 * simplifies the development of Java-based applications. It makes developing
 * web applications and microservices with the Spring Framework faster and
 * easier through three core capabilities:
 * 
 * Autoconfiguration. An opinionated approach to configuration. Additional
 * features such as an embedded server and starter packs.
 * 
 * Autoconfiguration
 * One of the key features of Spring Boot is its auto-configuration mechanism,
 * which automatically configures beans and components based on the dependencies
 * present in the classpath. We no longer need to write XML configuration
 * because Spring Boot analyzes the environment and classpath to configure
 * beans, reducing the need for manual configuration and improving productivity.
 * 
 * Opinionated
 * Spring Boot adopts an opinionated approach to configuration, providing
 * sensible defaults and conventions for various aspects of application
 * development. This allows developers to quickly bootstrap new projects and
 * focus on writing business logic rather than spending time on boilerplate
 * configuration.
 * 
 * embedded server
 * Spring Boot comes with built-in support for embedded servers such as Tomcat,
 * Jetty, and Undertow, and it also provides a set of starter packs, which are
 * curated sets of dependencies for common use cases such as web applications,
 * data access, security, and messaging. Starter packs include all the necessary
 * dependencies and configurations to get started with specific types of
 * applications, making it easy to add functionality to projects without
 * worrying about version compatibility or dependency conflicts.
 * 
 * Spring Boot also seamlessly integrates with other components of the Spring
 * ecosystem, such as Spring Framework, Spring Data, Spring Security, and Spring
 * Cloud. This allows developers to leverage the full power of Spring ecosystem
 * technologies and frameworks to build robust and feature-rich applications.
 * 
 * Its simplicity, ease of use, and focus on convention over configuration make
 * it a popular choice for building a wide range of applications, from simple
 * REST APIs to complex microservices architectures.
 * 
 * spring boot Comparison of the Spring Framework and Spring Boot Spring
 * Framework Spring Boot It is a comprehensive and modular framework for
 * building enterprise Java applications It is an opinionated framework built on
 * top of the Spring Framework that aims to simplify and streamline the
 * development of Spring-based applications. It provides opinionated defaults
 * and starter packs to minimize boilerplate code and reduce the need for manual
 * configuration. It provides a wide range of features and functionalities for
 * various aspects of application development It includes embedded server
 * support and seamless integration with the Spring ecosystem. It requires
 * developers to configure and manage many aspects of their applications
 * manually It is designed to be easy to use and quick to get started because of
 * auto-configuration.








@SpringBootApplication:
It is a combination of three annotations: @EnableAutoConfiguration, @ComponentScan, and @Configuration.

@SpringBootApplication
public class AssociateApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AssociateApplication.class, args);
    }
}

@EnableAutoConfiguration:
It enables Spring Boot to auto-configure the application context. Therefore, it automatically creates and registers 
beans based on both the included jar files in the classpath and configures them to run the methods.

@Configuration
@EnableAutoConfiguration
public class AssociateApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AssociateApplication.class, args);
    }
}

@ComponentScan:
When we develop an application, we need to tell the Spring framework to look for Spring components. @ComponentScan 
enables Spring to scan for configurations, controllers, services, and other components we define. The @ComponentScan 
annotation is used with the @Configuration annotation to specify the package for Spring to scan for 
components such as @Component, @Controller, @Service, and @Repository.

@Configuration
@ComponentScan
public class AssociateApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AssociateApplication.class, args);
    }
}

We can also use @ComponentScan as shown below, where Spring can read the specified package.

@Configuration
@ComponentScan(basePackages = "com.revature")

@Configuration:
The most important annotation in Spring is the @Configuration annotation, which indicates that the 
class has @Bean definition methods. This allows the Spring container to process the class and generate Spring 
Beans to be used in the application. This annotation is part of the Spring core framework.

@Configuration
public class AppConfig {
 
    @Bean(name="demoService")
    public DemoClass service() {
        
    }
}





to exclued auto configuartion for a certain class:
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MyApplication { ... }


























 * 
 * 
 * 
 */