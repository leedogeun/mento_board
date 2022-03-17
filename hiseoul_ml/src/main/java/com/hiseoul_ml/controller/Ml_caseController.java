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

import com.hiseoul_ml.model.Ml_case;
import com.hiseoul_ml.model.Result;
import com.hiseoul_ml.repositories.Ml_caseRepository;
import com.hiseoul_ml.service.Ml_caseService;

@RestController
@RequestMapping(value = "restapi/ml")
public class Ml_caseController {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Ml_caseController.class);
	@Autowired
	Ml_caseRepository repository;

	@Autowired
	Ml_caseService mlcaseService;

	@GetMapping
	public Result retrieveMl_caseList() {
		Result result = mlcaseService.retrieveMl_caseList();
		return result;
	}

	@GetMapping("{mlCaseUuid}")
	public Result retrieveMl_case(@PathVariable String mlCaseUuid) {
		Result result = mlcaseService.retrieveMl_case(mlCaseUuid);
		return result;
	}
	
	@GetMapping("find/{Uuid}")
	public Result findUuid(@PathVariable String Uuid) {
		Result result = mlcaseService.findUuid(Uuid);
		return result;
	}

	@PostMapping
	public Result createMl_case(@ModelAttribute Ml_case ml_case) {
		Result result = mlcaseService.createMl_case(ml_case);
		return result;
	}

	@PutMapping
	public Result updateMl_case(@ModelAttribute Ml_case ml_case) {
		Result result = mlcaseService.updateMl_case(ml_case);
		return result;
	}

	@DeleteMapping
	public Result deleteMl_case(@RequestParam String mlCaseUuid) {
		Result result = mlcaseService.deleteMl_case(mlCaseUuid);
		return result;
	}

}