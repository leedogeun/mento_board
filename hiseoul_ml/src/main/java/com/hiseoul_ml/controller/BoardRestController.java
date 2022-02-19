package com.hiseoul_ml.controller;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hiseoul_ml.model.Board;
import com.hiseoul_ml.model.Result;
import com.hiseoul_ml.repositories.BoardRepository;
import com.hiseoul_ml.service.BoardService;

@RestController
@RequestMapping(value = "restapi/board")
public class BoardRestController {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(BoardRestController.class);
	@Autowired
	BoardRepository repository;

	@Autowired
	BoardService boardService;

	@GetMapping
	public Result retrieveBoardList() {
		Result result = boardService.retrieveBoardList();
		return result;
	}

	@GetMapping("{no}")
	public Result retrieveBoard(@PathVariable Integer no) {
		Result result = boardService.retrieveBoard(no);
		return result;
	}

	@PostMapping
	public Result createBoard(@ModelAttribute Board board) {
		Result result = boardService.createBoard(board);
		return result;
	}

	@PutMapping
	public Result updateBoard(@ModelAttribute Board board) {
		Result result = boardService.updateBoard(board);
		return result;
	}

	@DeleteMapping
	public Result deleteBoard(@RequestParam int no) {
		Result result = boardService.deleteBoard(no);
		return result;
	}

}