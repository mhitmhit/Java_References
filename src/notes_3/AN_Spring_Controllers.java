package notes_3;

public class AN_Spring_Controllers {

}
/**

The @Controller annotation is used to mark a class as a Spring MVC controller that handles web requests and 
typically returns a view name to be rendered.

The @RestController annotation is a convenience annotation that combines @Controller and @ResponseBody. It is used in 
RESTful web services to return data (usually JSON) directly in the HTTP response body.

Key Annotations:
    @RequestMapping: Maps HTTP requests to handler methods
    @GetMapping, @PostMapping, @PutMapping, @DeleteMapping: Shortcuts for HTTP methods
    @RequestParam, @PathVariable, @RequestBody: Binds HTTP request data to method parameters
    
Both @RequestParam and @PathVariable annotations are used to extract values from the request URI. 
However, @RequestParam gets values from the query string, while @PathVariable gets values from the URI.


@RestController: Combination of @Controller and @ResponseBody. Returns data directly in the response body (usually JSON).
@RequestMapping("/api"): Prefixes all endpoints in this class with /api.
@GetMapping("/status"): Handles GET requests to /api/status.
@PostMapping("/submit"): Handles POST requests to /api/submit and expects a JSON body.
@RequestBody: Binds the incoming JSON to the MyDTO object.
@ResponseEntity: Provides control over the HTTP response status and body.
@PutMapping
@DeleteMapping
@PatchMapping



// return HTML Views
@Controller
public class WebPageController {

    @GetMapping("/greeting")
    public String greet(Model model) {
        // Adding data to the model which will be used by the view (e.g., Thymeleaf)
        model.addAttribute("message", "Welcome to Spring MVC!");

        // Return the name of the view (e.g., greeting.html in /templates folder)
        return "greeting";
    }
}



// Rest API 
@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/status")
    public Map<String, String> getStatus() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "running");
        response.put("framework", "Spring Boot");
        return response;
    }

    @PostMapping("/submit")
    public ResponseEntity<String> submitData(@RequestBody MyDTO data) {
        // Simulate processing of the incoming data
        String message = String.format("Received data for %s aged %d", data.getName(), data.getAge());

        // Return a success response
        return ResponseEntity.ok(message);
    }
}





  @GetMapping("/string/{text}")
    public String getStringPathVariable(@PathVariable String text){
        return text;
    }
    
    
    
    

RequestMapping
In Spring MVC, the @RequestMapping annotation is used to map HTTP requests to handler methods in controllers. 
It allows developers to define which method should handle a particular URL pattern and HTTP method (such as GET, 
POST, PUT, DELETE, etc.). The @RequestMapping annotation can be applied at the class level and/or method level.

You can use @RequestMapping at the class level to specify a common base URL for all handler methods within that 
controller. This is useful for grouping related endpoints under a common base path:

@Controller
@RequestMapping("/api")
public class MyController {
    // Handler methods...
}

You can use @RequestMapping at the method level to further specify the URL pattern and HTTP method for 
individual handler methods. This allows you to have multiple handler methods within the same controller, 
each handling different requests.

@Controller
public class MyController {
    
    @RequestMapping("/hello", method = RequestMethod.GET)
    public String hello() {
        // Handler logic...
    }

    @RequestMapping("/save", method = RequestMethod.POST)
    public String saveData() {
        // Handler logic...
    }
}

   

The @RequestMapping annotation provides attributes for configuring requests:
value: This attribute specifies the URL pattern to which the handler method should be mapped.
@RequestMapping(value = "/hello")

method: This attribute specifies the HTTP request method(s) that the handler method should handle.
@RequestMapping(value = "/save", method = RequestMethod.POST)

params: This attribute specifies request parameters that must be present in the request for the handler method to be invoked.
@RequestMapping(value = "/users", params = "id")


    @GetMapping(value = "cats", params = {"term"})
    public String getSearchTerm(@RequestParam String term){
        return term;
    }
    
    
    
    @GetMapping(value = "cats", params = {"term", "format"})
    public String[] getSearchTermAndPage(@RequestParam String term, @RequestParam String format){
        return new String[]{term, format};
    }
    
       
       





ResponseBody
@ResponseBody annotation in Spring MVC is used to indicate that the return value of a controller 
method should be serialized directly to the HTTP response body. This annotation is typically used at the class 
level in combination with the @Controller annotation to specify that the return value of the methods in the 
class should not be interpreted as a view name but rather as the response content itself. Alternatively, 
the annotation could be placed on methods rather than the class itself.

Example:
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello, World!";
    }
}

















@Controller
@ResponseBody
@RequestMapping("/api/users")
public class UserController {

    @PostMapping("/register")
    public User register(@RequestBody User newUser) {
        // Logic to register a new user
    }

    @PostMapping("/login")
    public User login(@RequestBody LoginRequest loginRequest) {
        // Logic to authenticate user login
    }

    @GetMapping("/{userId}")
    public User getUserProfile(@PathVariable Long userId) {
        // Logic to retrieve user profile
    }

    @PutMapping("/{userId}")
    public User updateUserProfile(@PathVariable Long userId, @RequestBody User updatedUser) {
        // Logic to update user profile
    }

    // Other handler methods for user operations...
}








ResponseEntity
is a class that is meant to represent the entire HTTP response, offering the ability to control anything 
included in the response, such as status codes, headers, and the response body.
    The body is included and can be given a generic type to help ensure the type safety of the API's HTTP responses.
    Optionally, we can include header information without requiring direct access to the HttpServletResponse.
    Incorporating status codes, especially for handler methods that may not always behave in the same way.

HTTP Status Code
ResponseEntity allows you to specify the HTTP status code to be returned in the response. You can use predefined 
constants from the HttpStatus enum or provide a custom status code. For example, HttpStatus.OK, HttpStatus.CREATED, 
HttpStatus.NOT_FOUND, etc.

Headers
You can add custom headers to the response using the header() method of ResponseEntity. This allows you to include 
additional metadata in the response, such as content type, caching directives, authentication tokens, etc.

Body
ResponseEntity supports returning a response body along with the status code and headers. You can pass the body 
content as a parameter to the constructor or use the body() method to set the body content. 
The body can be of any type, including Java objects, collections, strings, etc.

The ResponseEntity class offers flexible control of our HTTP response through several static methods such as:
    The .status() method, which takes either an int status code or the HttpStatus enum.
    The .body() method, which allows information and objects to be passed back in the HTTP response body.
    The .header() method, which takes two strings for the key-value pair in the HTTP response headers.
    The .build() method for anything that doesn't have a body included with it.

Example:
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        String message = "Hello, World!";
        return ResponseEntity.ok(message);
    }

    @GetMapping("/error")
    public ResponseEntity<String> error() {
        String errorMessage = "Internal Server Error";
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body(errorMessage);
    }
}





@Controller
@RequestMapping("student")
public class StudentController {

    private List<Student> studentList = new ArrayList<>();

    {
        studentList.add(new Student("admin@mail.com", "IT", 100, "adminPass"));
        studentList.add(new Student("Charles@mail.com", "Biology", 72, "password"));
        studentList.add(new Student("Nick@mail.com", "Computer Science", 18, "superPass"));
    }

    @PostMapping("submit")
    public @ResponseBody ResponseEntity<String> submitInfo(@RequestParam String email,
                                          @RequestParam String major,
                                          @RequestParam int age,
                                          @RequestParam String password) {

        studentList.add(new Student(email, major, age, password));
        return ResponseEntity.status(201)
                .body("Successfully Registered");
    }
}





 @ResponseStatus allowed us to include the appropriate HTTP status code through the HttpStatus enum in Java when 
 returning our HTTP Response to the user/frontend.
@ExceptionHandler is an annotation at the method level that handles any exceptions specified in the annotation properties.













@Controller
@RequestMapping("student")
public class StudentController {

    private List<Student> studentList = new ArrayList<>();

    {
        studentList.add(new Student("admin@mail.com", "IT", 100, "adminPass"));
        studentList.add(new Student("Charles@mail.com", "Biology", 72, "password"));
        studentList.add(new Student("Nick@mail.com", "Computer Science", 18, "superPass"));
    }

    @GetMapping("info/{email}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public @ResponseBody Student displayInfo(@PathVariable String email) {

        for (Student student : studentList) {
            if (student.getEmail().equals(email))
                return student;
        }
        throw new CustomException("Email was not found; check the email and try again.");
    }

    @PostMapping("submit")
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody String submitInfo(@RequestParam String email,
                                          @RequestParam String major,
                                          @RequestParam int age,
                                          @RequestParam String password) {

        studentList.add(new Student(email, major, age, password));
        return "Successfully submitted";
    }

    @PutMapping("update")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public @ResponseBody void update(@RequestBody Student updatedStudent) {
        if (studentList.removeIf(student -> student.getEmail().equals(updatedStudent.getEmail()))) {
            studentList.add(updatedStudent);
            return;
        }
        throw new RuntimeException("Email was not registered; check the email and try again, or register a new student.");
    }

    @ExceptionHandler({RuntimeException.class, CustomException.class})
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public @ResponseBody String handleNotFound(RuntimeException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public @ResponseBody String handleMissingParams(MissingServletRequestParameterException ex) {
        return ex.getParameterName() + " is missing in the query parameters and is required.";
    }

}






















































*/