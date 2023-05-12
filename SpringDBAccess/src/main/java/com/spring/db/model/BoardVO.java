package com.spring.db.model;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
 create table jdbc_board(
	board_no int primary key auto_increment,
    writer varchar(30) not null,
    title varchar(100) not null,
    content varchar(2000),
    reg_date datetime default current_timestamp 
);
 */



@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardVO {

	private int boardNo;
	private String writer;
	private String title;
	private String content;
	private LocalDateTime regDate;
	
}
