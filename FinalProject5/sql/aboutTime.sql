CREATE TABLE MEMBER(
email varchar2(30) constraint member_email_pk primary key,
pw varchar2(30),
name varchar2(15));

INSERT INTO MEMBER VALUES('about', 'time', '이현우');
