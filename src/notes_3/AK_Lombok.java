package notes_3;

public class AK_Lombok {

}
/**

 * Description Lombok
 * 
 * Lombok is a Java library that helps reduce boilerplate code in Java classes
 * by providing annotations that automatically generate common methods such as
 * getters, setters, constructors, equals, hashCode, and toString. It aims to
 * improve code readability, maintainability, and productivity by eliminating
 * the need to write repetitive and mundane code manually. Lombok works by
 * plugging into the build process and auto-generating Java bytecode into the
 * .class files as per several annotations introduced in the code. Features of
 * Lombok
 * 
 * Getters, Setters, and Constructors: In many IDEs, getters and setters can be
 * auto-generated. However, the code is present in the class, and if a new field
 * is added, the getters and setters can be generated for the respective field.
 * If a field is renamed, the getters and setters should be edited.
 * 
 * Lombok annotations @Getter and @Setter are used to generate getters and
 * setters. Lazy Getter: The process of getting the data only when it is needed
 * is called lazy loading. The process of retrieving the data only when the
 * corresponding getter for the field is needed is called a lazy getter.
 * The @Getter(lazy=true) annotation can be used to create a lazy getter.
 * 
 * Core Java Methods: The methods like toString(), equals(), and hashCode() can
 * be auto-generated using Lombok annotations @ToString and @EqualsAndHashCode.
 * 
 * Value Classes/DTOs: In some situations, a data type is defined to represent
 * complex values as Data Transfer Objects (DTOs). In most cases, these are
 * immutable. Instead of adding the code for the constructor to take all the
 * fields and check that they are not null, Lombok
 * annotations @RequiredArgsConstructor and @NonNull can be used.
 * 
 * @Data Annotation: The Lombok annotation @Data is a bundle
 *       of @ToString, @EqualsAndHashCode, @Getter / @Setter,
 *       and @RequiredArgsConstructor.
 * 
 *       Configuring API: Instead of providing getters, setters, and constructor
 *       methods, the @Builder annotation in Lombok is used.
 * 
 *       Checked Exceptions: Instead of using catch blocks or throws,
 *       the @SneakyThrows annotation of Lombok can be used.
 * 
 *       Closing the Resources After Use: The @Cleanup annotation of Lombok is a
 *       good alternative for try-with-resources and the close() method.
 * 
 *       Logging: Annotations like @Log4j and @Slf4j can be used with Lombok.
 * 
 *       Thread Safe Methods: The @Synchronized annotation of Lombok is used to
 *       get an auto-generated, private, unexposed field.
 * 



<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.24</version>
    <scope>provided</scope>
</dependency>



@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    public String studentID;
    public String firstName;
    public String lastName;
    public String major;
    
    public Student(String studentID, String firstName, String lastName, String major) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
    }
}





















































 * 
 * 
 */