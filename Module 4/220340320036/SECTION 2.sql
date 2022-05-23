/*Section II*/

/*1.	Write a stored procedure by the name of PROC1 that accepts two varchar strings as parameters. 
Your procedure should then determine if the first varchar string exists inside the varchar string. 
For example, if string1 = ‘DAC’ and string2 = ‘CDAC, then string1 exists inside string2.  
The stored procedure should insert the appropriate message into a suitable TEMPP output table. 
Calling program for the stored procedure need not be written.*/

CREATE TABLE TEMPP
(
	STR1 VARCHAR(15),
    STR2 VARCHAR(15),
    REMARK VARCHAR(50)
);
DELIMITER //
CREATE PROCEDURE PROC1(STR1 VARCHAR(15), STR2 VARCHAR(15))
BEGIN
	DECLARE POS INT;
    SET POS=INSTR(STR2, STR1);
    IF POS=0 THEN
		INSERT INTO TEMPP VALUES (STR1, STR2, CONCAT(STR1, ' NOT FOUND IN ',STR2));
	ELSE
		INSERT INTO TEMPP VALUES (STR1, STR2, CONCAT(STR1, ' FOUND IN ',STR2,' AT POSITION ', POS));
    END IF;
END; //
DELIMITER ;

CALL PROC1('DAC', 'CDAC');
CALL PROC1('BHAVYA', 'DEVI DINESH');
CALL PROC1('DEVI', 'DEVI DINESH');
SELECT * FROM TEMPP;


/*2.	Create a stored function by the name of FUNC1 to take three parameters, the sides of a triangle. 
The function should return a Boolean value:- TRUE if the triangle is valid, FALSE otherwise. 
A triangle is valid if the length of each side is less than the sum of the lengths of the other two sides. 
Check if the dimensions entered can form a valid triangle. Calling program for the stored function need not be written.*/

CREATE TABLE TEMPP2
(
	SIDES VARCHAR(15),
    REMARK VARCHAR(50)
);

DELIMITER //
CREATE FUNCTION FUNC1(X FLOAT, Y FLOAT, Z FLOAT)
RETURNS BOOLEAN
DETERMINISTIC
BEGIN
    IF ( (X+Y)>Z AND (Y+Z)>X AND (Z+X)>Y) THEN
		RETURN TRUE;
	ELSE
		RETURN FALSE;
    END IF;
END; //
DELIMITER ;

DELIMITER //
CREATE PROCEDURE CALLING_PROC(X FLOAT, Y FLOAT, Z FLOAT)
BEGIN
	DECLARE CON BOOLEAN;
    SET CON=FUNC1(X, Y, Z);
    IF (CON=TRUE) THEN
		INSERT INTO TEMPP2 VALUES (CONCAT(X,', ',Y,', ', Z), 'FORMS A VAID TRIANGLE');
	ELSE
		INSERT INTO TEMPP2 VALUES (CONCAT(X,', ',Y,', ', Z), 'DOES NOT FORM A VAID TRIANGLE');
    END IF;
END; //
DELIMITER ;

CALL CALLING_PROC(1,2,3);
CALL CALLING_PROC(3,4,5);
SELECT * FROM TEMPP2;

