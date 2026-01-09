package notes_3;

public class AO_Rest_API {

}
/**

@RestController is a specialized version of the controller that incorporates @Controller and @ResponseBody, resulting in 
easier controller implementation as your methods no longer require the @ResponseBody 
annotation before the return type in each method signature.


@RestController
@RequestMapping("student")
public class StudentController {

    private List<Student> studentList = new ArrayList<>();

    {
        studentList.add(new Student("admin@mail.com", "IT", 100, "adminPass"));
        studentList.add(new Student("Charles@mail.com", "Biology", 72, "password"));
        studentList.add(new Student("Nick@mail.com", "Computer Science", 18, "superPass"));
    }

    @PostMapping("submit")
    public ResponseEntity<String> submitInfo(@RequestParam String email,
                                          @RequestParam String major,
                                          @RequestParam int age,
                                          @RequestParam String password) {

        studentList.add(new Student(email, major, age, password));
        return ResponseEntity.status(201)
                .body("Successfully Registered");
    }
}














































*/