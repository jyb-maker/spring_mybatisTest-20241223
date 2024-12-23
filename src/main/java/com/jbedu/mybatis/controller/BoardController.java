package com.jbedu.mybatis.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jbedu.mybatis.dao.BoardDao;

@Controller
public class BoardController {

	@Autowired
	private SqlSession sqlSession;  //의존성 자동 주입  -> DI
	
	@RequestMapping(value = "write_form")
	public String write_form() {
		return "write_form";
	}
	
	
	@RequestMapping(value = "/writeOk")
	public String boardWrite(HttpServletRequest request, Model model)  {
		
		String bname = request.getParameter("bname");
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");		

		BoardDao boardDao = sqlSession.getMapper(BoardDao.class);
		boardDao.boardWriteDao(bname, btitle, bcontent);	

			

		
		return "redirect:boardList";
	}
	
}
