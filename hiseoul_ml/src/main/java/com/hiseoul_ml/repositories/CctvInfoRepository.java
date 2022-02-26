package com.hiseoul_ml.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiseoul_ml.model.Cctv_info;

@Repository
public interface CctvInfoRepository extends JpaRepository<Cctv_info, String> {
	public List<Cctv_info> findAllByOrderByCctvUuidDesc();

}