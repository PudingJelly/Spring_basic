create table snsboard (
	bno int primary key auto_increment,
    writer varchar(50) not null,
    upload_path varchar(100) not null,
    file_loca varchar(100) not null,
    file_name varchar(50) not null,
    file_real_name varchar(50) not null,
    content varchar(2000),
    reg_date datetime default current_timestamp
);