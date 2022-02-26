package com.hiseoul_ml.model;

import java.security.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_biz_model")
@Getter
@Setter
@ToString
public class Biz_model {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "biz_model_uuid")
	private String biz_model_uuid;
	
	private String biz_model_name;
	private String biz_model_type;
	private String biz_model_contents;
	private Timestamp biz_model_write_date;
	private Timestamp biz_model_update_date;
	private String biz_model_use_yn;

	public String getBiz_model_uuid() {
		return biz_model_uuid;
	}

	public void setBiz_model_uuid(String biz_model_uuid) {
		this.biz_model_uuid = biz_model_uuid;
	}

	public String getBiz_model_name() {
		return biz_model_name;
	}

	public void setBiz_model_name(String biz_model_name) {
		this.biz_model_name = biz_model_name;
	}

	public String getBiz_model_type() {
		return biz_model_type;
	}

	public void setBiz_model_type(String biz_model_type) {
		this.biz_model_type = biz_model_type;
	}

	public String getBiz_model_contents() {
		return biz_model_contents;
	}

	public void setBiz_model_contents(String biz_model_contents) {
		this.biz_model_contents = biz_model_contents;
	}

	public Timestamp getBiz_model_write_date() {
		return biz_model_write_date;
	}

	public void setBiz_model_write_date(Timestamp biz_model_write_date) {
		this.biz_model_write_date = biz_model_write_date;
	}

	public Timestamp getBiz_model_update_date() {
		return biz_model_update_date;
	}

	public void setBiz_model_update_date(Timestamp biz_model_update_date) {
		this.biz_model_update_date = biz_model_update_date;
	}

	public String getBiz_model_use_yn() {
		return biz_model_use_yn;
	}

	public void setBiz_model_use_yn(String biz_model_use_yn) {
		this.biz_model_use_yn = biz_model_use_yn;
	}

}
