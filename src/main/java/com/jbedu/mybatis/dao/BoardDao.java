package com.jbedu.mybatis.dao;

import java.util.ArrayList;

import com.jbedu.mybatis.dto.BoardDto;

public interface BoardDao {
	
	public int boardWriteDao(String bname, String btitle, String bcontent);//글쓰기
	//성공하면 1, 실패하면 0
	public ArrayList<BoardDto> boardListDao();//모든 글 목록 가져오기
	public int boardDeleteDao(String bnum);//글 삭제
	//실패하면 0, 성공하면 1->삭제된 레코드의 갯수
}