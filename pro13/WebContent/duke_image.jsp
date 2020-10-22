<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
    
    
    <%
    	//include1.jsp의 param액션태그르 전달된값들을  request내장객체 메모리 영역에서 꺼내오기
    	request.setCharacterEncoding("utf-8");

	//include.jsp 이 호출 되었을때 
	//인코딩 방식

	String name=request.getParameter("name");
	String imgName=request.getParameter("imgName");
	//이미지 명과 이름을 받아온다.
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
</head>
<body>
	<br><br>
	<h1>이름은 <%=name%>입니다.</h1>
	<br><br>
	<img src="./image/<%=imgName%>" />
	
	
</body>
</html>