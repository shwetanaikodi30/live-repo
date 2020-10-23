CREATE DATABASE Contacts;
USE Contacts;

-- PRIMARY KEY CREATED WHEN COLUMN IS DEFINED. 
-- CREATE TABLE TESTPK3(TESTCOL INTEGER CONSTRAINT PK_TESTPK3 PRIMARY KEY, TESTCOL1 VARCHAR(10));
CREATE TABLE TESTPK2(TESTCOL INTEGER PRIMARY KEY, TESTCOL1 VARCHAR(10));
-- PRIMARY KEY CREATED AT TABLE LEVEL
CREATE TABLE TESTPK1(TESTCOL INTEGER , TESTCOL1 VARCHAR(10), primary key (TESTCOL));

CREATE TABLE address(address_id INTEGER NOT NULL,	address_building_number VARCHAR(55) NOT NULL,	address_street VARCHAR(55) NOT NULL,	
address_locality VARCHAR(55),	address_city VARCHAR(55) NOT NULL,	address_zip_postal VARCHAR(55) NOT NULL,	
address_state_province_county VARCHAR(55) NOT NULL,	address_country VARCHAR(55) NOT NULL , 
CONSTRAINT PK_Address PRIMARY KEY (address_id) );

CREATE TABLE email_address(	email_address_id INTEGER NOT NULL,	email_address_person_id INTEGER,	email_address VARCHAR(55) NOT NULL,
CONSTRAINT PK_email_address PRIMARY KEY (email_address_id ));

CREATE TABLE person(	person_id INTEGER  NOT NULL,  person_first_name VARCHAR(55) NOT NULL,	 person_last_name VARCHAR(55) NULL,	 
person_contacted_number INTEGER NOT NULL, person_date_last_contacted DATETIME NOT NULL,person_date_added DATETIME NOT NULL,  
CONSTRAINT PK_person PRIMARY KEY (person_id));

CREATE TABLE person_address(	person_address_id INTEGER NOT NULL,	person_address_person_id INTEGER NOT NULL,	person_address_address_id INTEGER NOT NULL,
 CONSTRAINT PK_person_address PRIMARY KEY (person_address_id));
CREATE TABLE phone_number(	phone_number_id INTEGER NOT NULL,	phone_number_person_id INTEGER NOT  NULL,	phone_number VARCHAR(55) NOT NULL,
 CONSTRAINT PK_phone_number PRIMARY KEY (phone_number_id));
 
INSERT INTO address (address_id, address_building_number, address_street, address_locality, address_city, address_zip_postal, address_state_province_county,
 address_country) VALUES (4, '555', 'Lion Street', NULL, 'San Francisco', '91001', 'California', 'US');
INSERT INTO address (address_id, address_building_number, address_street, address_locality, address_city, address_zip_postal, address_state_province_county,
 address_country) VALUES (1, '555', 'Lion Street', NULL, 'Los Angeles', '91001', 'California', 'US');
INSERT INTO address (address_id, address_building_number, address_street, address_locality, address_city, address_zip_postal, address_state_province_county,
 address_country) VALUES (2, '555', 'Trainsignal', NULL, 'Toronto', '7777', 'Ontario', 'Canada');
INSERT INTO address (address_id, address_building_number, address_street, address_locality, address_city, address_zip_postal, address_state_province_county,
 address_country) VALUES (3, '555', 'Lion Street', 'Boonies', 'Somewhere', '11111', 'Maine', 'US');

INSERT INTO email_address (email_address_id, email_address_person_id, email_address) VALUES (1, 1, 'jon.flanders@mail.com');
INSERT INTO email_address (email_address_id, email_address_person_id, email_address) VALUES (2, 1, 'jonf@anothermail.com');

INSERT INTO email_address (email_address_id, email_address_person_id, email_address) VALUES (4, 3, 'fritz@mail.com');
INSERT INTO email_address (email_address_id, email_address_person_id, email_address) VALUES (5, NULL, 'aaron@mail.com');

INSERT INTO person (person_id, person_first_name, person_last_name, person_contacted_number,person_date_last_contacted,person_date_added ) VALUES (1, 'Jon', 'Flanders', 5,'2013-09-14 11:43:31','2013-01-14 11:43:31');
INSERT INTO person (person_id, person_first_name, person_last_name, person_contacted_number,person_date_last_contacted,person_date_added) VALUES (2, 'Shannon', 'Ahern', 0,'2013-08-14 11:43:31','2013-02-14 11:43:31');
INSERT INTO person (person_id, person_first_name, person_last_name, person_contacted_number,person_date_last_contacted,person_date_added) VALUES (3, 'Fritz', 'Onion', 1,'2013-07-14 11:43:31','2013-03-14 11:43:31');
INSERT INTO person (person_id, person_first_name, person_last_name, person_contacted_number,person_date_last_contacted,person_date_added) VALUES (4, 'Fritz', 'Onion', 1,'2013-07-14 11:43:31','2013-03-14 11:43:31');
INSERT INTO person (person_id, person_first_name, person_last_name, person_contacted_number,person_date_last_contacted,person_date_added) VALUES (5, 'Fritz', 'Tomato', 1,'2013-07-14 11:43:31','2013-03-14 11:43:31');

INSERT INTO person_address (person_address_id, person_address_person_id, person_address_address_id) VALUES (1, 1, 1);
INSERT INTO person_address (person_address_id, person_address_person_id, person_address_address_id) VALUES (3, 2, 1);
INSERT INTO person_address (person_address_id, person_address_person_id, person_address_address_id) VALUES (4, 2, 2);
INSERT INTO person_address (person_address_id, person_address_person_id, person_address_address_id) VALUES (5, 3, 3);


INSERT INTO phone_number (phone_number_id, phone_number_person_id, phone_number) VALUES (1, 1, '555-1212');
INSERT INTO phone_number (phone_number_id, phone_number_person_id, phone_number) VALUES (2, 2, '555-1213');
INSERT INTO phone_number (phone_number_id, phone_number_person_id, phone_number) VALUES (3, 3, '555-1214');
INSERT INTO phone_number (phone_number_id, phone_number_person_id, phone_number) VALUES (4, 3, '555-1215');

SELECT 'YOU GUYS ARE LOVELY AND ROCING';
SELECT 'YOU', 'ARE ROCKING';

SELECT person_first_name FROM person ;
-- table alias
SELECT p.person_first_name FROM person p;
-- user defined column heading
SELECT p.person_first_name as FirstName FROM person p;
SELECT p.person_first_name as "First Name" FROM person p;
SELECT p.person_first_name as 'First Name' FROM person p;
SELECT DISTINCT p.person_first_name , p.person_last_name as FirstName 
FROM person p;	
select * from person;


SELECT DISTINCT p.person_first_name as FirstName 
FROM person p;	

ALTER TABLE email_address  
ADD  CONSTRAINT FK_email_address_person FOREIGN KEY(email_address_person_id)
REFERENCES person (person_id);

ALTER TABLE person_address  ADD  CONSTRAINT FK_person_address_address FOREIGN KEY(person_address_address_id)
REFERENCES address (address_id);
ALTER TABLE person_address  ADD  CONSTRAINT FK_person_address_person FOREIGN KEY(person_address_person_id)
REFERENCES person (person_id) ;
ALTER TABLE phone_number   ADD  CONSTRAINT FK_phone_number_person FOREIGN KEY(phone_number_person_id)
REFERENCES person (person_id);

SELECT person_last_name FROM person p WHERE p.person_first_name = 'Jon';
SELECT person_last_name FROM person p WHERE person_first_name = 'Jon';
SELECT p.person_last_name FROM person  WHERE person_first_name = 'Jon';

SELECT p.person_last_name 
FROM 
person p
WHERE p.person_first_name = 'Jon'
AND
p.person_contacted_number = 5;

SELECT p.person_last_name,  person_first_name, person_contacted_number
FROM 
person p
WHERE p.person_first_name = 'Jon'
or
p.person_contacted_number <= 5;

-- range operators
-- The following query includes the values 1 and 20. 
SELECT p.person_last_name,person_contacted_number
FROM 
person p
WHERE p.person_contacted_number 
BETWEEN 1 AND 20;

SELECT p.person_last_name,person_contacted_number
FROM 
person p
WHERE p.person_contacted_number 
not BETWEEN 1 AND 2;

SELECT p.person_last_name, person_first_name
FROM person p
WHERE p.person_first_name
IN ('Jon','Fritz');

SELECT p.person_last_name, person_first_name
FROM person p
WHERE p.person_first_name = 'Jon' or p.person_first_name = 'Fritz';

SELECT p.person_last_name, person_first_name
FROM person p
WHERE p.person_first_name = 'Jon' and p.person_first_name = 'Fritz';

SELECT p.person_last_name, person_first_name
FROM person p
WHERE p.person_first_name
not IN ('Jon','Fritz');

SELECT p.person_last_name, person_first_name
FROM person p
WHERE p.person_first_name != 'Jon' and p.person_first_name != 'Fritz';

SELECT e.email_address_person_id, e.email_address
FROM
email_address e
WHERE
e.email_address_person_id != NULL;

SELECT e.email_address_person_id, e.email_address
FROM
email_address e
WHERE
e.email_address_person_id is not NULL;

SELECT e.email_address_person_id, e.email_address
FROM
email_address e
WHERE
e.email_address_person_id is  NULL;

SELECT p.person_first_name,p.person_last_name
FROM person p
ORDER BY p.person_last_name asc;

SELECT p.person_first_name,p.person_last_name
FROM person p
ORDER BY p.person_last_name desc;

desc person;
describe person;
-- AGGREGATE FUNCTIONS
-- COUNT
SELECT COUNT(*) AS 'TOTAL RECORDS'
FROM person p;

SELECT COUNT(p.person_first_name)
FROM person p
WHERE p.person_last_name = 'Ahern';
-- MAX
SELECT MAX(p.person_contacted_number)
FROM person p;
-- MIN
SELECT MIN(p.person_contacted_number)
FROM person p;
-- AVG
SELECT AVG(p.person_contacted_number)
FROM person p;
-- SUM
SELECT SUM(p.person_contacted_number)
FROM person p;

SELECT  MIN(p.person_contacted_number), AVG(p.person_contacted_number), SUM(p.person_contacted_number) FROM person p; 
SELECT * FROM PERSON P;
SELECT  person_first_name, MIN(p.person_contacted_number), AVG(p.person_contacted_number), SUM(p.person_contacted_number) FROM person p; 
SELECT  person_first_name, MIN(p.person_contacted_number), AVG(p.person_contacted_number), SUM(p.person_contacted_number) FROM person p
GROUP BY person_first_name;

SELECT p.person_first_name
FROM person p;
SELECT COUNT( p.person_first_name)
FROM person p;
SELECT COUNT(DISTINCT p.person_first_name)
FROM person p;

SELECT COUNT( p.person_first_name), -- AGGREGATE COLUMN
p.person_first_name -- NON -AGGREGATE COLUMN
FROM person p
GROUP BY p.person_first_name;

SELECT 
COUNT(p.person_first_name) as FirstNameCount,
p.person_first_name
FROM person p
GROUP BY p.person_first_name
HAVING FirstNameCount > 1;

SELECT 
COUNT(p.person_first_name) as FirstNameCount,
p.person_first_name
FROM person p
HAVING FirstNameCount > 1;


SELECT 
COUNT(p.person_first_name) as FirstNameCount,
p.person_first_name
FROM person p
GROUP BY p.person_first_name
HAVING p.person_first_name = 'Fritz';

SELECT 
COUNT(p.person_first_name) as FirstNameCount,
p.person_first_name
FROM person p
GROUP BY p.person_first_name
HAVING p.person_first_name = 'Fritzz';

SELECT 
COUNT(p.person_first_name) as FirstNameCount,
p.person_first_name
FROM person p
--GROUP BY p.person_first_name
HAVING p.person_first_name = 'Fritz';


SELECT 
COUNT(p.person_first_name) as FirstNameCount,
p.person_first_name
FROM person p
GROUP BY p.person_first_name
HAVING COUNT(p.person_first_name) > 1;

SELECT 
COUNT(p.person_first_name) as FirstNameCount,
p.person_first_name
FROM person p
GROUP BY p.person_first_name
HAVING person_first_name  = 'Fritz';

SELECT COUNT(p.person_first_name) as FirstNameCount,
p.person_first_name
FROM person p
where person_first_name  = 'Fritz'
GROUP BY p.person_first_name;

SELECT COUNT(p.person_first_name) as FirstNameCount, 
p.person_first_name 
FROM person p 
GROUP BY p.person_first_name 
HAVING FirstNameCount > 1; 

SELECT COUNT(p.person_first_name) as FirstNameCount, 
p.person_first_name 
FROM person p  
HAVING FirstNameCount > 1; 

SELECT COUNT(p.person_first_name) as FirstNameCount, 
p.person_first_name 
FROM person p  
HAVING person_first_name = 'Fritz'; 


CREATE TABLE address(address_id INTEGER NOT NULL,	address_building_number VARCHAR(55) NOT NULL,	address_street VARCHAR(55) NOT NULL,	
address_locality VARCHAR(55),	address_city VARCHAR(55) NOT NULL,	address_zip_postal VARCHAR(55) NOT NULL,	
address_state_province_county VARCHAR(55) NOT NULL,	address_country VARCHAR(55) NOT NULL , 
CONSTRAINT PK_Address PRIMARY KEY (address_id) );

CREATE TABLE email_address(	email_address_id INTEGER NOT NULL,	email_address_person_id INTEGER,	email_address VARCHAR(55) NOT NULL,
CONSTRAINT PK_email_address PRIMARY KEY (email_address_id ));

-- WORKING ON GROUP BY AND HAVING CLAUSES
CREATE TABLE marks(FirstName VARCHAR(55) NOT NULL,	 LastName VARCHAR(55) NULL,	 
MARK1 INTEGER NOT NULL);

DROP TABLE MARKS;
select * from marks;
insert into marks values('Rambo','John',50);
insert into marks values('Sita','Rama',70);
insert into marks values('Rambo','John',80);
insert into marks values('Sita','Rama',90);
insert into marks values('Rambo','John',50);
insert into marks values('Hari','Krishna',50);

-- AGGREGATE FUNCTION
SELECT COUNT(MARK1) FROM MARKS;
SELECT COUNT(MARK1), MAX(MARK1), MIN(MARK1) FROM MARKS;
SELECT FirstName, COUNT(MARK1) FROM MARKS;

SELECT FirstName, COUNT(MARK1) FROM MARKS
GROUP BY FIRSTNAME
HAVING COUNT(MARK1) > 2;

SELECT FirstName, COUNT(MARK1) AS 'MARKCOUNT' FROM MARKS
GROUP BY FIRSTNAME
HAVING MARKCOUNT > 2;


SELECT FirstName, LASTNAME, COUNT(MARK1) AS 'MARKCOUNT' FROM MARKS
GROUP BY FIRSTNAME, LASTNAME
HAVING MARKCOUNT > 2;

SELECT FirstName, COUNT(MARK1) FROM MARKS
GROUP BY FIRSTNAME
HAVING MARK1 > 2;

DROP TABLE T1;
DROP TABLE T2;

CREATE TABLE T1 (
	T1C1 CHAR(10),
	T1C2 CHAR(10)
);
CREATE TABLE T2 (
	T2C1 CHAR(10),
	T2C2 CHAR(10)
);
INSERT INTO T1 VALUES ('X', 'RED');
INSERT INTO T1 VALUES ('Y', 'GREEN');
INSERT INTO T1 VALUES ('Z', 'BLUE');
INSERT INTO T1 VALUES ('Y', 'ORANGE');
INSERT INTO T2 VALUES ('X', 'APPLE');
INSERT INTO T2 VALUES ('Y', 'ORANGE');
INSERT INTO T2 VALUES ('A', 'MANGO');
INSERT INTO T2 VALUES ('X', 'BANANA');
SELECT * FROM T1;
SELECT * FROM T2;
#	INNER JOIN
SELECT * FROM T1 INNER JOIN T2 ON T1.T1C1=T2.T2C1;
# LEFT OUTER JOIN
SELECT * FROM T1 LEFT OUTER JOIN T2 ON T1.T1C1=T2.T2C1;
# RIGHT OUTER JOIN
SELECT * FROM T1 RIGHT OUTER JOIN T2 ON T1.T1C1=T2.T2C1
ORDER BY T1.T1C1;

--  INNER JOIN (EQUI JOIN)
SELECT * FROM T1 INNER JOIN T2 ON T1.T1C1=T2.T2C1;

-- 	INNER JOIN (NONEQUI JOIN)
SELECT * FROM T1 INNER JOIN T2 ON T1.T1C1 > T2.T2C1;

# FULL OUTER JOIN 
# LEFT OUTER JOIN
SELECT * FROM T1 LEFT OUTER JOIN T2 ON T1.T1C1=T2.T2C1
UNION
SELECT * FROM T1 RIGHT OUTER JOIN T2 ON T1.T1C1=T2.T2C1;

SELECT * FROM T1 LEFT OUTER JOIN T2 ON T1.T1C1=T2.T2C1
UNION ALL
SELECT * FROM T1 RIGHT OUTER JOIN T2 ON T1.T1C1=T2.T2C1;

SELECT * FROM T1 NATURAL JOIN T2;


CREATE TABLE T3 (
	C1 CHAR(10),
	T1C2 CHAR(10)
);
CREATE TABLE T4 (
	C1 CHAR(10),
	T2C2 CHAR(10)
);

INSERT INTO T1 VALUES ('X', 'RED');
INSERT INTO T1 VALUES ('Y', 'GREEN');
INSERT INTO T1 VALUES ('Z', 'BLUE');
INSERT INTO T1 VALUES ('Y', 'ORANGE');
INSERT INTO T2 VALUES ('X', 'APPLE');
INSERT INTO T2 VALUES ('Y', 'ORANGE');
INSERT INTO T2 VALUES ('A', 'MANGO');
INSERT INTO T2 VALUES ('X', 'BANANA');

SELECT * FROM T1 NATURAL JOIN T2;
SELECT * FROM T3 NATURAL JOIN T4;
SELECT * FROM T1 CROSS JOIN T2;

#	FULL OUTER JOIN
SELECT * FROM T1 FULL OUTER JOIN T2 ON T1.T1C1=T2.T2C1;
