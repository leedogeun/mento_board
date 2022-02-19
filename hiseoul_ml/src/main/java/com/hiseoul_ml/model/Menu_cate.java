package com.hiseoul_ml.model;

import java.security.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_menu_cate")
@Getter
@Setter
@ToString
public class Menu_cate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer cate_no;
	private String menu_name;
	private String menu_perm;
	private String parant_no;
	private String uri;
	private String menu_use_yn;
	private Timestamp write_date;
	private Timestamp update_date;

	public Integer getCate_no() {
		return cate_no;
	}

	public void setCate_no(Integer cate_no) {
		this.cate_no = cate_no;
	}

	public String getMenu_name() {
		return menu_name;
	}

	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}

	public String getMenu_perm() {
		return menu_perm;
	}

	public void setMenu_perm(String menu_perm) {
		this.menu_perm = menu_perm;
	}

	public String getParant_no() {
		return parant_no;
	}

	public void setParant_no(String parant_no) {
		this.parant_no = parant_no;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getMenu_use_yn() {
		return menu_use_yn;
	}

	public void setMenu_use_yn(String menu_use_yn) {
		this.menu_use_yn = menu_use_yn;
	}

	public Timestamp getWrite_date() {
		return write_date;
	}

	public void setWrite_date(Timestamp write_date) {
		this.write_date = write_date;
	}

	public Timestamp getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Timestamp update_date) {
		this.update_date = update_date;
	}

}
