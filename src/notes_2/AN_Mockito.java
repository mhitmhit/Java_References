package notes_2;

public class AN_Mockito {

}

/**
 Mockito is a popular open-source framework for mocking objects (mock objects) and methods (method stubs) in 
 software tests. Using Mockito greatly 
 simplifies the development of tests for classes with external dependencies.
 
 A mock object is a dummy implementation for an interface or a class
 
 A stub is an entity that has its return values pre-programmed. It is injected into the test class so that you have 
 complete control over the input being tested.
 
A mock is a class whose interactions with the test class can be evaluated after the test is over. For example, you 
can ask it whether one of its methods was called or how many times it was called. Classes with unintended consequences 
that must be investigated, like those that send emails or communicate data to another external service, are common 
candidates for mocks.

A spy is a class that uses the real implementation of methods unless we choose to stub them. This is different from 
mocks in that, if we choose not to stub a mock's method, it will still not have an implementation, and the return value 
is a default fake value, like 0 or null.
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */