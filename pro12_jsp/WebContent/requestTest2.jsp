<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>request 내장 객체 영역</title>
</head>
<body>
	<!--  -->
	<!--클라이언트가 요청하는 디자인 페이지  -->
	<%-- --%>
	
	<% 
		//request객체 메모리 영역에 들어있는 currtime변수 값의 주소를 꺼내어서 저장하게 되는데..
		//꺼낼 currtime 변수가 없으므로 null값이 저장됨
		
		Date date1=(Date)request.getAttribute("currTime");//다운캐스팅
	%>
	현재 시간은 <%=date1 %>입니다. <br>
	
	<%
		//request 내장객체 메모리 영역 내부에 currTime 변수를 선언하여 new Date()객체 값을 저장하자
		request.setAttribute("currTime", new Date());
	
		//request 내장객체 메모리 영역에 들어있는 currTime변수 값을 꺼내어서 저장
		date1=(Date)request.getAttribute("currTime");//다운캐스팅
	
	%>
	현재시간은<%=date1%>입니다. <br>
	
	<%
		//request 내장객체 메모리 영역 내부에 있는 currTime변수를 제거한다. 
		request.removeAttribute("currTime");
	
		//request내장객체 메모리 영역에 들어있는 currtime변수 값을 꺼내어서 저장
		date1=(Date)request.getAttribute("currTime");
	%>
	현재시간은<%=date1%>입니다. <br>
</body>
</html>