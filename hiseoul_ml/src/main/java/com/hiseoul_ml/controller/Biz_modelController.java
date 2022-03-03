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
import com.hiseoul_ml.model.Biz_model;
import com.hiseoul_ml.model.Result;
import com.hiseoul_ml.repositories.Biz_modelRepository;
import com.hiseoul_ml.service.Biz_modelService;

@RestController
@RequestMapping(value = "restapi/biz")
public class Biz_modelController {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Biz_modelController.class);
	@Autowired
	Biz_modelRepository repository;

	@Autowired
	Biz_modelService bizService;

	@GetMapping
	public Result retrieveBiz_modelList() {
		Result result = bizService.retrieveBiz_modelList();
		return result;
	}

	@GetMapping("{bizModelUuid}")
	public Result retrieveBiz_model(@PathVariable String bizModelUuid) {
		Result result = bizService.retrieveBiz_model(bizModelUuid);
		return result;
	}

	@PostMapping
	public Result createBiz_model(@ModelAttribute Biz_model biz_model) {
		Result result = bizService.createBiz_model(biz_model);
		return result;
	}

	@PutMapping
	public Result updateBiz_model(@ModelAttribute Biz_model biz_model) {
		Result result = bizService.updateBiz_model(biz_model);
		return result;
	}

	@DeleteMapping
	public Result deleteBiz_model(@RequestParam String bizModelUuid) {
		Result result = bizService.deleteBiz_model(bizModelUuid);
		return result;
	}

}