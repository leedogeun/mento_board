package com.hiseoul_ml.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiseoul_ml.enumpkg.ServiceResult;
import com.hiseoul_ml.model.Cctv_info;
import com.hiseoul_ml.model.ErrorResponse;
import com.hiseoul_ml.model.Result;
import com.hiseoul_ml.repositories.CctvInfoRepository;

@Service
public class CctvInfoServiceImpl implements Cctv_infoService {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(CctvInfoServiceImpl.class);
	@Autowired
	CctvInfoRepository repository;

	@Override
	public Result updateCctvinfo(Cctv_info cctvinfo) {
		Optional<Cctv_info> search = repository.findById(cctvinfo.getCctvUuid());
		Result result = new Result();
		if (search.isPresent()) {
			cctvinfo = repository.save(cctvinfo);
			result.setPayload(cctvinfo);
		} else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}

	public Result deleteCctvinfo(String cctv_uuid) {
		Result result = new Result();
		boolean isPresent = repository.findById(cctv_uuid).isPresent();
		if (!isPresent) {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		} else {
			repository.deleteById(cctv_uuid);
		}
		return result;
	}

	@Override
	public Result createCctvinfo(Cctv_info cctvinfo) {
		cctvinfo = repository.save(cctvinfo);
		Result result = new Result();
		result.setPayload(cctvinfo);
		return result;
	}

	@Override
	public Result retrieveCctvinfoList() {
		List<Cctv_info> list = repository.findAllByOrderByCctvUuidDesc();
		Result result = new Result();
		result.setPayload(list);
		return result;
	}

	@Override
	public Result retrieveCctvinfo(String cctv_uuid) {
		Optional<Cctv_info> optionalBoard = repository.findById(cctv_uuid);
		Result result = new Result();
		if (optionalBoard.isPresent()) {
			result.setPayload(optionalBoard.get());
		} else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}
}