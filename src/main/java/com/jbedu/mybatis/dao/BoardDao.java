package com.jbedu.mybatis.dao;

import java.util.ArrayList;

import com.jbedu.mybatis.dto.BoardDto;

public interface BoardDao {

	public void boardWriteDao(String bname, String btitle, String bcontent); // 글쓰기 
	public ArrayList<BoardDto> boardListDao(); 	// 모든 글 목록 가져오기 
	
	
}
