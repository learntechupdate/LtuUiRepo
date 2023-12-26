--CREATE TABLE RIYAZ_lOGIN_DETAILS ( DomainName varchar(225), DomainURL varchar(255) NOT NULL,UserId varchar(255) NOT NULL UNIQUE,UserPassword varchar(255) NOT NULL );

INSERT INTO RIYAZ_lOGIN_DETAILS (DomainName,DomainURL, UserId,UserPassword) 
VALUES ('OrangeHRM','https://opensource-demo.orangehrmlive.com/','Admin','admin123');

INSERT INTO RIYAZ_lOGIN_DETAILS (DomainName,DomainURL, UserId,UserPassword) 
VALUES ('OPL','https://login.onepaperlane.org/users/login','oplqatest+wfadmin@gmail.com','P@rk002');

SELECT * FROM RIYAZ_lOGIN_DETAILS;

SELECT T1.domainname
FROM LTU_lOGIN_DETAILS T1, riyaz_login_details T2
WHERE T1.userid=t2.userid
ORDER BY desc;

