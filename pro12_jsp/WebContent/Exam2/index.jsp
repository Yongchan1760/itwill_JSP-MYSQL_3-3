<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Insert title here</title>
</head>
<body>
	<h1>welcome to myworld</h1>
	
	<%
		//login.jsp 페이지에서 로그인에 성공했을때
		//같은 웹브라우저에서 유지되는 session내장객체 메모리 영역에 저장된값을
		//언더 변수에 저장
		String new_id=(String)session.getAttribute("a");
	
		//세션영역에 세션값이 존재하면 로그인 화면으로 디자인
		//session영역에 세션값이 존재하지 않으면 로그아웃된 화면으로 디자인 
		//db에 저장된 master값이 session영역에 저장된 id값이 동일할떄  로그인처리하자
		
		if("master".equals(new_id)){
%>		
			<%=new_id%>님 로그인중..<br>
			<a href="logout.jsp">logout</a>
			<a href="shop.jsp">쇼핑몰</a>
	<%		
		}else{
	%>
			<a href="login.jsp">login</a>
			<a href="shop.jsp">쇼핑몰</a>
	<% 		
		}
	%>
</body>
</html>