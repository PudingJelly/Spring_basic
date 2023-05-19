
# 해당 계정이 어떤 데이터베이스를 사용할 지 명시하는 문장
use spring;

CREATE TABLE scores(
	stu_id INT PRIMARY KEY auto_increment,
    stu_name VARCHAR(30) NOT NULL,
    kor INT DEFAULT(0),
	eng INT DEFAULT(0),
    math INT DEFAULT(0),
    total INT DEFAULT(0),
    average DECIMAL(5, 2)
);

create table jdbc_board(
	board_no int primary key auto_increment,
    writer varchar(30) not null,
    title varchar(100) not null,
    content varchar(2000),
    reg_date datetime default current_timestamp 
);

create table freeboard(
	bno int primary key auto_increment,
    title varchar(30) not null,
    writer varchar(50) not null,
    content varchar(3000) not null,
    reg_date datetime default current_timestamp,
    update_date datetime default null
);

select * from freeboard;

select count(*) from freeboard;

select * from freeboard
order by bno desc
limit 30, 10;
# (page-1) * cpp

create table users (
	user_id varchar(50) primary key,
    user_pw varchar(50) not null,
    user_name varchar(50) not null,
    user_phone1 varchar(50),
    user_phone2 varchar(50),
    user_email1 varchar(50),
    user_email2 varchar(50),
    addr_basic varchar(300),
    addr_detail varchar(300),
    addr_zip_num varchar(50),
    reg_date datetime default current_timestamp
);

drop table users;











