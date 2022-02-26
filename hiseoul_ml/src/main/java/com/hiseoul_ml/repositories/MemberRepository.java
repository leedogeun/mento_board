package com.hiseoul_ml.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hiseoul_ml.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
	public List<Member> findAllByOrderByNoDesc();

}