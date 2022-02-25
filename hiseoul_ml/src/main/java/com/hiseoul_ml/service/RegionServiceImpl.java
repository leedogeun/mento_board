package com.hiseoul_ml.service;

import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hiseoul_ml.enumpkg.ServiceResult;
import com.hiseoul_ml.model.ErrorResponse;
import com.hiseoul_ml.model.Region;
import com.hiseoul_ml.model.Result;
import com.hiseoul_ml.repositories.RegionRepository;

@Service
public class RegionServiceImpl implements RegionService {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(RegionServiceImpl.class);
	@Autowired
	RegionRepository repository;

	@Override
	public Result createRegion(Region region) {
		region = repository.save(region);
		Result result = new Result();
		result.setPayload(region);
		return result;
	}

	@Override
	public Result retrieveRegionList() {
		List<Region> list = repository.findAllByOrderByRegion_uuidDesc();
		Result result = new Result();
		result.setPayload(list);
		return result;
	}

	@Override
	public Result retrieveRegion(String region_uuid) {
		Optional<Region> optionalBoard = repository.findById(region_uuid);
		Result result = new Result();
		if (optionalBoard.isPresent()) {
			result.setPayload(optionalBoard.get());
		} else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}

	@Override
	public Result updateRegion(Region region) {
		Optional<Region> search = repository.findById(region.getRegion_uuid());
		Result result = new Result();
		if (search.isPresent()) {
			region = repository.save(region);
			result.setPayload(region);
		} else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}

	@Override
	public Result deleteRegion(String region_uuid) {
		Result result = new Result();
		boolean isPresent = repository.findById(region_uuid).isPresent();
		if (!isPresent) {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		} else {
			repository.deleteById(region_uuid);
		}
		return result;
	}

}