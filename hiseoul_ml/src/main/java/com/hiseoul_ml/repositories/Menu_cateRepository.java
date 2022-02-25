package com.hiseoul_ml.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hiseoul_ml.model.Menu_cate;

@Repository
public interface Menu_cateRepository extends JpaRepository<Menu_cate, Integer> {
	public List<Menu_cate> findAllByOrderByCate_noDesc();

}