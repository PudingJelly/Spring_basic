create database spring;
create user 'spring@localhost' identified by 'spring';
grant all privileges on spring.* to 'spring'@'localhost';

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

##마이페이지 구현을 위한 테이블 조인 및 조회
select
	user_name, user_phone1, user_phone2,
    user_email1, user_email2,
    addr_basic, addr_detail, addr_zip_num,
    f.bno,
    f.title,
    f.reg_date
from users u
left join freeboard f
on u.user_id = f.writer
where u.user_id = 'abc1234'
order by f.bno desc
limit 0, 10;


##댓글구현 테이블 제작

create table freereply(
	rno int primary key auto_increment,
    bno	int,
    
    foreign key (bno)
    references freeboard(bno)
    on delete cascade, ##원본글이 지워지면 그에 달린 댓글들도 전부 지워 버리겠다.
    
    reply varchar(1000),
    reply_id varchar(50),
    reply_pw varchar(50),
    reply_date datetime default current_timestamp,
    update_date datetime default null
);

update freereply
set update_date = '2023-05-24 00:00:00'
where rno = 2;





