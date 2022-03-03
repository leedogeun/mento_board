package com.hiseoul_ml.service;

import com.hiseoul_ml.model.MenuCate;
import com.hiseoul_ml.model.Result;

public interface MenuCateService {
	public Result createMenu_cate(MenuCate menu_cate);

	public Result retrieveMenu_cateList();

	public Result retrieveMenu_cate(int no);

	public Result updateMenu_cate(MenuCate menu_cate);

	public Result deleteMenu_cate(int no);
}