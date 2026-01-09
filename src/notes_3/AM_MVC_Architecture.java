package notes_3;

public class AM_MVC_Architecture {

}
/**
 

 
 
 
 
 
 * Model: The component that deals with all data-related logic or business
 * logic. 
 * View: This component deals with the UI logic of the application.
 * Controller: It serves as an interface between the Model and View. It is used
 * to process business logic and incoming requests, manipulate data using the
 * Model component, and interact with views to provide the final output.
 * 
 * Key Features Annotation-based Configuration: Spring MVC provides support for
 * annotating controllers and mapping request URLs to controller methods using
 * annotations such as @RequestMapping, @GetMapping, @PostMapping, etc. This
 * allows for clean and concise configuration of request mappings. Data Binding
 * and Validation: Spring MVC supports automatic data binding between HTTP
 * request parameters and Java objects, as well as validation of form data using
 * annotations. View Resolvers: Spring MVC supports view resolvers, which are
 * responsible for resolving logical view names to actual View implementations.
 * This allows for flexible and configurable rendering of views, supporting
 * various view technologies such as JSP, Thymeleaf, FreeMarker, etc.
 * 
 * 
 * 
 * Spring MVC also follows the Front Controller pattern. The Front Controller
 * pattern is a design pattern commonly used in web applications to handle
 * requests from clients and route them to the appropriate components for
 * processing. In Spring MVC, the Front Controller is represented by the
 * DispatcherServlet, which acts as the entry point for all incoming requests.
 * When a request is received by the DispatcherServlet, it consults the request
 * mappings configured in the application to determine which controller should
 * handle the request. The DispatcherServlet then delegates the request to the
 * corresponding controller for further processing.
 * 

 * The request from the client is sent to our Embedded Tomcat Server, which
 * forwards the request to the DispatcherServlet (Front Controller). Based on
 * the request, it is sent to a specific controller through the Front
 * Controller's delegation. The Front Controller is aware of all the controllers
 * annotated with the @Controller annotation. The response from the controller
 * is a model, returned to the Front Controller, which then interacts with the
 * view template to render a response to the user. The model can be either in
 * raw data formats such as JSON or XML or utilize view technologies such as
 * JSP.
 * 
 * In this architecture, as the DispatcherServlet (Front Controller) handles all
 * requests and sends the response, there is no direct interaction between the
 * client and the controllers. As the DispatcherServlet interacts with the view
 * template, at any point in time, the developer can change the view from JSP to
 * Thymeleaf or any other view template easily.
 * 
 * 
 * 
 * Spring DEV Tools
 * Automatic Restart:
 * Live Reload: 
 * Remote Debugging
 * Development-time Configuration
 * Property Defaults:
 * 
 * 
 * <dependency>  
    <groupId>org.springframework.boot</groupId>  
    <artifactId>spring-boot-devtools</artifactId>  
</dependency> 



Spring Environments:
Spring introduces the new @PropertySource annotation as a convenient mechanism for adding property sources to the environment.

We can use this annotation in conjunction with the @Configuration:

@Configuration
@PropertySource("classpath:application2.properties")
public class RevatureApplication {
    //.....
}

Another very useful way to register a new properties file is by using a placeholder, which allows us to dynamically select 
the right file at runtime:

@PropertySource({ 
  "classpath:persistence-${envTarget:mysql}.properties"
})

Property values can be injected directly into your beans using the @Value annotation, accessed via Spring’s Environment 
abstraction, or bound to structured objects via @ConfigurationProperties.

Injecting a property with the @Value annotation:

@Value("${jdbc.url}")
private String jdbcUrl;


 
 
 
 
 
 
 Advantages:
 - seperate roles, that are managed by Spring Boot (controllers, control views...)
 - light weight: embedded tomcat, 
 - powerful config: easily connects things together.
 - rapid development
 - reusable business code
 - flexible mapping
 
 
 Architecture:
  User --requ---> Front Controller (dispatcher servlet) ---delegate req ---> Controller (handle req, create model)  --delegate rendering of response--> Front Controller (dispatcher servlet)
  
  Front Controller (dispatcher servlet) ----Model----> View Template --return control--> Front Controller (dispatcher servlet)
  																										
																	
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 * 
 * 
 * 
 */