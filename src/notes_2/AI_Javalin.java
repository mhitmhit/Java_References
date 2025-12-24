package notes_2;

public class AI_Javalin {
/**
javalin is a very lightweight web framework for Java 8 (and later) and Kotlin. It supports modern features 
such as HTTP/2, WebSocket, and asynchronous requests. Javalin is servlet-based, and its main goals are simplicity, 
a great developer experience, and first-class interoperability between Java and Kotlin. Kotlin is a programming language 
initially designed for the JVM and Android that combines object-oriented and functional programming features.

Simple
    Unlike other Java and Kotlin web frameworks, Javalin has very few concepts that you need to learn.You never 
    extend classes and you rarely implement interfaces.

Lightweight
    Javalin is just a few thousand lines of code on top of Jetty, and its performance is equivalent to raw Jetty code.

Interoperable
    Other Java and Kotlin web frameworks usually offer one version for each language. Javalin is being madewith 
    inter-operability in mind, apps are built the same way in both Java and Kotlin.

Flexible
    Javalin is designed to be simple and blocking, as this is the easiest programming model to reason about.But, 
    if you set a Future as a result, Javalin switches into asynchronous mode.

OpenAPI
    Many lightweight Java and Kotlin web frameworks don't support OpenAPI, but Javalin does (including Swagger UI and ReDoc).

Jetty
    Javalin runs on top of Jetty, one of the most used and stable web-servers on the JVM. You can configurethe 
    Jetty server fully, including SSL and HTTP2 and everything else that Jetty offers.
    
    

to manager starting and stopping a server:
Javalin app = Javalin.create()
    .start() // start server (sync/blocking)
    .stop() // stop server (sync/blocking)



if you need a quick server:
Javalin app = Javalin.start(7000);


configuration you can use as needed:
Javalin.create() // create has to be called first
    .contextPath("/context-path") // set a context path (default is "/")
    .dontIgnoreTrailingSlashes() // treat '/test' and '/test/' as different URLs
    .defaultContentType(string) // set a default content-type for responses
    .defaultCharacterEncoding(string) // set a default character-encoding for responses
    .disableStartupBanner() // remove the javalin startup banner from logs
    .embeddedServer( ... ) // see section below
    .enableCorsForOrigin("origin") // enables cors for the specified origin(s)
    .enableDynamicGzip() // gzip response (if client accepts gzip and response is more than 1500 bytes)
    .enableRouteOverview("/path") // render a HTML page showing all mapped routes
    .enableStandardRequestLogging() // does requestLogLevel(LogLevel.STANDARD)
    .enableStaticFiles("/public") // enable static files (opt. second param Location.CLASSPATH/Location.EXTERNAL)
    .maxBodySizeForRequestCache(long) // set max body size for request cache
    .port(port) // set the port
    .start(); // start has to be called last




If you need to customize the embedded server, you can call the app.embeddedServer() method:
app.embeddedServer(new EmbeddedJettyFactory(() -> {
    Server server = new Server();
    // do whatever you want here
    return server;
}));



You can configure your embedded jetty-server with a handler-chain (example), and Javalin will attach it’s 
own handlers to the end of this chain
StatisticsHandler statisticsHandler = new StatisticsHandler();

Javalin.create()
    .embeddedServer(new EmbeddedJettyFactory(() -> {
        Server server = new Server();
        server.setHandler(statisticsHandler);
        return server;
    }))
    .start();





Javalin.create(config -> {
    config.http.generateEtags = booleanValue;     // if javalin should generate etags for dynamic responses (not static files)
    config.http.prefer405over404 = booleanValue;  // return 405 instead of 404 if path is mapped to different HTTP method
    config.http.maxRequestSize = longValue;       // the max size of request body that can be accessed without using using an InputStream
    config.http.defaultContentType = stringValue; // the default content type
    config.http.asyncTimeout = longValue;         // timeout in milliseconds for async requests (0 means no timeout)
});




private static CompletableFuture<HttpResponse<String>> getRandomName() {
    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create("https://nameGenerator.person/name"))
        .build();
    return httpClient.sendAsync(request, ofString());
}



app.get("/random-name", ctx -> {
    ctx.future(() -> {
        return getRandomName()
            .thenAccept(response -> ctx.html(response.body()).status(response.statusCode()))
            .exceptionally(throwable -> {
                ctx.status(500).result("Could not get a random name" + throwable.getMessage());
                return null;
            })
    });
});

































 */
}
