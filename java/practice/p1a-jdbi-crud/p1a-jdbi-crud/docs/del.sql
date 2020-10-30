DROP SCHEMA IF EXISTS sakiladb;
CREATE SCHEMA sakiladb;
USE sakiladb;

--- MISC QUERIES ---
CREATE TABLE delta (
  last_update date
) ;
insert into delta values(STR_TO_DATE('1-01-2012', '%d-%m-%Y'));
select * from delta;