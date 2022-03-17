package com.hiseoul_ml.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.hiseoul_ml.model.Ml_case;


@Repository
public interface Ml_caseRepository extends JpaRepository<Ml_case, String> {
	public List<Ml_case> findAllByOrderByMlCaseUuidDesc();
	
	
	/* 참조::
	@Query( "select id, name, password from User where name = :name" )
    public List<User> findUsersForName( @Param( "name" ) String name );
    
    https://www.codejava.net/frameworks/spring-boot/spring-data-jpa-filter-search-examples
	@Query("SELECT p FROM Product p WHERE CONCAT(p.name, p.brand, p.madein, p.price) LIKE %?1%")
	public List<Product> search(String keyword);
	
	*https://dev.to/fabiothiroki/setup-spring-and-postgres-for-full-text-search-4n97
	*/
	
	@Query("SELECT ml FROM tb_ml_case ml "
			+ " WHERE CONCAT(ml.ml_case_uuid, ml.ml_case_region_uuid, ml.ml_case_region_uuid, ml.ml_case_cctv_uuid, ml.ml_case_biz_model_uuid) = :Uuid")
	public List<Ml_case> findAllByUuid(@Param( "Uuid" )String Uuid);
}