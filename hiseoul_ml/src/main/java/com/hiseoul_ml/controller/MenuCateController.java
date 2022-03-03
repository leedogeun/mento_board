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
import com.hiseoul_ml.model.MenuCate;
import com.hiseoul_ml.model.Result;
import com.hiseoul_ml.repositories.MenuCateRepository;
import com.hiseoul_ml.service.MenuCateService;

@RestController
@RequestMapping(value = "restapi/menu")
public class MenuCateController {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(MenuCateController.class);
	@Autowired
	MenuCateRepository repository;

	@Autowired
	MenuCateService menucateService;

	@GetMapping
	public Result retrieveMenu_cateList() {
		Result result = menucateService.retrieveMenu_cateList();
		return result;
	}

	@GetMapping("{no}")
	public Result retrieveMenu_cate(@PathVariable int no) {
		Result result = menucateService.retrieveMenu_cate(no);
		return result;
	}

	@PostMapping
	public Result createMenu_cate(@ModelAttribute MenuCate menu_cate) {
		Result result = menucateService.createMenu_cate(menu_cate);
		return result;
	}

	@PutMapping
	public Result updateMenu_cate(@ModelAttribute MenuCate menu_cate) {
		Result result = menucateService.updateMenu_cate(menu_cate);
		return result;
	}

	@DeleteMapping
	public Result deleteMenu_cate(@RequestParam int no) {
		Result result = menucateService.deleteMenu_cate(no);
		return result;
	}

}