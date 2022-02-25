package com.hiseoul_ml.service;

import com.hiseoul_ml.model.Ml_case;
import com.hiseoul_ml.model.Result;

public interface Ml_caseService {
	public Result createMl_case(Ml_case ml_case);

	public Result retrieveMl_caseList();

	public Result retrieveMl_case(String ml_case_uuid);

	public Result updateMl_case(Ml_case ml_case);

	public Result deleteMl_case(String ml_case_uuid);
}