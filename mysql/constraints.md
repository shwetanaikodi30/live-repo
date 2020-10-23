:newspaper: **constraints** ..  

:label: ***types of constraints***  

MySQL CONSTRAINTs are :
1. NOT NULL
   1. MySQL NOT NULL constraint allows to specify that a column can not contain any NULL value. 
   2. MySQL NOT NULL can be used to CREATE and ALTER a table.
2. UNIQUE
   1. The UNIQUE constraint in MySQL does not allow to insert a duplicate value in a column. The UNIQUE constraint maintains the uniqueness of a column in a table. More than one UNIQUE column can be used in a table. unique allows one or null value.
3. PRIMARY KEY
   1. A PRIMARY KEY constraint for a table enforces the table to accept unique data for a specific column. It does not have null value.
4. FOREIGN KEY
   1. A FOREIGN KEY in MySQL creates a link between two tables by one specific column of both tables. The specified column in one table must be a PRIMARY KEY and referred by the column of another table known as FOREIGN KEY.
5. CHECK
   1. A CHECK constraint controls the values in the associated column. The CHECK constraint determines whether the value is valid or not from a logical expression.
6. DEFAULT
   1. MySQL table, each column must contain a value ( including a NULL). While inserting data into a table, if no value is supplied to a column, then the column gets the value set as DEFAULT.

```sql
drop table newbook_mast;
CREATE TABLE IF NOT EXISTS newbook_mast
( 
   book_id varchar(15)  UNIQUE
);

insert into newbook_mast values (null);
insert into newbook_mast values ('test');
insert into newbook_mast values (null);
--insert into newbook_mast values ('null');


```sql
CREATE TABLE IF NOT EXISTS newbook_mast
( book_id	varchar(15) NOT NULL UNIQUE, 
book_name varchar(50) , 
isbn_no varchar(15) NOT NULL UNIQUE ,
cate_id varchar(8) , 
aut_id varchar(8) , 
pub_id varchar(8) ,
dt_of_pub date CHECK (dt_of_pub LIKE '--/--/----'), 
pub_lang varchar(15) ,
no_page decimal(5,0) CHECK(no_page>0) ,
book_price decimal(8,2) ,
PRIMARY KEY (book_id) );
```

```sql
CREATE TABLE IF NOT EXISTS
newauthor(aut_id varchar(8) NOT NULL , 
aut_name varchar(50) NOT NULL,
country varchar(25) NOT NULL CHECK (country IN ('USA','UK','India')), 
home_city varchar(25) NOT NULL, 
PRIMARY KEY (aut_id,home_city));
```
```sql
CREATE TABLE IF NOT EXISTS newpublisher
(pub_id varchar(8) NOT NULL UNIQUE DEFAULT '' ,           
pub_name varchar(50) NOT NULL  DEFAULT '' ,          
pub_city varchar(25) NOT NULL  DEFAULT '' ,          
country varchar(25) NOT NULL DEFAULT 'India',          
country_office varchar(25) , 
no_of_branch int(3),        
estd date
CHECK ((country='India' AND pub_city='Mumbai')
OR (country='India' AND pub_city='New Delhi')) ,
PRIMARY KEY (pub_id));

drop table newauthor1;
drop table newbook_mast1;
CREATE TABLE newauthor1
(aut_id varchar(8) NOT NULL  PRIMARY KEY ,
aut_name varchar(50) NOT NULL
);

CREATE TABLE newbook_mast1 ( book_id varchar(15), book_name varchar(50), aut_id varchar(8), PRIMARY KEY (book_id), FOREIGN KEY (aut_id) REFERENCES newauthor1(aut_id) );

select * from newauthor1;
insert into newauthor1 values ('a1', 'aname');
insert into newauthor1 values ('a2', 'aname1'); 
insert into newauthor1 values (null, 'aname1'); 

select * from newbook_mast1;
insert into newbook_mast1 values ('b1', 'bname','a1');
insert into newbook_mast1 values ('b2', 'bname1','a1'); 
insert into newbook_mast1 values ('b3', 'bname1',null); 
insert into newbook_mast1 values ('b4', 'bname1',null); 

delete from newauthor1 where aut_id = 'a1';
delete from newauthor1 where aut_id = 'a2';
```

#:label: ***update vs modify***  
ALTER Command is used to add, delete, modify the attributes of the relations (tables) in the database. UPDATE Command is used to update existing records in a database. ALTER Command by default initializes values of all the tuple as NULL. UPDATE Command sets specified values in the command to the tuples.

```sql
create table customer10(customerid char(5));
ALTER TABLE Customer10
ADD column Email varchar(255);
ALTER TABLE Customer10
ADD  Email1 varchar(255);

ALTER TABLE Customer10
DROP COLUMN Email;

ALTER TABLE Customer10
DROP  Email1;

ALTER TABLE Customer10
  MODIFY customerid varchar(50) NULL;

  
ALTER TABLE Customer10
  change column  customerid customer_id varchar(50) NULL;
```

Super Key is an attribute (or set of attributes) that is used to uniquely identifies all attributes in a relation. 


<!-- additional queries -->
select * from newbook_mast;
select * from newbook_mast where book_id is 'null';
select * from newbook_mast where book_id  = 'null';
select * from newbook_mast where book_id != 'nully';
select * from newbook_mast where book_id != null;
select * from newbook_mast where book_id is 'null';
select * from newbook_mast where book_id <> null ;

select * from newbook_mast where book_id is not null;
select * from newbook_mast where book_id is  null;

:beetle: is 'null'
is 'not null'
 = 'null'
 != 'null'
 is null
 is not null
 <> null  
```

```sql
SELECT 
    productname, 
    buyprice
FROM
    products p1
WHERE
    buyprice > (SELECT 
            AVG(buyprice)
        FROM
            products
        WHERE
            productline = p1.productline)
```
a correlated subquery is a subquery that uses the data from the outer query. In other words, a correlated subquery depends on the outer query. A correlated subquery is evaluated once for each row in the outer query.
