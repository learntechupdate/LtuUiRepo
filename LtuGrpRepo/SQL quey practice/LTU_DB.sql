-- HighAlert!!!!Do Not create DB or delete DB
-- Alert!!! don't Drop table/Delete Tables in organiztions 
--Please don't delete old quereies u can select and run particluar query
-- work on your respective workspaces
-- if u delete table , delete the table which you created 
-- https://www.w3schools.com/sql/

--13 Aug 2021 LTU team
--To check ? Varchar lenght?

--Create TABLE LTU - slno, domain,un , pwd , email id ,
/*CREATE TABLE LTU_lOGIN_DETAILS 
( SlNo int, DomainName varchar(255),EmailId varchar(255),UserId varchar(255),UserName varchar(255), UserPassword varchar(255) );*/

--DROP TABLE LTU_lOGIN_DETAILS; -- Alert!!! don't use this in organiztions 



-- NOT NULL UNIQUE
--CREATE TABLE LTU_lOGIN_DETAILS ( DomainName varchar(225), DomainURL varchar(255) NOT NULL,UserId varchar(255) NOT NULL UNIQUE,UserPassword varchar(255) NOT NULL );



SELECT * FROM LTU_lOGIN_DETAILS;

INSERT INTO LTU_lOGIN_DETAILS (DomainName,DomainURL, UserId,UserPassword) 
VALUES ('OrangeHRM','https://opensource-demo.orangehrmlive.com/','Admin','admin123');

INSERT INTO LTU_lOGIN_DETAILS (DomainName,DomainURL, UserId,UserPassword) 
VALUES ('OPL','https://login.onepaperlane.org/users/login','oplqatest+wfadmin@gmail.com','P@rk002');



-- String Data Types on 14 Aug or Next  Session



