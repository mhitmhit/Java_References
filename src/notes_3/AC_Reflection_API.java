package notes_3;

public class AC_Reflection_API {

}
/**

Reflection in Java is a feature that allows a program to examine and manipulate its own structure, behavior, 
and metadata at runtime. It provides a way to inspect and modify classes, interfaces, fields, methods, and constructors, 
even if they are private or inaccessible through normal means. Reflection is particularly useful for building generic code, 
implementing frameworks, and writing debugging tools. 
The API can be found in the java.lang.reflect package.


 Introspection: Reflection enables you to inspect the structure and behavior of classes, interfaces, fields, methods, 
 and constructors at runtime. This introspective capability is valuable for building frameworks, libraries, and tools 
 that need to analyze or manipulate classes dynamically.
Dependency Injection and IoC Containers: Many dependency injection frameworks and Inversion of Control (IoC) containers 
use reflection to inspect and wire dependencies at runtime. By using reflection, these frameworks can automatically 
instantiate and inject dependencies into objects based on their annotations or configuration.
Testing and Debugging: Reflection can be helpful in testing and debugging scenarios where you need to access and modify 
private fields or invoke private methods for testing purposes. It enables you to inspect and manipulate the internal 
state of objects, which can be useful for writing unit tests or diagnosing issues in production environments.
Annotations and Custom Annotations: Reflection is often used with annotations to process and interpret metadata associated 
with classes, fields, methods, and other program elements. It allows you to extract and analyze annotation metadata at 
runtime, enabling powerful runtime behavior based on annotations.
Framework and Library Development: Reflection is frequently employed in the development of frameworks and libraries to 
provide flexible and extensible behavior. Frameworks can use reflection to dynamically discover and invoke extension 
points, configure components based on annotations or configuration files, and enforce 
runtime constraints or policies



Class<?> classObj = String.class;
System.out.println(classObj);

Class<?> classObj2 = Class.forName("java.lang.String");
System.out.println(classObj2);

Class<?> classObj3 = "hello world".getClass();
System.out.println(classObj3);



// step 1
Class<?> classObj = Object.class;
System.out.println(classObj + "\n");

// step 2
Method [] methods = classObj.getDeclaredMethods();
for (Method method : methods) {
   System.out.println(method);
}


// step 3
Method method = (Method) classObj.getDeclaredMethod("getClass");
System.out.println(method);
System.out.println(method.invoke("hello world"));
















*/