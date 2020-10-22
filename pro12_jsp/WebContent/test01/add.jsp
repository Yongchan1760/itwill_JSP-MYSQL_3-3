<?xml version="1.0" encoding="utf-8" ?>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
        errorPage="addException.jsp"
    %>
      <!-- add.jsp페이지에서 예외 발생시 예외를 처리할 jsp페이지를 지정합니다. -->
      
      
      
      
   <%
   	//한글 처리
   	request.setCharacterEncoding("utf-8");
   
   //add.html에서 입력받은 자연수를 request메모리에서 꺼내와 얻기
   int num=Integer.parseInt(request.getParameter("num"));
   
   //합을 저장할 변수
   int sum=0;
   
   for(int i=0;i<=num;i++){
	   sum+=i;
   }
   %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>Insert title here</title>
</head>
<body>
	<h2>합계 구하기 </h2>
	<h1>1부터 <%=num %>까지의 합은 <%=sum %>입니다.</h1>
</body>
</html>