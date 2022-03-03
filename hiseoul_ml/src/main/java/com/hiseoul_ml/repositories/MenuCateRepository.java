package com.hiseoul_ml.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hiseoul_ml.model.MenuCate;

@Repository
public interface MenuCateRepository extends JpaRepository<MenuCate, Integer> {
	public List<MenuCate> findAllByOrderByCateNoDesc();

}