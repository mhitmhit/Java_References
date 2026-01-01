package notes_2;

public class AAB_SQL_Advanced {
/**

Single Value Output:
count() Returns the number of rows, including rows with NULL values, in a group.
sum() 	Returns the total summed values in a set.
avg() 	Returns the average value of an expression.
min() 	Returns the minimum (lowest) value in a set.
max() 	Returns the maximum (highest) value in a set.

SELECT COUNT(*) FROM EMP; 
SELECT COUNT(EMP_NAME) FROM EMP;  
SELECT SUM(duration) AS "Total duration" FROM EMP;
SELECT AVG(salary) FROM EMP;
SELECT MIN(salary) FROM EMP;
SELECT MAX(salary) FROM EMP; 

UCASE() 	Converts the value of a field to uppercase.
LCASE() 	Converts the value of a field to lowercase.
MID() 	Returns the substring from the text field.
LEN() 	Returns the length of the value in a text field.
ROUND() 	Used to round a numeric field to the number of decimals specified.
NOW() 	Returns the current system date and time.
FORMAT() 	Used to format how a field is displayed.

 SELECT UCASE("Hello World") AS UpperCase_String;  
 SELECT MID("Hello World", 4, 8) AS Substring;
 SELECT MID("Hello World", 4, 8) AS Substring;
 SELECT LENGTH("Hello World") AS String_Length;
 SELECT ROUND(1560.44444, 2) AS Round_Value; 
 SELECT NOW() AS CurrentDateTime;  
 SELECT FORMAT(1234.1234, 2) AS Format_Number; 
 
 
 
 
 
 
 
 
 
 
 
 
 
sequence:
START WITH: Starting value from which the sequence starts.
INCREMENT BY: Value by which the sequence will increment itself. Increment_value can be positive or negative.
MAXVALUE: Maximum value of the sequence.
MINVALUE: Minimum value of the sequence.
CYCLE: When the sequence reaches its set limit, it starts from the beginning.
NO CYCLE: An exception will be thrown if the sequence exceeds its max value.

 CREATE SEQUENCE sequence_name
    [ INCREMENT BY increment ]
    [ START WITH start ]
    [ MAXVALUE max_value | NO MAXVALUE ]
    [ MINVALUE min_value | NO MINVALUE ]
    [ CYCLE | NO CYCLE ];
 
 

Implementation
Syntax to create a sequence

In PostgreSQL:

CREATE SEQUENCE sequence_name
    [ INCREMENT BY increment ]
    [ START WITH start ]
    [ MAXVALUE max_value | NO MAXVALUE ]
    [ MINVALUE min_value | NO MINVALUE ]
    [ CYCLE | NO CYCLE ];

    sequence_name: Name of the sequence.
    START WITH: Starting value from which the sequence starts.
    INCREMENT BY: Value by which the sequence will increment itself. Increment_value can be positive or negative.
    MAXVALUE: Maximum value of the sequence.
    MINVALUE: Minimum value of the sequence.
    CYCLE: When the sequence reaches its set limit, it starts from the beginning.
    NO CYCLE: An exception will be thrown if the sequence exceeds its max value.

Example 1:
CREATE SEQUENCE example_1
AS INT
START WITH 10
INCREMENT BY 10; 

Example 2:
CREATE SEQUENCE example_2
START WITH 100
INCREMENT BY -1
MINVALUE 1
MAXVALUE 100
CYCLE;


 
 
 
 
 
 
 
 
 
 
 Triggers:
 CREATE TRIGGER [trigger_name] 
    [BEFORE | AFTER]  
    {INSERT | UPDATE | DELETE}  
    ON [table_name]  
    [FOR EACH ROW]  
    [trigger_body] 
    
 
AFTER INSERT: activated after data is inserted into the table.
AFTER UPDATE: activated after data in the table is modified.
AFTER DELETE: activated after data is deleted from the table.
BEFORE INSERT: activated before data is inserted into the table.
BEFORE UPDATE: activated before data in the table is modified.
BEFORE DELETE: activated before data is deleted from the table.


DROP TRIGGER [IF EXISTS] trigger_name;



 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
stored procedure: (do not return values, but log result in the application)
set of statements is named and stored to be executed at a future point in time as a batch.
stored procedures live in the database itself, they can be called by different programs.
safer, should be used more.
 
CREATE PROCEDURE procedure_name (IN | OUT | INOUT parameter_name parameter_datatype, … )
BEGIN    
    -- SQL statements
END


DELIMITER //
CREATE PROCEDURE UpdateEmployeeSalaries(IN PercentageIncrease DECIMAL(5,2))
BEGIN
    -- Updating the salaries
    UPDATE Employees
    SET Salary = Salary * (1 + PercentageIncrease / 100);
    -- Logging the update
    INSERT INTO SalaryUpdateLog (UpdateDate, PercentageIncrease)
    VALUES (NOW(), PercentageIncrease);
END //
DELIMITER ;

CALL UpdateEmployeeSalaries(3.0)

DROP PROCEDURE [IF EXISTS] stored_procedure_name;





 
 
 
 
 
 
 
 
 
 
 
Functions (must always return a value):
performs a defined set of operations on given data and returns a result
can accept an input and return a scalar value.
 
DELIMITER //
CREATE FUNCTION get_balance(acc_no INT)
RETURNS INT
DETERMINISTIC
BEGIN
   DECLARE acc_bal INT;
   SELECT order_total 
   INTO acc_bal 
   FROM sample2.orders 
   WHERE customer_id = acc_no 
   LIMIT 1;
   RETURN acc_bal;
END//
DELIMITER ;
 
 
SELECT get_balance(101);
 
DROP FUNCTION [ IF EXISTS ] function_name;
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 */
}
