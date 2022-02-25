package com.hiseoul_ml.service;

import com.hiseoul_ml.model.Member;
import com.hiseoul_ml.model.Result;

public interface MemberService {
	public Result createMember(Member member);

	public Result retrieveMemberList();

	public Result retrieveMember(int no);

	public Result updateMember(Member member);

	public Result deleteMember(int no);
}