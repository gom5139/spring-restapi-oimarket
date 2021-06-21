package com.oimarket.oimarket_back.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oimarket.oimarket_back.model.Members;
import com.oimarket.oimarket_back.repository.MembersRepository;

@RestController
@RequestMapping("/members")
public class MembersController {
	
	static Logger logger = LoggerFactory.getLogger(MembersController.class);
	
	@Autowired
	private MembersRepository memberRepository;
	
	//회원 가입
	
	//회원 리스트 가져오기
	@GetMapping("/all")
	public List<Members> getAllMembers(){
		
		logger.info("!!!!!!!!!!!!!!!!");
		
		return memberRepository.findAll();
		
	}
	
	
	//특정 회원 정보 가져오기 
	
	//특정 회원 정보 수정
	
	//회원 삭제
	
	

}
