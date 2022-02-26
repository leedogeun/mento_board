package com.hiseoul_ml.service;

import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hiseoul_ml.enumpkg.ServiceResult;
import com.hiseoul_ml.model.Biz_model;
import com.hiseoul_ml.model.ErrorResponse;
import com.hiseoul_ml.model.Result;
import com.hiseoul_ml.repositories.Biz_modelRepository;

@Service
public class Biz_modelServiceImpl implements Biz_modelService {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Biz_modelServiceImpl.class);
	@Autowired
	Biz_modelRepository repository;

	@Override
	public Result createBiz_model(Biz_model biz_model) {
		biz_model = repository.save(biz_model);
		Result result = new Result();
		result.setPayload(biz_model);
		return result;
	}

	@Override
	public Result retrieveBiz_modelList() {
		List<Biz_model> list = repository.findAllByOrderByBizModelUuidDesc();
		Result result = new Result();
		result.setPayload(list);
		return result;
	}

	@Override
	public Result retrieveBiz_model(String biz_model_uuid) {
		Optional<Biz_model> optionalBoard = repository.findById(biz_model_uuid);
		Result result = new Result();
		if (optionalBoard.isPresent()) {
			result.setPayload(optionalBoard.get());
		} else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}

	@Override
	public Result updateBiz_model(Biz_model biz_model) {
		Optional<Biz_model> search = repository.findById(biz_model.getBizModelUuid());
		Result result = new Result();
		if (search.isPresent()) {
			biz_model = repository.save(biz_model);
			result.setPayload(biz_model);
		} else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}

	@Override
	public Result deleteBiz_model(String biz_model_uuid) {
		Result result = new Result();
		boolean isPresent = repository.findById(biz_model_uuid).isPresent();
		if (!isPresent) {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		} else {
			repository.deleteById(biz_model_uuid);
		}
		return result;
	}

}