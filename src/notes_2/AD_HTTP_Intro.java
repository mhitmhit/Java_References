package notes_2;

public class AD_HTTP_Intro {
/**

HTTP stands for HyperText Transfer Protocol
A protocol of transmitting data in a particular format, primarily between a server and a browser. 
It uses an architecture in which a client makes a 
connection to a server, makes a request, and waits for the response

Description
What is HTTP?

HTTP stands for HyperText Transfer Protocol. If you don't know what Hypertext refers to or what a Protocol is, this definition isn't particularly helpful. Let's give a definition that is a bit easier to understand:
HTTP

    A protocol of transmitting data in a particular format, primarily between a server and a browser. It uses an architecture in which a client makes a connection to a server, makes a request, and waits for the response.

The data in the "particular format" mentioned is the hypertext stated in the name, with hypertext simply referring to text documents that have the special ability to link to one another. There are many kinds of hypertext documents, and ones that have the ability to show multiple kinds of media are called hypermedia documents. HTTP is capable of transmitting hypermedia documents in addition to hypertext documents.

An example of a hypertext document is an HTML document, or HyperText Markup Language document.

Another concept we have been throwing around is the server and the client, so lets talk about what we mean when we talk about these:
Server

    A server is a computer or collection of computers that is the destination of the HTTP request. Commonly, this will be a powerful collection of computers that have an increased level of computation power and data storage compared to the client.

Client

    A client is a computer or collection of computers that is the creator of the HTTP request. Commonly, this will be a single, personal computer.

Note that while server and client typically refer to what was mentioned, that is not what they always are. For example, you can have a client with vastly more computational power than the server, and you can have clients that are normally servers themselves.

HTTP is a protocol that is referred to as stateless, which means that once a request and response has completed, the server doesn't retain any data about the request. Care must be taken here about this definition, as it can be easily confused. Just because HTTP is stateless does NOT mean that HTTP methods cannot change data on the server, or that the server will not track HTTP calls made to it. Let's break this down in more detail:

    A client makes a request to the server to calculate 5 + 5
    The server takes in the data provided (5 and 5) in order to calculate
    The server makes the calculation and responds with 10
    The server stores in a database the user that made the request and a timestamp of when they made the call
    The same client makes a request to the server, again to calculate 5 + 5
    Because HTTP is stateless, the server does not still have 5 and 5 stored and must take them in again
    The server makes the calculation and responds with 10
    The server stores in a database the same information as before


HTTP has two parts: the request and the response. The client creates the request, and 
the server creates the response. The request will hold the following information:
    The method being used
    A URL specifying the location of the target resource
    What version of HTTP is being used
    Optional information to help the server with the request (called headers)
    For some methods, a body which contains some resource

The response will hold the following information:
    What version of HTTP is being used
    A status code reflecting the outcome of the request
    A status message which is shorthand and less descriptive than the status code
    Optional information to detail what happened with the request (called headers again)
    For some methods, a body which contains some resource






REST stands for REpresentational State Transfer.RESTful webservice uses HTTP










HTTP defines a set of request methods to indicate the desired action to be performed for a given resource.

GET method is used to retrieve data from a server at the specified resource
curl https://reqres.in/api/users/2

POST (add resource to server) requests are used to send data to the API server to create or update a resource. 
The data sent to the server is stored in the request body of the HTTP request.
This may be JSON, XML, or query parameters - non-idempotent
curl -X POST -d "{\"first_name\": \"Kendra\", \"last_name\": \"Jackson\"}" -H "Content-
Type: application/json" https://reqres.in/api/users/2

PUT (fully replace a resource on a server) requests are used to send data to the API to update or create a resource
Similar to POST, PUT requests are used to send data to the API to update or create a resource. 
The difference is that PUT requests are idempotent - idempotent

PATCH is that you only apply partial modifications to the resource
The difference between PATCH and PUT is that a PATCH request is typically non-idempotent

DELETE method is exactly as it sounds: delete the resource at the specified URL
curl -i -X DELETE https://reqres.in/api/users/2

HEAD method is almost identical to GET, except without the response body

OPTIONS request should return data describing what other methods and operations the server supports at the given URL

TRACE request is to echo the received request back to the client, allowing the client to see what changes or additions 
have been made by intermediate servers. 
It is used primarily for diagnostic purposes and is not commonly used in regular web development.



Description

HTTP Status Codes indicate whether a specific HTTP request has been successfully completed.
Responses are grouped in five classes:
    Informational responses (100–199)
    Successful responses (200–299)
    Redirection messages (300–399)
    Client error responses (400–499)
    Server error responses (500–599)


















































 */
}
