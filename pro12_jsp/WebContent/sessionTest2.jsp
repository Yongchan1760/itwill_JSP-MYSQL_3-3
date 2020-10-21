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
	<h1>여기는 sessiontest2.jsp페이지 입니다.</h1>
	<%--session내장객체 메모리 영역에 저장된 데이터를 꺼내올때 getAttribute--%>
	
	<%=
		session.getAttribute("sessionVal")//sessionVal
		
	%>
	
	<%--결론 클라이언트 요청시 자동으로 생성되는 jsp페이지의 session 영역은 또다시 다른
	jsp페이지 요청시.. 같은 웹브라우저가 닫기기 전까지는 session영역은 계속 유지된다. --%>
</body>
</html>