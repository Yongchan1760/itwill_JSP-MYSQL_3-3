<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<h1>여기는 responseTest1.jsp페이지입니다.</h1>
	<%
		//response 객체의 sendredirect() 메소드를 이용해서
		//리다이렉트 방식으로 다른 서버페이지를 포워딩(재요청)하여 패이지의 흐름을 바꾸어 이동시키자
		//response.sendRedirect("포워딩할 서버페이지 주소")
		response.sendRedirect("responseTest2.jsp");
		//response.sendRedirect("http://daum.net");
	%>
</body>
</html>