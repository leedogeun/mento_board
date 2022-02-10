package com.hiseoul_ml.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="chez_board")
@Getter
@Setter
@ToString
public class Board{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer boardno;
	private String title;
	private String contents;
	private String writer;
	public String getContent() {
		return contents;
	}
	public void setBoardno(Integer boardno) {
		this.boardno = boardno;
	}
	public Integer getBoardno() {
		return boardno;
	}
	public void setContent(String content) {
		this.contents = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer =writer;
	}
}
