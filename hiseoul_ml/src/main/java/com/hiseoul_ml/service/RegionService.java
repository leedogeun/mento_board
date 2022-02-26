package com.hiseoul_ml.service;

import com.hiseoul_ml.model.Region;
import com.hiseoul_ml.model.Result;

public interface RegionService {
	public Result createRegion(Region region);

	public Result retrieveRegionList();

	public Result retrieveRegion(String regionUuid);

	public Result updateRegion(Region region);

	public Result deleteRegion(String regionUuid);
}