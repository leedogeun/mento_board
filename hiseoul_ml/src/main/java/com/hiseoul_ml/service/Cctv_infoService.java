package com.hiseoul_ml.service;

import com.hiseoul_ml.model.Cctv_info;
import com.hiseoul_ml.model.Result;

public interface Cctv_infoService {
	public Result createCctvinfo(Cctv_info cctvinfo);

	public Result retrieveCctvinfoList();

	public Result retrieveCctvinfo(String cctv_uuid);

	public Result updateCctvinfo(Cctv_info cctvinfo);

	public Result deleteCctvinfo(String cctv_uuid);
}