package com.hiseoul_ml.service;

import com.hiseoul_ml.model.Menu_cate;
import com.hiseoul_ml.model.Result;

public interface Menu_cateService {
	public Result createMenu_cate(Menu_cate menu_cate);

	public Result retrieveMenu_cateList();

	public Result retrieveMenu_cate(int no);

	public Result updateMenu_cate(Menu_cate menu_cate);

	public Result deleteMenu_cate(int no);
}