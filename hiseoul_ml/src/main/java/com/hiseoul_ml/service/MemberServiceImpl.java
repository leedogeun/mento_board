package com.hiseoul_ml.service;

import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hiseoul_ml.enumpkg.ServiceResult;
import com.hiseoul_ml.model.ErrorResponse;
import com.hiseoul_ml.model.Member;
import com.hiseoul_ml.model.Result;
import com.hiseoul_ml.repositories.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(MemberServiceImpl.class);
	@Autowired
	MemberRepository repository;

	@Override
	public Result createMember(Member member) {
		member = repository.save(member);
		Result result = new Result();
		result.setPayload(member);
		return result;
	}

	@Override
	public Result retrieveMemberList() {
		List<Member> list = repository.findAllByOrderBynoDesc();
		Result result = new Result();
		result.setPayload(list);
		return result;
	}

	@Override
	public Result retrieveMember(int no) {
		Optional<Member> optionalBoard = repository.findById(no);
		Result result = new Result();
		if (optionalBoard.isPresent()) {
			result.setPayload(optionalBoard.get());
		} else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}

	@Override
	public Result updateMember(Member member) {
		Optional<Member> search = repository.findById(member.getNo());
		Result result = new Result();
		if (search.isPresent()) {
			member = repository.save(member);
			result.setPayload(member);
		} else {
			result.setError(new ErrorResponse(ServiceResult.NOTEXIST.toString()));
		}
		return result;
	}

	@Override
	public Result deleteMember(int no) {
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