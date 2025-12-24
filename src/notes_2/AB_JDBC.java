package notes_2;

public class AB_JDBC {
/**

To interact with a database, we need to do several things:

    Obtain a JDBC driver.
    Open a connection using:
        Database URL.
        Username.
        Password.
    Execute an SQL statement using either:
        Statement.
        PreparedStatement.
        CallableStatement.
    Retrieve the results of executing the statement.
    Close the connection.


try (Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD)) {
  // More code goes here
} catch (SQLException e) {}




By default, when a connection is created, it is in auto-commit mode, so every SQL statement acts as a 
transaction and is committed immediately 
after execution. To manually group statements into a transaction, simply call:

Connection conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
conn.setAutoCommit(false);
// Execute some SQL statements...
conn.commit();






JDBC String
The database URL is an address pointing to the database to be used, also known as the JDBC String. 
The format of this URL varies between database vendors, as shown in the table below:
RDBMS 		JDBC driver 	URL format
MySQL 		com.mysql.jdbc.Driver 	jdbc:mysql://hostname/databaseName
Oracle 		oracle.jdbc.driver.OracleDriver 	jdbc:oracle:thin:@hostname:portNumber:databaseName
SQLServer 	com.microsoft.sqlserver.jdbc.SQLServerDriver 	jdbc:sqlserver://serverName:portNumber;property=value
PostgreSQL 	org.postgresql.Driver 	jdbc:postgresql://hostname:port/databaseName






Executing SQL

Once we have the Connection object, we can write our SQL and execute it:

Statement stmt = conn.createStatement();
String sql = "SELECT * FROM employees";
ResultSet rs = stmt.executeQuery(sql);






Alternatively, a PreparedStatement can be used. This interface gives us the flexibility of 
specifying parameters with the ? symbol. It also protects against SQL 
injection when user input is used by pre-compiling the SQL statement.

PreparedStatement ps = conn.prepareStatement(sql);
String sql = "SELECT * FROM employees WHERE age > ? AND location = ?";
ps.setInt(1, 40);
ps.setString(2, "New York");
ResultSet rs = ps.executeQuery();





The Statement and PreparedStatement also have additional methods for sending SQL, including:
    .execute() - for any kind of SQL statement, returns a boolean.
    .executeUpdate() - for DML statements, returns an int which is the number of rows affected.







Retrieving Results
Results from an SQL query are returned as a ResultSet, which can be iterated over to extract the data:
List<Employee> empList = new ArrayList<>();
while (rs.next()) {
  int id = rs.getInt("id");
  String name = rs.getString("first_name");
  empList.add(new Employee(id, name));
}







import java.sql.*;
  
public class JDBCDemo {
    
    public static void main(String args[]) throws SQLException {

      // Database URL + credentials
        String url = "jdbc:mysql://localhost:3306/example";
        String username = "root";
        String password = "pass";

        // Obtain a connection using credentials
        Connection con = DriverManager.getConnection(
                url, username, password);

        // Create a Statement object
        Statement st = con.createStatement();

        // Execute the query using the Statement object
        String query = "INSERT INTO example_table VALUES (1, 'hello world')";
        int rowsUpdated = st.executeUpdate(query);
        
        System.out.println(rowsUpdated); // 1

        // Closing the connection
        con.close();
    }
} // class







Describe JDBC classes and interfaces
    DriverManager class - Used to load JDBC drivers and establish connections to a database.
        Has the getConnection(String url, String user, String password) method - Attempts to establish a 
        connection to the given database URL.
        Documentation: https://docs.oracle.com/javase/8/docs/api/java/sql/DriverManager.html
    DataSource interface - For retrieving connections, an alternative to DriverManager.
        Implementing classes are provided by the vendors, not by JDBC.
        Documentation: https://docs.oracle.com/javase/8/docs/api/javax/sql/DataSource.html?is-external=true
    Connection interface - Represents a physical connection with a database.
        Can be used to create statements with the following methods:
            createStatement(): Creates a Statement object.
            prepareStatement(String sql): Creates a PreparedStatement object. (sql with java variables)
            prepareCall(String sql): Creates a CallableStatement object.
        Can be used to manage database transactions with the following methods:
            setAutoCommit(boolean autoCommit): Sets this connection's auto-commit mode to the given state.
            rollback(Savepoint savepoint): Undoes all changes made in the current transaction and releases any 
            database locks currently held by this Connection object.
            commit(): Makes all changes made since the previous commit/rollback permanent and releases any database 
            locks currently held by this Connection object.
            setSavepoint(String name): Creates a savepoint with the given name in the current transaction and returns 
            the new Savepoint object that represents it.

        Needs to be closed after use:
            Has the close() method: Releases this Connection object's database and JDBC resources immediately 
            instead of waiting for them to be automatically released.
            Has the isClosed() method: Retrieves whether this Connection object has been closed.
    SQLException class - A general exception thrown when something goes wrong while accessing the database.
    Statement interface - Used for executing static SQL statements.
        Defines a constant, RETURN_GENERATED_KEYS, to indicate that generated PKs should be made available for retrieval.
        Has the execute(String sql, int autoGeneratedKeys) method: Executes the given SQL statement, which may return multiple results. 
        The second parameter is optional and can use RETURN_GENERATED_KEYS as a value.
        Has the executeQuery(String sql) method: Executes the given SQL statement, returning a single ResultSet object.
        Has the executeUpdate(String sql) method: Executes the given SQL statement, which may be an INSERT, UPDATE, or 
        DELETE statement or an SQL statement that returns nothing, such as an SQL DDL statement. If DML is executed, 
        the number of rows affected will be returned.
    PreparedStatement interface - Represents pre-compiled SQL statements and extends the Statement interface.    
    CallableStatement interface - Used to execute stored procedures and extends the PreparedStatement interface.
        Has methods that interact with stored procedures, such as getting and setting parameter values.    
    ResultSet interface - Represents data returned from the database.
        Has the next() method: Moves the cursor forward one row from its current position.
        Includes getter methods for retrieving values from the ResultSet object's rows.
        



This example demonstrates the use of the JDBC API and its classes and interfaces to successfully interface with a database.
Context

Let's say that we have a database with the following Notes table already persisted:
id 	content 	priority
1 	take out trash 	high
2 	tues appt with dentist @10am 	medium
3 	remember to clean out the fridge 	low
4 	call Sammy 	low

In our application, we have a Note Java class:

public class Note {

  // fields
  private long id;
  private String content;
  private String priority;

  // ... constructors, getters, and setters omitted
}

Processing SQL Statements with JDBC Classes and Interfaces

In general, to process any SQL statement with JDBC, you follow these steps:

    Establish a connection.
    Create a statement.
    Execute the query.
    Process the ResultSet object.
    Close the connection.


import java.sql.*;

public class App {
    // database URL + credentials
    String url = "jdbc:mysql://localhost:3306/example";
    String username = "root";
    String password = "pass";

    public Note addNote(String content, String priority) {

        // step 1 & 5: open connection to db and close when done
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // step 2: create your statement
            PreparedStatement ps = connection.prepareStatement("INSERT INTO notes(content, priority) VALUES (?, ?)",
                    Statement.RETURN_GENERATED_KEYS);

            // assign any parameters their values
            ps.setString(1, content);
            ps.setString(2, priority);

            // step 3: execute statement
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            // step 4: process results:
            // while there is another record in the ResultSet to process...
            while (rs.next()) {
                // ... get the value of the first column in that ResultSet row...
                long resultId = rs.getLong(1);

                // ... and return a Note with the generated id in its state, as well as the
                // other values
                return new Note(resultId, content, priority);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // read
    public Note getNoteById(long id) {

        // step 1 & 5: open connection to db and close when done
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            // step 2: create your statement
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM notes WHERE id = ?");

            // assign any parameters their values
            ps.setLong(1, id);

            // step 3: execute statement
            ResultSet rs = ps.executeQuery();

            // step 4: process results:
            // while there is another record in the ResultSet to process...
            while (rs.next()) {
                // ... get the values from the respective columns ...
                long resultId = rs.getLong("id");
String content = rs.getString("content");
String priority = rs.getString("priority");

// ... and return a Note with those values as its state
return new Note(resultId, content, priority);
}
} catch (SQLException ex) {
    ex.printStackTrace();
}

// return null if unsuccessful
return null;

}

### Establishing Connections

First, establish a connection with the data source you want to use. We used the statement `Connection connection = 
DriverManager.getConnection(url, username, password)` to establish a connection using the variables `url`, `username`, and `password` 
that we defined at the beginning of the class.

### Creating Statements

A Statement is an interface that represents a SQL statement. You execute Statement objects, which generate ResultSet objects 
that represent a table of data returned by a database query. You need a Connection object to create a Statement object.

Our example created PreparedStatements with the following code:
```java
ResultSet rs = stmt.executeQuery(query);

and

PreparedStatement ps = connection.prepareStatement("SELECT * FROM notes WHERE id = ?");

Executing Queries

To execute a query, call an execute method from the Statement interface.

Our example executed statements with the following code:

ps.executeUpdate();

and

ResultSet rs = ps.executeQuery();

Processing ResultSet Objects









You access the data in a ResultSet object through a cursor. Note that this cursor is not a database cursor; 
it is a pointer that points to one row of data in the ResultSet object. Initially, the cursor is positioned 
before the first row. You call various methods defined in the ResultSet object to move the cursor.

In our example, we used the following code to process a ResultSet:

// while there is another record in the ResultSet to process...
while (rs.next()) {
    // ... get the values from the respective columns ...
    long resultId = rs.getLong("id");
    String content = rs.getString("content");
    String priority = rs.getString("priority");

    // ... and return a Note with those values as its state
    return new Note(resultId, content, priority);
}

Closing Connections

When you are finished using a Connection, Statement, or ResultSet object, call its close method to immediately 
release the resources it is using.

Alternatively, use a try-with-resources statement to automatically close Connection, Statement, and ResultSet 
objects, regardless of whether an SQLException has been thrown. The JDBC throws an SQLException when it encounters 
an error during an interaction with a data source. A try-with-resources statement consists of a try statement and 
one or more declared resources. Our example closes a connection using the following code:

// step 1 & 5: open connection to db and close when done
try (Connection connection = DriverManager.getConnection(url, username, password)) {
    // steps 2-4 omitted...
} catch (SQLException ex) {
    ex.printStackTrace();
}




















ResultSet
    Data Retrieval

    ResultSet is used to fetch and process data retrieved from SELECT queries. 
    It allows developers to extract the result set row by row and access individual column values.

    Report Generation

    When generating reports or exporting data from a database, ResultSet provides a convenient way to 
    iterate over the query results and extract the necessary information for the report.

    Data Analysis

    ResultSet can be utilized for performing data analysis and statistical calculations on query results. 
    It enables developers to aggregate, summarize, or perform calculations on the returned data.

    Data Validation

    ResultSet can be used to validate data against specific conditions or business rules. It allows 
    developers to traverse the result set and apply custom validation logic.




Implementation
The following code snippet showcases a simple Employee class that is used when retrieving data from our 
database. This Employee model class uses a similar structure and naming conventions to our employees table in the database.

// Class used to represent data from our database
class Employee {
  private int empId;
  private String empName;
  private String empTitle;

  public Employee(int empId, String empName, String empTitle) {
    this.empId = empId;
    this.empName = empName;
    this.empTitle = empTitle;
  }
  // getters & setters below...
}








Data Access Object (DAO)
Data Access Objects (DAOs) provide a standardized and abstracted way of accessing and manipulating data in 
Java applications. By separating the data access logic from the business logic, DAOs promote modularity, maintainability, and 
flexibility. They are commonly used in enterprise applications, web applications, and mobile applications to interact with various 
data storage systems. Implementing DAOs involves creating a DAO interface, 
its implementation class, an entity class, and configuring the data source.
DAO Example: [product that have productID, productName, productDEscription]
- create object class of product
- create DAO Interface to implement: addProduct, delecteProduct, updateProduct.
- create a class to implement DAO. this class implements DAO, and have the methods. (implements the queries here using jdbc utilities). 












Navigating Result Set Rows

When working with JDBC (Java Database Connectivity) and retrieving data from a database using a ResultSet, 
it is essential to understand how to navigate through the rows of the result set. Navigating the result set rows allows 
you to access and process individual records returned by a SQL query.

The ResultSet provides methods to move the cursor within the result set, allowing traversal of rows in different 
directions. By understanding how to navigate the result set rows, you can effectively retrieve and process the desired data 
from the query results.
Methods available on ResultSet to navigate

next()
    Moves the cursor to the next row in the result set and returns true if a valid row exists. This method is typically used 
    in a loop to iterate through all rows.

previous()
    Moves the cursor to the previous row in the result set and returns true if a valid row exists.

first()
    Moves the cursor to the first row in the result set and returns true if a valid row exists.

last()
    Moves the cursor to the last row in the result set and returns true if a valid row exists.

absolute(int row)
    Moves the cursor to the specified row number, where the first row is 1. Returns true if the specified row is valid.

relative(int rows)
    Moves the cursor forward or backward by the specified number of rows. 
    The argument can be positive or negative, indicating the direction and magnitude of movement.

isFirst()
    Returns true if the cursor is currently positioned at the first row in the result set.

isLast()
    Returns true if the cursor is currently positioned at the last row in the result set.





The Statement interface is used for executing static SQL statements.
The PreparedStatement interface is used for executing pre-compiled SQL statements.



Statement stmt = conn.createStatement();
String sql = "SELECT * FROM employees";
ResultSet rs = stmt.executeQuery(sql);



String sql = "SELECT * FROM employees WHERE age > ? AND location = ?";
PreparedStatement ps = conn.prepareStatement(sql);
ps.setInt(1, 40);
ps.setString(2, "New York");
ResultSet rs = ps.executeQuery();



with Statement and PreparedStatement, we can use:
.execute() - for any kind of SQL statement. Returns a boolean representing a successful or 
unsuccessful execution of the query.
.executeUpdate() - for DML statements. Returns an int indicating the number of rows affected.
.executeQuery() - for DQL statements. Returns a ResultSet with records from the database.



The CallableStatement interface is used to execute stored procedures. You create an instance of a CallableStatement 
by calling the prepareCall() method on a connection object. 
A CallableStatement can return one ResultSet object or multiple ResultSet objects.












# JDBC Walkthrough

JDBC stands for Java DataBase Connnectivity. It is utilized to connect our java code with a database. JDBC will allow us to execute SQL statements from java and retrieve the result set of that query to be utilized in java.

## JDBC classes to know
### **Connection**: Creates an active connection to a database
Example:
```java
Connection connection = DriverManager.getConnection(url,username,password);

//for this lab, we created a ConnectionUtil Singleton class so you do not have to worry about the credentials to the database.
//The connection statement will look more like this for this lab
Connection connection = ConnectionUtil.getConnection();
```

### **Statement**: An object that represents an SQL statement to be executed
Example:
```java
String sqlStatement = "SELECT * FROM users WHERE username = 'user123' AND password = 'pass123'"

Statement statement = connection.createStatement();
```

### Executing the SQL Statement 
How we execute the the statement object is different based on what sublanguage of sql we are working with. For example if we are trying to execute a DML statement, then there is only one more method we have to call

```java
statement.executeUpdate(sql);
```

On the other hand, if the sql statement is a dql operation, we will call the method `executeQuery(sql);` and store the value in a ResultSet object that we can loop through

```java
ResultSet rs = statement.executeQuery(sql);
```
### **ResultSet**: object that will store your data from the query that you executed. This will only be needed for DQL operations (as shown above).

## DQL Example

Retrieving all records from table users (DQL EXAMPLE):
```java
public List<User> getAllUsers() {

        List<User> users = new ArrayList<>();

        try {
            //retrieve active connection to db
            Connection connection = ConnectionUtil.getConnection();
 
            String sql = "select * from users;";

            //create the Statement object
            Statement statement = connection.createStatement();

            //execute the statement and retrieve result set
            ResultSet rs = statement.executeQuery(sql);

            //loop through each record and add record to user list object
            while(rs.next()){
                users.add(new User(rs.getString(1), rs.getString(2)));
            }
            //NOTE: in the above statement, rs.getString(1) is retrieving column 1 as a string from a record. in our situation, that will get the firstname. Since lastname is in the second column in the table, we retrieve that value by using rs.getString(2);


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
```

## DML Example
Inserting a Record into Table users (DML EXAMPLE):
```java
public void createUser(User user) {
        try {
            //retrieve active connection to db
            Connection connection = ConnectionUtil.getConnection();

            //SQL statement we are going to execute
            String sql = "insert into users (firstname, lastname) values ('" + user.getFirstname() + "', '" + user.getLastname() + "');";

            //create Statement object
            Statement statement = connection.createStatement();

            //execute the statement to db
            statement.executeUpdate(sql);


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
```























 */
}
