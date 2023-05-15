package com.spring.myweb.command;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 create table freeboard(
	bno int primary key auto_increment,
    title varchar(30) not null,
    writer varchar(50) not null,
    content varchar(3000) not null,
    reg_date datetime default current_timestamp,
    update_date datetime default null
);
 */

@Getter 
@Setter 
@ToString
public class FreeBoardVO {

	private int bno;
	private String title;
	private String writer;
	private String content;
	private LocalDateTime regDate;
	private LocalDateTime updateDate;
	
}
