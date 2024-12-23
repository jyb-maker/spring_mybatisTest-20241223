<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 내용보기</title>
</head>
<body>
	<h2> 글 보기 </h2>
	<hr>
	글쓴이 : ${bDto.bname}<br><br>
	제목 : ${bDto.btitle}<br><br>
	글내용 : ${bDto.bcontent}<br><br>
	게시일 : ${bDto.bdate}<br><br>				
</body>
</html>