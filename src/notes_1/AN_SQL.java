package notes_1;


public class AN_SQL {
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
















































	 */
	
	
	
	
	
}
