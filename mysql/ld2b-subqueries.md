create table marks ( student_no varchar(10), module_code varchar(8), mark integer);

insert into marks values ('20060101', 'CM0001', 80);
insert into marks values ('20060101', 'CM0002', 65);
insert into marks values ('20060101', 'CM0003', 50);
insert into marks values ('20060102', 'CM0001', 75);
insert into marks values ('20060102', 'CM0003', 45);
insert into marks values ('20060102', 'CM0004', 70);
insert into marks values ('20060103', 'CM0001', 60);
insert into marks values ('20060103', 'CM0002', 75);
insert into marks values ('20060103', 'CM0004', 60);
insert into marks values ('20060104', 'CM0001', 55);
insert into marks values ('20060104', 'CM0002', 40);
insert into marks values ('20060104', 'CM0003', 45);
insert into marks values ('20060105', 'CM0001', 55);
insert into marks values ('20060105', 'CM0002', 50);
insert into marks values ('20060105', 'CM0004', 65);

<!-- Find the Student who have Maximum average in class? -->

select student_no, avg(mark) from marks
group by student_no;

drop table average;
create table average
select student_no, avg(mark) as 'avg' from marks
group by student_no;

select  * from average;
select max(avg) from average;

<!-- sub query -->
select student_no, avg(mark) from marks
group by student_no;

select student_no, avg(mark) from marks
group by student_no;


--Maximum
--average
select max(avgval)
from
(
select avg(mark) avgval from marks
group by student_no
) alias;