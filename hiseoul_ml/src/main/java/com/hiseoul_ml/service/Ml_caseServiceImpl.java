package com.hiseoul_ml.service;

import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hiseoul_ml.enumpkg.ServiceResult;
import com.hiseoul_ml.model.ErrorResponse;
import com.hiseoul_ml.model.Ml_case;
import com.hiseoul_ml.model.Result;
import com.hiseoul_ml.repositories.Ml_caseRepository;

@Service
public class Ml_caseServiceImpl implements Ml_caseService {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Ml_caseServiceImpl.class);
	@Autowired
	Ml_caseRepository repository;

	@Override
	public Result createMl_case(Ml_case ml_case) {
		ml_case = repository.save(ml_case);
		Result result = new Result();
		result.setPayload(ml_case);
		return result;
	}

	@Override
	public Result findUuid(String Uuid) {
//		List<Ml_case> list = repository.findAllByUuid(Uuid);
//		Result result = new Result();
//		result.setPayload(list);
//		return result;
		return null;
	}

	@Override
	public Result retrieveMl_caseList() {
		List<Ml_case> list = repository.findAllByOrderByMlCaseUuidDesc();
		Result result = new Result();
		result.setPayload(list);
		return result;
	}

	@Override
	public Result retrieveMl_case(String ml_case_uuid) {
		Optional<Ml_case> optionalBoard = repository.findById(ml_case_uuid);
		Result result = new Result();
		if (optionalBoard.isPresent()) {
			result.setPayload(optionalBoard.get());
		} else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}

	@Override
	public Result updateMl_case(Ml_case ml_case) {
		Optional<Ml_case> search = repository.findById(ml_case.getMlCaseCctvUuid());
		Result result = new Result();
		if (search.isPresent()) {
			ml_case = repository.save(ml_case);
			result.setPayload(ml_case);
		} else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}

	@Override
	public Result deleteMl_case(String ml_case_uuid) {
		Result result = new Result();
		boolean isPresent = repository.findById(ml_case_uuid).isPresent();
		if (!isPresent) {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		} else {
			repository.deleteById(ml_case_uuid);
		}
		return result;
	}

}