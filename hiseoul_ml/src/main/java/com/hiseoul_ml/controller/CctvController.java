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
import com.hiseoul_ml.model.Cctv_info;
import com.hiseoul_ml.model.Result;
import com.hiseoul_ml.repositories.CctvInfoRepository;
import com.hiseoul_ml.service.Cctv_infoService;

@RestController
@RequestMapping(value = "restapi/cctv")
public class CctvController {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(CctvController.class);
	@Autowired
	CctvInfoRepository repository;

	@Autowired
	Cctv_infoService cctvService;

	@GetMapping
	public Result retrieveCctvinfoList() {
		Result result = cctvService.retrieveCctvinfoList();
		return result;
	}

	@GetMapping("{cctvUuid}")
	public Result retrieveCctvinfo(@PathVariable String cctvUuid) {
		Result result = cctvService.retrieveCctvinfo(cctvUuid);
		return result;
	}

	@PostMapping
	public Result createCctvinfo(@ModelAttribute Cctv_info cctvinfo) {
		Result result = cctvService.createCctvinfo(cctvinfo);
		return result;
	}

	@PutMapping
	public Result updateCctvinfo(@ModelAttribute Cctv_info cctvinfo) {
		Result result = cctvService.updateCctvinfo(cctvinfo);
		return result;
	}

	@DeleteMapping
	public Result deleteCctvinfo(@RequestParam String cctvUuid) {
		Result result = cctvService.deleteCctvinfo(cctvUuid);
		return result;
	}

}