<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    isErrorPage="true"
    %>
    <!-- isErrorPage="true"
    다른 jsp페이지에서 예외가 발생했을때 예외를 처리하는 예외처리 페이지로 지정합니다. -->
    
    <!-- 페이지 지시자 태그의 is errpage속성을 true로 설정해 exemption내장객체를 이용해서 
    발생한 예외를 처리하도록 합니다. 이떄 exception 내장객체는 자바의 exception클래스의 인스턴스입니다. -->
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>Insert title here</title>
</head>
<body>
	=============toString()메소드를 호출한 결과 내용==============<br>
	<h1>예외 <%=exception.toString() %></h1>
	<!-- exception 내장객체를 사용한 예외 처리를 합니다. -->
	
	
	================getmassage()메소드 호출한 결과 내용===========</br>
	<!-- 예외가 발생하면 발생한 예외 메세지를 간략하게 얻고싶을떄 getmessage()메소드 호출 -->
	<h1> <%=exception.getMessage() %></h1>
	
	=====printstacktrace() 메소드 호출한 결과내용 <br>
	
	<!--이클립스의 console창에 예외메세지를 상세히 출력합니다.   -->
	<h1> <% exception.printStackTrace(); %></h1>
	
	<h3>숫자만 입력가능합니다. 다시 시도해 주세요</h3>
	
	<a href="add.html">다시 입력하러 가기</a>
	
</body>
</html>