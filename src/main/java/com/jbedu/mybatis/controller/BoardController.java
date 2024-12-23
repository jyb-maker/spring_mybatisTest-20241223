package com.jbedu.mybatis.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoardController {

	@Autowired
	private SqlSession sqlSession;  //의존성 자동 주입  -> DI
	
	@RequestMapping(value = "write_form")
	public String write_form() {
		return "write_form";
	}
	
	
	
}
