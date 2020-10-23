SELECT * FROM CATEGORY;
SELECT * FROM FILM_CATEGORY WHERE FILM_ID < 10;
SELECT * FROM category cat WHERE cat.name = 'Action'; 
SELECT  *  FROM inventory; 
SELECT  cat.category_id  FROM  category cat WHERE cat.name = 'Action';  --1
SELECT * FROM FILM_CATEGORY WHERE FILM_ID category_id  = 1;
SELECT * FROM category cat WHERE cat.name = 'Action' or cat.name='Animation';

SELECT * FROM film_category fc WHERE fc.category_id IN 
               ( SELECT cat.category_id FROM category cat WHERE cat.name = 'Action' or cat.name='Animation' );

SELECT * FROM inventory inv WHERE inv.film_id IN 
   (
      SELECT fc.film_id FROM film_category fc WHERE fc.category_id IN 
               ( SELECT cat.category_id FROM category cat WHERE cat.name = 'Action' or cat.name='Animation' )
   );


SELECT * FROM FILM_CATEGORY WHERE  category_id  = (SELECT  cat.category_id  FROM  category cat WHERE cat.name = 'Action');
SELECT * FROM FILM_CATEGORY inner join category on FILM_CATEGORY.category_id = category.category_id
where name = 'Action';

-- SELECT * FROM FILM_CATEGORY WHERE  category_id  = (SELECT  cat.category_id  FROM  category cat WHERE cat.name = 'Action' or cat.name = 'Animation');
SELECT * FROM FILM_CATEGORY WHERE  category_id  in (SELECT  cat.category_id  FROM  category cat WHERE cat.name = 'Action' or cat.name = 'Animation');
SELECT * FROM FILM_CATEGORY inner join category on FILM_CATEGORY.category_id = category.category_id
where category.name = 'Action' or category.name='Animation';
select * from rental;

( SELECT inv.inventory_id FROM inventory inv WHERE inv.film_id IN ( SELECT fl.film_id FROM film fl WHERE fl.film_id IN ( SELECT fc.film_id FROM film_category fc WHERE fc.category_id IN ( SELECT cat.category_id FROM category cat WHERE cat.name = 'Action' ) ) ) )


SELECT * FROM inventory inv WHERE inv.film_id IN 
            (
            SELECT fc.film_id FROM film_category fc WHERE fc.category_id IN 
               ( SELECT cat.category_id FROM category cat WHERE cat.name = 'Action' or cat.name='Animation' )
            )
and inv.inventory_id  < 100;


SELECT ren.customer_id FROM rental ren WHERE ren.inventory_id IN
   (
   SELECT ren.inventory_id FROM inventory inv WHERE inv.film_id IN 
            (
            SELECT fc.film_id FROM film_category fc WHERE fc.category_id IN 
               ( SELECT cat.category_id FROM category cat WHERE cat.name = 'Action'  )
            )
   )


SELECT cust.customer_id, cust.first_name, cust.last_name FROM customer cust 
WHERE cust.customer_id IN
(
   SELECT ren.customer_id FROM rental ren WHERE ren.inventory_id IN
   (
   SELECT ren.inventory_id FROM inventory inv WHERE inv.film_id IN 
            (
            SELECT fc.film_id FROM film_category fc WHERE fc.category_id IN 
               ( SELECT cat.category_id FROM category cat WHERE cat.name = 'Action'  )
            )
   )
)
and cust.customer_id < 10;


--CREATE A TABLE COPY
CREATE TABLE tempCustomerOrder 
SELECT cust.customer_id, cust.first_name, cust.last_name FROM customer cust 
WHERE cust.customer_id IN
(
   SELECT ren.customer_id FROM rental ren WHERE ren.inventory_id IN
   (
   SELECT ren.inventory_id FROM inventory inv WHERE inv.film_id IN 
            (
            SELECT fc.film_id FROM film_category fc WHERE fc.category_id IN 
               ( SELECT cat.category_id FROM category cat WHERE cat.name = 'Action'  )
            )
   )
)
and cust.customer_id < 10;

-- CREATE A VIEW 
CREATE VIEW vwCustomerOrder as 
SELECT cust.customer_id, cust.first_name, cust.last_name FROM customer cust 
WHERE cust.customer_id IN
(
   SELECT ren.customer_id FROM rental ren WHERE ren.inventory_id IN
   (
   SELECT ren.inventory_id FROM inventory inv WHERE inv.film_id IN 
            (
            SELECT fc.film_id FROM film_category fc WHERE fc.category_id IN 
               ( SELECT cat.category_id FROM category cat WHERE cat.name = 'Action'  )
            )
   )
)
and cust.customer_id < 10;

select * from vwCustomerOrder;

- find the category for 'Action'
- find the film of category_id
- find the inventory for the film
- find the customer details

User Story : 
As a user
I would like to find all the customers 


USE sakila;

/*
Problem Statement:
Find all the customer's payments which are over their average payment.
*/

SELECT  payment_id, cust.first_name, cust.last_name, amount
FROM payment pt
INNER JOIN customer cust ON cust.customer_id = pt.customer_id
WHERE amount <
		(	SELECT AVG(amount)
			FROM payment pt1
			WHERE pt1.customer_id = pt.customer_id)
ORDER BY cust.customer_id;


SELECT  cust.first_name, cust.last_name, COUNT(payment_id) CountofPayment
FROM payment pt
INNER JOIN customer cust ON cust.customer_id = pt.customer_id
WHERE amount >
		(	SELECT AVG(amount)
			FROM payment pt1
			WHERE pt1.customer_id = pt.customer_id)
GROUP BY cust.first_name, cust.last_name
ORDER BY cust.customer_id;

SELECT AVG(amount), cust.first_name, cust.last_name
FROM payment pt
INNER JOIN customer cust ON cust.customer_id = pt.customer_id
GROUP BY cust.first_name, cust.last_name
ORDER BY cust.customer_id;


select c1 from t1 where
c1 = (5,10);


select c1 from t1 where
c1 in (5,10);

