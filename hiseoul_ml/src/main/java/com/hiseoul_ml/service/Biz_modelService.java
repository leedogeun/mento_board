package com.hiseoul_ml.service;

import com.hiseoul_ml.model.Biz_model;
import com.hiseoul_ml.model.Result;

public interface Biz_modelService {
	public Result createBiz_model(Biz_model biz_model);

	public Result retrieveBiz_modelList();

	public Result retrieveBiz_model(String bizModelUuid);

	public Result updateBiz_model(Biz_model biz_model);

	public Result deleteBiz_model(String bizModelUuid);
}