package com.hiseoul_ml.service;

import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hiseoul_ml.enumpkg.ServiceResult;
import com.hiseoul_ml.model.ErrorResponse;
import com.hiseoul_ml.model.Member;
import com.hiseoul_ml.model.MenuCate;
import com.hiseoul_ml.model.Result;
import com.hiseoul_ml.repositories.MemberRepository;
import com.hiseoul_ml.repositories.MenuCateRepository;

@Service
public class MenuCateServiceImpl implements MenuCateService {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(MenuCateServiceImpl.class);
	@Autowired
	MenuCateRepository repository;

	@Override
	public Result createMenu_cate(MenuCate menu_cate) {
		menu_cate = repository.save(menu_cate);
		Result result = new Result();
		result.setPayload(menu_cate);
		return result;
	}

	@Override
	public Result retrieveMenu_cateList() {
		List<MenuCate> list = repository.findAllByOrderByCateNoDesc();
		Result result = new Result();
		result.setPayload(list);
		return result;
	}

	@Override
	public Result retrieveMenu_cate(int no) {
		Optional<MenuCate> optionalBoard = repository.findById(no);
		Result result = new Result();
		if (optionalBoard.isPresent()) {
			result.setPayload(optionalBoard.get());
		} else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}

	@Override
	public Result updateMenu_cate(MenuCate menu_cate) {
		Optional<MenuCate> search = repository.findById(menu_cate.getCateNo());
		Result result = new Result();
		if (search.isPresent()) {
			menu_cate = repository.save(menu_cate);
			result.setPayload(menu_cate);
		} else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}

	@Override
	public Result deleteMenu_cate(int no) {
		Result result = new Result();
		boolean isPresent = repository.findById(no).isPresent();
		if (!isPresent) {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		} else {
			repository.deleteById(no);
		}
		return result;
	}

}