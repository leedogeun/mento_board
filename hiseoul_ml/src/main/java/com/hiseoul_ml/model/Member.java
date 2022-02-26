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
@Table(name = "tb_member")
@Getter
@Setter
@ToString
public class Member {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer no;
	private String id;
	private String pass;
	private String name;
	private String email;
	private String instance_yn;
	private Timestamp write_date;
	private Timestamp up_date;
	private String active_yn;
	private Integer permission;
	private Integer auth;

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getInstance_yn() {
		return instance_yn;
	}

	public void setInstance_yn(String instance_yn) {
		this.instance_yn = instance_yn;
	}

	public Timestamp getWrite_date() {
		return write_date;
	}

	public void setWrite_date(Timestamp write_date) {
		this.write_date = write_date;
	}

	public Timestamp getUp_date() {
		return up_date;
	}

	public void setUp_date(Timestamp up_date) {
		this.up_date = up_date;
	}

	public String getActive_yn() {
		return active_yn;
	}

	public void setActive_yn(String active_yn) {
		this.active_yn = active_yn;
	}

	public Integer getPermission() {
		return permission;
	}

	public void setPermission(Integer permission) {
		this.permission = permission;
	}

	public Integer getAuth() {
		return auth;
	}

	public void setAuth(Integer auth) {
		this.auth = auth;
	}

}
