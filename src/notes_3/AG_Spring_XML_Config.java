package notes_3;

public class AG_Spring_XML_Config {

}
/**
 
 XML configuration in Spring is a traditional way of defining and managing beans and their dependencies.
It provides a clear and centralized way of configuring the application, making it easier to understand and maintain.
Beans are defined within the <bean> tag in the XML configuration file. Each bean is given a unique id, and the fully 
qualified class name is specified with the class attribute.
Dependency Injection can be done through constructor injection, where dependencies are specified within the 
<constructor-arg> tag, or through setter injection, where dependencies are specified within the <property> tag.
XML configuration also supports the injection of complex data types, such as lists, sets, and maps.
Even though annotation-based configuration is becoming more popular due to its simplicity, XML configuration is still 
in use, especially in legacy applications or applications that require a high degree of configurability and explicit 
control over configuration details.
The use of XML configuration enables the sharing of configuration details across multiple applications, which can be 
beneficial in large systems.



 constructor based DI:
Ex/
<bean id="anotherBean" class="com.example.AnotherBean">
    <constructor-arg ref="exampleBean" />
</bean>

Ex/
    <!-- constructor based injection-->
    <bean id = "animal1" class = "Models.Animal">
    	<constructor-arg index="0" value = "cat" />
    	<constructor-arg index="1" value = "fluffy" />
    	<constructor-arg index="2" value = "5" />
    </bean>






setter-based DI
Ex/
<bean id="yetAnotherBean" class="com.example.YetAnotherBean">
    <property name="exampleBean" ref="exampleBean" />
</bean>

Ex/
    <bean id = "animal2" class = "Models.Animal">
    	<property name="species" value="dog" />
    	<property name="name" value="rex" />
    	<property name="age" value="2" />
    </bean>
    
    
    
    



















*/