package com.hiseoul_ml.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hiseoul_ml.model.Board;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
	public List<Board> findAllByOrderByBoardnoDesc();
}