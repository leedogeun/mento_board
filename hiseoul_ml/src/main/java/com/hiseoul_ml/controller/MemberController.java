package com.hiseoul_ml.controller;

import org.apache.logging.log4j.LogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.hiseoul_ml.model.Member;
import com.hiseoul_ml.model.Result;
import com.hiseoul_ml.repositories.MemberRepository;
import com.hiseoul_ml.service.MemberService;

@RestController
@RequestMapping(value = "restapi/member")
public class MemberController {
	private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(MemberController.class);
	@Autowired
	MemberRepository repository;

	@Autowired
	MemberService memberService;

	@GetMapping
	public Result retrieveMemberList() {
		Result result = memberService.retrieveMemberList();
		return result;
	}

	@GetMapping("{no}")
	public Result retrieveMember(@PathVariable int no) {
		Result result = memberService.retrieveMember(no);
		return result;
	}

	@PostMapping
	public Result createMember(@ModelAttribute Member member) {
		Result result = memberService.createMember(member);
		return result;
	}

	@PutMapping
	public Result updateMember(@ModelAttribute Member member) {
		Result result = memberService.updateMember(member);
		return result;
	}

	@DeleteMapping
	public Result deleteMember(@RequestParam int no) {
		Result result = memberService.deleteMember(no);
		return result;
	}

}