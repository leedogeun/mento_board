package com.hiseoul_ml.model;

import java.security.Timestamp;
import java.util.UUID;

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
@Table(name = "tb_ml_case")
@Getter
@Setter
@ToString
public class Ml_case {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
		
	@Column(name = "ml_case_uuid")
	UUID mlcaseuuid;
	private String ml_case_uuid;
	
	@Column(name = "ml_case_region_uuid")
	UUID ml_caseregionuuid;
	private String ml_case_region_uuid;
	
	@Column(name = "ml_case_cctv_uuid")
	UUID ml_casecctvuuid;
	private String ml_case_cctv_uuid;
	
	@Column(name = "ml_case_biz_model_uuid")
	UUID mlcasebizmodeluuid;
	private String ml_case_biz_model_uuid;
	
	private String ml_case_name;
	private String ml_case_type;
	private String ml_case_count;
	private String ml_case_pre_count;
	private String ml_case_ml_number;
	private Timestamp ml_case_write_date;
	private Timestamp ml_case_update_date;
	private String ml_case_use_yn;

	public String getMl_case_uuid() {
		return ml_case_uuid;
	}

	public void setMl_case_uuid(String ml_case_uuid) {
		this.ml_case_uuid = ml_case_uuid;
	}

	public String getMl_case_region_uuid() {
		return ml_case_region_uuid;
	}

	public void setMl_case_region_uuid(String ml_case_region_uuid) {
		this.ml_case_region_uuid = ml_case_region_uuid;
	}

	public String getMl_case_cctv_uuid() {
		return ml_case_cctv_uuid;
	}

	public void setMl_case_cctv_uuid(String ml_case_cctv_uuid) {
		this.ml_case_cctv_uuid = ml_case_cctv_uuid;
	}

	public String getMl_case_biz_model_uuid() {
		return ml_case_biz_model_uuid;
	}

	public void setMl_case_biz_model_uuid(String ml_case_biz_model_uuid) {
		this.ml_case_biz_model_uuid = ml_case_biz_model_uuid;
	}

	public String getMl_case_name() {
		return ml_case_name;
	}

	public void setMl_case_name(String ml_case_name) {
		this.ml_case_name = ml_case_name;
	}

	public String getMl_case_type() {
		return ml_case_type;
	}

	public void setMl_case_type(String ml_case_type) {
		this.ml_case_type = ml_case_type;
	}

	public String getMl_case_count() {
		return ml_case_count;
	}

	public void setMl_case_count(String ml_case_count) {
		this.ml_case_count = ml_case_count;
	}

	public String getMl_case_pre_count() {
		return ml_case_pre_count;
	}

	public void setMl_case_pre_count(String ml_case_pre_count) {
		this.ml_case_pre_count = ml_case_pre_count;
	}

	public String getMl_case_ml_number() {
		return ml_case_ml_number;
	}

	public void setMl_case_ml_number(String ml_case_ml_number) {
		this.ml_case_ml_number = ml_case_ml_number;
	}

	public Timestamp getMl_case_write_date() {
		return ml_case_write_date;
	}

	public void setMl_case_write_date(Timestamp ml_case_write_date) {
		this.ml_case_write_date = ml_case_write_date;
	}

	public Timestamp getMl_case_update_date() {
		return ml_case_update_date;
	}

	public void setMl_case_update_date(Timestamp ml_case_update_date) {
		this.ml_case_update_date = ml_case_update_date;
	}

	public String getMl_case_use_yn() {
		return ml_case_use_yn;
	}

	public void setMl_case_use_yn(String ml_case_use_yn) {
		this.ml_case_use_yn = ml_case_use_yn;
	}

}
