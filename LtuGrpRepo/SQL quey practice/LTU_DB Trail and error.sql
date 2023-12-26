--Please don't delete old quereies u can select and run particluar query
-- work on your respective workspaces

-- xxxxxxxxxxxxxxxxxxxxxxxxLTUxxxxxxxxxxxxxxxxxxx

-- 12 Aug 21
/*CREATE TABLE EXTN_LTU (
    ID int NOT NULL PRIMARY KEY,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int
);
*/

SELECT * FROM EXTN_LTU;

--INSERT INTO EXTN_LTU(ID,LastName,AGE) VALUES (1001,'ltu1',32);

--UPDATE EXTN_LTU SET firstname='LearnTechUpgrade1001' WHERE id='1000';

--Update extn_ltu set firstname='LearnNew' where lastname like '%ltu%';

Select * from EXTN_QAS;
Select * from EXTN_PERSONS;

Select ft.id,ft.firstname,ft.address,st.age From EXTN_QAS FT, EXTN_PERSONS ST Where FT.ID=st.id AND ST.ID = 101;
Select ft.id,ft.firstname,ft.address,st.age From EXTN_QAS FT, EXTN_PERSONS ST Where FT.ID=st.id;

Select * from EXTN_QAS;
Select * from EXTN_PERSONS;
Select * from customers;

-- _______________________________________________________________________



-- xxxxxxxxxxxxxx----Riyaz practice work space------xxxxxxxxxxxxxxxxx

/*CREATE TABLE EXTN_QAS (
    id int,
    FirstName varchar(255),
    LastName varchar(255),
    Address varchar(255),
    City varchar(255)
);*/


Select T1.ID,T2.City,T2.Address from EXTN_PERSONS T1, EXTN_QAS T2 where T1.ID=T2.ID;

-- task insert date - employee table (org ltu ), join date and leaving date 
-- 

-- _____________________________________________________________________




-- xxxxxxxxxxxxxx----Soma practice work space------xxxxxxxxxxxxxxxxx

-- ________________________________________________________________


-- xxxxxxxxxxxxxx----Touheed practice work space------xxxxxxxxxxxxxxxxx
--by LTU on 11 Aug 2021
/*
CREATE TABLE EXTN_PERSONS (
    ID int NOT NULL UNIQUE,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int
);
*/

SELECT * FROM EXTN_PERSONS;
--INSERT INTO EXTN_Persons (ID,LastName,FirstName,Age) values (111,'Aslam1','Touhee1d',31);


-- Data inserstion
--INSERT INTO EXTN_QAS (id,FirstName,LastName,Address,City) values (103,'LTU3','Team3','Online learling3 ','Web Github3');


--update data
--UPDATE EXTN_QAS SET city='Himalya' where id=103;

--Interview question: Single join query to find Address and age person using Tables QAS & EXTN_PERSONS
select FT.ID,FT.address,ST.age from EXTN_QAS FT,EXTN_PERSONS ST where FT.ID=ST.ID AND FT.ID=101; -- FT and ST are alias 
--contains
select * from EXTN_QAS where address like '%Online%';
--multiple conditions
select * from EXTN_QAS where FIRSTNAME IN ('LTU','Touheed');

-- ______________________________________________________


