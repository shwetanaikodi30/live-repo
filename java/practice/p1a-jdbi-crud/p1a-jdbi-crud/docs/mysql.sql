DROP SCHEMA IF EXISTS sakiladb;
CREATE SCHEMA sakiladb;
USE sakiladb;

CREATE TABLE actor(
  actor_id SMALLINT NOT NULL AUTO_INCREMENT,
  first_name VARCHAR(45) NOT NULL,
  last_name VARCHAR(45) NOT NULL,
  last_update text,
  PRIMARY KEY  (actor_id)
); 

INSERT INTO actor VALUES (1,'PENELOPE','GUINESS','2006-02-15 04:34:33'),
(2,'NICK','WAHLBERG','2006-02-15 04:34:33'),
(3,'ED','CHASE','2006-02-15 04:34:33'),
(4,'JENNIFER','DAVIS','2006-02-15 04:34:33'),
(5,'JOHNNY','LOLLOBRIGIDA','2006-02-15 04:34:33'),
(6,'BETTE','NICHOLSON','2006-02-15 04:34:33'),
(7,'GRACE','MOSTEL','2006-02-15 04:34:33'),
(8,'MATTHEW','JOHANSSON','2006-02-15 04:34:33'),
(9,'JOE','SWANK','2006-02-15 04:34:33'),
(10,'CHRISTIAN','GABLE','2006-02-15 04:34:33');
commit;

select * from actor;

