package com.hiseoul_ml.service;

import com.hiseoul_ml.model.Board;
import com.hiseoul_ml.model.Result;

public interface BoardService {
	public Result createBoard(Board board);

	public Result retrieveBoardList();

	public Result retrieveBoard(int no);

	public Result updateBoard(Board board);

	public Result deleteBoard(int no);
}