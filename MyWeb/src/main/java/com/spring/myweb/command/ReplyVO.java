package com.spring.myweb.command;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
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
 */
@Getter
@Setter
@ToString
public class ReplyVO {

	private int rno;
	private int bno;
	
	private String reply;
	private String replyId;
	private String replyPw;
	private LocalDateTime replyDate;
	private LocalDateTime updateDate;
	
}
