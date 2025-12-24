package notes_2;

public class AI_Javelin_a_PathParameters {

}

/**
 
 
 
 # Javalin Lab: Retrieving Data from Path Parameters

Now that we have learned how to create a webserver and define endpoints with Javalin, we need to learn how to 
retrieve data from the HTTP requests.

The most common ways to transmit data in an HTTP request are:
- Path parameters
- HTTP Request body

For this lab we will be looking at Path Parameters

## Path Parameters

Path parameters are variables that are in the URL path. For example, Lets say we define the following endpoint:

```java
app.get("/lastname/{name}", ctx -> {
    String lastName = ctx.pathParam("name");
});
```
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
