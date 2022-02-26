package com.hiseoul_ml.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiseoul_ml.model.Biz_model;



@Repository
public interface Biz_modelRepository extends JpaRepository<Biz_model, String> {
	public List<Biz_model> findAllByOrderByBizModelUuidDesc();
}