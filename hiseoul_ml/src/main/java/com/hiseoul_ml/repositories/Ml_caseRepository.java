package com.hiseoul_ml.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hiseoul_ml.model.Ml_case;


@Repository
public interface Ml_caseRepository extends JpaRepository<Ml_case, String> {
	public List<Ml_case> findAllByOrderByML_case_uuidDesc();

}