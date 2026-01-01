package notes_2;


public class AA_SQL {
//	Relational Database Management System
//	A relational database management system (RDBMS) is a program that allows you to create, update, and administer a relational database. Most relational database management systems use the SQL language to access the database.
//
//
//	Why do we need SQL?
//	Allows users to access data in the relational database management systems.
//	Allows users to describe the data.
//	Allows users to define the data in a database and manipulate that data.
//	Allows to embed within other languages using SQL modules, libraries & pre-compilers.
//	Allows users to create and drop databases and tables.
//	Allows users to create view, stored procedure, functions in a database.
//	Allows users to set permissions on tables, procedures and views.
//
//
//
//	Primary Key
//	A primary key is a field in a table which uniquely identifies each row/record in a database table. Primary keys must contain unique values. A primary key column cannot have NULL values.
//	A table can have only one primary key, which may consist of single or multiple fields. When multiple fields are used as a primary key, they are called a composite key.
//	If a table has a primary key defined on any field(s), then you cannot have two records having the same value of that field(s).
//
//
//
//	SQL Statements
//	DDL - Data Definition Language - CREATE, ALTER, DROP
//	DML - Data Manipulation Language - SELECT, INSERT, UPDATE, DELETE
//	DCL - Data Control Language - GRANT, REVOKE
//	TCL - Transaction Control Language - SAVEPOINT, ROLLBACK, COMMIT
//
//
//
//	Different Types Of Joins
//	INNER JOIN
//	LEFT JOIN
//	RIGHT JOIN
//	FULL JOIN
// 
	
	
//	CREATE DATABASE database_name;
//	
//	Description
//	Database Consistency
//
//	Database consistency is when all data points within the database system align to be properly read and accepted. Information that does not meet the predefined values 
//	within the database will result in consistency errors with the dataset. Any transactions involving data written to the database must adhere to the established rules set by 
//	developers. This is defined by specific constraints, triggers, variables, cascades, etc., that will all be described in the modules to follow.
//
//	While database consistency helps ensure the appropriate format for data written to the database, it does not account for what the data represents. This means the 
//	information entered may match the appropriate format but does not guarantee that the data corresponds with the actual information.
//
//	The rules applied to our data keep databases working smoothly by maintaining consistent data, achieving higher accuracy, increasing database space, and improving data retrieval.
//	Database Inconsistency
//
//	Database consistency also applies to any changes of the data within the system. If one particular object in the database is updated but is also present in another table 
//	in the database, it must be properly updated in all other tables where it is present. If this fails, it results in database inconsistency.
//
//	Database inconsistency occurs when any portion of the information is updated in one table but is not represented in all other tables utilizing that same information.




//	Implementation
//
//	The general syntax for creating a table in MySQL is:
//
//	CREATE TABLE [IF NOT EXISTS] table_name(  
//	    column_definition1,  
//	    column_definition2,  
//	    ........,  
//	    table_constraints  
//	);
//
//	Example:
//
//	CREATE TABLE movies(m_name VARCHAR(45) NOT NULL,m_genre VARCHAR(20) NOT NULL,m_director VARCHAR(30) NOT NULL,m_year INT NOT NULL,PRIMARY KEY(m_name));
//
//	Add values to the newly created table.
//
//	INSERT INTO movies VALUES("Mr.Bean", "comedy", "Mr.ABC", 2019);
//	INSERT INTO movies VALUES("Fox", "horror", "Mr.XYZ", 2020);
//
//	DROP vs TRUNCATE
//
//	The general syntax for dropping a table in MySQL is:
//
//	DROP TABLE table_name;
//
//	We use the DROP command to completely remove the table. Example:
//
//	DROP TABLE movies;
//
//	The general syntax for truncating a table in MySQL is:
//
//	TRUNCATE TABLE table_name;
//
//	The TRUNCATE command is used to delete the data inside a table, but not the table itself. Example:
//
//	TRUNCATE TABLE movies;
//
//	Modifying structure
//
//	To ADD a column:
//
//	ALTER TABLE table_name
//	ADD column_name datatype;
//
//	We use the ALTER TABLE command to modify a table. Example:
//
//	ALTER TABLE movies
//	ADD ticket_price INT;
//
//	To DROP a column:
//
//	ALTER TABLE table_name
//	DROP COLUMN column_name;
//
//	Example:
//
//	ALTER TABLE movies
//	DROP COLUMN m_genre;
//
//	To MODIFY a column:
//
//	ALTER TABLE table_name
//	MODIFY COLUMN column_name datatype;
//
//	Example:
//
//	ALTER TABLE movies
//	MODIFY COLUMN ticket_price DOUBLE;



//	Numeric types store values that are either whole or fractional. The minimum and maximum values of the different numeric types will 
//	depend on the SQL implementation. The different types of numeric types are:
//
//	    bit(n)
//	    bit varying(n)
//	    integer
//	    smallint
//	    bigint
//	    real(s)
//	    float(p,s)
//	    double precision(p,s)
//	    decimal(p,s)



//	SQL sublanguage commands, The commands are:
//	    DDL - data definition language
//	        CREATE
//	        ALTER
//	        DROP
//	        TRUNCATE - drops all rows in a table, preserving the table structure for future use
//	        RENAME
//
//	    DML - data manipulation language
//	        INSERT
//	        UPDATE
//	        DELETE
//
//	    DQL - data query language
//	        SELECT
//
//	    DCL - data control language
//	        GRANT
//	        REVOKE
//	        
//	    TCL - transaction control language
//	    	COMMIT
//	    	ROLLBACK
//	    	SAVEPOINT


	    	
//	The schema defines how table relationships should be built and organized within a particular database.


//UPDATE TABLE_NAME
//SET column1 = value1, column2 = value2, columnN = valueN
//WHERE [condition];
//
//    Example of UPDATE for a single record in an employee with id = 12 for address
//        NOTE: Double-check the ID whenever you use these commands to ensure you're updating the appropriate record.
//
//UPDATE employees
//SET add_street = 'Philly Lane', add_number = '20211', add_zip = 19101
//WHERE employee_id = 12;
//
//    Example of UPDATE for multiple records in employees to transfer department_name from "QC" to "Tech"
//
//UPDATE employees
//SET department_name = 'Tech'
//WHERE department_name = 'QC';



//DELETE FROM TABLE_NAME
//WHERE [condition];
//
//    Example to DELETE a student, with student_id = 'student1@uni.edu', from an enrollment table for course_id = 101
//
//DELETE FROM enrollment
//WHERE student_id = 'student1@uni.edu' AND course_id = 101;
//
//    Example to DELETE all of the above student's grades from a student_assessments table
//
//DELETE FROM student_assessments
//WHERE student_id = 'student1@uni.edu';

	
//	SELECT [ALL | DISTINCT]
//		    select_expr [, select_expr] ...
//		    [into_option]
//		    [FROM table_ref]
//		    [WHERE where_condition]
//		    [GROUP BY {col_name | expr | position}]
//		    [HAVING having_condition]
//		    [ORDER BY {col_name | expr | position}]
//		        [ASC | DESC]
//		    [LIMIT {[offset,] row_count | row_count OFFSET offset}];
//	
//	
	
//	SELECT my_value, my_other_value FROM my_table;	
//	SELECT id, name, price, type FROM produce;
//	SELECT name, price, type FROM produce WHERE type='apple' AND price>1.00;
//	SELECT name, price, type FROM produce WHERE type IN ('apple', 'root', 'berry', 'allium');
//	SELECT name, price, type FROM produce WHERE NOT (type='apple') AND NOT (type='allium');
//	SELECT name, price, type FROM produce WHERE type LIKE 'a%';
//	SELECT name, price, type FROM produce WHERE type LIKE '_____';
//	SELECT name, price, type FROM produce WHERE price BETWEEN 0.50 AND 1.00;
//	SELECT name, price, type FROM produce WHERE name BETWEEN 'o' AND 'y';
//	SELECT type, AVG(price) FROM produce GROUP BY type;
//	SELECT type, AVG(price) AS group_avg, (SELECT AVG(price) FROM produce) AS gross_avg FROM produce GROUP BY type HAVING AVG(price) > gross_avg;
//	SELECT name, price, type FROM produce ORDER BY name ASC;
//	
//	
//	Implementation
//
//	Syntax to create a database:
//
//	CREATE DATABASE WORK;
//
//	Syntax to select/use a database:
//
//	USE WORK;
//
//	Syntax to create a table:
//
//	CREATE TABLE EMP
//	(id INT, NAME VARCHAR(25), AGE INT, PRIMARY KEY(id));
//
//	Syntax to alter a table:
//
//	ALTER TABLE EMP
//	ADD SALARY DOUBLE;
//
//	Syntax to insert values:
//
//	INSERT INTO EMP VALUES(111, "Ryan", 24, 5000);
//
//	Syntax to update a record:
//
//	UPDATE EMP SET AGE = 23 WHERE id = 111;
//
//	Syntax to delete a record:
//
//	DELETE FROM EMP WHERE id = 111;
//
//	Syntax to select a record:
//
//	SELECT * FROM EMP;
//
//	Syntax to truncate a table:
//
//	TRUNCATE TABLE EMP;
//
//	Syntax to drop a table:
//
//	DROP TABLE EMP;

	

//SELECT column1, column2, ...
//FROM table_name
//WHERE condition;
//
//Example:
//
//SELECT title
//FROM movies
//WHERE ticket_price = 200;
//
//    The syntax to use the ORDER BY clause is:
//
//SELECT expressions    
//FROM tables    
//[WHERE conditions]    
//ORDER BY expression [ASC | DESC];    
//
//Example:
//
//SELECT marks
//FROM STUDENTS
//WHERE marks > 60
//ORDER BY marks DESC;
//
//    The syntax to use the GROUP BY clause is:
//
//SELECT column_name, function(column_name)  
//FROM table_name   
//WHERE condition   
//GROUP BY column_name;  
//
//Example 1:
//
//SELECT Dept, Salary
//FROM Employee
//WHERE Salary > 15000
//GROUP BY employee.salary, employee.dept
//ORDER BY Dept DESC;
//
//Example 2:
//
//SELECT Dept, AVG(Salary) AS AvgSalary
//FROM Employee
//WHERE Salary > 15000
//GROUP BY employee.dept
//ORDER BY Dept DESC;

//	*      SELECT * FROM table WHERE condition1 = value1 AND condition2 = value2;
//	 *      SELECT * FROM table WHERE something > 500 OR something < 100;
//	 *      SELECT * FROM table WHERE value NOT IN ('value1', 'value2');

	
//	 *      SELECT manager, AVG(salary)
//	 *      FROM employees
//	 *      GROUP BY manager
//	 *      ORDER BY AVG(salary) DESC	
	
	
	
//	SELECT artist, COUNT(song)
//	FROM song
//	GROUP BY artist
//	ORDER BY COUNT(song) DESC;
	
	
	
	
//	SELECT * FROM table_name ORDER BY column1 [, column2, column3, etc...] [ASC|DESC]	
	
//	SELECT * FROM employee WHERE current = true ORDER BY salary DESC	
	
// SELECT * FROM character ORDER BY last_name, first_name ASC	
	
	
	
	
	
	/**
	 * Implementation

		Basic syntax for Create operations you've seen previously:
		
		CREATE TABLE TABLE_NAME (
		    col_1 INT PRIMARY KEY, 
		    col_2 VARCHAR(20), 
		    col_N INT
		);
		
		INSERT INTO TABLE_NAME (column1, column2, columnN)
		VALUES (value1, value2, valueN);
		
		Basic syntax for Read operations you've seen previously:
		
		SELECT * FROM TABLE_NAME;
		
		SELECT col_1, col_N
		FROM TABLE_NAME
		WHERE id = 1;
		
		Basic syntax for Update operations you've seen previously:
		
		UPDATE TABLE_NAME
		SET column1 = value1, column2 = value2, columnN = valueN
		WHERE [condition];
		
		Basic syntax for Delete operations you've seen previously:
		
		DELETE FROM TABLE_NAME
		WHERE [condition];




 * The syntax for the ALTER keyword is different depending on what we want to achieve:
 *      - Adding a column:
 *          - ALTER TABLE table_name ADD column_name data_type [constraint];
 *      - Removing a column:
 *          - ALTER TABLE table_name DROP column_name;
 *          
 *          




Constraints:

CREATE TABLE SalesTransaction(
 transId VARCHAR(8) PRIMARY KEY,
 customerId CHAR(7) NOT NULL REFERENCES Customer(customerId),
 storeId INT NOT NULL REFERENCES Store(StoreId),
-- Using DEFAULT to default to the current date cannot be null because a default value will be given
 transDate DATE DEFAULT now()
);

CREATE TABLE Vendor(
 vendorId  CHAR(2) NOT NULL,
 vendorName VARCHAR(25) UNIQUE NOT NULL,
 PRIMARY KEY (vendorId)
); 

ALTER TABLE <table_name> ADD CONSTRAINT <constraint_name> <constraint_type>(constraint_option, ...)

CREATE TABLE <table_name> (
    <col_name> datatype constraint1 constraint2,
    CONSTRAINT <constraint_name> <constraint_type>(constraint_option, ...)
)

Implementation

Syntax to create a table with employee_id as an attribute that will AUTO_INCREMENT when inserting a new record.

CREATE TABLE table_name(
variable_name variable_datatype AUTO_INCREMENT
);

Example:

CREATE TABLE employees (
    employee_id INT AUTO_INCREMENT PRIMARY KEY,
    employee_name VARCHAR(50),
    department_id INT
);

This same table written using SERIAL would look as follows:

CREATE TABLE table_name (
    variable_name SERIAL PRIMARY KEY,
    -- Other columns...
);

Example:

CREATE TABLE employees (
    employee_id SERIAL PRIMARY KEY,
    employee_name VARCHAR(50),
    department_id INT
);

CREATE TABLE FishTank (
   FishID INT PRIMARY KEY,
   Species VARCHAR(50),
   -- Ensure tank size is positive and not too large
   TankSize DECIMAL CHECK (TankSize > 0 AND TankSize <= 100), 
   -- Ensure temperature is within a reasonable range
   Temperature DECIMAL CHECK (Temperature >= 0 AND Temperature <= 30)
);  


CREATE TABLE products (
    productID INT PRIMARY KEY,
    productPrice DECIMAL CHECK (productPrice > 0)
);




Implementation

It's important to refer to the documentation of the specific database system you are using, 
as the syntax and supported data types for DEFAULT can vary between database management systems.

CREATE TABLE UserOnline (
    ID INT PRIMARY KEY,
    UserName VARCHAR(25),
    Online BOOLEAN DEFAULT false
);

-- Inserting a user with online status not specified (defaults to false)
INSERT INTO UserOnline (ID, UserName) VALUES (1, 'LemonadeStandBoss');

-- Inserting a user with online status explicitly set to true
INSERT INTO UserOnline (ID, UserName, Online) VALUES (2, 'CodeLikeABoss', true);




CREATE TABLE employee(
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    emp_role VARCHAR(20)
    );





 *      CREATE TABLE site_user (
 *          id SERIAL PRIMARY KEY,
 *          username varchar(100),
 *          password varchar(100)
 *      );
 *      
 *      
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 

Foreign Key: 

Step 1: Create a table named Student.

CREATE TABLE Student (
    student_id INT PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    major VARCHAR(20)
);

Step 2: Create a table named InternationalStudent.

CREATE TABLE InternationalStudent (
    country_id INT PRIMARY KEY,
    name VARCHAR(20),
    student_id INT,
    FOREIGN KEY (student_id) REFERENCES Student(student_id)
    ON DELETE CASCADE
);

Step 3: Insert values into Student table and InternationalStudent table.

INSERT INTO Student VALUES (1, "Taylor", "Swift", "English Literature");
INSERT INTO Student VALUES (2, "Stephen", "Hawking", "Physics");
INSERT INTO InternationalStudent VALUES (1, "USA", 1);
INSERT INTO InternationalStudent VALUES (2, "UK", 2);

SELECT * FROM InternationalStudent;

Result:
country_id 	name 	student_id
1 	USA 	1
2 	UK 	2

Step 4: Delete a record from the Student table.

DELETE FROM Student WHERE major = "English Literature";

Now the record in the child table InternationalStudent with student_id as 1 is deleted.

SELECT * FROM InternationalStudent;

Result:
country_id 	name 	student_id
2 	UK 	2






Implementation

Step 1: Create a Branch and Employee table

CREATE TABLE Branch(
    id INT PRIMARY KEY,
    name VARCHAR(20)
);

CREATE TABLE Employee(
    id INT PRIMARY KEY,
    name VARCHAR(20),
    address VARCHAR(50)
);

Step 2: Add branch_id as a foreign key for the employee table

ALTER TABLE Employee ADD branch_id INT;
ALTER TABLE Employee ADD FOREIGN KEY (branch_id) REFERENCES Branch(id);

DESC Employee;

Result:
Field 	Type 	Null 	Key 	Default 	Extra
employee_id 	int 	NO 	PRI 	NULL 	
first_name 	varchar(20) 	YES 		NULL 	
last_name 	varchar(20) 	YES 		NULL 	
emp_role 	varchar(20) 	YES 		NULL 	
branch_id 	int 	YES 	MUL 	NULL 	

The id column in the branch table is its PRIMARY KEY, and it is used by the FOREIGN 
KEY of the employee table.


























CASCADE:
CASCADE is a keyword used to simultaneously delete or update data from both the child and parent tables and is used in 
conjunction with ON DELETE or ON UPDATE. 
Applying the CASCADE keyword to the command modifies the changes in 
both parent and child tables according to the execution of that query. CASCADE is appended to the reference command for 
the foreign key when creating a table
Description

In SQL, CASCADE is a keyword used to simultaneously delete or update data from both the child and parent tables and is 
used in conjunction with ON DELETE or ON 
UPDATE. Applying the CASCADE keyword to the command modifies the changes in both parent and child tables according to the 
execution of that query. CASCADE is appended 
to the reference command for the foreign key when creating a table.
ON DELETE

Appending ON DELETE CASCADE to the foreign keys within our child table allows us the opportunity to delete the parent record 
and subsequently delete all relational 
information in any referenced table through one command. Otherwise, due to referential integrity, it would require multiple 
commands to delete all of the referenced 
records inside the child tables first before removing the parent record.
ON UPDATE

Appending ON UPDATE CASCADE to the foreign key within our child table allows us to update information in a single command. 
By updating the parent table record, changes 
will apply to all subsequent child tables' information. This also helps reduce the number of commands and keeps our referential 
integrity intact.


Implementation

Sticking with the college student theme, let's look at students in a college course and use CASCADE to handle deletions and 
updates.

    Define the table for students

CREATE TABLE students(
    student_id INT PRIMARY KEY,
    student_name VARCHAR(40),
    email VARCHAR(20) UNIQUE
);

    Define the table for courses

CREATE TABLE courses(
    course_id INT PRIMARY KEY,
    course_name VARCHAR(20),
    course_length_weeks INT,
    credits INT
);

    Finally, let's define a junction table to handle enrollment and use CASCADE
        For the purposes of this example, we will assume that courses never get updated

CREATE TABLE enrollments(
    course_id INT,
    student_id INT,
    grade INT,
    completion_status BOOLEAN,
    PRIMARY KEY(course_id, student_id),
    FOREIGN KEY(course_id) REFERENCES courses(course_id) ON DELETE CASCADE,
    FOREIGN KEY(student_id) REFERENCES students(student_id) ON DELETE CASCADE ON UPDATE CASCADE
);

    The above command allows for the deletion of all referenced courses through a single command by removing the record from the courses table. 
    Along with this, the command also accounts for any updates or deletions within the student table records.
    
    
    
    
    
    
    
    
    
    
    




UNIQUE:
-- Create a table with a UNIQUE constraint allowing NULL values
CREATE TABLE students (
    studentId INT UNIQUE,
    firstName VARCHAR(255),
    lastName VARCHAR(255)
);

-- Insert rows with unique non-null values and multiple NULL values
-- This is valid, as NULL values are not considered duplicates for the UNIQUE constraint
INSERT INTO students (studentId, firstName, lastName) VALUES
    (1, 'Jane', 'Smith'),
    (2, 'Suzanne', 'Brown'),
    (NULL, 'Abdul', 'Singh'),
    (NULL, 'Soria', 'Waler');
    
    
    
    

    
ALTERNATE KEYS:
A candidate key is a column or a combination of columns that uniquely identifies each row in a table.
Any table can have only one primary key, so all the candidate keys other than the primary key are secondary keys or alternate keys.
A secondary key and a foreign key are NOT related or the same.












SUBQUERIES:
Nested Query in the WHERE clause
Inline View in the FROM clause
Inner Query in the SELECT clause

SELECT col1, ... FROM table_ref WHERE (subquery);

SELECT a.id, a.name, b.evalName, b.mark FROM students a, evals b WHERE a.id = b.studentId
    AND b.evalName = 'quiz 1'
    AND b.mark > (SELECT mark FROM evals WHERE evalName = 'quiz 1' AND studentId = 2);
    
SELECT a.name, b.evalName, b.mark FROM students a, (SELECT studentId, evalName, mark FROM evals 
WHERE mark > 90) b WHERE a.id = b.studentId; 

SELECT a.id, a.name, (SELECT AVG(mark) FROM evals WHERE studentId = a.id GROUP BY studentId) avg 
FROM students a; 












JOIN:

SELECT 
TABLE_NAME1.column1, TABLE_NAME1.columnN, TABLE_NAME2.column1, TABLE_NAME2.columnN
FROM TABLE_NAME1
INNER JOIN TABLE_NAME2
ON TABLE_NAME1.matching_column = TABLE_NAME2.matching_column;





inner join only shows matching results. 

There are three types of OUTER JOIN: FULL, LEFT, and RIGHT.
let and right joins show all results from primary table + matching results. non matched will have null values. 
outer join or full join combines tables together with non matching having null values. 


theta join is based on an arbitrary comparison. 

equi join is based on an equality or matching column data. 

Syntax for Equi-Join: SELECT * FROM Table1 JOIN Table2 ON Table1.Column = Table2.Column;
Syntax for Theta-Join: SELECT * FROM Table1, Table2 WHERE Table1.Column > Table2.Column;



 * Example: SELECT * FROM table_left INNER JOIN table_right
 * ON table_left.column1 = table_right.column3;
 * 
 *SELECT * FROM table_left INNER JOIN table_right
 * ON table_left.column1 = table_right.column3
 * WHERE table_left.column1 = value;
 * 
 *  
 *  * SELECT * FROM table_left INNER JOIN table_right
         * ON table_left.column1 = table_right.column3
         * WHERE table_left.column1 = value;

 *      SELECT * FROM table_left
 *      FULL OUTER JOIN table_right ON table_left.character = table_right.character



CROSS JOIN, commonly known as a CARTESIAN JOIN:If no condition is provided, the result set is generated by 
multiplying each row of Table1 with all rows in Table2

SELECT * FROM Table1 CROSS JOIN Table2;


 SELF JOIN is used to intersect or join a table in the database to itself. 
 We use it when we need to compare data within the same table. also called a Unary relationship.

SELECT column_name(s) FROM table1 T1, table1 T2 WHERE condition;

SELECT e.employee_name AS employee, m.employee_name AS manager  
FROM employees e  
JOIN employees m ON e.manager_id = m.employee_id  
ORDER BY e.employee_id;

above is same as:
SELECT e.employee_name AS employee, m.employee_name AS manager  
FROM employees e, employees m  
WHERE e.manager_id = m.employee_id  
ORDER BY e.employee_id;









Composite Key
    A composite key is a combination of columns used to uniquely identify a table.
    A composite key can also be a combination of candidate keys.
    A group of all the foreign keys can also be used to uniquely identify a table; in this scenario, it is also considered a 
    composite key.


CREATE TABLE employee(
    employee_id INT PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    manager_id INT,
    FOREIGN KEY(manager_id) REFERENCES employee(employee_id) ON DELETE SET NULL
);
CREATE TABLE client(
    client_id INT PRIMARY KEY,
    client_name VARCHAR(20),
    branch_id INT,
    FOREIGN KEY(branch_id) REFERENCES branch(branch_id) ON DELETE SET NULL
);
CREATE TABLE branch (
  branch_id INT PRIMARY KEY,
  client_name VARCHAR(40),
  manager_id INT,
  FOREIGN KEY(manager_id) REFERENCES employee(employee_id) ON DELETE SET NULL
);

CREATE TABLE works_with (
  employee_id INT,
  client_id INT,
  sales INT,
  PRIMARY KEY(employee_id, client_id),
  FOREIGN KEY(employee_id) REFERENCES employee(employee_id) ON DELETE CASCADE,
  FOREIGN KEY(client_id) REFERENCES client(client_id) ON DELETE CASCADE
);




Normalization
(1NF) every column is a unique attribute, and a unique identifier or primary key is used. 
It can also be described as the elimination of recurring 
groups of relations. 1NF does not allow hierarchies of data values.
(2NF) We say a relation is in 2NF if it is in 1NF and if every non-key attribute is completely 
dependent only on the primary key. A non-key attribute is any column that cannot be used to uniquely identify the table.
(3NF) deals with the elimination of non-key attributes that do not describe the primary key. 
For a relation to be in 3NF, the relationship between any two non-key attributes, 
or groups of non-key attributes, must not be in a one-to-one relation.
The attributes should be mutually independent, which means that none of the attributes should be functionally 
dependent on any combination of attributes. This mutual independence ensures that any update to an individual 
attribute will not affect other attributes in a row.
3.5 Normal Form. A table should satisfy these two conditions to meet 3.5:
    It should be in the Third Normal Form.
    For any dependency A → B, A should be a superkey, which means that A should be a key attribute if B is a key attribute.


Summary
Normalization
    Normalization is the process of organizing the data and attributes of a database. 
    It is performed to reduce data redundancy.
Normal Forms

    1NF: A relation is in 1NF if all its attributes have atomic values.
    2NF: A relation is in 2NF if it is in 1NF and all non-key attributes are fully functionally 
    dependent on the candidate key.
    3NF: A relation is in 3NF if it is in 2NF and there is no transitive dependency.
    BCNF: A relation is in BCNF if it is in 3NF and for every functional dependency, the left-hand side 
    of the dependency is a superkey.



multiplicity as the possible range of associations between one entity and another
Cardinality represents a specific number of associations
    One-to-one relationship
        Definition: In a one-to-one relationship, each record in one table is associated with only one record in another table, and vice versa.
        Example: A person might have only one passport, and each passport belongs to only one person.
        Implementation: A one-to-one relationship can be implemented by adding a unique foreign key in one of the tables that references the primary key of the other table. Alternatively, both tables can share the same primary key.
    One-to-many relationship
        This is described from the perspective of the "one" side.
        Definition: In a one-to-many relationship, a single record in the "one" table can be associated with multiple records in the "many" table.
        Example: A single author can have multiple books. Here, "author" is the "one" side, and "books" are the "many" side.
        Implementation: The "many" table (books) includes a foreign key that references the primary key in the "one" table (author).
    Many-to-one relationship
        This is described from the perspective of the "many" side.
        Definition: In a many-to-one relationship, multiple records in the "many" table can be associated with a single record in the "one" table.
        Example: Many employees can belong to a single department. Here, "employees" are the "many" side, and "department" is the "one" side.
        Implementation: The "many" table (employees) includes a foreign key that references the primary key in the "one" table (department).
    Many-to-many relationship
        Definition: In a many-to-many relationship, multiple records in one table can be associated with multiple records in another table.
        Example: A student can enroll in multiple courses, and each course can have multiple students enrolled in it.
        Implementation: This type of relationship requires a junction table (also called a bridge or join table) that holds foreign keys referencing the primary keys of the two tables involved. For example, a student_courses table might store references to both student_id and course_id to track which students are in which courses.










SET operators are:
    UNION - removes duplicates
    UNION ALL - does not remove duplicates
    INTERSECT
    MINUS / EXCEPT

Two important rules to perform SET operations are:
    The order and number of columns must be same.
    Data types must be compatible.
    unions stitch results together vertically. 
    joins stitch results together horizonatlly.

    Union (UNION): Developers use the UNION operator to combine the results of two or more 
    SELECT statements, eliminating duplicate rows. This is useful when working with datasets that have 
    similar structures or when aggregating data from multiple sources.
   
    Intersect (INTERSECT): The INTERSECT operator is used to retrieve common rows from two 
    SELECT statements. It helps identify the shared elements between two datasets, which can be beneficial 
    for various analysis tasks.
    
    Except (EXCEPT or MINUS): The EXCEPT operator (MINUS in some databases) is used to retrieve rows from the 
    first SELECT statement that are not present in the second SELECT statement. This is helpful for finding the 
    difference between two datasets.



-- UNION: Get a combined list of all unique products sold across businesses
SELECT product_id
FROM (
    SELECT product_id FROM sales
    WHERE business_id IN (SELECT business_id FROM businesses)
    UNION
    SELECT product_id FROM sales
) AS union_result;



-- UNION ALL: Get a combined list of all products sold across businesses (including duplicates)
SELECT product_id
FROM (
    SELECT product_id FROM sales
    WHERE business_id IN (SELECT business_id FROM businesses)
    UNION ALL
    SELECT product_id FROM sales
) AS union_all_result;


-- INTERSECT: Get a list of products sold in common across all businesses
SELECT product_id
FROM (
    SELECT product_id FROM sales
    WHERE business_id = 1
    INTERSECT
    SELECT product_id FROM sales
    WHERE business_id = 2
) AS intersect_result;




-- EXCEPT: Get a list of products sold in the first business but not in the second business
SELECT product_id
FROM (
    SELECT product_id FROM sales
    WHERE business_id = 1
    EXCEPT
    SELECT product_id FROM sales
    WHERE business_id = 2
) AS except_result;











CREATE VIEW firstname_lastname AS SELECT firstname, lastname FROM Person;



CREATE VIEW view_name AS
SELECT column1, column2, ...
FROM table_name
WHERE condition;


-- Create a view to show detailed information about each player and the games they played
CREATE VIEW player_games_view
AS
SELECT p.player_id, p.player_name, p.player_email, g.game_id, g.game_title, g.game_score
FROM players p
JOIN games_played g 
ON p.player_id = g.player_id;


SELECT * FROM player_games_view;











index is a database object that provides a fast and efficient way to look up and retrieve data from a table
An index is typically a data structure that stores a sorted or hashed subset of the data in a table. It consists of key 
columns and corresponding pointers to the actual data rows in the table.
    Clustered Index: The rows of the table are stored in the order of the index key. 
    Each table can have only one clustered index.
    Non-Clustered Index: The index key contains a sorted order of the data, but the actual data 
    rows are stored separately from the index.

-- Create a Non-Clustered Index on Users table
CREATE INDEX idx_UserID ON Users (userid);

-- Create a Non-Clustered Index on Accounts table
CREATE INDEX idx_AccountID ON Accounts (accountid);

-- Cluster the Accounts table based on the idx_AccountID index
CLUSTER Accounts USING idx_AccountID;









DCL sublanguage (Data control Language)
	GRANT
	REVOKE

GRANT PRIVILEGES ON object TO user;
GRANT SELECT ON posts TO 'john.user';
GRANT SELECT, INSERT, UPDATE, DELETE ON posts TO 'community.manager';
REVOKE PRIVILEGES ON object FROM user;
REVOKE SELECT ON posts FROM 'john.user';
REVOKE SELECT, INSERT, UPDATE, DELETE ON posts FROM 'community.manager';








TCL sublanguage (Transaction control language)
SQL transaction is a sequence of one or more SQL operations (such as queries, inserts, updates, or deletes) 
that are treated as a single unit of work

START TRANSACTION / BEGIN: Starts a new transaction.

COMMIT: This command is used to save the data permanently. Whenever we perform any of the DML commands, 
such as INSERT, DELETE, or UPDATE, these changes can be rolled back if the data is not stored permanently. 
To be on the safer side, the COMMIT command is used.

ROLLBACK: This command is used to restore the data to the last savepoint or last committed state. If, for 
some reason, the data inserted, deleted, or updated is not correct, you can rollback the data to a particular 
savepoint, or if a savepoint has not been created, then to the last committed state.

SAVEPOINT: This command is used to save the data at a particular point temporarily so that whenever needed, 
it can be rolled back to that particular point.

START TRANSACTION;
INSERT INTO bankaccounts VALUES("ACC3", 10000);
SAVEPOINT sv;
INSERT INTO bankaccounts VALUES("ACC4", 900000);
ROLLBACK TO sv;
INSERT INTO bankaccounts VALUES("ACC4", 90000);
COMMIT;

START TRANSACTION; 
UPDATE bankaccounts SET funds=funds-100 WHERE account_no='ACC1';
UPDATE bankaccounts SET funds=funds+100 WHERE account_no='ACC2';
COMMIT; 







ACID: Atomicity, Consistency, Isolation, and Durability.
The ACID properties are a set of four properties that guarantee the reliability and consistency of database transactions. 

Atomicity (all statements in a statement should be executed. fail or pass as a group)
A transaction is considered atomic if it cannot be further broken down into individual operations, and all of the 
operations that occur within a transaction either succeed or fail as a single unit. 
If a single operation fails during a transaction, everything is considered to have failed and must be rolled back.

Consistency (Result of transaction should be as expected)
One of the advantages of using a transaction is that, even if the transaction is a success or a failure, 
the database is consistent, and the data integrity is maintained.

Isolation
Every transaction is isolated from other transactions. Therefore, a transaction shouldn't affect other transactions 
running at the same time. Stated another way, data modifications made by one transaction should be isolated from the data 
modifications made by other transactions. So, while a transaction can see data in the state it was in before another 
concurrent transaction modified it, as well as after the second transaction has completed, 
it cannot see any intermediate states.

Durability
Data modifications that take place within a successful transaction may be safely considered stored in the database, 
regardless of whatever else may occur. As each transaction is completed, a row is entered in the database transaction log. 
Thus, in the event of a system failure that requires the database to be restored from a backup, you can use this transaction 
log to get the database back to the state it was in after a successful transaction.









Transaction Isolation levels:
Read Uncommitted
Read Uncommitted is the lowest isolation level.
One transaction may read changes made by other transactions that have not yet been committed (transactions are 
not isolated from each other in any way).
Transaction phenomena allowed: dirty read, non-repeatable read, phantom read.
Transaction phenomena prevented: none.

Read Committed
Guarantees that any data queried has already been committed.
The transaction holds a read or write lock on the current record, preventing other transactions from reading, 
updating, or deleting that record.
Transaction phenomena allowed: non-repeatable read, phantom read.
Transaction phenomena prevented: dirty read.

Repeatable Read
Prevents other transactions from updating or deleting any data it queries.
The transaction holds read locks on all records it references and write locks on referenced records for update 
and delete actions.
Transaction phenomena allowed: phantom read.
Transaction phenomena prevented: dirty read, non-repeatable read.

Serializable
Serializable is the highest isolation level.
It guarantees that transactions are serializable.
Defined as an execution of operations in which concurrently executing transactions appear to be serially executing.
Transaction phenomena allowed: none.
Transaction phenomena prevented: dirty read, non-repeatable read, phantom read.


"SET TRANSACTION ISOLATION LEVEL READ UNCOMMITTED;"


Transaction Phenomenas:
Dirty read: a transaction read data from another uncommitted transaction.
NonRepeatable read: a transaction reads same record twice and gets different values.
Phantom read: two identical queries, return two different records.































	*/
	
	
	
	
	
}
