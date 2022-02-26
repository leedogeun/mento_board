package com.hiseoul_ml.model;

import java.security.Timestamp;
import java.sql.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.crypto.Data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_cctv_info")
@Getter
@Setter
@ToString
public class Cctv_info {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "cctv_uuid")
	private String cctvUuid;

	private String cctv_name;
	private String cctv_type;
	private String cctv_model;
	private String cctv_product_company;
	private String cctv_resolution;
	private String cctv_marker;
	private Date cctv_write_date;
	private Date cctv_update_date;
	private String cctv_use_yn;
	private String cctv_active_status;

	public String getCctvUuid() {
		return cctvUuid;
	}

	public void setCctvUuid(String cctvUuid) {
		this.cctvUuid = cctvUuid;
	}

	public String getCctv_name() {
		return cctv_name;
	}

	public void setCctv_name(String cctv_name) {
		this.cctv_name = cctv_name;
	}

	public String getCctv_type() {
		return cctv_type;
	}

	public void setCctv_type(String cctv_type) {
		this.cctv_type = cctv_type;
	}

	public String getCctv_model() {
		return cctv_model;
	}

	public void setCctv_model(String cctv_model) {
		this.cctv_model = cctv_model;
	}

	public String getCctv_product_company() {
		return cctv_product_company;
	}

	public void setCctv_product_company(String cctv_product_company) {
		this.cctv_product_company = cctv_product_company;
	}

	public String getCctv_resolution() {
		return cctv_resolution;
	}

	public void setCctv_resolution(String cctv_resolution) {
		this.cctv_resolution = cctv_resolution;
	}

	public String getCctv_marker() {
		return cctv_marker;
	}

	public void setCctv_marker(String cctv_marker) {
		this.cctv_marker = cctv_marker;
	}


	public Date getCctv_write_date() {
		return cctv_write_date;
	}

	public void setCctv_write_date(Date cctv_write_date) {
		this.cctv_write_date = cctv_write_date;
	}

	public Date getCctv_update_date() {
		return cctv_update_date;
	}

	public void setCctv_update_date(Date cctv_update_date) {
		this.cctv_update_date = cctv_update_date;
	}

	public String getCctv_use_yn() {
		return cctv_use_yn;
	}

	public void setCctv_use_yn(String cctv_use_yn) {
		this.cctv_use_yn = cctv_use_yn;
	}

	public String getCctv_active_status() {
		return cctv_active_status;
	}

	public void setCctv_active_status(String cctv_active_status) {
		this.cctv_active_status = cctv_active_status;
	}

}
